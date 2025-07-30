package core_java_assignment1;

import java.util.ArrayList;
import java.util.Scanner;

// Abstract superclass Bank
abstract class Bank {
    String accNo;      // customer account number
    String custName;   // customer name
    int custGender;    // 1 = Male, 2 = Female
    String custJob;    // customer job position
    double curBal;     // current balance in the account

    public Bank(String accNo, String custName, int custGender, String custJob, double curBal) {
        this.accNo = accNo;
        this.custName = custName;
        this.custGender = custGender;
        this.custJob = custJob;
        this.curBal = curBal;
    }

    public abstract double calcBalance();

    @Override
    public String toString() {
        return "Account No: " + accNo + ", Name: " + custName + ", Gender: " + (custGender == 1 ? "Male" : "Female") +
               ", Job: " + custJob + ", Current Balance: RM" + curBal;
    }
}

// Saving account subclass
class Saving extends Bank {
    double savRate;  // interest rate per year (e.g., 0.05 for 5%)

    public Saving(String accNo, String custName, int custGender, String custJob, double curBal, double savRate) {
        super(accNo, custName, custGender, custJob, curBal);
        this.savRate = savRate;
    }

    @Override
    public double calcBalance() {
        return curBal + (savRate * curBal);
    }

    @Override
    public String toString() {
        return super.toString() + ", Account Type: Saving, Interest Rate: " + (savRate * 100) + "%, Balance after Interest: RM" + calcBalance();
    }
}

// Current account subclass
class Current extends Bank {
    boolean fixedDep;  // has fixed deposit or not
    double curRate;    // interest rate per year (e.g., 0.03 for 3%)

    public Current(String accNo, String custName, int custGender, String custJob, double curBal, boolean fixedDep, double curRate) {
        super(accNo, custName, custGender, custJob, curBal);
        this.fixedDep = fixedDep;
        this.curRate = curRate;
    }

    @Override
    public double calcBalance() {
        double balance = curBal + (curRate * curBal);
        if (fixedDep) {
            balance -= 150;  // deduct RM150 service fee
        }
        return balance;
    }

    @Override
    public String toString() {
        return super.toString() + ", Account Type: Current, Fixed Deposit: " + fixedDep + ", Interest Rate: " + (curRate * 100) + "%" +
               ", Balance after Interest & Fees: RM" + calcBalance();
    }
}

// Main test program
public class Question19 {
    public static void main(String[] args) {
        ArrayList<Bank> customers = new ArrayList<>();

        // Sample customers
        customers.add(new Saving("S001", "Alice Tan", 2, "Engineer", 5000, 0.05));
        customers.add(new Current("C001", "Bob Lee", 1, "Teacher", 8000, true, 0.03));
        customers.add(new Current("C002", "Charlie Lim", 1, "Doctor", 12000, false, 0.03));
        customers.add(new Saving("S002", "Diana Ong", 2, "Designer", 3000, 0.04));

        Scanner scanner = new Scanner(System.in);

        // b) Search by account number
        System.out.print("Enter account number to search: ");
        String searchAccNo = scanner.nextLine().trim();

        boolean found = false;
        for (Bank customer : customers) {
            if (customer.accNo.equalsIgnoreCase(searchAccNo)) {
                System.out.println("Customer found:");
                System.out.println(customer.toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Account number " + searchAccNo + " not found.");
        }

        // c) Count Current account customers and total balance
        int currentCount = 0;
        double totalCurrentBalance = 0;

        for (Bank customer : customers) {
            if (customer instanceof Current) {
                currentCount++;
                totalCurrentBalance += customer.calcBalance();
            }
        }

        System.out.println("\nTotal number of Current account customers: " + currentCount);
        System.out.printf("Total balance of all Current accounts (after interest and fees): RM%.2f\n", totalCurrentBalance);

        scanner.close();
    }
}

/*
 Enter account number to search: C001
Customer found:
Account No: C001, Name: Bob Lee, Gender: Male, Job: Teacher, Current Balance: RM8000.0, Account Type: Current, Fixed Deposit: true, Interest Rate: 3.0%, Balance after Interest & Fees: RM8090.0

Total number of Current account customers: 2
Total balance of all Current accounts (after interest and fees): RM20450.00
*/
