import java.util.*;
public class Task12 {
  public static void main(String [] args) {
    Scanner k= new Scanner(System.in);
    System.out.println("Please enter a value: "); 
    int a=k.nextInt();
    for (int counter = 0; counter <= 10; counter++) {
      System.out.print( counter+"!"+"="+" ");
      System.out.println (output(counter));
      
    }
  }
  public static int output (int c) {
    
    if(c<=1) {
      return 1;
    } else {
      return c *output(c-1);
      
    }
  }
  
}