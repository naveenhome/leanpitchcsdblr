package csd.blr.test.java;

import junit.framework.TestCase;
import csd.blr.main.java.Largest;

public class TestLargest extends TestCase{
	
	public void testLarge1()
	{
		int arr[]={4,5,8,3,9,2};
		Largest obj = new Largest();
		assertEquals(9, obj.find(arr));
		
	}
	public void testLarge2()
	{
		int arr[]={4,5,8,3,2};
		Largest obj = new Largest();
		assertEquals(8, obj.find(arr));
		
	}
	public void testLarge3()
	{
		int arr[]={-4,-5,-8,-3,-2};
		Largest obj = new Largest();
		assertEquals("Array can't be blank", obj.find(arr));
		
	}
	public void testLarge4()
	{
		int arr[]={};
		Largest obj = new Largest();
		assertEquals(-2, obj.find(arr));
				
	}
	public void testLarge5()
	{
		int arr[]={5,5};
		Largest obj = new Largest();
		assertEquals(5, obj.find(arr));
				
	}
	

}
