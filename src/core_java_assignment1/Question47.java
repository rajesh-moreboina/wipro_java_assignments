package core_java_assignment1;

// Custom checked exception
class InvalidSalaryException extends Exception {
    public InvalidSalaryException(String message) {
        super(message);
    }
}

// Emply class (was Employ)
class Emply {
    private int id;
    private String name;
    private double salary;

    public Emply(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return "Emply [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}

// EmployeeService class
class EmployeeService {

    public void validateSalary(double salary) throws InvalidSalaryException {
        if (salary < 0) {
            throw new InvalidSalaryException("Invalid Salary: Salary cannot be negative.");
        }
    }

    public void processSalary(Emply emp) throws InvalidSalaryException {
        validateSalary(emp.getSalary());
        System.out.println("Processing salary for " + emp.getName());
    }

    public void startProcess(Emply emp) throws InvalidSalaryException {
        processSalary(emp);
    }
}

// Main class
public class Question47 {
    public static void main(String[] args) {
        Emply emp = new Emply(1, "Rajesh", -50000); // negative salary

        EmployeeService service = new EmployeeService();

        try {
            service.startProcess(emp);
        } catch (InvalidSalaryException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

/*
Exception caught: Invalid Salary: Salary cannot be negative.
*/