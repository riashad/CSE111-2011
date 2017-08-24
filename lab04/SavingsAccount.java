/*
  Riashad Noor
  11121038
  Lab04
 */

public class SavingsAccount {
  private String name,accountId;
  private double savingsBalance, tb, mi;
  static double annualInterestRate;
  public SavingsAccount(String n,String aid, double sb) {
    name=n;
    accountId=aid;
    savingsBalance=sb;
  }
  public void printSavingsBalance() {
    System.out.println ("Name : "+name+"\n"
                          +"Account ID : "+accountId+"\n"
                          +"Balance : "+savingsBalance+"\n"
                          +"Monthly Interest : "+mi+"\n"
                          +"Balance after adding Interest : "+tb);
  }
  public void calculateMonthlyInterest() {
    mi=savingsBalance*annualInterestRate/12;
    tb=savingsBalance+(savingsBalance*annualInterestRate/12);
  }
  public static void modifyInterestRate(double p) {
    annualInterestRate=p;
  }
}