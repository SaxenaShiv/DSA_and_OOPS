package calculatorAPI;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int calculate(int a,int b,char op) {
		int res=0;
		switch(op) {
		case '+':
			res = a+b;
			break;
		case '-':
			res = a-b;
			break;
		case '*':
			res = a*b;
			break;
		case '/':
			if(b!=0) {
				res = a/b;
			}
			break;
			default:
				System.out.println("Invalid Operation");
		}
		return res;
	}

}
