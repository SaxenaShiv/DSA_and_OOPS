package generic_tree;
import java.util.*;
public class Initialization1 {

	public static class Node{
		int data;
		ArrayList<Node>child = new ArrayList<>();
		
		Node(int data){
			this.data = data;
		}
	}
	
	public static void levelOrderTraversal(Node root) {
		Queue<Node>q = new ArrayDeque<>();
		q.add(root);
		//remove, print, add child
		while(q.size()>0) {
			Node temp = q.remove();            
			System.out.print(temp.data+" ");
			
			for(Node children:temp.child) {
				q.add(children);
			}
		}
		System.out.println(".");
	}
	public static void levelOrderTraversalLineWise(Node root) {
		Queue<Node>q = new ArrayDeque<>();
		Queue<Node>cq =new ArrayDeque<>();
		q.add(root);
		//remove, print, add child
		while(q.size()>0) {
			Node temp = q.remove();            
			System.out.print(temp.data+" ");
			
			for(Node children:temp.child) {
				cq.add(children);
			}
			if(q.size()==0) {
				q = cq;
				cq = new ArrayDeque<>();
				System.out.println(".");
			}
		}
		
	}
	public static void main(String[] args) { 
		Node root = new Node(10);        //root element or level 0
		
		Node n1 = new Node(20);
		root.child.add(n1);
		
		Node n2 = new Node(30);
		root.child.add(n2);
		
		Node n3 = new Node(40);
		root.child.add(n3);                  //level 1 elements
		
		Node n4 = new Node(50);
		n1.child.add(n4);
		
		Node n5 = new Node(60);
		n1.child.add(n5);
		
		Node n6 = new Node(70);
		n2.child.add(n6);
		
		Node n7 = new Node(80);
		n2.child.add(n7);
		
		Node n8 = new Node(90);
		n2.child.add(n8);
		
		Node n9 = new Node(100);           //level 2 elements
		n3.child.add(n9);
		
		Node n10 = new Node(110);
		n7.child.add(n10);
		
		Node n11 = new Node(120);
		n7.child.add(n11);              //level 3 elements
		
		
		System.out.println("level Order Traversal");
		levelOrderTraversal(root);
		
		System.out.println("`````````````````````");
		System.out.println("level Order Traversal Line Wise");
		levelOrderTraversalLineWise(root);
		
		System.out.println("`````````````````````");
	}

}
