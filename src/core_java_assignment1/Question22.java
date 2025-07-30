package core_java_assignment1;

//Drawable interface
interface Drawable {
void drawingColor();
void thickness();
}

//Fillable interface
interface Fillable {
void fillingColor();
void size();
}

//Line class implementing both interfaces
class Line implements Drawable, Fillable {
public void drawingColor() {
   System.out.println("Line Drawing Color: Black");
}

public void thickness() {
   System.out.println("Line Thickness: 2px");
}

public void fillingColor() {
   System.out.println("Line has no filling color.");
}

public void size() {
   System.out.println("Line Size: 10 units");
}
}

//Circle class implementing both interfaces
class Circle implements Drawable, Fillable {
public void drawingColor() {
   System.out.println("Circle Drawing Color: Red");
}

public void thickness() {
   System.out.println("Circle Thickness: 3px");
}

public void fillingColor() {
   System.out.println("Circle Filling Color: Blue");
}

public void size() {
   System.out.println("Circle Radius: 5 units");
}
}

//Square class implementing both interfaces
class Square implements Drawable, Fillable {
public void drawingColor() {
   System.out.println("Square Drawing Color: Green");
}

public void thickness() {
   System.out.println("Square Thickness: 4px");
}

public void fillingColor() {
   System.out.println("Square Filling Color: Yellow");
}

public void size() {
   System.out.println("Square Side Length: 6 units");
}
}

//Main class
public class Question22 {
public static void main(String[] args) {
   System.out.println("=== Line ===");
   Line line = new Line();
   line.drawingColor();
   line.thickness();
   line.fillingColor();
   line.size();

   System.out.println("\n=== Circle ===");
   Circle circle = new Circle();
   circle.drawingColor();
   circle.thickness();
   circle.fillingColor();
   circle.size();

   System.out.println("\n=== Square ===");
   Square square = new Square();
   square.drawingColor();
   square.thickness();
   square.fillingColor();
   square.size();
}
}

/*
=== Line ===
Line Drawing Color: Black
Line Thickness: 2px
Line has no filling color.
Line Size: 10 units

=== Circle ===
Circle Drawing Color: Red
Circle Thickness: 3px
Circle Filling Color: Blue
Circle Radius: 5 units

=== Square ===
Square Drawing Color: Green
Square Thickness: 4px
Square Filling Color: Yellow
Square Side Length: 6 units
*/

