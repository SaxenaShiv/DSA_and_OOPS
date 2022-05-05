package thirty_day_challenge;
import java.util.*;
public class Day_Eight_dictionaries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		English to Spanish
		Map <String,String>englSpanDictonary = new HashMap<String,String>();
		//putting things inside our dictionary
		englSpanDictonary.put("Monday", "Lunes");
		englSpanDictonary.put("Tuesday", "Martes");
		englSpanDictonary.put("Wednesday", "Miercoles");
		englSpanDictonary.put("Thrusday", "Jueves");
		englSpanDictonary.put("Friday", "Viernes");
		englSpanDictonary.put("Saturday", "Sabado");
		englSpanDictonary.put("Sunday", "Domingo");
		//retrieve things
//		System.out.println(englSpanDictonary.get("Monday"));
//		System.out.println(englSpanDictonary.get("Tuesday"));
//		System.out.println(englSpanDictonary.get("Wednesday"));
//		System.out.println(englSpanDictonary.get("Thrusday"));
//		System.out.println(englSpanDictonary.get("Friday"));
//		//print all the keys
//		System.out.println(englSpanDictonary.keySet());
//		//print all values
//		System.out.println(englSpanDictonary.values());
//		//size
//		System.out.println("The Size of Dictonary is "+englSpanDictonary.size());
		
		System.out.println();
		System.out.println();
		
		Map<String,Boolean> shoppingList = new HashMap<String,Boolean>();       //Boolean obj is created in memory
		//Put some stuff in dictonary
		shoppingList.put("Bread", true);
		shoppingList.put("Dal", Boolean.TRUE);
		shoppingList.put("Tomatoes", Boolean.TRUE);
		//retrieve
		System.out.println(shoppingList.get("Dal"));
		System.out.println(shoppingList.get("Tomatoes"));
		//Key-value Pairs
		System.out.println(shoppingList.toString());
		//Is Empty?
		System.out.println(shoppingList.isEmpty());
		//Clear dictionary
		shoppingList.clear();
		
		System.out.println(shoppingList.toString());
		System.out.println(shoppingList.isEmpty());
	}

}
