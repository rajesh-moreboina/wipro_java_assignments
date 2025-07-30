package core_java_assignment1;


//Base class
class Vehicle {
 protected String color;
 protected int noOfWheels;
 protected String model;

 public Vehicle(String color, int noOfWheels, String model) {
     this.color = color;
     this.noOfWheels = noOfWheels;
     this.model = model;
 }

 public void displayInfo() {
     System.out.println("Model: " + model + ", Color: " + color + ", Wheels: " + noOfWheels);
 }

 public void start() {
     System.out.println(model + " is starting.");
 }

 public void stop() {
     System.out.println(model + " is stopping.");
 }
}

//Truck subclass
class Truck extends Vehicle {
 private double loadCapacity; // in tons

 public Truck(String color, int noOfWheels, String model, double loadCapacity) {
     super(color, noOfWheels, model);
     this.loadCapacity = loadCapacity;
 }

 public void loadCargo() {
     System.out.println(model + " is loading cargo of " + loadCapacity + " tons.");
 }
}

//Bus subclass
class Bus extends Vehicle {
 private int passengerCapacity;

 public Bus(String color, int noOfWheels, String model, int passengerCapacity) {
     super(color, noOfWheels, model);
     this.passengerCapacity = passengerCapacity;
 }

 public void pickPassengers() {
     System.out.println(model + " is picking up " + passengerCapacity + " passengers.");
 }
}

//Car subclass
class Car extends Vehicle {
 private String carType; // e.g., Sedan, SUV

 public Car(String color, int noOfWheels, String model, String carType) {
     super(color, noOfWheels, model);
     this.carType = carType;
 }

 public void playMusic() {
     System.out.println(model + " (" + carType + ") is playing music.");
 }
}

//Road class to create and test vehicles
public class Question17 {
 public static void main(String[] args) {
     Truck truck = new Truck("Blue", 6, "Volvo Truck", 15.5);
     Bus bus = new Bus("Yellow", 4, "Mercedes Bus", 50);
     Car car = new Car("Red", 4, "Toyota Camry", "Sedan");

     System.out.println("Truck details:");
     truck.displayInfo();
     truck.start();
     truck.loadCargo();
     truck.stop();

     System.out.println("\nBus details:");
     bus.displayInfo();
     bus.start();
     bus.pickPassengers();
     bus.stop();

     System.out.println("\nCar details:");
     car.displayInfo();
     car.start();
     car.playMusic();
     car.stop();
 }
}
/*
Truck details:
Model: Volvo Truck, Color: Blue, Wheels: 6
Volvo Truck is starting.
Volvo Truck is loading cargo of 15.5 tons.
Volvo Truck is stopping.

Bus details:
Model: Mercedes Bus, Color: Yellow, Wheels: 4
Mercedes Bus is starting.
Mercedes Bus is picking up 50 passengers.
Mercedes Bus is stopping.

Car details:
Model: Toyota Camry, Color: Red, Wheels: 4
Toyota Camry is starting.
Toyota Camry (Sedan) is playing music.
Toyota Camry is stopping.
*/
