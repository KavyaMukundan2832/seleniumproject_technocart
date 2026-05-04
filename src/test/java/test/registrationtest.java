package test;

import org.testng.annotations.Test;

import base.technobase;

public class registrationtest extends technobase {
	
	@Test
	public void gotoTest()
	{
		test=extent.createTest("Register link");
		ob3.gotoLink();
		ob3.createAcc();
	}

}
