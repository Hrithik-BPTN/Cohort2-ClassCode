package week2.thursday;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample1 {

    public static void main(String[] args) {

        // Exception - an unwanted event that occurs during the execution of program that disrupts the
        // normal flow of the instructions.

        Scanner scanner = new Scanner(System.in);
        try {  // We put risky code in the try block

            System.out.println("Enter a Whole number to divide: ");
            int x = scanner.nextInt();

            System.out.println("Enter a Whole number to divide by: ");
            int y = scanner.nextInt();

            int result = x / y;
            System.out.println("result: " + result);

        } catch(ArithmeticException ae) { // Handle the relevant exceptions
            System.out.println("Division by Zero not allowed!!");

        } catch(InputMismatchException | NullPointerException  ime){  // | -> OR
            System.out.println("Plz provide whole numbers as input!!");
        } catch(Exception e){ // Catches any exception, generally considered a lazy practice
            System.out.println("Something Went Wrong!");
        } finally { // Generally used to close files, scanners e.t.c. This part of the code will run anyway.
            scanner.close();
        }

    }
}
