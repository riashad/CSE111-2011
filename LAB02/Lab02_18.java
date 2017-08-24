import java.util.Scanner;
public class Lab02_18{
    public static void main (String[]args){
        Scanner k = new Scanner (System.in);
        System.out.println("the length of rhombus you want to print:");
        int l = k.nextInt();
        int sp=l-1;
        for(int v=1; v<=l; v++){
            for(int e=0; e<sp; e++){
                System.out.print(" ");
            }
            for(int u=1;u<=(2*v)-1;u++){
                System.out.print(u);
            }
            sp--;
            System.out.println();
        }
        sp=1;
        for(int v=l; v>1; v--){
            for(int e=0; e<sp; e++){
                System.out.print(" ");
            }
            for(int u=1;u<=(2*v)-3;u++){
                System.out.print(u);
            }
            sp++;
            System.out.println(); 
        }
    }
}