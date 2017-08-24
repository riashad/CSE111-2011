/*There are two ways to print 
ASCII code / Unicode / int 
value of each character.*/

import java.util.*;
public class lab03_03{
  public static void main(String [] args){
    
    Scanner k=new Scanner(System.in);
    System.out.println("Please Enter a Character");
    String bu=k.next();
    
    for(int i=0;i<bu.length();i++){
      
      //int codefora=bu.codePointAt(i);
      System.out.print(bu.charAt(i)+":");
      System.out.println(bu.codePointAt(i));//or use: codefora
    }
  }
}