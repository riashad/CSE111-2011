import java.util.Scanner;
public class Lab02_14{
    public static void main (String[]args){
        Scanner k = new Scanner (System.in);
        System.out.println("Of how many lines of triangle you want to print?");
        int l = k.nextInt();
        for(int v = 1; v<= l; v++){
            for (int c=1; c<=v;c++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}