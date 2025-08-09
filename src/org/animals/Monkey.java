package org.animals;

public class Monkey {
    String color = "Grey";
    int weight = 40;
    int age = 5;

    public boolean isVegetarian() {
        return true;
    }

    public boolean canClimb() {
        return true;
    }

    public String sound() {
        return "Chatter";
    }

    public void printDetails() {
        System.out.println("Monkey -> Color: " + color + ", Weight: " + weight + "kg, Age: " + age);
        System.out.println("Vegetarian: " + isVegetarian() + ", Can Climb: " + canClimb() + ", Sound: " + sound());
    }
}
