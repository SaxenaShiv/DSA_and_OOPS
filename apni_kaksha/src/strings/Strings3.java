package strings;

public class Strings3 {

	public static void main(String[] args) {
		String Cars = "Buggatti,Lamborghini,Mercedes,BMW,Madza";
		String allcars [] = Cars.split(",");
		for (String car : allcars) {
		System.out.println(car);
		}
	}

}
