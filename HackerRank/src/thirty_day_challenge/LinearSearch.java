package thirty_day_challenge;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n =sc.nextInt();
		//INPUT
		int arr[] = new int [n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int item = sc.nextInt();
		if(Lsearch(arr,item)!= -1) {
			System.out.println("Item found at "+Lsearch(arr,item) +" index");
		}
		else {
			System.out.println("Item not found");
		}
	}
	public static int Lsearch(int []arr,int item) {
		int i=0;
		while(i<arr.length) {
			if(arr[i]==item) {
				return(i);	
			}
			i++;
		}
		return -1;
		}
	}


