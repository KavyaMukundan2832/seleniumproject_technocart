package test;

import org.testng.annotations.Test;

import base.technobase;

public class producttest extends technobase {
	
	@Test
	public void addProduct() throws Exception
	{
		test=extent.createTest("Add product test");
		ob6.scroll();
		ob6.add();
		ob6.alert();
	}
	

}
