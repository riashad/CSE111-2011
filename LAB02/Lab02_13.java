import java.util.Scanner;
public class Lab02_13{
    public static void main (String[]args){
        Scanner k = new Scanner (System.in);
        System.out.println("Please enter the width of the rectangle?");
        int w = k.nextInt();
        System.out.println("Please enter the height of the rectangle?");
        int h = k.nextInt();
        for (int v = 0; v < h; v++){
            for( int e = 1; e <= w; e++){
                System.out.print(e);
            }
            System.out.println();
        }
    }
}