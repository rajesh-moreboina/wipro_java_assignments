package core_java_assignment1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Question43 {
    public static void main(String[] args) {
        String filename = "example.txt"; // Change this to your file path

        // try-with-resources ensures BufferedReader is closed automatically
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("File contents:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file:");
            System.out.println(e.getMessage());
            // Optionally e.printStackTrace();
        }
    }
}

