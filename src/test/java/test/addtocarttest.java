package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.technobase;

public class addtocarttest extends technobase {
	@Test
	
	public void addtocartTest() throws Exception
	{
		test=extent.createTest("addtocart test");
		ob5.scrolldown();
		ob5.productClick();
	}

}
