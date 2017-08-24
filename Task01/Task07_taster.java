public class Task07_taster {
  public void output (int c) {
    
    if(c>0) {
      System.out.println(c);
      output(c-1);
    }
  }
}