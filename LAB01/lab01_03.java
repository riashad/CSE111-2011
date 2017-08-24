import java.util.*;
public class lab01_03{
  public static void main(String[]args){
    
    Scanner k= new Scanner(System.in);
    int a[]= new int[10];
    
    for(int i=0; i<a.length; i++){
      System.out.println("Please Enter a value");
      a[i]=k.nextInt();
    }
    
    for(int i=0;i<9;i++){
      for(int j=i+1;j<a.length;j++ ){
        if(a[i]<a[j]){
          int temp=a[i];
          a[i]=a[j];
          a[j]=temp;
        }
      }
    }
    
    for(int i=0;i<a.length;i++){
      System.out.println(a[i]);
      
      
    }
  }
}

