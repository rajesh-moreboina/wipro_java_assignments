
package junitprograms;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@SuiteClasses
(
	{
		JUNITAssertionsDemo.class,//1 testcase
		MyCalTest.class//5 testcase
	}
)
public class TestSuiteDemo {

}
