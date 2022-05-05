package pattern;
import java.util.*;
public class Pattern_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // write ur code here
        int stars =n/2+1;
        int spaces =1;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=stars;j++){
             System.out.print("*\t");
            }
            for(int j=1;j<=spaces;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=stars;j++){
             System.out.print("*\t");
            }
            
         
            
            if( i<=n/2){
                stars --;
                spaces +=2;
            }else {
                stars ++;
                spaces -=2;
            }
            System.out.println();
        }

	}

}
