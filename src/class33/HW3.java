package class33;

public class HW3 {

      /*  3) Create a method to check age eligibility that will
        throw a runtime exception. Method should throw an exception age is less than 16.*/
      public static void eligibility (int age){
          if(age<16){
              throw new RuntimeException("You are under age") ;
          } else{
              System.out.println("You are qualified");
          }
      }

    public static void main(String[] args) {
        eligibility(10);
    }
}
