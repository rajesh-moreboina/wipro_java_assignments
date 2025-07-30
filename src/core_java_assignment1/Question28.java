package core_java_assignment1;

@FunctionalInterface
interface PerformOperation {
    boolean check(int num);
}

public class Question28 {

    // Returns lambda to check if a number is odd
    public static PerformOperation isOdd() {
        return num -> num % 2 != 0;
    }

    // Returns lambda to check if a number is prime
    public static PerformOperation isPrime() {
        return num -> {
            if (num <= 1) return false;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) return false;
            }
            return true;
        };
    }

    // Returns lambda to check if a number is palindrome
    public static PerformOperation isPalindrome() {
        return num -> {
            String str = String.valueOf(num);
            int len = str.length();
            for (int i = 0; i < len / 2; i++) {
                if (str.charAt(i) != str.charAt(len - i - 1)) return false;
            }
            return true;
        };
    }

    public static void main(String[] args) {
        int[] testNumbers = {121, 17, 22, 33};

        PerformOperation oddCheck = isOdd();
        PerformOperation primeCheck = isPrime();
        PerformOperation palindromeCheck = isPalindrome();

        for (int num : testNumbers) {
            System.out.println(num + " is odd? " + oddCheck.check(num));
            System.out.println(num + " is prime? " + primeCheck.check(num));
            System.out.println(num + " is palindrome? " + palindromeCheck.check(num));
            System.out.println("----------------------------");
        }
    }
    
}
/*
 121 is odd? true
121 is prime? false
121 is palindrome? true
----------------------------
17 is odd? true
17 is prime? true
17 is palindrome? false
----------------------------
22 is odd? false
22 is prime? false
22 is palindrome? true
----------------------------
33 is odd? true
33 is prime? false
33 is palindrome? true
----------------------------
 */

