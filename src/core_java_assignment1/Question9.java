package core_java_assignment1;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalSales = 0.0;
        char ch = 0;
       
		do {
            System.out.print("Enter product number (1, 2 or 3): ");
            int productNumber = sc.nextInt();

            System.out.print("Enter quantity sold: ");
            int quantity = sc.nextInt();
         
            double price = 0.0;

            switch (productNumber) {
                case 1:
                    price = 22.50;
                    break;
                case 2:
                    price = 44.50;
                    break;
                case 3:
                    price = 9.98;
                    break;
                default:
                    System.out.println("Invalid product number!");
                    continue; // Skip to next loop iteration
            }

            double productTotal = price * quantity;
            totalSales += productTotal;

            System.out.printf("Subtotal for this product: ₹%.2f\n", productTotal);

            System.out.print("Do you want to enter another product? (Y/N): ");
            ch = sc.next().charAt(0);

        } while (ch == 'Y' || ch == 'y');

        System.out.printf("Total retail value of all products sold: ₹%.2f\n", totalSales);
        sc.close();
    }
}
