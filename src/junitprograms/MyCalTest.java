package junitprograms;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
//import org.junit.Ignore;
import org.junit.Test;


//@Ignore
public class MyCalTest {
	
	int f;
	int s;
	int result;
	MyCal obj;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		obj=new MyCal();
		result=obj.sum(10, 20);
		System.out.println("@Before :: "+result);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test //MyCal class
	public void test() 
	{
		System.out.println("My First Test Case ");
		MyCal obj1=new MyCal();
		assertEquals(result,obj1.sum(10, 20));
		//assertEquals(result,obj1.sum(11, 22));
	}
	
	//second method
	@Test //Student class
	public void test2()
	{
		System.out.println("For student class");
		Student std=new Student();
		std.setId(100);
		std.setName("rajesh");
		
		assertEquals(100,std.getId());
		assertEquals("rajesh",std.getName());
		
	}
	
	//third class
	// division class
	Divison obj3=new Divison(10,5);
	Divison obj4=new Divison(20,0);
	@Test
	public void text3()
	{
		System.out.println("for division class");
		assertEquals(2,obj3.divide());
		//assertEquals(4,obj4.divide());
	}
	
	//fouth test case
	@Test(expected=Exception.class)
	//@Ignore
	public void test4()
	{
		throw new NullPointerException();
	}
	
	@Test
	@Ignore
	public void test5()
	{
		System.out.println("Divison another case");
		assertEquals(5,obj4.divide());
	}

}
