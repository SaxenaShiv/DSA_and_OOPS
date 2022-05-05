package test;

public class Car {
	int weight;
	String colour;
	double speed;
	
	Car(){                                       // Constructor default
		System.out.println("default");
		
	}
	
	Car(int x,String s){
		System.out.println("Parameterized");     // Constructor Parameterized
		weight=x;
		colour = s;
		//speed = d;
		
	}
	public static void main(String args[]) {
		Car object = new Car();  //default cons
		
		Car obj2  = new Car(10,"yellow");
		System.out.println(obj2.colour);
		
		System.out.println(object);//object hashcode
		
		  
	}

}

