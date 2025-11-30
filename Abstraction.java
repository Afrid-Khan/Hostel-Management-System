package abstraction;
import java.util.Scanner;
public class Abstraction {

    public static void main(String[] args) {
      
        Scanner s = new Scanner(System.in);
        Rectangle r1= new Rectangle(5,10);
        Triangle c1= new Circle();
        
        System.out.println( r1.toString());
        System.out.println( r1.getArea());
        System.out.println( t1.toString());
        System.out.println( t1.getArea());
        
        
        
    }
    
}
