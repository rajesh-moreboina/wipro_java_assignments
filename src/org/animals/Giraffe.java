package org.animals;

public class Giraffe {
    String color = "Spotted yellow";
    int weight = 800;
    int age = 12;

    public boolean isVegetarian() {
        return true;
    }

    public boolean canClimb() {
        return false;
    }

    public String sound() {
        return "Hum";
    }

    public void printDetails() {
        System.out.println("Giraffe -> Color: " + color + ", Weight: " + weight + "kg, Age: " + age);
        System.out.println("Vegetarian: " + isVegetarian() + ", Can Climb: " + canClimb() + ", Sound: " + sound());
    }
}
