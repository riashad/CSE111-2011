import java.util.*;
public class Lab02_07{
  public static void main(String[]args){
    
    Scanner k= new Scanner(System.in);
    
    System.out.println("Please enter a value");
    int a=k.nextInt();//linelimit
    
    System.out.println("Please enter another value");
    int b=k.nextInt();//digitlimit
    
    for(int i=1; i<=a;i++){
      if(i==1 || i==a){
        for(int j=1; j<=b;j++){
          System.out.print("*");
        }
      }else{
        for(int j=1;j<=b;j++){
          if(j==1 || j==b){
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