package calculatorAPI;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String str = getPhoneNumber(sc.nextLine());
		System.out.print(str);

	}
	public static String getPhoneNumber(String s) {
		 StringBuilder res = new StringBuilder();
	        HashMap<String,Integer>map  =new HashMap<>();
	        //creating key value map
	        map.put("zero",0);
	        map.put("one",1);
	        map.put("two", 2);
	        map.put("three",3);
	        map.put("four",4);
	        map.put("five",5);
	        map.put("six",6);
	        map.put("seven",7);
	        map.put("eight",8);
	        map.put("nine",9);
	         
	         String str[] = s.split(" ");
	         for(int i=0;i<str.length;i++){
	             if(map.containsKey(str[i])){
	                 res.append(String.valueOf(map.get(str[i])));
	             }
	             if(str[i].equals("double")){
	                 res.append(String.valueOf(map.get(str[i+1])));
	                 res.append(String.valueOf(map.get(str[i+1])));
	                 i++;
	             }
	             if(str[i].equals("triple")){
	                 res.append(String.valueOf(map.get(str[i+1])));
	                 res.append(String.valueOf(map.get(str[i+1])));
	                 res.append(String.valueOf(map.get(str[i+1])));
	                 i++;
	                 
	             }
//	             switch(str[i]){
//                 case "double":
//                 res.append(String.valueOf(map.get(str[i+1])));
//                 res.append(String.valueOf(map.get(str[i+1])));
//                 i++;
//                 break;
//                 
//                 case "triple":
//                 res.append(String.valueOf(map.get(str[i+1])));
//                 res.append(String.valueOf(map.get(str[i+1])));
//                 res.append(String.valueOf(map.get(str[i+1])));
//                 i++;
//                 i++;
//                 break;
//             }
	         }
	        
	        return res.toString();

	    }


}
