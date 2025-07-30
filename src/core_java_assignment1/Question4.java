//Take name, roll number and field of interest from user and print in the format below :
//Hey, my name is xyz and my roll number is xyz. My field of interest are xyz.

package core_java_assignment1;
import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your name: ");
		String name=sc.next();
		
		System.out.println("enter roll_no: ");
		int roll_no=sc.nextInt();
		
		System.out.println("enter your field of interest: ");
		String field_of_interest=sc.next();
		
		System.out.print("Hey, my name is "+name +" my roll number is "+roll_no+". "+"My field of interest are "+field_of_interest+".");

	}
}

/*
enter your name: 
rajesh
enter roll_no: 
567
enter your field of interest: 
developer
Hey, my name is rajesh my roll number is 567. My field of interest are developer.
*/
