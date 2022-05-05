package generic_tree;
import java.util.*;
public class BestInitialization {

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
	public static Node construct(int[]arr) {
		Stack<Node> st = new Stack<>();
		Node root = null;
		for(int val:arr) {
			if(val!=-1) {
				Node temp = new Node(val);
				st.push(temp);
			}else {
				Node node = st.pop();
				
				
				if(st.size()>0) {
					Node parent = st.peek();
					parent.child.add(node);
				}else {
					root = node;
				}
			}
		}
		return root;
	}
	public static void main(String[] args) { 
		int arr[] = {10,20,50,-1,60,-1,-1,30,70,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
		
		Node root = construct(arr);
		
		System.out.println("level Order Traversal");
		levelOrderTraversal(root);
		
		
	}

}
