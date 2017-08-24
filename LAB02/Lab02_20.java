import java.util.Scanner;
public class Lab02_20{
    public static void main (String[]args){
        Scanner k = new Scanner (System.in);
        System.out.println("Of how many lines of triangle you want to print?");
        int line = k.nextInt();
        for(int v=1;v<=line; v++){
            if(v==1||v==line){
                for (int c=1; c<=v;c++){
                    System.out.print(c);
                }
            }
            else{
                for (int c=1; c<=v;c++){
                    if(c==1||c==v){
                        System.out.print(c);
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}