import java.util.*;
public class Lab02_06{
  public static void main (String[]args){
    
    Scanner Light = new Scanner (System.in);
    System.out.println("Please Enter a value");
    int l = Light.nextInt();
    
     int p=1;
     for(int v = 1; v<=l; v++){
     for(int e=0;e<l-v;e++){
        System.out.print(" ");
      }
      for(int u=1;u<=p;u++){
        System.out.print("*");
      }
      p=p+2;
      System.out.println();

     }
    int q=2*(l-1)-1;
    for(int v = 1; v<=l-1; v++){
      for(int e=1;e<=v;e++){
        System.out.print(" ");
      }
      for(int u=1;u<=q;u++){
        System.out.print("*");
      }
      q=q-2;
      System.out.println();
    }
    
  }
}