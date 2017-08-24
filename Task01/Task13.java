import java.util.*;
public class Task13 {
  public static void main(String [] args) {
    Scanner k= new Scanner(System.in);
    System.out.println("Please enter a value: "); 
    int a=k.nextInt();
    
    for (int counter = 0; counter <= a; counter++) {
     //System.out.print( counter+"!"+"="+" ");
      System.out.println (fibonacci (counter));
      
    }
  }
  public static int fibonacci (int c) {
    
    if(c==0 || c==1) {
      return 1;
    } else {
      return fibonacci (c-1) +fibonacci (c-2);
      
    }
  }
  
}