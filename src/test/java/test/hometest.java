package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.technobase;

public class hometest extends technobase {
	
	@Test
	
	public void titleTest()
	{
		test=extent.createTest("Title test");
		Assert.assertEquals(ob1.title(),"Online Shopping Site in India : Shop Online for Machines Accessories – Technocart");
	}
	
	@Test
	
	public void logoTest() throws Exception {
		
		test=extent.createTest("Logo test");
		ob1.logo();
	}
	
	@Test
	
	public void mouseHoverTest()
	{
		test=extent.createTest("Mousehover test");
		ob1.moveTo();
	}
	
	

}
