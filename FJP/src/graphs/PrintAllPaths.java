package graphs;
import java.util.*;


public class PrintAllPaths {
	static class Edge{
		int v1 ;
		int v2;
		int wt;
		
		Edge(int v1,int v2,int wt){
			this.v1 = v1;
			this.v2 = v2;
			this.wt = wt;
		}
	}
	public static void main(String[] args) {
		ArrayList<Edge>[]graph = new ArrayList[7];
		
		for(int i=0;i<graph.length;i++) {
			graph[i] = new ArrayList<>();
		}
		
		graph[0].add(new Edge(0,1,10));  
		graph[0].add(new Edge(0,3,40));
		
		graph[1].add(new Edge(1,0,10));
		graph[1].add(new Edge(1,2,10));
		
		graph[2].add(new Edge(2,1,10));
		graph[2].add(new Edge(2,3,10));
		
		graph[3].add(new Edge(3,2,10));
		graph[3].add(new Edge(3,0,40));
		graph[3].add(new Edge(3,4,2));
		
		graph[4].add(new Edge(4,3,2));
		graph[4].add(new Edge(4,5,3));
		graph[4].add(new Edge(4,6,8));
		
		graph[5].add(new Edge(5,4,3));
		graph[5].add(new Edge(5,6,3));
		
		graph[6].add(new Edge(6,4,8));
		graph[6].add(new Edge(6,5,3));
		
		int src = 0;
		int dest = 6;
		boolean []visited = new boolean[7];
		PrintAllPaths(graph,visited,src,dest,src+"");
		
	}
	
	public static void PrintAllPaths(ArrayList<Edge>[]graph,boolean[] visited,int src,int dest,String asf) {
		if(src==dest) {
			System.out.println(asf);
			return;
		}
		visited[src] = true;
		for(int i=0;i<graph[src].size();i++) {
			Edge e = graph[src].get(i);
			int nbr = e.v2;
			if(visited[nbr]==false) {
				PrintAllPaths(graph,visited,nbr,dest,asf+nbr+"");
			
			}
		}
		visited[src]=false;
		
	}

}
