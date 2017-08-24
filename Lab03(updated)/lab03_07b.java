import java.util.*;
public class lab03_07b{
  public static void main(String []args){
    
    Scanner k=new Scanner(System.in);
    
    System.out.println("Please Enter First Char");
    String first=k.next();
    
    
    System.out.println("Please Enter Second Char");
    String second=k.next();
    
    
    System.out.println(first.compareToIgnoreCase(second));
  }
}
