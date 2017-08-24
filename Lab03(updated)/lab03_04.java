/*Imagine user will give you some 
 numbers, say 8 numbers.
 All numbers are between 2 and 4.*/ 


import java.util.*;
public class lab03_04{
  public static void main(String [] args){
    
    Scanner k=new Scanner(System.in);
    System.out.println("Please enter a Character/Symbol");
    String bu=k.next();
    int []position=new int[26];
    
    for(int i=0; i<bu.length();i++){
      
      int t=bu.charAt(i)-65;
      position[t]++;
    }
      for(int e =65;e<=90;e++){
      System.out.println((char) e + " which is "+ e + " was found "+ position[e-65] + " times");
    }
  }
}

