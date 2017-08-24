import java.util.Scanner;
public class Lab02_19{
    public static void main (String[]args){
        Scanner k=new Scanner (System.in);
        System.out.println("Enter the width of the rectangle:");
        int width=k.nextInt();
        System.out.println("Enter the height of the rectangle:");
        int height=k.nextInt();
        for(int h=1;h<=height;h++){
            for(int w=1; w<=width; w++){
                if(h==1||h==height){
                    System.out.print(w);
                }
                else{
                    if(w==1||w==width){
                        System.out.print(w);
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