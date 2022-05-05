package time_space_complexity;

import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
        int []arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int []ans = mergeSort(arr,0,arr.length-1);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}

	}
	 public static int[] mergeSort(int[] arr, int lo, int hi) {
		    //write your code here
		    if(lo == hi){
		        int []bc = new int[1];
		        bc[0] = arr[lo];
		        return bc;
		    }
		    int mid = (lo+hi)/2;
		    int []fh = mergeSort(arr,lo,mid);
		    int []sh = mergeSort(arr,mid+1,hi);
		    int []ans = Merge2SortedArray(fh,sh);

		    return ans;
		  }

		  //used for merging two sorted arrays
	 public static int[]Merge2SortedArray(int[] a,int[] b){
	      int i=0;
	      int j=0;
	      int k=0;
	      
	      int []ans = new int[a.length+b.length];
	      while(i<a.length && j<b.length){
	          if(a[i]<=b[j]){
	              ans[k] =a[i];
	              i++;
	              k++;
	          }
	          else{
	              ans[k] = b[j];
	              j++;
	              k++;
	          }
	      }
	      while(i<a.length){
	          ans[k] = a[i];
	          k++;
	          i++;
	      }
	      while(j<b.length){
	          ans[k] = b[j];
	          k++;
	          j++;
	      }
	      return ans;
	  }

}
