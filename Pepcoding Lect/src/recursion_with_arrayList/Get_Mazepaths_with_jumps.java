package recursion_with_arrayList;
import java.util.*;
public class Get_Mazepaths_with_jumps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int m = sc.nextInt();
		
		System.out.print(getMazePaths(0,0,n-1,m-1));

	}
	public static ArrayList<String> getMazePaths(int sr,int sc,int dr,int dc){
		if(sr == dr && sc == dc) {
			ArrayList<String> bc = new ArrayList<>();
			bc.add("");
			return bc;
		}
		ArrayList<String> ans = new ArrayList<>();
		
		for(int jump=1;jump<=dc-sc;jump++) {
			ArrayList<String> rr = getMazePaths( sr, sc+jump,dr,dc);
			for(int i=0;i<rr.size();i++) {
				ans.add("h"+jump+rr.get(i));
			}
		}
		
		for(int jump=1;jump<=dr-sr;jump++) {
			ArrayList<String>rr = getMazePaths(sr+jump,sc,dr,dc);
			
			for(int i=0;i<rr.size();i++) {
				ans.add("v"+jump+rr.get(i));
			}
		}
		
		for(int jump=1;jump<=dr-sr && jump<=dc-sc;jump++) {
			ArrayList<String>rr = getMazePaths(sr+jump,sc+jump,dr,dc);
			
			for(int i=0;i<rr.size();i++) {
				ans.add("d"+jump+rr.get(i));
			}
		}
		
		
		return ans;
	}

}
