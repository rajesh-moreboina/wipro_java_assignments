package core_java_assignment1;
import java.util.*;
public class Question15
{
	public static void main(String[] args) {
	        int[] arr = {5, 3, 5, 2, 3, 2, 5, 7, 8, 3};  // example array with 10 elements

	        // Use a map to store element -> count
	        Map<Integer, Integer> frequencyMap = new HashMap<>();

	        // Count occurrences
	        for (int num : arr) {
	            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
	        }

	        // Display occurrences
	        System.out.println("Element occurrences in the array:");
	        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
	            System.out.println("Element " + entry.getKey() + " occurs " + entry.getValue() + " times.");
	        }
	    }
	}
/*
Element occurrences in the array:
Element 2 occurs 2 times.
Element 3 occurs 3 times.
Element 5 occurs 3 times.
Element 7 occurs 1 times.
Element 8 occurs 1 times.
*/
