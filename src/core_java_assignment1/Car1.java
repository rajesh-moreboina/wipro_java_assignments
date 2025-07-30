package core_java_assignment1;

public class Car1 extends Vehicle1 {
    @Override
    public void startEngine() {
        System.out.println("Car engine started with a key.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped.");
    }
}

