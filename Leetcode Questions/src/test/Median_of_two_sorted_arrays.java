package test;

public class Median_of_two_sorted_arrays {
	
	public static double medianOf2SortedArrays(int[]a1,int a2[]){
		
		if(a1.length>a2.length) {
			int []temp = a1;
			a1 = a2;
			a2 = temp;
		}
		
		int lo = 0;
		int hi = a1.length;
		int te = a1.length+a2.length;
		while(lo<=hi) {
			int aleft = (lo+hi) /2;
			int bleft = (te+1)/2-aleft;
			
			int alm1 = (aleft==0)?Integer.MIN_VALUE:a1[aleft-1];
			int al = (aleft==a1.length)?Integer.MAX_VALUE:a1[aleft];
			int blm1 = (bleft==0)?Integer.MIN_VALUE:a2[bleft-1];
			int bl = (bleft==a2.length)?Integer.MAX_VALUE:a2[bleft];
			
			if(alm1<=bl && blm1<=al) {
				
				double median = 0.0;
				
				if(te%2==0) {
					int lmax = Math.max(alm1, blm1);
					int rmin = Math.min(al, bl);
					median = (lmax+rmin)/2.0;
				}else {
					int lmax = Math.max(alm1, blm1);
					median = lmax;
				}
				return median;
			}else if(alm1>bl) {
				hi = aleft-1;
			}else if(blm1>al) {
				lo = aleft+1;
			}
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		int []a1={1,2};
		int []a2= {3,4};
		System.out.print(medianOf2SortedArrays(a1,a2));

	}

}
