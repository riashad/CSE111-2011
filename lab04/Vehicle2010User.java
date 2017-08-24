/*
  Riashad Noor
  11121038
  Lab04
 */

public class Vehicle2010User{
    public static void main (String[]args){
      
        Vehicle2010 car = new Vehicle2010 ();
        Vehicle2010 car2 = new Vehicle2010();
        
        System.out.println(car);
        car.LowerLeft();
        
        System.out.println(car);
        car2.moveLeft();
        
        System.out.println(car.equals(car2));
        car2.moveDown();
        
        System.out.println(car.equals(car2));
        
        
    }
}
