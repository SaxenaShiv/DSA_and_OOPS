package water_management;
import java.io.*;
import java.util.*;
public class WaterBillGenerator {

	public static void main(String[] args) throws Exception {
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		
		//without guests
		String str = br.readLine();
		String []s = str.split(" ");
		String ra = s[2];
	
		
		String[] ratio = ra.split(":");         //seprating ratios
		int apt = Integer.parseInt(s[1]);      
		int cr = Integer.parseInt(ratio[0]);      //corporation water ratio
		int Br = Integer.parseInt(ratio[1]);      //Borewell water ratio
		int bill = 0;
		if(apt == 2) {
			int tc = 10*3*30;                        //total consumption in 30 days(2 bhk)
			bill = ((cr/(cr+Br))*tc)+((Br/(cr+Br))*tc); //calculating bill
			
		}else {
			int tc = 10*5*30;                       //total consumption in 30 days (3BHK)
			bill = ((cr/(cr+Br))*tc)+((Br/(cr+Br))*tc);
			
		}
		System.out.print(bill);
		

	}

}
