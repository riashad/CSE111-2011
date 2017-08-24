import java.util.Scanner;
public class Lab02_16{
    public static void main(String[]args){
        Scanner k=new Scanner (System.in);
        System.out.println("How many lines you want to print?");
        int line=k.nextInt();
        for(int run=1;run<=line;run++){
            for(int space=0;space<line-run;space++){
            System.out.print(" ");
            }
            for(int num=1;num<=run;num++){
            System.out.print(num);
            }
            System.out.println();
        }
    }
}