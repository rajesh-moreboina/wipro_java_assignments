package org.animals;

public class Lion {
    String color = "Golden";
    int weight = 190;
    int age = 8;

    public boolean isVegetarian() {
        return false;
    }

    public boolean canClimb() {
        return false;
    }

    public String sound() {
        return "Roar";
    }

    public void printDetails() {
        System.out.println("Lion -> Color: " + color + ", Weight: " + weight + "kg, Age: " + age);
        System.out.println("Vegetarian: " + isVegetarian() + ", Can Climb: " + canClimb() + ", Sound: " + sound());
    }
}
