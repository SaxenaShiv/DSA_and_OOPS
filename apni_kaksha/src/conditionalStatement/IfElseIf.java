package conditionalStatement;


public class IfElseIf {

	public static void main(String[] args) {
//		int num = 13;
//		
//		if (num <=10) {
//			System.out.println("Number is less than 10");
//			
//		} else if(num >10 && num <=20 ) {
//			System.out.println("Number is greater than 10 and less than 20 ");
//		}else if (num>20 && num <=30) {
//			System.out.println("Number is greater than 20 and less than 30");
//		}else {
//			 System.out.println("Number is greater than 30");
//		}
        
		int a = 15;    
		int b= 16;
		
		int GreaterNo = 0;
		
		GreaterNo = (a > b ? a : b);   // Ternary Operator IF_ELSE
		System.out.println("Greater Number Should be " + GreaterNo); 
	}

}
