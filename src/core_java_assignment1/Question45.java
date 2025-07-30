package core_java_assignment1;

import java.util.*;
import java.util.stream.Collectors;

class Student1 {
    private int id;
    private String name;
    private String department;

    public Student1(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }

    @Override
    public String toString() {
        return name;
    }
}

public class Question45 {
    public static void main(String[] args) {
        List<Student1> students = Arrays.asList(
            new Student1(1, "Rajesh", "CSE"),
            new Student1(2, "Anjali", "ECE"),
            new Student1(3, "Vikram", "CSE"),
            new Student1(4, "Sneha", "MECH"),
            new Student1(5, "Tarun", "ECE"),
            new Student1(6, "Kiran", "CIVIL"),
            new Student1(7, "Priya", "MECH")
        );

        // Grouping by department using Stream + Collectors.groupingBy
        Map<String, List<Student1>> studentsByDept = students.stream()
                .collect(Collectors.groupingBy(Student1::getDepartment));

        // Print the grouped students
        for (String dept : studentsByDept.keySet()) {
            System.out.println("Department: " + dept);
            List<Student1> deptStudents = studentsByDept.get(dept);
            for (Student1 s : deptStudents) {
                System.out.println(" - " + s.getName());
            }
            System.out.println(); // line break for clarity
        }
    }
}

/*
 Department: CIVIL
 - Kiran

Department: CSE
 - Rajesh
 - Vikram

Department: ECE
 - Anjali
 - Tarun

Department: MECH
 - Sneha
 - Priya

*/
