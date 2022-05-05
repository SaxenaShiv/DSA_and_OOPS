package recursion_with_arrayList;
import java.util.*;
public class Print_Stairs_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.print(getStairsPath(n));

	}
	public static ArrayList<String> getStairsPath(int n){
		if(n==0) {
			ArrayList<String> bc= new ArrayList<>();
			bc.add("");
			return bc;
		}
		if(n <0) {
			ArrayList<String> bc= new ArrayList<>();
			
			return bc;
		}
		
		ArrayList<String>rr1 = getStairsPath(n-1);
		ArrayList<String>rr2 = getStairsPath(n-2);
		ArrayList<String>rr3 = getStairsPath(n-3);
		
		ArrayList<String> ans= new ArrayList<>();
		
		for(int i=0;i<rr1.size();i++) {
			ans.add("1"+ rr1.get(i));
		}
		for(int i=0;i<rr2.size();i++) {
			ans.add("2"+ rr2.get(i));
		}
		for(int i=0;i<rr3.size();i++) {
			ans.add("3"+ rr3.get(i));
		}
		return ans;
	}

}
