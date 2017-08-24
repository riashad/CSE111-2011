import java.util.*;
public class Lab02_08{
  public static void main(String []args){
    
    Scanner k= new Scanner(System.in);
    
    System.out.println("Please enter a value");
    int a=k.nextInt();
    
    for(int i=1; i<=a;i++){
      
      if(i==1 ||i==a ){
        for(int j=1; j<=i;j++){
          System.out.print("*");
        }
      }else{
          for(int j=1; j<=i;j++){
            if(j==1 ||j==i){
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