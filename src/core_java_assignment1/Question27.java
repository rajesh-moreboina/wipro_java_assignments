package core_java_assignment1;

//Enum for six types of paper currency
enum Currency {
 ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED
}

public class Question27 {
 public static void main(String[] args) {

     // Loop through and print all enum values
     System.out.println("Available Paper Currencies:");
     for (Currency c : Currency.values()) {
         System.out.println("- " + c);

         // Switch statement to describe each currency
         switch (c) {
             case ONE:
                 System.out.println("Description: The smallest denomination of paper currency.");
                 break;
             case FIVE:
                 System.out.println("Description: Commonly used for small transactions.");
                 break;
             case TEN:
                 System.out.println("Description: Often used in day-to-day purchases.");
                 break;
             case TWENTY:
                 System.out.println("Description: Widely circulated and used at ATMs.");
                 break;
             case FIFTY:
                 System.out.println("Description: Medium-high denomination used for larger purchases.");
                 break;
             case HUNDRED:
                 System.out.println("Description: High denomination, used for big payments or savings.");
                 break;
         }

         System.out.println(); // Blank line for readability
     }
 }
}

/*
 Available Paper Currencies:
- ONE
Description: The smallest denomination of paper currency.

- FIVE
Description: Commonly used for small transactions.

- TEN
Description: Often used in day-to-day purchases.

- TWENTY
Description: Widely circulated and used at ATMs.

- FIFTY
Description: Medium-high denomination used for larger purchases.

- HUNDRED
Description: High denomination, used for big payments or savings.

*/
