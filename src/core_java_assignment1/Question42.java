package core_java_assignment1;

public class Question42 {

    // Method that initially throws an exception
    public static void someMethod2() throws Exception {
        throw new Exception("Exception thrown in someMethod2");
    }

    // Method that calls someMethod2, catches, and rethrows the exception
    public static void someMethod() throws Exception {
        try {
            someMethod2();
        } catch (Exception e) {
            System.out.println("Caught exception in someMethod, rethrowing...");
            throw e;  // Rethrow the caught exception
        }
    }
   

    public static void main(String[] args) {
        try {
            someMethod();
        } catch (Exception e) {
            System.out.println("Caught rethrown exception in main:");
            e.printStackTrace();  // Print stack trace
        }
    }
}

/*
 Caught exception in someMethod, rethrowing...
Caught rethrown exception in main:
java.lang.Exception: Exception thrown in someMethod2
	at assignment1.Question42.someMethod2(Question42.java:7)
	at assignment1.Question42.someMethod(Question42.java:13)
	at assignment1.Question42.main(Question42.java:23)

 */

