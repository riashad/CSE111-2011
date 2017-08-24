import java.util.Scanner;
public class Lab02_25{
    public static void main (String[]args){
        Scanner k = new Scanner (System.in);
        System.out.println("Of how many lines of triangle you want to print?");
        int l = k.nextInt();
        int sp=l-1;
        for(int v=1; v<=l; v++){
            for(int e=0; e<sp; e++){
                System.out.print(" ");
            }
            for(int u=1;u<=v;u++){
                System.out.print(u);
            }
            for(int u=v-1;u>=1;u--){
                System.out.print(u);
            }
            sp--;
            System.out.println();
        }
    }
}