package csd.blr.test.java;

import csd.blr.main.java.Rect;

public class Squre extends Rect{
	
	public int area()
	{
		if (this.getW()==0)
		{
			
	
		return this.getH()*this.getH();
		}
		else
			return this.getW()*this.getW();
			
		
	}

}
