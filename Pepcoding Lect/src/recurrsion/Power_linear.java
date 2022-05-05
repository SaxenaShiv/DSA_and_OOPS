package recurrsion;
import java.util.*;
public class Power_linear {

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
		int xpnby2 = solution(x,n-1);
		int xpn = xpnby2*x;
		
            return xpn;
	}

}
