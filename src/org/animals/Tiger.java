package org.animals;

public class Tiger {
    String color = "Orange with black stripes";
    int weight = 220;
    int age = 7;

    public boolean isVegetarian() {
        return false;
    }

    public boolean canClimb() {
        return true;
    }

    public String sound() {
        return "Growl";
    }

    public void printDetails() {
        System.out.println("Tiger -> Color: " + color + ", Weight: " + weight + "kg, Age: " + age);
        System.out.println("Vegetarian: " + isVegetarian() + ", Can Climb: " + canClimb() + ", Sound: " + sound());
    }
}
