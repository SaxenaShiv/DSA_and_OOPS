package arrays;
import java.util.*;
public class Car_fleet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]pos = new int[n];
		int[]speed = new int[n];
		for(int i=0;i<n;i++) {
			pos[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			speed[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		
		System.out.println(solution(pos,speed,k));
		
	}
	public static int solution(int[]pos,int []speed,int target) {
		int n = pos.length;
		double[][]carData = new double[n][2];
		for(int i=0;i<n;i++) {
			carData[i][0] = pos[i]*1d;
			carData[i][1] = (target-pos[i])*1d/speed[i];
		}
		Arrays.sort(carData,(a,b)->Double.compare(a[0], b[0]));
		int res = 1;
		
		double tt = carData[n-1][1];
		for(int i=n-2;i>=0;i--) {
			if(carData[i][1]>tt) {
				res++;
				tt = carData[i][1];
			}
		}
		
		return res;
	}

}
