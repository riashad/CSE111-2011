import java.util.Scanner;
public class Lab02_21{
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
                if(run==line||run==1){
                    System.out.print(num);
                }
                else{
                    if(num==run||num==line){
                        System.out.print(num);
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
            sp--;
        }
    }
}