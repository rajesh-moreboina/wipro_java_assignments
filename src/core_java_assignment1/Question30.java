package core_java_assignment1;

import java.util.Scanner;

//Functional Interface
@FunctionalInterface
interface Minimum {
 double minimum3(double a, double b, double c);
}

public class Question30 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     // Input three float values
     System.out.print("Enter first number: ");
     double num1 = sc.nextDouble();

     System.out.print("Enter second number: ");
     double num2 = sc.nextDouble();

     System.out.print("Enter third number: ");
     double num3 = sc.nextDouble();

     // Lambda expression using method reference inside logic
     Minimum min = (a, b, c) -> Math.min(Math.min(a, b), c);

     // Call the method and print the result
     double result = min.minimum3(num1, num2, num3);
     System.out.printf("The smallest value is: %.2f\n", result);
 }
}

/*
 Enter first number: 99
Enter second number: 45
Enter third number: 98
The smallest value is: 45.00
*/
