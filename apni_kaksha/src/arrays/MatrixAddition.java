package arrays;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Dimensions :");
		int rows = sc.nextInt();
		int coloumns = sc.nextInt();
		
		int a [][] = new int [rows][coloumns];
		int b [][] = new int [rows][coloumns];
		System.out.println("Enter Array A");
		for (int i=0; i<rows; i++) {
			for (int j=0; j<coloumns;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter Array B");
		for (int i=0; i<rows; i++) {
			for (int j=0; j<coloumns;j++) {
				b[i][j] = sc.nextInt();
			}

		}
		System.out.println("Result Array C is");
		int c [][]= new int [rows][coloumns];
		for (int i=0; i<rows; i++) {
			for (int j=0; j<coloumns;j++) {
				c[i][j] = a[i][j]+b[i][j];
			}

	}
		for (int i= 0; i<rows;i++) {
			for (int j=0; j<coloumns; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
}  
	/* 
	  
	  */
}
