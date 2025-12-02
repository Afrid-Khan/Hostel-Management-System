
package interphase;

public class Interface {

    public static void main(String[] args) {
       
     Bike b= new Bike();
      b.printState();
      b.changeGear(3);
      b.speedUp(50);
      b.printState();
      
      b.welcome();
     
        System.out.println(Vehicle.BRAND);
        Vehicle.about();
    }
    
}
