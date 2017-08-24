/*
  Riashad Noor
  11121038
  Lab04
 */

public class Vehicle{
  
  int x; int y;
  
  public void moveUp(){
    y++;
  }
  
  public void moveDown(){
    y--;
  }
  
  public void moveRight(){
    x++;
  }
  public void moveLeft(){
    x--;
  }
  
  public String toString(){
     return "("+x+", " +y+")";
  }
}
  