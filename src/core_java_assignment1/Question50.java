package core_java_assignment1;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

class Emp50 {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Emp50(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return name + " (" + department + ") - " + salary;
    }
}

public class Question50 {
    public static void main(String[] args) {
        List<Emp50> employees = Arrays.asList(
            new Emp50(101, "Ravi", "HR", 50000),
            new Emp50(102, "Priya", "IT", 60000),
            new Emp50(103, "Arun", "HR", 55000),
            new Emp50(104, "Kavya", "IT", 70000),
            new Emp50(105, "Divya", "Sales", 45000)
        );

        // Q1: Print all employee names
        System.out.println("Q1: Employee Names:");
        employees.stream()
                 .map(Emp50::getName)
                 .forEach(System.out::println);

        // Q2: Filter employees with salary > 55000
        System.out.println("\nQ2: Employees with salary > 55000:");
        employees.stream()
                 .filter(e -> e.getSalary() > 55000)
                 .forEach(System.out::println);

        // Q3: Count employees in HR department
        long hrCount = employees.stream()
                                .filter(e -> e.getDepartment().equals("HR"))
                                .count();
        System.out.println("\nQ3: Number of employees in HR: " + hrCount);

        // Q4: Sort employees by salary descending
        System.out.println("\nQ4: Employees sorted by salary (desc):");
        employees.stream()
                 .sorted(Comparator.comparingDouble(Emp50::getSalary).reversed())
                 .forEach(System.out::println);

        // Q5: Highest paid employee
        Optional<Emp50> highestPaid = employees.stream()
                                              .max(Comparator.comparingDouble(Emp50::getSalary));
        System.out.println("\nQ5: Highest paid employee:");
        highestPaid.ifPresent(System.out::println);

        // Q6: Average salary of all employees
        double avgSalary = employees.stream()
                                    .mapToDouble(Emp50::getSalary)
                                    .average()
                                    .orElse(0);
        System.out.println("\nQ6: Average salary: " + avgSalary);

        // Q7: Collect all names into List
        List<String> allNames = employees.stream()
                                         .map(Emp50::getName)
                                         .collect(toList());
        System.out.println("\nQ7: All employee names: " + allNames);

        // Q8: Group employees by department
        Map<String, List<Emp50>> groupByDept = employees.stream()
                                                       .collect(groupingBy(Emp50::getDepartment));
        System.out.println("\nQ8: Grouped by department:");
        groupByDept.forEach((dept, emps) -> System.out.println(dept + ": " + emps));

        // Q9: Total salary per department
        Map<String, Double> totalSalaryByDept = employees.stream()
            .collect(groupingBy(Emp50::getDepartment, summingDouble(Emp50::getSalary)));
        System.out.println("\nQ9: Total salary per department:");
        totalSalaryByDept.forEach((dept, total) -> System.out.println(dept + ": " + total));

        // Q10: Names of employees in IT sorted by salary
        List<String> itNamesSorted = employees.stream()
            .filter(e -> e.getDepartment().equals("IT"))
            .sorted(Comparator.comparingDouble(Emp50::getSalary))
            .map(Emp50::getName)
            .collect(toList());
        System.out.println("\nQ10: IT employees sorted by salary: " + itNamesSorted);

        // Q11: Check if any employee earns less than 40000
        boolean anyBelow40k = employees.stream()
                                      .anyMatch(e -> e.getSalary() < 40000);
        System.out.println("\nQ11: Any employee earns less than 40000? " + anyBelow40k);

        // Q12: Comma separated string of all employee names
        String allNamesCSV = employees.stream()
                                      .map(Emp50::getName)
                                      .collect(joining(", "));
        System.out.println("\nQ12: Employee names CSV: " + allNamesCSV);

        // Q13: List of top 2 highest earning employees
        List<Emp50> top2 = employees.stream()
                                   .sorted(Comparator.comparingDouble(Emp50::getSalary).reversed())
                                   .limit(2)
                                   .collect(toList());
        System.out.println("\nQ13: Top 2 highest earning employees: " + top2);

        // Q14: Skip first 2 employees and print rest
        System.out.println("\nQ14: Skip first 2 employees:");
        employees.stream()
                 .skip(2)
                 .forEach(System.out::println);

        // Q15: Limit to first 3 employees and print names
        System.out.println("\nQ15: First 3 employees' names:");
        employees.stream()
                 .limit(3)
                 .map(Emp50::getName)
                 .forEach(System.out::println);

        // Q16: Employee with minimum salary in HR
        Optional<Emp50> minSalaryHR = employees.stream()
                                              .filter(e -> e.getDepartment().equals("HR"))
                                              .min(Comparator.comparingDouble(Emp50::getSalary));
        System.out.println("\nQ16: Min salary in HR:");
        minSalaryHR.ifPresent(System.out::println);

        // Q17: Partition employees salary > 55000 and <= 55000
        Map<Boolean, List<Emp50>> partitioned = employees.stream()
            .collect(Collectors.partitioningBy(e -> e.getSalary() > 55000));
        System.out.println("\nQ17: Partitioned employees by salary > 55000:");
        partitioned.forEach((key, list) -> System.out.println(key + ": " + list));

        // Q18: Map<Department, AverageSalary>
        Map<String, Double> avgSalaryByDept = employees.stream()
            .collect(groupingBy(Emp50::getDepartment, averagingDouble(Emp50::getSalary)));
        System.out.println("\nQ18: Average salary by department:");
        avgSalaryByDept.forEach((dept, avg) -> System.out.println(dept + ": " + avg));

        // Q19: Sort employees by name then salary
        System.out.println("\nQ19: Sorted by name then salary:");
        employees.stream()
                 .sorted(Comparator.comparing(Emp50::getName)
                                   .thenComparing(Emp50::getSalary))
                 .forEach(System.out::println);

        // Q20: Convert to Map<Id, Name>
        Map<Integer, String> idToName = employees.stream()
                                                .collect(toMap(Emp50::getId, Emp50::getName));
        System.out.println("\nQ20: Map<Id, Name>:");
        idToName.forEach((id, name) -> System.out.println(id + " -> " + name));

        // Challenge 1: Names starting with D and ending with a
        List<Emp50> challenge1 = employees.stream()
            .filter(e -> e.getName().startsWith("D") && e.getName().endsWith("a"))
            .collect(toList());
        System.out.println("\nChallenge 1: Names start with 'D' and end with 'a': " + challenge1);

        // Challenge 2: Departments with more than 1 employee
        Map<String, Long> deptCount = employees.stream()
            .collect(groupingBy(Emp50::getDepartment, counting()));
        List<String> moreThanOne = deptCount.entrySet().stream()
            .filter(e -> e.getValue() > 1)
            .map(Map.Entry::getKey)
            .collect(toList());
        System.out.println("\nChallenge 2: Departments with more than 1 employee: " + moreThanOne);

        // Challenge 3: Second highest salary
        Optional<Double> secondHighestSalary = employees.stream()
            .map(Emp50::getSalary)
            .distinct()
            .sorted(Comparator.reverseOrder())
            .skip(1)
            .findFirst();
        System.out.println("\nChallenge 3: Second highest salary: " + secondHighestSalary.orElse(0.0));
    }
}

