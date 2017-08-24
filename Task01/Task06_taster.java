public class Task06_taster {
  public void output (int c) {
    
    if (c>0) {//base case
      output(c-1); //recursive call/step
      System.out.println(c);
    }
  }
}