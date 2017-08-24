import java.util.Scanner;
public class Lab02_12{
    public static void main (String[]args){
        Scanner k = new Scanner (System.in);
        System.out.println("Entet the last number?");
        int l = k.nextInt();
        for(int v=1; v<=l;v++){
            System.out.print(v);
        }
        System.out.println();
    }
}