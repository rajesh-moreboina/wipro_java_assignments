package core_java_assignment1;

public class Question32 {
    public static void main(String[] args) {
        try {
            // Uncomment each block one at a time to see the behavior

            // 1. NegativeArraySizeException
            //int[] arr1 = new int[-5];

            // 2. ArrayIndexOutOfBoundsException
            int[] arr2 = new int[3];
             arr2[5] = 100;

            // 3. StringIndexOutOfBoundsException
            // String str = "Rajesh";
            // char ch = str.charAt(10);

            // 4. IndexOutOfBoundsException (will be caught by more specific catch first)
            // java.util.ArrayList<String> list = new java.util.ArrayList<>();
            // list.get(2);

            // 5. NullPointerException
            // String s = null;
            // s.length();

            // 6. ArithmeticException
            // int result = 10 / 0;

        } catch (NegativeArraySizeException e) {
            System.out.println("Caught NegativeArraySizeException:");
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException:");
            e.printStackTrace();
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException:");
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught IndexOutOfBoundsException:");
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException:");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException:");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Caught General Exception:");
            e.printStackTrace();
        }
    }
}

/*
 Caught ArrayIndexOutOfBoundsException:
java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
	at assignment1.Question32.main(Question32.java:13)
*/
