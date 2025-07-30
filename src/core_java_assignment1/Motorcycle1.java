package core_java_assignment1;

public class Motorcycle1 extends Vehicle1 {
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started with a button.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine stopped.");
    }
}
