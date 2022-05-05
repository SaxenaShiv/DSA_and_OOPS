package recursionAndBacktracking;
import java.io.*;
import java.util.*;
public class Queens_Permutations_2das2d_box_choosingOptions {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		boolean[] queens = new boolean[n];
		
		queensPermut(0,n,0,0,"",queens);
		
	}
	
	private static void queensPermut(int qpsf,int tq,int row,int col,String asf,boolean[]queens) {
		if(row==tq) {
			if(qpsf==tq) {
				System.out.println(asf);
				System.out.println();
			}
			return;
		}
		int nr = 0;
		int nc = 0;
		char sep ='\0';
		if(col== tq-1) {
			nr = row + 1;
			nc = 0;
			sep = '\n';
		}else {
			nr = row;
			nc = col+1;
			sep = '\t';
		}
		
		for(int i=0;i<queens.length;i++) {
			if(queens[i]==false) {
				queens[i]=true;
				queensPermut(qpsf+1, tq, nr, nc, asf+"q"+(i+1)+sep, queens);
				queens[i]=false;
			}
		}
		queensPermut(qpsf, tq, nr, nc, asf+"-"+sep, queens);
	}
																			
	

}
