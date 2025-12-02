
package interphase;

public class Bike implements Vehicle {
    private int speed;
    private int gear;
    
    public Bike(){
    speed= 0;
    gear=0;
  }
    @Override
    public void changeGear(int newGear){
       gear= newGear;
    }
    
    @Override
    public void speedUp(int increment){
    speed= speed + increment;
    }
    
    public void applyBrakes(int decrement){
    speed= speed - decrement;
    }
    public void welcome(){
    Vehicle.super.welcome();
        System.out.println("Let the good times roll ");
    }
    public void printState(){
        System.out.println("Speed : " +speed + ", gear : " +gear);
    }
    
}
