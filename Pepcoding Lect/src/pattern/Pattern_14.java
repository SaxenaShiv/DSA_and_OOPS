package pattern;
import java.util.*;
public class Pattern_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        
        for(int i=1;i<=10;i++){
            int c = n*i;
            System.out.println(n+ "*" +i+ "=" +c );
        }

	}

}
