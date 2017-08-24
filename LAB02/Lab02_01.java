import java.util.*;
public class Lab02_01{
  public static void main(String []args){
    
    Scanner k= new Scanner(System.in);
    int a[]=new int[6];
    
    for(int i=1; i<=a.length;i++){
      System.out.println("Please Enter value");
      a[i]=k.nextInt();
      
      for( i=1; i<=a.length;i++)
        System.out.print("*");
        System.out.println(" ");
    }
  }
}

