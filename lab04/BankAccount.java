public class BankAccount {
  String name,AccountId,address;
  double balance,interest;
  public BankAccount(String n,String ac,String a, double b) {
    name=n;
    AccountId=ac;
    address=a;
    balance=b;
    
    System.out.println("Name : "+n+"\n"
                         +"Account ID : "+ac+"\n"
                         +"Address : "+a+"\n"
                         +"Balance : "+b+"\n");
  }
  public void addInterest() {
    interest=balance+(balance*0.07);
    System.out.println ("Balance after adding Interest : "+interest);
  }
}