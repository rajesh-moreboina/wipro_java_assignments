//A company decided to give bonus of 10% to employee if his/her year of service is more than 6 years.
//Ask user for their salary and year of service and print the net bonus amount.

package core_java_assignment1;
import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Current salary :: ");
		int salary=sc.nextInt();
		
		System.out.print("Years of service :: ");
		int years=sc.nextInt();
		
		if(years>6)
		{
			double bonus=salary*0.10;
			System.out.printf("you got net bonus amount $:: %.2f ",bonus);
		}
		else
		{
			System.out.println("Sry u didn't get any net bonus amount");
		}
	}
}
	/*
	 * Current salary :: 4567321
		Years of service :: 7
		you got net bonus amount $ ::456732.10

	 */


