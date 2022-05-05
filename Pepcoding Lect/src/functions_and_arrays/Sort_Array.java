package functions_and_arrays;

import java.util.Scanner;

public class Sort_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
			int temp =0;
			if(arr[i]>arr[j]) {
				temp = arr[i];
				arr[i]=arr[j];
				arr[j] = temp;
				
			}
			
			}
			
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
