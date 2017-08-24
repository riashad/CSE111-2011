import java.util.*;
public class lab01_02{
  public static void main(String[]args){
    
    Scanner k= new Scanner(System.in);
    int a[]=new int[10];
    int i=0;
    while(i<a.length){
      a[i]=k.nextInt();
      int m=0; 
           System.out.print("You have entered ");
      while(m<=i){
        if(m==i){
          System.out.println(a[m]);
        }else{    
        System.out.print(a[m]+",");
        }
        m++;
      }
 
      i++;
    }
  }
}


 