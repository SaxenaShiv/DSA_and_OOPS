import java.util.*;
public class tassa {
	public static void main (String[]args) {
		
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter the size :");
	int size = sc.nextInt();
		
		int a[] = new int[size];
			System.out.println("Enter the elements:");
			
			for(int i=0;i<size;i++){
				 a[i] = sc.nextInt();
			}
			
			System.out.println ("Enter the position you want to delete:");
			int pos = sc.nextInt();
			
			if(pos<=0 || pos>size){
				System.out.println("Invalid input");
			}
			
			else{
				
				for(int i=pos-1;i<size-1;i++){
					a[i] = a[i+1];
				}
				size --;
				
				System.out.println("The new arrie is:");
				for(int i=0;i<size;i++){
					System.out.println(a[i]);
				}
			}
			
		}

}

