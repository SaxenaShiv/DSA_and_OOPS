package loops;

public class Continue {

	public static void main(String[] args) {
		for (int i=1; i<=100;i++) {
			
			if (i>= 80 && i <=90) {
				continue;
			}
			System.out.println(i);
		}

	}

}
