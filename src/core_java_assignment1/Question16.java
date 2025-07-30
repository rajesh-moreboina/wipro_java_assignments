package core_java_assignment1;

import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[3];

        for (int i = 0; i < 3; i++) {
            while (true) {
                System.out.print("Enter the mark (0-100) for student " + (i + 1) + ": ");
                if (scanner.hasNextInt()) {
                    int mark = scanner.nextInt();
                    if (mark >= 0 && mark <= 100) {
                        marks[i] = mark;
                        break;
                    } else {
                        System.out.println("Invalid input, try again...");
                    }
                } else {
                    System.out.println("Invalid input, try again...");
                    scanner.next(); // discard invalid input
                }
            }
        }

        double average = (marks[0] + marks[1] + marks[2]) / 3.0;

        // Print average rounded to 2 decimal places
        System.out.printf("The average is: %.2f\n", average);

       
    }
}

/*
Enter the mark (0-100) for student 1: 99
Enter the mark (0-100) for student 2: 87
Enter the mark (0-100) for student 3: 59
The average is: 81.67
*/
