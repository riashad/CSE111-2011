import java.util.Scanner;
public class Lab02_22{
    public static void main (String[]args){
        Scanner k = new Scanner (System.in);
        System.out.println("Of how many lines of triangle you want to print?");
        int l = k.nextInt();
        int sp=l-1;
        for(int v=1; v<=l; v++){
            for(int e=0; e<sp; e++){
                System.out.print(" ");
            }
            if(v==1||v==l){
                for(int u=1;u<=(2*v)-1;u++){
                    System.out.print(u);
                }
            }
            else{
                for(int u=1;u<=(2*v)-1;u++){
                    if(u==1||u==(2*v)-1){
                        System.out.print(u);
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