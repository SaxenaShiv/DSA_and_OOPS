package recursion_with_arrayList;
import java.util.*;
import java.util.Scanner;

public class Print_Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.print(gss(str));

	}
	public static ArrayList<String> gss(String str){
		if(str.equals("")== true) {
			ArrayList<String> bc = new ArrayList<>();           // bc -> base Case
			bc.add("");
			return bc;
		}
		
//		  if(str.length() == 0){
//		  ArrayList<String> bc = new ArrayList<>();           
//			bc.add("");
//			return bc;
//			}
		 
		char ch = str.charAt(0);
		String ros = str.substring(1);                   //remaining other strings
		ArrayList<String> rr = gss(ros);                  // rr => recurrence relation
		ArrayList<String> ans = new ArrayList<>();
		for(int i=0;i<rr.size();i++) {
			ans.add(rr.get(i));
		}
		for(int i=0;i<rr.size();i++) {
			ans.add(ch + rr.get(i));
		}
		
		return ans;
	}

}
