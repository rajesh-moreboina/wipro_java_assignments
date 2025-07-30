package core_java_assignment1;

import java.util.Optional;

// Custom Exception
class MissingFieldException extends Exception {
    public MissingFieldException(String message) {
        super(message);
    }
}

// Emppp class (renamed from Employee)
class Emppp {
    private int id;
    private String name;
    private Optional<String> email;
    private Optional<String> department;

    public Emppp(int id, String name, String email, String department) {
        this.id = id;
        this.name = name;
        this.email = Optional.ofNullable(email);
        this.department = Optional.ofNullable(department);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Optional<String> getEmail() {
        return email;
    }

    public Optional<String> getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Emppp [id=" + id + ", name=" + name +
               ", email=" + email.orElse("N/A") +
               ", department=" + department.orElse("N/A") + "]";
    }
}

// Main class
public class Question49 {
    public static void main(String[] args) {
        Emppp emp1 = new Emppp(1, "Rajesh", "rajesh@gmail.com", "IT");
        Emppp emp2 = new Emppp(2, "Anjali", null, null); // missing optional data

        try {
            printEmployeeInfo(emp1);
            System.out.println();
            printEmployeeInfo(emp2);
        } catch (MissingFieldException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void printEmployeeInfo(Emppp emp) throws MissingFieldException {
        System.out.println("ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());

        // Email: Default if missing
        System.out.println("Email: " + emp.getEmail().orElse("email@default.com"));

        // Department: Throw exception if missing
        String department = emp.getDepartment()
            .orElseThrow(() -> new MissingFieldException("Department is required for employee ID: " + emp.getId()));
        System.out.println("Department: " + department);
    }
}

/*
 * ID: 1
Name: Rajesh
Email: rajesh@gmail.com
Department: IT

ID: 2
Name: Anjali
Email: email@default.com
Error: Department is required for employee ID: 2
*/
