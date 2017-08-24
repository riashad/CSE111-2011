import java.util.Scanner;
public class Lab02_10{
    public static void main (String[]args){
        Scanner k= new Scanner (System.in);
        System.out.println("how many lines of triangle you want to print?");
        int l = k.nextInt();
        int sp=l-1;
        for(int v=1; v<=l; v++){
            for(int e=0; e<sp; e++){
                System.out.print(" ");
            }
            for(int u=1;u<=(v+(v-1));u++){
                if(v==1||v==l){
                    System.out.print("*");
                }
                else{
                    if(u==1||u==(v+(v-1))){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            sp--;
            System.out.println();
        }
    }
}
