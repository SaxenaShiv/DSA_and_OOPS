package thirty_day_challenge;
import java.util.*;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class Day_three {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        
        if(N>2 && N<5){
            if(N%2 == 0){
                System.out.println("Not Weird");
            }else{
                System.out.println("Weird");
            }
            
        }else if(N>6 && N<20){
            if(N%2 ==0){
                System.out.println("Weird");
            }else{
                System.out.println("Not Weird");
            }
            
        }
        else{
            System.out.println("Weird");
        }

	}
}
