import java.util.Scanner;
public class Lab02_24{
    public static void main (String[]args){
        Scanner k = new Scanner (System.in);
        System.out.println("Enter the highest number of your Palindrome:");
        int l = k.nextInt();
        for(int v=1; v<=l;v++){
            System.out.print(v);
        }
        for(int v=l-1; v>=1;v--){
            System.out.print(v);
        }
        System.out.println();
    }
}