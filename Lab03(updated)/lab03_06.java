import java.util.*;
public class lab03_06{
  public static void main(String [] args){
    
    Scanner k=new Scanner(System.in);
    System.out.println("Please Enter a Character");
    
    String pre=k.next();
    
    String post="==THE END==";
    
    System.out.println(pre);
    System.out.println(pre.concat(post));
    System.out.println(pre);
  }
}
