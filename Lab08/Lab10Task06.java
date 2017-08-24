import java.util.*;
import java.io.*;

public class Lab10Task06 {
  public static void main(String [] args) {
    
    
    Scanner k =new Scanner (new File("f:\\Lab08\\a.txt")); 
    System.out.println("Please Enter 3 number");
    String ektaLine;
    int a;
    int sum=0;
    
    for(int i=0; i<3; i++){
      
        ektaLine=k.nextLine();
        a=Integer.parseInt(ektaLine);
       sum+=a;
    }
    System.out.println(sum);
    
  }
}
