package thirty_day_challenge;
import java.util.*;
public class Heap_Sort {
     public static void main (String[]args) {
    	 int arr[] = {1, 12, 9, 5, 6, 10};
    	 int n =arr.length ;
    	 heapSort(arr, n);
    	 
    	 System.out.println("Sorted Array is:");
    	 printArray(arr,n);
     }
     
     public static void heapSort(int []arr,int n) {
    	//MAX HEAP
    	 for(int i=n/2-1;i>=0;i--) {
    		 heapify(arr,n,i);
    	 }
    	 
    	 //HEAP SORT
    	 for(int i= n-1;i>=0;i--) {
    		 swap(arr[0],arr[i]);
    		 //HEAPIFYING ROOT ELEMENT
        	 heapify(arr,i,0);
    	 }
    	 
    	
     }
     public static void printArray(int []arr,int n) {
    	 for(int i=0;i<n;i++) {
    		 System.out.print(arr[i]+" ");
    	 }
    	 System.out.println();
     }
     
     public static void heapify(int []arr,int n,int i) {
    	 int largest = i;
    	 int left = 2*i+1;
    	 int right = 2*i+2;
    	 
    	 if(left <n && arr[left]>arr[largest]) {
    		 largest = left;
    	 }
    	 
    	 if(right < n && arr[right]>arr[largest]) {
    		 largest = right;
    	 }
    	 
    	 if(largest != i) {
    		 swap(arr[i],arr[largest]);
    		 heapify(arr,n,largest);
    	 }
     }
     public static void swap(int a,int b) {
    	 int temp = a;
    	 a = b;
    	 b = temp;
     }
}
