import java.util.Scanner;
public class Lab02_11{
  public static void main (String[]args){
    Scanner k= new Scanner (System.in);
    System.out.println("the length of the hollow rhombus you want to print:");
    int l = k.nextInt();
    int sp=l-1;
    for(int v=1; v<=l; v++){
      for(int e=0; e<sp; e++){
        System.out.print(" ");
      }
      for(int u=1;u<=(v+(v-1));u++){
        if(u==1||u==(2*v)-1){
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
      }
      sp--;
      System.out.println();
    }
    int o=(2*l)-3;
    sp=1;
    for(int v=1; v<=l-1; v++){
      for(int e=0; e<sp; e++){
        System.out.print(" ");
      }
      for(int u=1;u<=o;u++){
        if(u==1||u==o){
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
      }
      o-=2; sp++;
      System.out.println();
    }
  }
}
