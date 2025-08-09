package org.animals;

public class Elephant {
    String color = "Grey";
    int weight = 5000;
    int age = 25;

    public boolean isVegetarian() {
        return true;
    }

    public boolean canClimb() {
        return false;
    }

    public String sound() {
        return "Trumpet";
    }

    public void printDetails() {
        System.out.println("Elephant -> Color: " + color + ", Weight: " + weight + "kg, Age: " + age);
        System.out.println("Vegetarian: " + isVegetarian() + ", Can Climb: " + canClimb() + ", Sound: " + sound());
    }
}
