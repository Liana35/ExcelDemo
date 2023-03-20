package class33;

import java.util.ArrayList;
import java.util.List;

public class HW2 {

    /*Create a static method that will return a List of Exceptions.
      Inside your method create objects of 4 exception classes using try and catch blocks and store them inside your list.
      Call your method inside main and print name and details of all Exception objects.*/
    public static List<Exception> exceptionList() {
        List<Exception> list = new ArrayList<>();

        NullPointerException one = new NullPointerException();
        try {
            String str = null;
            str.length();
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception: cannot access a method on a null object");
            list.add(one);
        }

        ClassNotFoundException two = new ClassNotFoundException();
        try {
            throw two;
        } catch (ClassNotFoundException e) {
            System.out.println("JVM has traversed the entire classpath and not found the class you've attempted to reference");
            list.add(two);
        }

        ArithmeticException three = new ArithmeticException();
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Cannot divide by 0");
            list.add(three);
        }

        RuntimeException four = new RuntimeException();
        try {
            throw four;
        } catch (RuntimeException e) {
            System.out.println("A runtime error occurs while a program is running or when you first attempt to start the application. ");
            list.add(four);
        }
        return list;
    }

    public static void main(String[] args) {
        for (Exception x : exceptionList()) {
            System.out.println();
            }


        }
    }
