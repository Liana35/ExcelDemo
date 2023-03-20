package class33;

public class HW4Exeptions {
    /*Create a method checkUserName that will throw a runtime exception.
    Method should throw an exception when entered username is less than 5 characters.*/

    /*if(name.length()<8){
        throw new LazyException("Lazy person found");
    }*/

    public static void checkUserName(String name){
        if(name.length()<5){
            throw new RuntimeException("Name should be longer than 5 letters");
        } else{
            System.out.println("Name is correct");
        }
    }

    public static void main(String[] args) {
        checkUserName("Rita");
    }
}
