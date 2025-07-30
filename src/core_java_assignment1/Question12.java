package core_java_assignment1;
import java.util.*;

class Student {
    private static int rollCounter = 1;

    private int rollNo;
    private String studName;
    private int marksInEng;
    private int marksInMaths;
    private int marksInScience;

    public Student(String studName, int marksInEng, int marksInMaths, int marksInScience) {
        this.rollNo = rollCounter++;
        this.studName = studName;
        this.marksInEng = marksInEng;
        this.marksInMaths = marksInMaths;
        this.marksInScience = marksInScience;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getStudName() {
        return studName;
    }

    public int getMarksInEng() {
        return marksInEng;
    }

    public int getMarksInMaths() {
        return marksInMaths;
    }

    public int getMarksInScience() {
        return marksInScience;
    }

    public int getTotalMarks() {
        return marksInEng + marksInMaths + marksInScience;
    }

    public double getPercentage() {
        return getTotalMarks() / 3.0;
    }
}

public class Question12 {
    private List<Student> students;

    public Question12() {
        students = new ArrayList<>();
        students.add(new Student("Ravi", 85, 90, 80));
        students.add(new Student("Sneha", 78, 92, 88));
        students.add(new Student("Kiran", 90, 85, 95));
        students.add(new Student("Anjali", 88, 70, 75));
        students.add(new Student("Rahul", 95, 96, 93));
        students.add(new Student("Priya", 76, 88, 82));
        students.add(new Student("Manish", 65, 70, 68));
        students.add(new Student("Divya", 80, 60, 72));
    }

    public void displayByRollNo() {
        System.out.println("\n1. Students by Roll No (Ascending):");
        students.stream()
                .sorted(Comparator.comparingInt(Student::getRollNo))
                .forEach(s -> System.out.println("Roll No: " + s.getRollNo() + ", Name: " + s.getStudName()));
    }

    public void displayHighestPercentageStudent() {
        System.out.println("\n2. Student with Highest Percentage:");
        Student top = students.stream()
                .max(Comparator.comparingDouble(Student::getPercentage))
                .orElse(null);
        if (top != null) {
            System.out.println("Roll No: " + top.getRollNo() + ", Name: " + top.getStudName());
        }
    }

    public void displayHighestInMaths() {
        System.out.println("\n3. Student with Highest Marks in Maths:");
        Student topMath = students.stream()
                .max(Comparator.comparingInt(Student::getMarksInMaths))
                .orElse(null);
        if (topMath != null) {
            System.out.println("Roll No: " + topMath.getRollNo() + ", Name: " + topMath.getStudName());
        }
    }

    public void displayByMathsScienceTotal() {
        System.out.println("\n4. Students by Total of Maths + Science (Ascending):");
        students.stream()
                .sorted(Comparator.comparingInt(s -> s.getMarksInMaths() + s.getMarksInScience()))
                .forEach(s -> {
                    int total = s.getMarksInMaths() + s.getMarksInScience();
                    System.out.println("Roll No: " + s.getRollNo() + ", Name: " + s.getStudName() + ", Total(Maths+Science): " + total);
                });
    }

    public void displayWithRank() {
        System.out.println("\n5. Student Details with Rank (By Percentage - Descending):");
        List<Student> sorted = new ArrayList<>(students);
        sorted.sort(Comparator.comparingDouble(Student::getPercentage).reversed());

        int rank = 1;
        for (Student s : sorted) {
            System.out.printf("Rank %d → Roll No: %d, Name: %s, Total: %d, Percentage: %.2f%%\n",
                    rank++, s.getRollNo(), s.getStudName(), s.getTotalMarks(), s.getPercentage());
        }
    }

    public static void main(String[] args) {
        Question12 std = new Question12();

        std.displayByRollNo();
        std.displayHighestPercentageStudent();
        std.displayHighestInMaths();
        std.displayByMathsScienceTotal();
        std.displayWithRank();
    }
}
/*
 * 
1. Students by Roll No (Ascending):
Roll No: 1, Name: Ravi
Roll No: 2, Name: Sneha
Roll No: 3, Name: Kiran
Roll No: 4, Name: Anjali
Roll No: 5, Name: Rahul
Roll No: 6, Name: Priya
Roll No: 7, Name: Manish
Roll No: 8, Name: Divya

2. Student with Highest Percentage:
Roll No: 5, Name: Rahul

3. Student with Highest Marks in Maths:
Roll No: 5, Name: Rahul

4. Students by Total of Maths + Science (Ascending):
Roll No: 8, Name: Divya, Total(Maths+Science): 132
Roll No: 7, Name: Manish, Total(Maths+Science): 138
Roll No: 4, Name: Anjali, Total(Maths+Science): 145
Roll No: 1, Name: Ravi, Total(Maths+Science): 170
Roll No: 6, Name: Priya, Total(Maths+Science): 170
Roll No: 2, Name: Sneha, Total(Maths+Science): 180
Roll No: 3, Name: Kiran, Total(Maths+Science): 180
Roll No: 5, Name: Rahul, Total(Maths+Science): 189

5. Student Details with Rank (By Percentage - Descending):
Rank 1 → Roll No: 5, Name: Rahul, Total: 284, Percentage: 94.67%
Rank 2 → Roll No: 3, Name: Kiran, Total: 270, Percentage: 90.00%
Rank 3 → Roll No: 2, Name: Sneha, Total: 258, Percentage: 86.00%
Rank 4 → Roll No: 1, Name: Ravi, Total: 255, Percentage: 85.00%
Rank 5 → Roll No: 6, Name: Priya, Total: 246, Percentage: 82.00%
Rank 6 → Roll No: 4, Name: Anjali, Total: 233, Percentage: 77.67%
Rank 7 → Roll No: 8, Name: Divya, Total: 212, Percentage: 70.67%
Rank 8 → Roll No: 7, Name: Manish, Total: 203, Percentage: 67.67%
*/
