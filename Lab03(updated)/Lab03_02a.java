//Input a word into a String. 
//Print each character on a line by itself. 
//Use charAt method.

import java.util.*;
public class Lab03_02a{
  public static void main(String []args){
    
    Scanner k= new Scanner(System.in);
    System.out.println("Please enter a characte/Symbol");
    
    String me=k.nextLine();
    
    for(int i=0;i<me.length(); i++){
      System.out.println(me.charAt(i));
    } 
    Scanner p= new Scanner(System.in);
    System.out.println("Please enter a characte/Symbol");
    
    String us=p.next();
    
    for(int z=0; z<us.length();z++){
      System.out.println(us.charAt(z));
      
      
    }
  }
}


