package strings;

public class Strings {

	public static void main(String[] args) {
		String name = "Shiv Kumar Saxena";
		String name2 = new String (" Shiv ji");
		String name3 = new String (" ");
		
		
		System.out.println(name.charAt(2));
		System.out.println(name.length());
		System.out.println(name.substring(5));
		System.out.println(name.substring(2,17));
		System.out.println(name.contains("z"));
		
		System.out.println(name.equals(name2));
		System.out.println(name3.isEmpty());
		System.out.println(name3.isBlank());
		
		
	}

}
