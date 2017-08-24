/*
  Riashad Noor
  11121038
  Lab04
 */

public class test {
  public static void main (String []  args) {
    SavingsAccount.modifyInterestRate(4.2);
    System.out.println ("Information of 1st Client:\n"+"---------------------------");
    SavingsAccount s1=new SavingsAccount ("saver1","01175296",20000);
    s1.calculateMonthlyInterest();
    s1.printSavingsBalance ();
     System.out.println ();
     
    System.out.println ("Information of 2nd Client:\n"+"---------------------------");
    SavingsAccount s2=new SavingsAccount ("saver2","01175296",30000);
    s2.calculateMonthlyInterest();
    s2.printSavingsBalance ();
    
    System.out.println ();
    System.out.println ("After changing the Annual Interest Rate :\n"+"----------------------------------");
    System.out.println ();
    
    SavingsAccount.modifyInterestRate(5.5);
    System.out.println ("Information of 1st Client:\n"+"---------------------------");
    SavingsAccount s3=new SavingsAccount ("saver1","01175296",20000);
    s3.calculateMonthlyInterest();
    s3.printSavingsBalance ();
     System.out.println ();
    System.out.println ("Information of 2nd Client:\n"+"---------------------------");
    SavingsAccount s4=new SavingsAccount ("saver2","01175296",30000);
    s4.calculateMonthlyInterest();
    s4.printSavingsBalance ();
  }
}