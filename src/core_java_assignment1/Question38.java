package core_java_assignment1;

import java.io.*;
import java.util.Scanner;

// Employee class implementing Serializable
class Employeee implements Serializable {
    private int emp_id;
    private String emp_name;
    private transient double emp_sal; // transient: won't be serialized

    public Employeee(int emp_id, String emp_name, double emp_sal) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_sal = emp_sal;
    }

    public void displayDetails() {
        System.out.println("Employee ID   : " + emp_id);
        System.out.println("Employee Name : " + emp_name);
        System.out.println("Employee Salary (not serialized): " + emp_sal);
    }
}

public class Question38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filename = "employee.ser";

        try {
            // Take input
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Employee Salary: ");
            double salary = sc.nextDouble();

            // Create employee object
            Employeee emp = new Employeee(id, name, salary);

            // Serialize the object
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
            oos.writeObject(emp);
            oos.close();
            System.out.println("\nEmployee object serialized to " + filename);

            // Deserialize the object
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
            Employeee deserializedEmp = (Employeee) ois.readObject();
            ois.close();

            System.out.println("\n--- Deserialized Employee Details ---");
            deserializedEmp.displayDetails(); // emp_sal will be 0.0 because it was transient

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
/*
 Enter Employee ID: 101
Enter Employee Name: rajesh
Enter Employee Salary: 55000

Employee object serialized to employee.ser

--- Deserialized Employee Details ---
Employee ID   : 101
Employee Name : rajesh
Employee Salary (not serialized): 0.0
*/
