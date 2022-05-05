package whileLoops;

import java.util.Scanner;

public class Log_formula {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		int numberofdigits = (int)Math.log10(n) + 1;
		System.out.println(numberofdigits);
		

	}

}
