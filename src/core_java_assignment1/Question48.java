package core_java_assignment1;

// Functional Interface
@FunctionalInterface
interface EmployeeProcessor {
    void process(Emp e);
}

// Emp class (was Employee)
class Emp {
    private int id;
    private String name;
    private double salary;

    public Emp(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}

// Main class
public class Question48 {
    public static void main(String[] args) {
        Emp emp1 = new Emp(1, "Rajesh", 50000);
        Emp emp2 = new Emp(2, "Anjali", 60000);

        // Lambda to print name and salary
        EmployeeProcessor nameAndSalaryPrinter = e ->
            System.out.println("Name: " + e.getName() + ", Salary: " + e.getSalary());

        // Lambda to calculate and print 10% bonus
        EmployeeProcessor bonusCalculator = e ->
            System.out.println("Bonus for " + e.getName() + ": " + (e.getSalary() * 0.10));

        System.out.println("Employee Details:");
        nameAndSalaryPrinter.process(emp1);
        nameAndSalaryPrinter.process(emp2);

        System.out.println("\nBonus Details:");
        bonusCalculator.process(emp1);
        bonusCalculator.process(emp2);
    }
}

/*
Employee Details:
Name: Rajesh, Salary: 50000.0
Name: Anjali, Salary: 60000.0

Bonus Details:
Bonus for Rajesh: 5000.0
Bonus for Anjali: 6000.0
*/