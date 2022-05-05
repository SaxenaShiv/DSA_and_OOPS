package dowhileLoops;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n =2;
		do {
		  n = sc.nextInt();
		  System.out.println("number " + n);
		}while ( n != 1);
		
		

	}

}
