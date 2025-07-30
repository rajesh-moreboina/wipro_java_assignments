package core_java_assignment1;
public class Question10 {

	public static void main(String[] args) {
		if(args.length==0)
		{
			System.out.println("Plz provide the no of eggs as a command line args.");
			return;
		}
		
		int totaleggs=Integer.parseInt(args[0]);
		
		int gross=totaleggs/144;
		int remainingAfterGross=totaleggs%144;
		
		int dozen =remainingAfterGross/12;
		int leftover=remainingAfterGross%12;
		System.out.println("Your no of eggs is "+gross +" gross, "+dozen +" dozen, and "+ leftover);
	}

}

/*
 Your no of eggs is 9 gross, 3 dozen, and 10
*/
