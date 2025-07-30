package junit_assignment_questions.copy;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

	public class Second_Question 
	{
	    // Method to reverse a string
	    public static String reverseString(String input) {
	        if (input == null) {
	            throw new IllegalArgumentException("Input string cannot be null.");
	        }
	        return new StringBuilder(input).reverse().toString();
	    }

	    // JUnit 5 Test Cases

	    @Test
	    public void testReverseRegularString() {
	        assertEquals("tac", reverseString("cat"));
	        assertEquals("avaJ", reverseString("Java"));
	    }

	    @Test
	    public void testReverseEmptyString() {
	        assertEquals("", reverseString(""));
	    }

	    @Test
	    public void testReverseNullInput() {
	        assertThrows(IllegalArgumentException.class, () -> {
	            reverseString(null);
	        });
	    }
	}

