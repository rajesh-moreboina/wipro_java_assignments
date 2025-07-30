package junitprograms;

//import junit.framework.Assert;
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotSame;
//import static org.junit.Assert.assertSame;
import static org.junit.Assert.*;
import org.junit.Test;

import junit.framework.Assert;


public class JUNITAssertionsDemo
{
	@Test
	public void test()
	{
		String obj1="rajesh";
		String obj2="moreboina";
		String obj3=new String ("rajesh");
		String obj4="rajesh";
		String obj5=null;
		int a=10;
		int b=100;
		int x[]= {1,2,3,4};
		int y[]= {1,2,3,4};
		
		//Assert.assertEquals(obj3, obj4);
		assertArrayEquals(x,y);
		
		assertEquals(obj1, obj3);
		assertEquals(obj1,obj4);
		assertNotSame(obj1,obj2);
		
		assertTrue(a<b);
		assertNotEquals(a, b);
		
		assertFalse(a>b);
		//assertEquals(a, b);
		
		
	}
		
}
