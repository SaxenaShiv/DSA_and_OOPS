package recurssion_with_arryas;

import java.util.Scanner;

public class First_Index_of_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int idx = 0;
        System.out.println(firstIndex(arr,idx,x));

	}
	public static int firstIndex(int []arr,int idx,int x) {
		
		if(idx == arr.length) {
			return -1;
		}
		if(arr[idx] == x) {
			return idx;
		}
		
		return firstIndex(arr,idx+1,x);
	}

}
