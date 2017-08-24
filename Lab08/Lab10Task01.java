import java.util.*;

public class Lab10Task01 {
  public static void main(String [] args) {
    
    Scanner k= new Scanner(System.in);
    System.out.println("Please Enter 3 number");
    int i;
    int []a= new int[3];
    for( i=0; i<a.length; i++){
      a[i]=k.nextInt();
    }
    int sum=0;
    i=0;
    sum= sum+ a[i]+ a[i+1]+a[i+2];
    System.out.println(sum);
    
  }
}
