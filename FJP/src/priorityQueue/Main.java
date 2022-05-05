package priorityQueue;
import java.util.*;
public class Main {
	 static class MyPriorityQueue<T> {
		ArrayList<T>data;
		Comparator cmptr;
		
		MyPriorityQueue(){
			this.data = new ArrayList<>();
			cmptr = null;
		}
		public int size() {
			return data.size();
		}
		public void upheapify(int i) {
			if(i==0) {
				return ;
			}
			int pi = (i-1)/2;
			if(isSmaller(i,pi)) {
				swap(pi,i);
				upheapify(pi);
			}
			
		}
		
		public T peek() {
			if(this.size()==0) {
				return null;
			}
			return data.get(0);
		}
		
		public void add(T val) {
			data.add(val);
			upheapify(data.size()-1);
		}
		
		public T remove() {
			if(this.size()==0) {
				return null;
			}
			swap(0,data.size()-1);
			T val = data.remove(data.size()-1);
			downheapify(0);
			return val;
		}
		public void downheapify(int pi) {
			if(pi==0) {
				return;
			}
			int lci = 2*pi+1;
			int rci = 2*pi+1;
			int minidx = pi;
			
			if(lci<data.size()&&isSmaller(lci,minidx)) {
				minidx = lci;
			}
			if(rci<data.size()&&isSmaller(rci,minidx)) {
				minidx = rci;
			}
			if(minidx!=pi) {
				swap(minidx,pi);
				downheapify(minidx);
			}
			
		}
		public void swap(int a,int b) {
			T ith = data.get(a);
			T jth = data.get(b);
			
			data.set(a,jth);
			data.set(b,ith);
		}
		
		boolean isSmaller(int i,int j) {
			T ith = data.get(i);
			T jth = data.get(j);
			
			if(cmptr!=null) {                         //comparator
				if(cmptr.compare(ith, jth)<0) {
					return true;
				}else {
					return false;
				}
			}else {
				Comparable cith = (Comparable)ith;         //Comparable
				Comparable cjth = (Comparable)jth;
				
				if(cith.compareTo(cjth)<0) {
					return true;
				}else {
					return false;
				}
			}
		}
	 }
	 
	 
	 //Student class
	static class Student implements Comparable<Student>{
		String name;
		int ht;
		int wt;
		
		Student(String name,int ht,int wt){
			this.name = name;
			this.ht = ht;
			this.wt = wt;
		}
		public String toString() {
			return this.name+"->"+this.ht+","+this.wt;
		}
		
		public int compareTo(Student other) {
			return this.ht-other.ht;
		}
	}
	public static void main(String[] args) {
		Student[]students = new Student[5];
		students[0] = new Student("A",180,75);
		students[1] = new Student("B",150,85);
		students[2] = new Student("C",185,72);
		students[3] = new Student("D",165,65);
		students[4] = new Student("E",177,55);
		
		MyPriorityQueue<Student> pq = new MyPriorityQueue<>();
		
	}

}
