import java.util.*;
public class Task04{
  public static void main(String[]args){
    String kisuShongkha = "74.5                89          \n    45";
    StringTokenizer kisuNnumber = new StringTokenizer(kisuShongkha, "\n"); 
    
    while(kisuNnumber.hasMoreTokens()) {
      String key = kisuNnumber.nextToken();
      String val = kisuNnumber.nextToken(); 
      System.out.println( key+val); 
//      while(kisuNnumber.hasNextDouble()){
//        System.out.println(kisuNnumber.nextDouble());
      //}
    }
      
      String golpo = "still you can find some teachers who dislike such co-curricular \n"+
        "activities like Programming Contests. They do not understand contests are\n"+
        "far more interesting and challenging than whatever slides he was showing in the classroom.\n"+
        "To be a good contestant, one needs to be resourceful."+
        "Apart from a working brain, the primary resource for a contestant would be books.\n"+
        "And a good source of books and training materials is the Internet.";
      StringTokenizer k2 = new StringTokenizer(golpo, "\n"); 
    
    while(k2.hasMoreTokens()) {
      String key = k2.nextToken();
     // String val = k2.nextToken(); 
      System.out.println(key ); 
     
//      while(k2.hasNextLine()){
//        System.out.println(k2.nextLine());
      }
      //Write code below that adds the above numbers and prints sum.
     String s="23 3 8 20 32";
    
    Scanner k3= new Scanner(s);
    int sum=0;
    System.out.println("\n ");
    System.out.println("Number will show serial wise as given: ");
    while(k3.hasNextInt()) {
      
      int p=k3.nextInt();
      
      sum=sum+p;
    
      System.out.println( p);
    }
    System.out.println("\n ");
    System.out.println("Total of given numbers: "+sum);
    
    
    
    
  }
}