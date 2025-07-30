package core_java_assignment1;

import java.io.*;
import java.util.Scanner;

public class Question37 {
    public static void main(String[] args) {
        String fileName = "batchmates.txt";
        Scanner scanner = new Scanner(System.in);

        try {
            // Step 1: Create the file and write names
            FileWriter writer = new FileWriter(fileName);
            System.out.print("Enter number of batchmates: ");
            int n = scanner.nextInt();
            scanner.nextLine(); // consume newline

            for (int i = 1; i <= n; i++) {
                System.out.print("Enter name of batchmate " + i + ": ");
                String name = scanner.nextLine();
                writer.write(name + "\n");
            }

            writer.close();
            System.out.println("\nBatchmates' names saved to " + fileName + "\n");

            // Step 2: Read and display contents
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            System.out.println("----- Batchmates List -----");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
/*
 Enter number of batchmates: 3
Enter name of batchmate 1: rajesh
Enter name of batchmate 2: mani
Enter name of batchmate 3: prabha

Batchmates' names saved to batchmates.txt

----- Batchmates List -----
rajesh
mani
prabha

 */

