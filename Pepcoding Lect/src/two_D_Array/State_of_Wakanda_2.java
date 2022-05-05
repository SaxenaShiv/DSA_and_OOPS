package two_D_Array;
import java.util.*;
public class State_of_Wakanda_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

	    int n = sc.nextInt();


	    int [][]arr = new int [n][n];

	    for (int i = 0; i < n; i++) {
	      for (int j = 0; j < n; j++) {
	        arr[i][j] = sc.nextInt();
	      }
	    }
	    
	    for(int diag=0;diag<n;diag++) {
	    	int i=0; int j=diag;
	    	while(j<n) {
	    		System.out.println(arr[i][j]);
	    		
	    		i++;
	    		
	    		j++;
	    	}
	    }

	}

}
