package functions_and_arrays;
import java.util.*;
public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int []arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int data = sc.nextInt();
		
			int ans=bs(arr,data);
			System.out.println(ans);
		}
	
	public static int bs(int []arr,int data) {
		int left = 0;
		int right = arr.length-1;
		
		while( left <=right) {
			int mid = (left + right)/2;
			
			if(arr[mid] == data) {
				return mid;
			}else if(arr[mid] > data) {
				right = mid -1;
			}else {
				left = mid +1;
			}
			
		}
		return -1;
	}

	}


