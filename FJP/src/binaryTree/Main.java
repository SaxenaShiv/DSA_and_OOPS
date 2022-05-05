package binaryTree;
import java.util.*;
public class Main {
	public static class Node{
		int data;
		Node left;
		Node right;
	}
	public static Node construct(Integer[]arr) {
		Node root =new Node();
		int idx=1;
		Stack<Pair>st = new Stack<>();
		root.data = arr[0];
		
		Pair rootp = new Pair();
		rootp.node = root;
		rootp.state = 1;
		
		st.push(rootp);
		
		while(st.size()>0) {
			Pair peekp = st.peek();
			if(peekp.state==1) {
				if(arr[idx]!=null) {
					Node lc = new Node();
					lc.data = arr[idx];
					peekp.node.left = lc;
					
					Pair lp = new Pair();
					lp.node=lc;
					lp.state=1;
					st.push(lp);
				}
				peekp.state++;
				idx++;
				
			}else if(peekp.state==2) {
				if(arr[idx]!=null) {
					Node rc = new Node();
					rc.data = arr[idx];
					peekp.node.right = rc;
					
					Pair rp = new Pair();
					rp.node = rc;
					rp.state=1;
					st.push(rp);
				}
				peekp.state++;
				idx++;
			}else if(peekp.state==3) {
				st.pop();
			}
			
		}
		return root;
	}
	
	public static class Pair{
		Node node;
		int state;
	}
	
	public static void  display(Node node) {
		if(node == null) {
			return;
		}
		String str = "<-"+node.data+"->";
		String lcstr = node.left == null?".":node.left.data+"";
		String rcstr = node.right==null?".":node.right.data+"";
		System.out.println(lcstr+str+rcstr);
		
		display(node.left);
		display(node.right);
	}
	public static void main(String[] args) {
		Integer[] arr = {50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
		Node root = construct(arr);
		display(root);
	}

}
