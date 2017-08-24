//Input a word into a String. 
//Print each character on a line by itself. 
//Use charAt method.

import java.util.*;
public class Lab03_02{
  public static void main(String []args){
    
    Scanner k= new Scanner(System.in);
    
    String Kira= "Programming";
   
    for(int c=0;c<Kira.length();c++) {
      System.out.println(Kira.charAt(c));
    }
  }
}