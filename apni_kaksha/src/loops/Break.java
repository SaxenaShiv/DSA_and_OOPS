package loops;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		for (;;) {
			if (n<0) {
				break;
			}
			System.out.println(n);
		}

	}

}
