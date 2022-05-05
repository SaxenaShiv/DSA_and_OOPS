package loops;

import java.util.Scanner;

public class Fibbonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		
		int b= 0;
		int c= 1;
		
		System.out.print(b+ " ");
		System.out.print(c+ " ");
		
		for (int i = 0; i <a-2; i++) {
			int d = b+c;
			System.out.print(d+" ");
			b=c;
			c=d;
		}
	

	}

}
