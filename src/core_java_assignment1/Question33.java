package core_java_assignment1;

//Custom Exception Class
class LowSalException extends Exception {
 public LowSalException(String message) {
     super(message);
 }
}

//Main Employee Class
public class Question33 {
 private int empId;
 private String empName;
 private String designation;
 private double basic;
 private final double hra;

 // Constructor
 public Question33(int empId, String empName, String designation, double basic) throws LowSalException {
     if (basic < 50000) {
         throw new LowSalException("Basic salary is less than 50000. Please enter a valid salary.");
     }

     this.empId = empId;
     this.empName = empName;
     this.designation = designation;
     this.basic = basic;
     this.hra = calculateHRA();
 }

 // Method to calculate HRA
 private double calculateHRA() {
     switch (designation.toLowerCase()) {
         case "manager":
             return 0.10 * basic;
         case "teamleader":
             return 0.12 * basic;
         case "hr":
             return 0.05 * basic;
         default:
             return 0.0;
     }
 }

 // Method to print employee details
 public void printDET() {
     System.out.println("---- Employee Details ----");
     System.out.println("Employee ID      : " + empId);
     System.out.println("Employee Name    : " + empName);
     System.out.println("Designation      : " + designation);
     System.out.println("Basic Salary     : " + basic);
     System.out.println("HRA              : " + hra);
     System.out.println("---------------------------");
 }

 // Main method to test
 public static void main(String[] args) {
     try {
         Question33 e1 = new Question33(101, "Rajesh", "Manager", 60000);
         e1.printDET();

         Question33 e2 = new Question33(102, "Anjali", "HR", 48000); // This will throw exception
         e2.printDET();
     } catch (LowSalException e) {
         System.out.println("Exception: " + e.getMessage());
     }
 }
}
/*
 ---- Employee Details ----
Employee ID      : 101
Employee Name    : Rajesh
Designation      : Manager
Basic Salary     : 60000.0
HRA              : 6000.0
---------------------------
Exception: Basic salary is less than 50000. Please enter a valid salary.
*/
