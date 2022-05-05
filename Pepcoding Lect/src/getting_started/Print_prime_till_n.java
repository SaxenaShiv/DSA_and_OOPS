package getting_started;
import java.util.*;
public class Print_prime_till_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int low = sc.nextInt();
		int high = sc.nextInt();
		
		for(int i=low;i<=high;i++) {
			int factor =0;
			for(int div =2;div*div <=i;div++) {
				if(i%div == 0) {
					factor ++;
				}
			}
			if(factor == 0) {
				System.out.println(i);
			}
			
		}

	}

}
