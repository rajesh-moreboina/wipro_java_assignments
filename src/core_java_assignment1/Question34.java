package core_java_assignment1;

public class Question34 {
    private String employeeId; // Format: YY-D-XXX
    private String name;
    private int yearOfBirth;

    // Constructor
    public Question34(String employeeId, String name, int yearOfBirth) {
        this.employeeId = employeeId;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    // Method to display employee details
    public void printDetails() {
        System.out.println("Employee Details:");
        System.out.println("Employee ID     : " + employeeId);
        System.out.println("Name            : " + name);
        System.out.println("Year of Birth   : " + yearOfBirth);

        // Parse and display ID components
        String[] parts = employeeId.split("-");
        if (parts.length == 3) {
            String year = parts[0];
            String designationCode = parts[1];
            String number = parts[2];

            String designation = "";
            if (designationCode.equalsIgnoreCase("F")) {
                designation = "Faculty";
            } else if (designationCode.equalsIgnoreCase("S")) {
                designation = "Staff";
            } else {
                designation = "Unknown";
            }

            System.out.println("Parsed Details:");
            System.out.println("  Year: " + year);
            System.out.println("  Designation: " + designation);
            System.out.println("  Number: " + number);
        } else {
            System.out.println("Invalid Employee ID Format.");
        }
    }

    // Main method to test
    public static void main(String[] args) {
        // Example inputs
        Question34 emp1 = new Question34("81-F-112", "Mani Moreboina", 1999);
        emp1.printDetails();

        System.out.println();

        Question34 emp2 = new Question34("79-S-254", "Priya Sharma", 1985);
        emp2.printDetails();
    }
}

/*
 Employee Details:
Employee ID     : 81-F-112
Name            : Mani Moreboina
Year of Birth   : 1999
Parsed Details:
  Year: 81
  Designation: Faculty
  Number: 112

Employee Details:
Employee ID     : 79-S-254
Name            : Priya Sharma
Year of Birth   : 1985
Parsed Details:
  Year: 79
  Designation: Staff
  Number: 254
*/

