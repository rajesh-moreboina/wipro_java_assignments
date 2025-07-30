//The total number of students in a class are 90 out of which 45 are boys. If 50% of the total students secured grade 'A' out of which 20 are boys, then write a program to calculate the total number of girls getting grade 'A'.
package core_java_assignment1;

public class Question3 {

	public static void main(String[] args)
	{
		int total_std=90;
		
		int total_boys=45;
		
		int totalGradeA=total_std/2;//50% total A grades
		
		int total_girls=total_std-total_boys;//getting total girls
		
		int A_gradeBoys=20;
		int A_gradeGirls=totalGradeA-A_gradeBoys;
		System.out.println(" total no of girls getting grade A is :: "+A_gradeGirls);
		
		
	}

}
/*	output
 *  total no of girls getting grade A is :: 25
 */

