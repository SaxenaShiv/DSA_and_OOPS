package recurrsion_with_backtracking;
import java.util.*;
public class flood_fill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int [][]arr = new int [n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		boolean [][]visited = new boolean[n][m];
		floodfill(arr,0,0,"",visited);

	}
	public static void floodfill(int[][] maze,int sr,int sc, String psf ,boolean [][]visited) {
		if(sr<0||sr>=maze.length||sc<0||sc>=maze[0].length||visited[sr][sc]==true) {
			return;
		}
		
		if(sr==maze.length-1 && sc==maze[0].length-1) {
			System.out.println(psf);
			return;
		}
		visited[sr][sc] = true;
		floodfill(maze,sr-1,sc,psf+"t",visited);          //top
		floodfill(maze,sr,sc-1,psf+"l",visited);          //left		
		floodfill(maze,sr+1,sc,psf+"d",visited);          //down
		floodfill(maze,sr,sc+1,psf+"r",visited);          //right
		visited[sr][sc] = false;
	}

}
