package test;

import org.testng.annotations.Test;

import base.technobase;

public class checkouttest extends technobase {
	
	@Test
	public void checkoutPageTest()
	{
		test=extent.createTest("Checkout page Test");
		ob7.scrollDown();
		ob7.fillValue();
		ob7.clickCheckout();
	}

}
