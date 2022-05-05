
public class One_to_hundred_without_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNum(1);

	}
	public static void printNum(int num) {
		if(num <=100) {
			System.out.println(num);
			num++;
			printNum(num);
			}
	}

}
