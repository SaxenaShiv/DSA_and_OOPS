package greedy_Algo;
import java.util.*;

class ZeroOneKnapsack_Job_Schedule{
	 public static ArrayList<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
		   HashMap<Character,ArrayList<Integer>>map = new HashMap<>();
		   for(int i=0;i<26;i++) {        //alphabets hashmap
			   map.put((char)('a'+i), new ArrayList<>());
		   }
		   for(String word:words) {       //creating mask
			   int mask = 0;
			   for(Character ch: word.toCharArray()) {
				   mask = mask|1<<(ch-'a');
			   }
			   HashSet<Character>unique = new HashSet<>();       //checking redundancy using this hashset
			   for(Character ch:word.toCharArray()) {
				   if(unique.contains(ch)) {
					   continue;
				   }
				   unique.add(ch);
				   map.get(ch).add(mask);
			   }
		   }
		   
		   //now checking from puzzles
		   ArrayList<Integer>fans = new ArrayList<>();
		   for(String puzzle:puzzles) {
			   int pmask = 0;
			   ArrayList<Integer>wordsTocheck = map.get(puzzle.charAt(0));        //creating array check list
			   for(Character ch:puzzle.toCharArray()) {        //generating puzzle mask
				   pmask = pmask|1<<(ch-'a');
			   }
			   
			   int count = 0;
			   
			   for(int wmask:wordsTocheck) {   
				   if((wmask & pmask)==wmask)          //checking that mask is correct or not
					   count++;
			   }
			   fans.add(count);
		   }
		    return fans;
		  }
	public static void main (String args[]) {
		 Scanner scn = new Scanner(System.in);
		    int n = scn.nextInt();
		    String[] words = new String[n];
		    for (int i = 0 ; i < words.length; i++) {
		      words[i] = scn.next();
		    }
		    int m = scn.nextInt();
		    String[] puzzles = new String[m];
		    for (int i = 0 ; i < m ; i++) {
		      puzzles[i] = scn.next();
		    }
		    ArrayList<Integer> ans = findNumOfValidWords(words, puzzles);
		    for (int i = 0 ; i < m ; i++) {
		      System.out.println(puzzles[i] + " -> " + ans.get(i));
		    }

	}
}