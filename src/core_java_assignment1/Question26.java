package core_java_assignment1;

import java.util.*;

public class Question26 {
    public static void main(String[] args) {
        // Input array
        int[] input = {2, 3, 54, 1, 6, 7, 7};

        // Use a LinkedHashSet to maintain insertion order and remove duplicates
        Set<Integer> uniqueElements = new LinkedHashSet<>();
        for (int num : input) {
            uniqueElements.add(num);
        }

        // Sum of even numbers
        int evenSum = 0;
        System.out.println("Unique elements:");
        for (int num : uniqueElements) {
            System.out.print(num + " ");
            if (num % 2 == 0) {
                evenSum += num;
            }
        }

        System.out.println("\nSum of even numbers: " + evenSum);
    }
}
