//1.Write a program to add 8 to the number 2345 and then divide it by 3. 
//Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. 
//Display the final result.

package core_java_assignment1;

public class Question1 {

	public static void main(String[] args) 
	{
		int num=2345+8;
		int num2=num/3;
		int num3=num2%5;
		int num4=num3*5;
		System.out.println("final result:: "+num4);
	}

}
/* Output
 * final result:: 20
 */
