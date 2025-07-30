package core_java_assignment1;

class Shape {

    // Calculate area of square (one parameter)
    public double area(double side) 
    {
        return side * side;
    }

    // Calculate area of rectangle (two parameters)
    public double area(double length, double breadth)
    {
        return length * breadth;
    }

    // Calculate perimeter of square (one parameter)
    public double perimeter(double side) {
        return 4 * side;
    }

    // Calculate perimeter of rectangle (two parameters)
    public double perimeter(double length, double breadth) 
    {
        return 2 * (length + breadth);
    }
}

public class Question14 {
    public static void main(String[] args) {
        Shape shape = new Shape();

        // Square details
        double squareSide = 5;

        // Rectangle details
        double length = 7;
        double breadth = 4;

        System.out.println("Square Area: " + shape.area(squareSide));
        System.out.println("Square Perimeter: " + shape.perimeter(squareSide));

        System.out.println("Rectangle Area: " + shape.area(length, breadth));
        System.out.println("Rectangle Perimeter: " + shape.perimeter(length, breadth));
    }
}

/*
Square Area: 25.0
Square Perimeter: 20.0
Rectangle Area: 28.0
Rectangle Perimeter: 22.0
*/

