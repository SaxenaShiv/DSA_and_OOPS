package two_D_Array;
import java.util.*;
public class Matrix_Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
	    int m1 = sc.nextInt();
	    
	    int [][]arr1 = new int[n1][m1];
	    
	    for(int i=0;i<arr1.length;i++){
	        for(int j=0;j<arr1[0].length;j++){
	            arr1[i][j] = sc.nextInt();
	        }
	    }
	    
	    int n2 = sc.nextInt();
	    int m2 = sc.nextInt();
	    
	    int [][]arr2 = new int[n2][m2];
	    
	    for(int i=0;i<arr2.length;i++){
	        for(int j=0;j<arr2[0].length;j++){
	            arr2[i][j] = sc.nextInt();
	        }
	    }
	    
	    if(m1 != n2) {
	    	System.out.println("Invalid input");
	    }
	    
	    int [][]prod = new int[n1][m2];
	    for(int i=0;i<prod.length;i++) {
	    	for(int j=0;j<prod[0].length;j++) {
	    		for(int k=0;k<m1;k++) {
	    			prod[i][j] += arr1[i][k]* arr2[k][j]; 
	    		}
	    	}
	    }
	    
	    for(int i=0;i<prod.length;i++) {
	    	for(int j=0;j<prod[0].length;j++) {
	    		System.out.print(prod[i][j]+ " ");
	    	}
	    	System.out.println();
	    }
	    

	}

}
