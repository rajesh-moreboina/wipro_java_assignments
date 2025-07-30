/*A student will not be allowed to sit in exam if his/her attendence is less than 70%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.
*/

package core_java_assignment1;
import java.util.Scanner;
public class Question7 {

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	
	System.out.print("No of classes held :: ");
	int total_classes=sc.nextInt();
	
	System.out.print("No of classes attended :: ");
	int attended_classes=sc.nextInt();
	
	if(attended_classes>total_classes||total_classes<=0)
	{
		System.out.println("Attended classes can't be more than held classes.");
	}
	else
	{
		double percentage= (attended_classes*100.0)/total_classes;
		System.out.printf("Percentage: %.2f", percentage);
		System.out.println();
		
		if(percentage>=70.0)
		{
			System.out.println("You are allowed to sit in the exam.");
		}
		else
		{
			System.out.println("You are not allowed to sit in the exam.");
		}
	}
	
}

}
/*
No of classes held :: 90
No of classes attended :: 70
Percentage: 77.78
You are allowed to sit in the exam.
*/