/*
Q1: Employee Names:
Ravi
Priya
Arun
Kavya
Divya

Q2: Employees with salary > 55000:
Priya (IT) - 60000.0
Kavya (IT) - 70000.0

Q3: Number of employees in HR: 2

Q4: Employees sorted by salary (desc):
Kavya (IT) - 70000.0
Priya (IT) - 60000.0
Arun (HR) - 55000.0
Ravi (HR) - 50000.0
Divya (Sales) - 45000.0

Q5: Highest paid employee:
Kavya (IT) - 70000.0

Q6: Average salary: 56000.0

Q7: All employee names: [Ravi, Priya, Arun, Kavya, Divya]

Q8: Grouped by department:
Sales: [Divya (Sales) - 45000.0]
HR: [Ravi (HR) - 50000.0, Arun (HR) - 55000.0]
IT: [Priya (IT) - 60000.0, Kavya (IT) - 70000.0]

Q9: Total salary per department:
Sales: 45000.0
HR: 105000.0
IT: 130000.0

Q10: IT employees sorted by salary: [Priya, Kavya]

Q11: Any employee earns less than 40000? false

Q12: Employee names CSV: Ravi, Priya, Arun, Kavya, Divya

Q13: Top 2 highest earning employees: [Kavya (IT) - 70000.0, Priya (IT) - 60000.0]

Q14: Skip first 2 employees:
Arun (HR) - 55000.0
Kavya (IT) - 70000.0
Divya (Sales) - 45000.0

Q15: First 3 employees' names:
Ravi
Priya
Arun

Q16: Min salary in HR:
Ravi (HR) - 50000.0

Q17: Partitioned employees by salary > 55000:
false: [Ravi (HR) - 50000.0, Arun (HR) - 55000.0, Divya (Sales) - 45000.0]
true: [Priya (IT) - 60000.0, Kavya (IT) - 70000.0]

Q18: Average salary by department:
Sales: 45000.0
HR: 52500.0
IT: 65000.0

Q19: Sorted by name then salary:
Arun (HR) - 55000.0
Divya (Sales) - 45000.0
Kavya (IT) - 70000.0
Priya (IT) - 60000.0
Ravi (HR) - 50000.0

Q20: Map<Id, Name>:
101 -> Ravi
102 -> Priya
103 -> Arun
104 -> Kavya
105 -> Divya

Challenge 1: Names start with 'D' and end with 'a': [Divya (Sales) - 45000.0]

Challenge 2: Departments with more than 1 employee: [HR, IT]

Challenge 3: Second highest salary: 60000.0
*/
