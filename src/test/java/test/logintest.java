package test;

import org.testng.annotations.Test;

import base.technobase;
import excelutilities.Excelutils;


public class logintest extends technobase {
	
	@Test
	
	public void loginTest()
	{
		test=extent.createTest("Login click");
		ob2.signinClick();
	}
	
	@Test
	public void loginDataTest()
	{
		test=extent.createTest("Data driven");
		{
			String xl="C:\\Users\\HOME\\Desktop\\technocart.xlsx";
			String Sheet="Sheet1";
			
			int rowCount=Excelutils.getRowCount(xl, Sheet);
			for (int i=1;i<=rowCount;i++)
			{
				String username=Excelutils.getCellValue(xl, Sheet, i, 0);
				System.out.println("un "+username);
				String password=Excelutils.getCellValue(xl, Sheet, i, 1);
				System.out.println("pw "+password);
				ob2.setValues(username, password);		
				
	}

}
	}}
