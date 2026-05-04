package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import page.addtocartpage;
import page.checkoutpage;
import page.homepage;
import page.loginpage;
import page.productpage;
import page.registrationpage;
import page.searchproductpage;

public class technobase {
	
	public static ExtentSparkReporter reporter;
	public static ExtentTest test;
	public static ExtentReports extent;
	
	public static WebDriver driver;
	public homepage ob1;
	public loginpage ob2;
	public registrationpage ob3;
	public searchproductpage ob4;
	public addtocartpage ob5;
	public productpage ob6;
	public checkoutpage ob7;
	
	@BeforeMethod
	public void object() 
	{
		 ob1=new homepage(driver);
		 ob2=new loginpage(driver);
		 ob3=new registrationpage(driver);
		 ob4=new searchproductpage(driver);
		 ob5=new addtocartpage(driver);
		 ob6=new productpage(driver);
		 ob7=new checkoutpage(driver);
	}
	
	@BeforeTest
	
	
	public void setUp() {
		
		reporter=new ExtentSparkReporter("./Reports/Technocartreport.html");
		reporter.config().setDocumentTitle("Ebay_report");
		reporter.config().setReportName("Functionality test");
		reporter.config().setTheme(Theme.DARK);
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Hostname", "Localhost");
		extent.setSystemInfo("OS", "Windows10");
		extent.setSystemInfo("testername", "Kavya");
		extent.setSystemInfo("Browser Name", "chrome");
		
		
		driver=new ChromeDriver();
		driver.get("https://www.technocart.com/");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void aftmthd(ITestResult result) throws Exception
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, "test case failed is "+result.getName());
			test.log(Status.FAIL, "test case failed is "+result.getThrowable());
			
		}else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, "test case skipped is "+result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, "test case Passed is "+result.getName());
		}
		 
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
		extent.flush();
		
		}


}
