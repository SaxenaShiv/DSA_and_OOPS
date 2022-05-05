package whileLoops;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n= sc.nextInt();
		int temp = n;
		int sum = 0;
		
		while (temp >0) {
			int lastdigit = temp % 10;
			temp /= 10;
			sum += lastdigit;
			System.out.println(lastdigit + " " + temp + " " + sum);
		}
		System.out.println("Sum of Digits of " + n + " is " + sum );
		

	}

}
