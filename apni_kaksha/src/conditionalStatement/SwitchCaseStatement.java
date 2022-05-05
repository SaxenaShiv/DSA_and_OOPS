package conditionalStatement;

import java.util.Scanner;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		Scanner sc =  new Scanner (System.in);
	     int dayofweek = sc.nextInt();
	     
	     switch(dayofweek) {
	     case 1:
	     case 2:
	    	 System.out.println("Bad Review");
	    	 break;
	     case 3:
	     case 4:
	    	 System.out.println("Average Review");
	    	 break;
	     case 5:
	    	 System.out.println("Excellent Review");
	    	 break;
	 
	     default:
	    	 System.out.println(0);
	  
	     }

	}

}
