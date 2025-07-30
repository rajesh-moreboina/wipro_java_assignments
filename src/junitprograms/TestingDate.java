package junitprograms;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import junit.framework.TestResult;
import junit.framework.TestSuite;


public class TestingDate 
{

	public static void main(String[] args)
	{
		Result rs=JUnitCore.runClasses(MyCalTest.class);
		
		for(Failure fs:rs.getFailures())
		{
			System.out.println("fails "+ fs);
			System.out.println(fs.getMessage());
		}
		if(rs.wasSuccessful())
		{
			System.out.println("Successful");
		}
		System.out.println("succes:: "+rs.wasSuccessful());
		System.out.println("runcount:: "+rs.getRunCount());
		
		//first test suites
		TestSuite ts=new TestSuite(JUNITAssertionsDemo.class,MyCalTest.class);
		
		//testing classes
		TestResult t2=new TestResult();
		ts.run(t2);
		System.out.println("test suits runcount?? ::"+ t2.runCount());
	}

}
