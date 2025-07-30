package core_java_assignment1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question31 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demonstrate InputMismatchException
        try {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();  // May throw InputMismatchException if input is not an int
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException occurred: Please enter a valid integer.");
            scanner.next(); // Clear the invalid input
        }

        // Demonstrate StringIndexOutOfBoundsException
        try {
            System.out.print("Enter a string: ");
            String text = scanner.next();
            System.out.print("Enter index to access character: ");
            int index = scanner.nextInt();  // Make sure to enter valid int this time
            char ch = text.charAt(index);  // May throw StringIndexOutOfBoundsException
            System.out.println("Character at index " + index + ": " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException occurred: Invalid index!");
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException occurred: Please enter a valid index.");
        }

        scanner.close();
    }
}
