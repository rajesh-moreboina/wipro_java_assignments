// Modify the above question to allow student to sit if he/she has medical cause. 
//Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
package core_java_assignment1;
import java.util.Scanner;
public class Question8 {

	public static void main(String[] args) {
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
				//System.out.println("You are not allowed to sit in the exam.");
				System.out.print("Do you have a medical cause? (Y/N): ");
				char medicalCause=sc.next().charAt(0);
				
				if(medicalCause =='Y'||medicalCause=='y')
				{
					System.out.println("You are allowed to sit in the exam due to medical cause.");
				}
				else
				{
					System.out.println("You are not allowed to sit in the exam.");
				}
			}
		}
		
		

	}

}
/*
No of classes held :: 90
No of classes attended :: 50
Percentage: 55.56
Do you have a medical cause? (Y/N): y
You are allowed to sit in the exam due to medical cause.
*/