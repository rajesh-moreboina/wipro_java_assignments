/* A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
 */
package core_java_assignment1;
import java.util.Scanner;
public class Question6 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter your marks: ");
	int grade =sc.nextInt();
	
	if(grade>80)
	{
		System.out.println("A");
	}
	else if(grade>60 && grade<=80)
	{
		System.out.println("B");
	}
	else if(grade>50 && grade<=60)
	{
		System.out.println("C");
	}
	else if(grade>45 && grade<=50)
	{
		System.out.println("D");
	}
	else if(grade>25 && grade<=45)
	{
		System.out.println("E");
	}
	else
	{
		System.out.println("F");
	}
	}

}
/*
 	Enter your marks: 
	95
	A
 */

