package thirty_day_challenge;
import java.util.*;
public class Day_six {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
        	
          String s = sc.nextLine();
          char[] charArray = s.toCharArray();         //converting string to char Array
          for(int j=0;j<charArray.length;j++){
            
            if(j%2==0){
              System.out.print(charArray[j]);            //printing chars at even indices
            }
            
          }
          System.out.print(" ");
          
          for(int j=0;j<charArray.length;j++){          //printing chars at odd indices
            
            if(j%2!=0){
              System.out.print(charArray[j]);
            }
          }
          
          
          
        }
        
	}

}
