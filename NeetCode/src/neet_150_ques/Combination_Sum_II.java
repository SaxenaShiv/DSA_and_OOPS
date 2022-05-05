package neet_150_ques;
import java.util.*;
import java.io.*;
public class Combination_Sum_II {
	public static void main(String[]a) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []cand = new int[n];
		for(int i=0;i<n;i++) {
			cand[i] = sc.nextInt();
		}
		int t = sc.nextInt();
		
		System.out.println(solution(cand,t));
	}
		private static List<List<Integer>> solution(int[]cand,int t){
			Arrays.sort(cand);
			List<List<Integer>>res = new ArrayList<>();
			List<Integer>curr = new ArrayList<>();
			dfs(cand,t,0,curr,res);
			return res;
		}
		private static void dfs(int[]cand,int t,int pos,List<Integer>curr,List<List<Integer>>res) {
			if(t==0) {
				res.add(new ArrayList<>(curr));
				return;
			}
			if(t<0)
				return;
			int prev=-1;
			for(int i=pos;i<cand.length;i++) {
				if(cand[i]==prev) {
					continue;
				}
				
				curr.add(cand[i]);
				dfs(cand,t-cand[i],i+1,curr,res);
				curr.remove(curr.size()-1);
				prev = cand[i];
			}
			
		}
		
	}


