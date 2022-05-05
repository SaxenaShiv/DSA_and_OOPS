package hashMap;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// LEAST RECENT USED PROCESS
public class LRU_cache {
	
    public static class LRU{
    	class Node{                         //Doubley LL node class
    		int key,val;
    		Node prev,next;
    	}
    	HashMap<Integer,Node>cache;
    	int cap;
    	Node head,tail;
    	LRU(int capacity){
    		cache = new HashMap<>();
    		cap = capacity;
    		head = new Node();
    		tail = new Node();
    		
    		head.next = tail;
    		tail.prev = head;
    	}
    	private void addNode(Node node) {
    		Node temp = head.next;
    		node.next = temp;
    		node.prev = head;
    		
    		temp.prev = node;
    		head.next = node;
    	}
    	
    	private void removeNode(Node node) {
    		Node lNbr = node.prev;
    		Node rNbr = node.next;
    		
    		lNbr.next = rNbr;
    		rNbr.prev = lNbr;
    		
    		node.prev = null;
    		node.next = null;
    	}
    	private void moveToFront(Node node) {
    		removeNode(node);
    		addNode(node);
    	}
    	int get(int key) {
    		Node node = cache.get(key);
    		if(node==null) {
    			return -1;
    		}else {
    			int val = node.val;
    			moveToFront(node);
    			return val;
    		}
    	}
    	
    	void put(int key,int value) {
    		Node node = cache.get(key);
    		if(node==null) {
    			Node newNode = new Node();
    			newNode.key = key;
    			newNode.val = value;
    			if(cap == cache.size()) {
    				Node LRU_node = tail.prev;
    				cache.remove(LRU_node.key);
    				removeNode(LRU_node);
    			}
    			cache.put(key,newNode);
    			addNode(newNode);
    		}
    	}
    }
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		LRU  obj = new LRU(Integer.parseInt(str.split(" ")[1]));
		
		while(true) {
			str= br.readLine();
			String inp[] = str.split(" ");
			
			if(inp.length ==1) {
				break;
			}else if(inp.length ==2) {
				System.out.println(obj.get(Integer.parseInt(inp[1])));
				
			}else if(inp.length ==3) {
				obj.put(Integer.parseInt(inp[1]),Integer.parseInt(inp[2]));
			}
		}
	}

}
