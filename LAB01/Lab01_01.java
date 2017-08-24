import java.util.*;
public class Lab01_01{
  public static void main(String[]args){
    
    Scanner k=new Scanner(System.in);
    int a[]=new int[10];
    int c=0;
    while(c<a.length){
      a[c]=k.nextInt();
      c++;
    }
    int j=9;
    while(j>0){
      System.out.println(a[j]);
      j--;
    }
  }
}