package two_D_Array;
import java.util.*;
public class Search_In_A_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		
		int [][]arr = new int [n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int data = sc.nextInt();
		
		int i=n-1;
		int j=0;
		
		while(i>=0 && j<n) {
			if(arr[i][j]==data) {
				System.out.println(i);
				System.out.println(j);
				return;
			}else if(arr[i][j]>data) {
				i--;
			}else {
				j++;
			}
		}
		System.out.println("Not Found");

	}

}
