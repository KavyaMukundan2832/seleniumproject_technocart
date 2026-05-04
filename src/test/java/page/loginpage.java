package page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	WebDriver driver;
	
	
	@FindBy(xpath="//*[@id=\"section-topbar\"]/div/div/div[2]/ul/li[3]/span[2]/a[1]")
	WebElement signinlink;	
	
	@FindBy(id="login-email")
	WebElement uname;
	
	@FindBy(id="login-password")
	WebElement upass;
	
	@FindBy(xpath="//*[@id=\"customer_login\"]/button")
	WebElement login;
	
	
	public loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void signinClick()
	{
		signinlink.click();
	}
	
	public void setValues(String username,String password)
	{
		signinlink.click();
		uname.sendKeys(username);
		upass.sendKeys(password);
		login.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));	

}
}
