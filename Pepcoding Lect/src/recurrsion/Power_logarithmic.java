package recurrsion;

import java.util.Scanner;

public class Power_logarithmic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		
		System.out.println(solution(x,n));
		

	}
	public static int solution(int x, int n) {
		if(n==0) {
		return 1;
	}
		int xpnby2 = solution(x,n/2);
		int xpn = xpnby2*xpnby2;
		if(n%2 != 0)
		{
			xpn *= x;
		}
            return xpn;
	}

	}


