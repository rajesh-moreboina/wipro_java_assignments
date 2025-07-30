package core_java_assignment1;

import java.util.*;

// Generic Repository
class Repository<T, ID> {
    private Map<ID, T> dataStore = new HashMap<>();

    public void save(ID id, T entity) {
        dataStore.put(id, entity);
    }

    public T findById(ID id) {
        return dataStore.get(id);
    }

    public List<T> findAll() {
        return new ArrayList<>(dataStore.values());
    }

    public void deleteById(ID id) {
        dataStore.remove(id);
    }
}

// Employ class
class Employ {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employ(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    // toString
    @Override
    public String toString() {
        return "Employ [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}

// Main class
public class Question46 {
    public static void main(String[] args) {
        Repository<Employ, Integer> employRepo = new Repository<>();

        // Add 3 employees
        employRepo.save(1, new Employ(1, "Rajesh", 50000));
        employRepo.save(2, new Employ(2, "Anjali", 60000));
        employRepo.save(3, new Employ(3, "Kiran", 55000));

        // Print all employees
        System.out.println("All Employees:");
        for (Employ emp : employRepo.findAll()) {
            System.out.println(emp);
        }

        // Find specific employee by ID
        System.out.println("\nEmployee with ID 2:");
        System.out.println(employRepo.findById(2));

        // Delete employee with ID 1
        employRepo.deleteById(1);

        // Print all employees after deletion
        System.out.println("\nEmployees after deletion:");
        for (Employ emp : employRepo.findAll()) {
            System.out.println(emp);
        }
    }
}

/*
 * All Employees:
Employ [id=1, name=Rajesh, salary=50000.0]
Employ [id=2, name=Anjali, salary=60000.0]
Employ [id=3, name=Kiran, salary=55000.0]

Employee with ID 2:
Employ [id=2, name=Anjali, salary=60000.0]

Employees after deletion:
Employ [id=2, name=Anjali, salary=60000.0]
Employ [id=3, name=Kiran, salary=55000.0]
*/
