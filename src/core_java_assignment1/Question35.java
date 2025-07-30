package core_java_assignment1;

import java.util.Scanner;

//User-defined Exception
class InvalidEmployeeCode extends Exception {
 public InvalidEmployeeCode(String message) {
     super(message);
 }
}

//Employee Class
class Employee {
 private String employeeCode;
 private String name;
 private int age;

 public Employee(String employeeCode, String name, int age) {
     this.employeeCode = employeeCode;
     this.name = name;
     this.age = age;
 }

 public void displayDetails() {
     System.out.println("\n--- Employee Details ---");
     System.out.println("Employee Code : " + employeeCode);
     System.out.println("Name          : " + name);
     System.out.println("Age           : " + age);
 }
}

//Main Class
public class Question35 {
 // Method to validate employee code using regex
 public static void validateEmployeeCode(String code) throws InvalidEmployeeCode {
     // Format: YY-D-XXX e.g., 81-F-112
     if (!code.matches("\\d{2}-[FS]-\\d{3}")) {
         throw new InvalidEmployeeCode("Invalid Employee Code Format! Must be like '81-F-112'");
     }
 }

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     try {
         // Reading details
         System.out.print("Enter Employee Code (Format: YY-F-XXX or YY-S-XXX): ");
         String code = sc.nextLine();

         // Validate code
         validateEmployeeCode(code);

         System.out.print("Enter Employee Name: ");
         String name = sc.nextLine();

         System.out.print("Enter Employee Age: ");
         int age = sc.nextInt();

         // If valid, create object
         Employee emp = new Employee(code, name, age);
         emp.displayDetails();

     } catch (InvalidEmployeeCode e) {
         System.out.println("Exception: " + e.getMessage());
     } catch (Exception e) {
         System.out.println("Something went wrong: " + e.getMessage());
     } finally {
         sc.close();
     }
 }
}
/*
 Enter Employee Code (Format: YY-F-XXX or YY-S-XXX): 81-F-112
Enter Employee Name: prabha
Enter Employee Age: 25

--- Employee Details ---
Employee Code : 81-F-112
Name          : prabha
Age           : 25
*/
