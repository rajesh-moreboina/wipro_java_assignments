package core_java_assignment1;

import java.util.Arrays;

public class Kitchen {
    public void showAppliances() {
        String[] appliances = {"Oven", "Refrigerator", "Microwave", "Dishwasher"};
        
        // Print original appliances
        System.out.println("Original appliances: " + Arrays.toString(appliances));
        
        // Copy appliances array into new array
        String[] copyAppliances = Arrays.copyOf(appliances, appliances.length);
        
        // Print copied appliances
        System.out.println("Copied appliances: " + Arrays.toString(copyAppliances));
    }
}
