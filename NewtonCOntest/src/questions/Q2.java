package questions;
import java.util.*;
public class Q2 {

	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		HashMap<Character,Integer> map= new HashMap<>();
		int Nutan = 0;
		int Tulsa = 0;
		String str = sc.nextLine();
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);

			if(ch=='N'){
				map.put(ch,map.getOrDefault(ch,0)+1);
				Nutan = map.get(ch);
			}
			else if(ch=='T'){
				map.put(ch,map.getOrDefault(ch,0)+1);
				Tulsa = map.get(ch);
			}
		}
		if(Nutan>Tulsa){
			System.out.println("Nutan");
		}else{
			System.out.println("Tulsa");
		}
	}

}
