package core_java_assignment1;

import java.util.Scanner;

public class Question25 {

    // Compute area using Heron's formula
    public static double area(double a, double b, double c) {
        double s = perimeter(a, b, c) / 2.0; // semi-perimeter
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    // Compute perimeter
    public static double perimeter(double a, double b, double c) {
        return a + b + c;
    }

    // Check if triangle is valid
    public static boolean isValid(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter side a (-1 to exit): ");
            double a = scanner.nextDouble();
            if (a == -1) {
                System.out.println("Bye~");
                break;
            }

            System.out.print("Enter side b: ");
            double b = scanner.nextDouble();

            System.out.print("Enter side c: ");
            double c = scanner.nextDouble();

            if (isValid(a, b, c)) {
                double area = area(a, b, c);
                double perimeter = perimeter(a, b, c);
                System.out.printf("Area: %.2f\n", area);
                System.out.printf("Perimeter: %.2f\n", perimeter);
            } else {
                System.out.println("The input is invalid.");
            }
        }

        scanner.close();
    }
}

/*
 Enter side a (-1 to exit): 3
Enter side b: 4
Enter side c: 6
Area: 5.33
Perimeter: 13.00
Enter side a (-1 to exit): 9
Enter side b: 5
Enter side c: 100
The input is invalid.
Enter side a (-1 to exit): -1
Bye~
*/
