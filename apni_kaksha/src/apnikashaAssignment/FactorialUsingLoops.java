package apnikashaAssignment;

import java.util.Scanner;

public class FactorialUsingLoops {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		
		int factorial = 1;
		for (int a = input; a>=1; a--) {
		     factorial = factorial*a;
		     }
		System.out.println(factorial);
	}

}
