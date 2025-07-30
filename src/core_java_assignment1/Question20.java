package core_java_assignment1;

public class Question20 {
    public static void main(String[] args) {
        Vehicle1 car = new Car1();
        Vehicle1 motorcycle = new Motorcycle1();

        car.startEngine();
        car.stopEngine();

        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}
/*
 Car engine started with a key.
Car engine stopped.
Motorcycle engine started with a button.
Motorcycle engine stopped.
*/
