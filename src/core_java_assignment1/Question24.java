package core_java_assignment1;

import java.util.Scanner;

public class Question24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] speeds = new double[5];
        double sum = 0;

        // Input speeds
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter speed of racer " + (i + 1) + ": ");
            speeds[i] = scanner.nextDouble();
            sum += speeds[i];
        }

        // Calculate average
        double average = sum / 5;
        System.out.println("\nAverage speed: " + average);

        // Print qualifying racers
        System.out.println("Qualifying racers (speed > average):");
        boolean anyQualified = false;
        for (int i = 0; i < 5; i++) {
            if (speeds[i] > average) {
                System.out.println("Racer " + (i + 1) + " - Speed: " + speeds[i]);
                anyQualified = true;
            }
        }

        if (!anyQualified) {
            System.out.println("No racer qualified.");
        }

        scanner.close();
    }
}
/*
Enter speed of racer 1: 20
Enter speed of racer 2: 69
Enter speed of racer 3: 50
Enter speed of racer 4: 65
Enter speed of racer 5: 34

Average speed: 47.6
Qualifying racers (speed > average):
Racer 2 - Speed: 69.0
Racer 3 - Speed: 50.0
Racer 4 - Speed: 65.0
*/