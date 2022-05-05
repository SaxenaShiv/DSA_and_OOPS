package strings_String_Builder_ArrayList;
import java.util.*;
public class Remove_prime_arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0;i<n;i++) {
			al.add( sc.nextInt());
		}
		solution(al);
		System.out.print(al);

	}
	public static void solution(ArrayList<Integer> al) {
		for(int i=0;i<al.size();) {
			if(isPrime(al.get(i)) == true) {
				al.remove(i);
			}else {
				i++;
			}
		}
	}
	public static boolean isPrime(int n) {
		for(int div=2;div*div<=n;div++) {
			if( n%div == 0 ) {
				return false;
			}
		}
		return true;
	}
	

}
