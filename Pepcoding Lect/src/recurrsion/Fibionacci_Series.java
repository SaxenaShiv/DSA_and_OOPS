package recurrsion;
import java.util.*;
public class Fibionacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.print(fibionacci(n));

	}
	public static int fibionacci(int n) {
		if(n ==0 ||n==1) {
			
			return n;
			
		}
		else {
			
			int a = fibionacci(n-1);
			
			int b = fibionacci(n-2);
			
			int c = a+b;
			
			return c;
		}
	}

}
