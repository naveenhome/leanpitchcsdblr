package csd.blr.test.java;

import junit.framework.TestCase;
import csd.blr.main.java.Rect;

public class TestLSP extends TestCase{
	public void test1()
	{
		Rect obj = new Rect();
		obj.setH(8);
		obj.setW(7);
		assertEquals(56, obj.area());
	}
	public void test2()
	{
		Squre obj = new Squre();
		obj.setH(8);
		assertEquals(64, obj.area());
		
	}
	public void test3()
	{
		Rect obj = new Squre();
		obj.setH(8);
		obj.setW(5);
		assertEquals(40, obj.area());
		
	}
	

}
