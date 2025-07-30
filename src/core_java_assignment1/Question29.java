package core_java_assignment1;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Question29 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Read inputs
            System.out.print("Enter Register Number (9 characters): ");
            String regNo = scanner.nextLine();

            System.out.print("Enter Mobile Number (10 digits): ");
            String mobileNo = scanner.nextLine();

            // Check length of Register Number and Mobile Number
            if (regNo.length() != 9) {
                throw new IllegalArgumentException("Register Number must be exactly 9 characters.");
            }
            if (mobileNo.length() != 10) {
                throw new IllegalArgumentException("Mobile Number must be exactly 10 characters.");
            }

            // Check mobile number contains digits only
            if (!mobileNo.matches("\\d+")) {
                throw new NumberFormatException("Mobile Number must contain digits only.");
            }

            // Check Register Number contains only alphabets and digits
            if (!regNo.matches("[a-zA-Z0-9]+")) {
                throw new NoSuchElementException("Register Number must contain only letters and digits.");
            }

            // If all checks pass
            System.out.println("valid");

        } catch (IllegalArgumentException | NoSuchElementException e) {
            System.out.println("invalid");
            System.out.println("Reason: " + e.getMessage());
        }

        scanner.close();
    }
}
/*
 Enter Register Number (9 characters): AB12345!9
Enter Mobile Number (10 digits): 9876543210
invalid
Reason: Register Number must contain only letters and digits.
*/
