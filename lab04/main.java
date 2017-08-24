public class main {
  public static void main (String args []) {
    
    System.out.println ("Information of 1st Client:\n"+"---------------------------");
    BankAccount s1=new BankAccount ("acc1","01175296","Dhaka",100);
    s1.addInterest();
    System.out.println ();
    System.out.println ("Information of 2nd Client:\n"+"---------------------------");
    BankAccount s2=new BankAccount ("acc2","11156423","CTG",200);
    System.out.println ();
    System.out.println ("Information of 3rd Client:\n"+"---------------------------");
    BankAccount s3=new BankAccount ("acc3","11101056","Khulna",500);
    s3.addInterest();
  }
}