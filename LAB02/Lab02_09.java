import java.util.*;
public class Lab02_09{
  public static void main (String[]args){
    
    Scanner Light = new Scanner (System.in);
    System.out.println("Please Enter a value");
    int l = Light.nextInt();
    for(int v = 1; v<=l; v++){
      for(int e=0;e<l-v;e++){
        System.out.print(" ");
      }
      if(v==1||v==l){
        for(int u=1;u<=v;u++){
          System.out.print("*");
        }
      }else{
        for(int u=1;u<=v;u++){
          if(u==1||u==v){  
            System.out.print("*");
          }else{        
            System.out.print(" ");
          }
        }
      }
      System.out.println();
    }
  }
}
