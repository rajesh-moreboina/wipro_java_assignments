package junit_assignment_questions;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Third_Question {

	    // Method to validate login credentials
	    public static boolean isValidLogin(String username, String password)
	    {
	        if (username == null || password == null || username.isEmpty() || password.isEmpty())
	        {
	            throw new IllegalArgumentException("Username and password must not be null or empty");
	        }
	        // Suppose valid credentials are: admin / secret123
	        return username.equals("admin") && password.equals("secret123");
	    }

	    // Test case: correct username and password
	    @Test
	    public void testValidCredentials() 
	    {
	        assertTrue(isValidLogin("admin", "secret123"));
	    }

	    // Test case: incorrect username
	    @Test
	    public void testInvalidUsername() 
	    {
	        assertFalse(isValidLogin("user", "secret123"));
	    }

	    // Test case: incorrect password
	    @Test
	    public void testInvalidPassword()
	    {
	        assertFalse(isValidLogin("admin", "wrongpass"));
	    }

	    // Test case: null username
	    @Test
	    public void testNullUsername()
	    {
	        assertThrows(IllegalArgumentException.class, () -> isValidLogin(null, "secret123"));
	    }

	    // Test case: null password
	    @Test
	    public void testNullPassword()
	    {
	        assertThrows(IllegalArgumentException.class, () -> isValidLogin("admin", null));
	    }

	    // Test case: empty username
	    @Test
	    public void testEmptyUsername() 
	    {
	        assertThrows(IllegalArgumentException.class, () -> isValidLogin("", "secret123"));
	    }

	    // Test case: empty password
	    @Test
	    public void testEmptyPassword() 
	    {
	        assertThrows(IllegalArgumentException.class, () -> isValidLogin("admin", ""));
	    }
	}
