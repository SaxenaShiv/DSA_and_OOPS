package recurssion_with_arryas;

import java.util.Scanner;

public class Max_of_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []arr = new int [n];
		
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int idx =0;
		System.out.println(maxOfArray(arr,idx));

	}
	public static int maxOfArray(int []arr,int idx) {
		if(idx == arr.length) {
			return Integer.MIN_VALUE;
		}
		/*
		 * if(idx == arr.length-1){
		 *  return arr[idx];                     can use "return -1" if all element are positive. 
		 */
		int f1 = maxOfArray(arr,idx +1);
		int ans = Math.max(f1, arr[idx]);
		return ans;
	}

}
