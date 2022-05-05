package strings_String_Builder_ArrayList;

import java.util.Scanner;

public class Palindromic_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String str = sc.next();
		
		for(int si=0;si<str.length();si++) {
			for(int ei = si;ei<str.length();ei++) {
				if(isPalindromic(str.substring(si,ei+1)) == true) {
					System.out.println(str.substring(si, ei+1));
				}
			}
		}

	}
	
	public static boolean isPalindromic (String str) {
		int left =0;
		int right = str.length()-1;
		
		while(left<right) {
			if(str.charAt(left)!=str.charAt(right)) {
				return false;
			}
			
			left++;
			right--;
		}
		return true;
	}

}
