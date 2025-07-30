package core_java_assignment1;

import java.util.*;

// Employe1 class
class Employe1 {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employe1(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    // toString method for display
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }
}

public class Question44 {
    public static void main(String[] args) {
        List<Employe1> employees = new ArrayList<>();

        // Add employee data
        employees.add(new Employe1(101, "Alice", 45000));
        employees.add(new Employe1(102, "Bob", 55000));
        employees.add(new Employe1(103, "Charlie", 40000));
        employees.add(new Employe1(104, "David", 55000));
        employees.add(new Employe1(105, "Eve", 60000));

        // Sort by salary descending
        employees.sort((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));

        System.out.println("Employees sorted by salary (descending):");
        for (Employe1 emp : employees) {
            System.out.println(emp);
        }

        // Sort by name alphabetically using lambda
        employees.sort((e1, e2) -> e1.getName().compareToIgnoreCase(e2.getName()));

        System.out.println("\nEmployees sorted by name (alphabetically):");
        for (Employe1 emp : employees) {
            System.out.println(emp);
        }
    }
}

/*
 Employees sorted by salary (descending):
ID: 105, Name: Eve, Salary: 60000.0
ID: 102, Name: Bob, Salary: 55000.0
ID: 104, Name: David, Salary: 55000.0
ID: 101, Name: Alice, Salary: 45000.0
ID: 103, Name: Charlie, Salary: 40000.0

Employees sorted by name (alphabetically):
ID: 101, Name: Alice, Salary: 45000.0
ID: 102, Name: Bob, Salary: 55000.0
ID: 103, Name: Charlie, Salary: 40000.0
ID: 104, Name: David, Salary: 55000.0
ID: 105, Name: Eve, Salary: 60000.0
*/
