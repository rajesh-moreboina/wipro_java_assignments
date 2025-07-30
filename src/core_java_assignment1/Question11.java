package core_java_assignment1;

public class Question11 {

    public void add(double a, double b) {
        double result = a + b;
        System.out.println("Addition: " + result);
    }

    public void diff(double a, double b) {
        double result = a - b;
        System.out.println("Difference: " + result);
    }

    public void mul(double a, double b) {
        double result = a * b;
        System.out.println("Multiplication: " + result);
    }

    public void div(double a, double b) {
        if (b == 0) {
            System.out.println("Division: Cannot divide by zero.");
            return;
        }
        double result = a / b;
        System.out.println("Division: " + result);
    }

    public static void main(String[] args) {
       Question11 calc = new Question11();

        double num1 = 20;
        double num2 = 5;

        calc.add(num1, num2);
        calc.diff(num1, num2);
        calc.mul(num1, num2);
        calc.div(num1, num2);
    }
}
/*
 Addition: 25.0
Difference: 15.0
Multiplication: 100.0
Division: 4.0
*/
