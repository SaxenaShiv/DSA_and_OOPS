package getting_started;
import java.util.*;
public class PrintPrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=1;i<=t;i++) {
			int n = sc.nextInt();
			int factors = 0;
			for(int div = 2;div*div<=n;div++) {
				if(n%div ==0) {
					factors ++;
					break;
				}
				
			}
			if(factors ==0) {
				System.out.println("Prime");
			}
			else {
				System.out.println("Not Prime");
			}
			
		}
		

	}

}
