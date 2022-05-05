package functions_and_arrays;

import java.util.*;


public class Print_Subsets{
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int arr[] = new int[n];

    for(int i = 0;i<arr.length;i++){
        arr[i] = sc.nextInt();
    }
    
    printSubsets(arr);

} 
public static void printSubsets(int []arr){
 int tns = (int)Math.pow(2, arr.length);

 for(int i=0;i<tns;i++){
	 int bn = Decimal2Binary( i,2);
     int div = (int)Math.pow(10, arr.length-1);
     
     for(int j=0;j<arr.length;j++){
    	 int q = bn/div;
    	 int r= bn%div;
         

         if(q ==1){
             System.out.print(arr[j]+ "\t");
         }else{
             System.out.print("-\t");
         }
         bn =r;
         div /=10;

     }
     System.out.println();

 }
 
}

public static int Decimal2Binary(int n,int b){
int ans =0;
int power =1;

while(n!=0){
   
   int r = n%b;
   n = n/b;

   ans += r*power;
   
   power*=10;
}
return ans;
}

}

