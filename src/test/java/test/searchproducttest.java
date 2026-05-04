package test;

import org.testng.annotations.Test;

import base.technobase;

public class searchproducttest extends technobase {
	
	@Test
	public void searchTest()
	{
		test=extent.createTest("Search product");
		ob4.search("Machine");
	}

}
