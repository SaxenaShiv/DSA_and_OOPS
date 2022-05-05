package pattern;
import java.util.*;
public class Pattern_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

        // write ur code here
        int n =scn.nextInt();
        int spaces = n/2;
        int stars = 1;
        
        for(int i=1;i<=n;i++){
            
           
            
            for(int j=1;j<=spaces;j++){
            	 if(i==n/2+1){
                     
                     System.out.print("*\t");
                 
             }else {
                System.out.print("\t");
            }
            }
            
            
            for(int j=1;j<=stars;j++){
                System.out.print("*\t");
            }
            
         System.out.println();   
            if(i<=n/2){
            stars ++;
           }
         
          else{
            stars--;
          }
        
        }

	}

}
