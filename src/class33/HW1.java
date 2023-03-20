package class33;

import com.sun.source.tree.TryTree;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
       // How would handle InputMismatchException? Input Mismatch Exception when user enters mismatch value then programmer expected.

        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Enter your age");
           int name= input.nextInt();
        } catch(InputMismatchException e){
            System.out.println("invalid");
            //input.close();
        }
    }
}
