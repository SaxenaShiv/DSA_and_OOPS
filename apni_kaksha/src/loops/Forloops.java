package loops;

import java.util.Scanner;

public class Forloops {

	public static void main(String[] args) {
//		for (int a = 0; a <=100; a= a+1 ) {
//			System.out.println("Hello World " + a);
//		}

      /*int sum = 0;
      int n = 100;
      for (int a =1; a<= n; a++) {
    	  sum = sum+ a;
      }
      System.out.println(sum);*/
		
		
		
	/*for (int a = 100; a>=0; a--) {
		System.out.println(a);
	}*/
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Table of");
		
		int b = sc.nextInt();
			for (int a = 1; a <= 10; a++ ) {
			System.out.println( + b*a);
		}
		
	}

}
