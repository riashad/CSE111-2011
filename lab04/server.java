public class server{
  public static void main(String [] args){
   
    Student s1= new Student();
    Student s2= new Student();
    Student s3= new Student();
    //Student 1
    s1.setName("Riashad");
    s1.setId("11121038");
    s1.setAddress("Shahbag, Dhaka");
    s1.setCgpa(3.0);
    
    System.out.println(s1.getName());
    System.out.println(s1.getId());
    System.out.println(s1.getAddress());
    System.out.println(s1.getCgpa());
    System.out.println();
    
    //Student 2
    s2.setName("Saikat");
    s2.setId("11121036");
    s2.setAddress("Dhanmondi, Dhaka");
    s2.setCgpa(3.5);
    
    System.out.println(s2.getName());
    System.out.println(s2.getId());
    System.out.println(s2.getAddress());
    System.out.println(s2.getCgpa());
    System.out.println();
    
    //Student 3
     s3.setName("Nadim");
    s3.setId("11121037");
    s3.setAddress("Shamoly, Dhaka");
    s3.setCgpa(3.45);
    
    System.out.println(s3.getName());
    System.out.println(s3.getId());
    System.out.println(s3.getAddress());
    System.out.println(s3.getCgpa());
      
  }
}