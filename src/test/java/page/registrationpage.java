package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registrationpage {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"section-topbar\"]/div/div/div[2]/ul/li[3]/span[2]/a[2]")
	WebElement registerlink;
	
	@FindBy(id="register-first-name")
	WebElement firstname;
	
	@FindBy(id="register-last-name")
	WebElement lastname;
	
	@FindBy(id="register-email")
	WebElement email;
	
	@FindBy(id="register-password")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"create_customer\"]/button")
	WebElement regbutton;
	
	public registrationpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void gotoLink()
	{
		registerlink.click();
	}
	
	public void createAcc()
	{
		firstname.sendKeys("Kavya");
		lastname.sendKeys("Mukundan");
		email.sendKeys("kavyamkgm2000@gmail.com");
		password.sendKeys("Kavya@2026");
		regbutton.click();
		
	}

}
