package strings_String_Builder_ArrayList;
import java.util.*;
public class String_Difference_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.print(difference(str));

	}
	
	public static String difference(String str) {
		StringBuilder sb = new StringBuilder();
		
		sb.append(str.charAt(0));
		for(int i=1;i<str.length();i++) {
		char curr = str.charAt(i);  
		char prev = str.charAt(i-1);
		
		int gap = curr-prev;
		
		sb.append(gap);
		sb.append(curr);
		
		}
		return sb.toString();
		
	}

}
