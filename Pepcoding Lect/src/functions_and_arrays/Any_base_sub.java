package functions_and_arrays;
import java.util.*;
public class Any_base_sub {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int b = sc.nextInt();
		
		int d = getDifference(n1,n2,b);
		System.out.println(d);

	}
	public static int getDifference(int n1,int n2,int b) {
		int ans =0;
		int borrow = 0;
		int power =1;
		
		while(n1>0) {
			int ld1 = n1%10;
			n1/=10;
			
			int ld2  = n2%10;
			n2/=10;
			
			int diff = 0;
			ld1 = ld1 +borrow;
			
			if(ld1>=ld2) {
				borrow = 0;
				diff = ld1 -ld2;
			}else {
				borrow = -1;
				diff = (ld1 + b) - ld2;
			}
			
			ans = ans+  diff*power; 
			power *=10;
		}
		
		return ans;
	}

}
