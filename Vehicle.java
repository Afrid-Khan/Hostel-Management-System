
package interphase;

public interface Vehicle {
       String BRAND= " Kawasaki";
        
        void changeGear(int newGear);
        void speedUp(int increment);
        void applyBrakes(int decrement);
        
        default void welcome(){
     System.out.println(" Welcome to the Kawasaki Brand !");
    }
    
    static void about(){
    System.out.println(" Kawasaki Heavy Industries Ltd " + "Japaneese public multinational corporation");
    }
    
}
