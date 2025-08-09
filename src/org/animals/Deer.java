package org.animals;

public class Deer {
    String color = "Brown";
    int weight = 80;
    int age = 4;

    public boolean isVegetarian() {
        return true;
    }

    public boolean canClimb() {
        return false;
    }

    public String sound() {
        return "Bleat";
    }

    public void printDetails() {
        System.out.println("Deer -> Color: " + color + ", Weight: " + weight + "kg, Age: " + age);
        System.out.println("Vegetarian: " + isVegetarian() + ", Can Climb: " + canClimb() + ", Sound: " + sound());
    }
}
