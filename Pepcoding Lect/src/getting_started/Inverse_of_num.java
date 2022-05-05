package getting_started;

import java.util.Scanner;

public class Inverse_of_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		int inv = 0;
		int i=0;
		int op =1;
		
		while(n!=0) {
			int od = n%10;
			int ip = od;
			int id = op;
			
			 inv = inv+id*(int)Math.pow(10, ip-1);
			
			n=n/10;
			op++;
		}
		System.out.println(inv);

	}

}
