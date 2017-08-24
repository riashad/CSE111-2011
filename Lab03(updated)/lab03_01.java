//Input a word into a String. 
//Print the length of the word,
//that is, how many characters / symbols / spaces are there.

import java.util.*;
public class lab03_01{
  public static void main(String[]args){
    
    Scanner k= new Scanner(System.in);
    
    String Naruto="Programming";
    int line=Naruto.length();
    System.out.println("Number of Characters: "+line);
    
    String Gara="Riashad";
    int lane=Gara.length();
    System.out.println("Number of Characters: "+lane);
  }
}