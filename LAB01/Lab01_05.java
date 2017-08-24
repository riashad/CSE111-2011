import java.util.*;

public class Lab01_05{  
  public static void main(String args[]){
    Scanner k = new Scanner ( System.in );

    System.out.println("Please Enter a value of Voltage");
    double e= k.nextInt();


    System.out.println("Please Enter a value of resistance");
    double r= k.nextInt();
    
    
    System.out.println("Please Enter a value of inductance");
    double L= k.nextInt();
    
    
    System.out.println("Please Enter a value of capacitance");
    double c = k.nextInt();
    
    
    System.out.println("Please Enter a value of frequency");
    int f= k.nextInt();
   
    double I=e/(Math.sqrt((r*r)+(2*Math.PI*f*L-1/2*Math.PI*f*c)*(2*Math.PI*f*L-1/2*Math.PI*f*c)));
    System.out.println("Current I: "+I);
  }
}

