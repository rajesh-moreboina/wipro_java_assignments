package core_java_assignment1;

//Base class
class Worker
{
 protected String name;
 protected double salaryRate;  

 public Worker(String name, double salaryRate)
 {
     this.name = name;
     this.salaryRate = salaryRate;
 }

 // Abstract pay method — overridden by subclasses
 public double pay(int hours)
 {
     return 0.0; 
 }

 public String getName() 
 {
     return name;
 }
}

//DailyWorker: paid based on number of days worked (hours input means days here)
class DailyWorker extends Worker 
{

 public DailyWorker(String name, double dailyRate) {
     super(name, dailyRate);
 }

 @Override
 public double pay(int days)
 {
     return salaryRate * days;  
 }
}

//SalariedWorker: paid fixed wage for 40 hours regardless of actual hours
class SalariedWorker extends Worker
{

 public SalariedWorker(String name, double hourlyRate) {
     super(name, hourlyRate);
 }

 @Override
 public double pay(int hours) 
 {
     // pays for fixed 40 hours irrespective of hours worked
     return salaryRate * 40;
 }
}

//Test program
public class Question13 {
 public static void main(String[] args) {
     DailyWorker dw = new DailyWorker("Alice", 100);    // daily rate = 100
     SalariedWorker sw = new SalariedWorker("Bob", 20); // hourly rate = 20

     int daysWorked = 5;
     int hoursWorked = 45;

     System.out.println(dw.getName() + "'s weekly pay (worked " + daysWorked + " days): " + dw.pay(daysWorked));
     System.out.println(sw.getName() + "'s weekly pay (worked " + hoursWorked + " hours): " + sw.pay(hoursWorked));
 }
}

/*
Alice's weekly pay (worked 5 days): 500.0
Bob's weekly pay (worked 45 hours): 800.0
*/
