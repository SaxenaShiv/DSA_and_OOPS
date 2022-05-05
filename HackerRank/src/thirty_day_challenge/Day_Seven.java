package thirty_day_challenge;

import java.util.Arrays;

public class Day_Seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []Array1;
		int []Array2 = new int [4];
		int []Array3 = {5,2,9,1,3};
		
		String []shoppinglist = {"Bananas","Apples","Orange"};
		
		System.out.println(Arrays.toString(Array2));
		System.out.println(Arrays.toString(Array3));
		printArray(Array3);
		System.out.println();
		Arrays.sort(Array3);
		printArray(Array3);
		System.out.println();
		for(String s: shoppinglist) {
			System.out.println(s);
		}
	}
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int item = arr[i];
			System.out.print(item+" ");
		}
		
		
	}

}
