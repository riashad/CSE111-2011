/*
  Riashad Noor
  11121038
  Lab04
 */
public class VehicleUser{
  public static void main (String[]args){
    Vehicle car = new Vehicle ();
    System.out.println(car);
    car.moveUp();
    System.out.println(car);
    car.moveLeft();
    System.out.println(car);
    car.moveDown();
    System.out.println(car);
    car.moveRight();
    System.out.println(car.toString());
    
    System.out.println(car.toString());
  }
}
