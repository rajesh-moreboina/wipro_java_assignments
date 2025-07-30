package junit_assignment_questions;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

	public class First_Question {
	    @Test
	    public void testFactorialOfZero() {
	        assertEquals(1, FactorialUtil.factorial(0));
	    }

	    @Test
	    public void testFactorialOfOne() {
	        assertEquals(1, FactorialUtil.factorial(1));
	    }

	    @Test
	    public void testFactorialOfPositiveNumbers() {
	        assertEquals(2, FactorialUtil.factorial(2));
	        assertEquals(6, FactorialUtil.factorial(3));
	        assertEquals(24, FactorialUtil.factorial(4));
	        assertEquals(120, FactorialUtil.factorial(5));
	        assertEquals(720, FactorialUtil.factorial(6));
	    }

	    @Test
	    public void testFactorialThrowsExceptionForNegativeNumber() {
	        assertThrows(IllegalArgumentException.class, () -> {
	            FactorialUtil.factorial(-1);
	        });
	    }
	}

