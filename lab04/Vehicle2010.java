/*
  Riashad Noor
  11121038
  Lab04
 */
public class Vehicle2010 extends Vehicle{
  
  public void UpperRight() {
    
    moveUp();
    moveRight();
  }
  
  public void UpperLeft() {
    
    moveUp();
    moveLeft();
  }
  
  public void LowerRight() {
    
    moveDown();
    moveRight();
  }
  
  public void LowerLeft() {
    
    moveDown();
    moveLeft();
  }
  public boolean equals(Vehicle2010 car2 ){
    
    if(this.x==car2.x && this.y==car2.y){
     
      return(true);
    }else{
      return(false);
    }
    //return (this.x==car2.x && this.y==car2.y);  
  }
}
  
  



