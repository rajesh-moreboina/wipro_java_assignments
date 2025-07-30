package core_java_assignment1;

public class Question36 {
    private boolean isFilled;
    private boolean isReleased;

    public Question36() {
        isFilled = false;
        isReleased = false;
        System.out.println("Tank Created.");
    }

    public void fill() {
        isFilled = true;
        System.out.println("Tank filled.");
    }

    public void empty() {
        isFilled = false;
        System.out.println("Tank emptied.");
    }

    public void releaseTank() {
        isReleased = true;
        System.out.println("Tank released properly.");
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            if (!isReleased) {
                System.out.println("Error: Tank not released before garbage collection!");
            } else {
                System.out.println("Tank finalized properly.");
            }
        } finally {
            super.finalize(); // Always call the superclass finalize
        }
    }

    // Main method to test different scenarios
    public static void main(String[] args) {
        // Scenario 1: Proper release
    	Question36 t1 = new Question36();
        t1.fill();
        t1.empty();
        t1.releaseTank();
        t1 = null;

        // Scenario 2: Forget to release
        Question36 t2 = new Question36();
        t2.fill();
        t2 = null;

        // Force garbage collection
        System.gc();

        // Give time for GC to trigger finalize()
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of main.");
    }
}
/*
 Tank Created.
Tank filled.
Tank emptied.
Tank released properly.
Tank Created.
Tank filled.
Error: Tank not released before garbage collection!
Tank finalized properly.
End of main.
*/
 

