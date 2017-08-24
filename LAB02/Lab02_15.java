import java.util.Scanner;
public class Lab02_15{
    public static void main(String[]args){
        Scanner k=new Scanner (System.in);
        System.out.println("How many lines you want to print?");
        int line=k.nextInt();
        int sp=line-1;
        for(int run=line;run>=1;run--){
            for(int space=0;space<sp;space++){
            System.out.print(" ");
            }
            for(int num=run;num<=line;num++){
            System.out.print(num);
            }
            System.out.println();
            sp--;
        }
    }
}
            
            
            