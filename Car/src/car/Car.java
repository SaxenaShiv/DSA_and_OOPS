
package car;
import java.util.*;

public class Car {
Scanner sc = new Scanner (System.in);
    int maxSpeed = 100;
    int minSpeed = 0;
    double weight;
    boolean isTheCarOn = false;
    char condition = 'A';
    
    double weight1 = sc.nextDouble();
    
    public void printVariables(){
        System.out.println( "This is the maxSpeed "+ maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Car familyCar = new Car ();
        familyCar.printVariables();
    }
    
}
