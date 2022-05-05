package conditionalStatement;

public class NestedIfElse {

	public static void main(String[] args) {
		int a = 120 , b = 140 , c = 180;

	int result = 0;
//		if (a>b ) {
//			if (a>c) {
//				result = a;
//			}else {
//				result = c;
//			}
//		}else {
//			if (b>c) {
//				result = b;
//			}else {
//				result = c;
//			}
//		}
		
	result = a>b ? a>c ? a : c : b>c ?b : c;        // ? is IF and : is ELSE
		System.out.println("The Largest No. is "+ result);

	}

}
