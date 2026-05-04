package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class homepage {
	
	WebDriver driver;
	
	@FindBy(xpath="//div[@class='header-logo']/a/img")
	WebElement logo;
	
	@FindBy(xpath="//*[@id=\"header-wrapper\"]/div[1]/div[2]/div/div/div/div/div/ul/li[1]/div[1]/a/span")
	WebElement mat;
	
	@FindBy(xpath="//*[@id=\"header-wrapper\"]/div[1]/div[2]/div/div/div/div/div/ul/li[2]/div[1]/a/span")
	WebElement machine;
	
	@FindBy(xpath="//*[@id=\"header-wrapper\"]/div[1]/div[2]/div/div/div/div/div/ul/li[3]/div[1]/a/span")
	WebElement hand;
	
	@FindBy(xpath="//*[@id=\"header-wrapper\"]/div[1]/div[2]/div/div/div/div/div/ul/li[4]/div[1]/a/span")
	WebElement safety;
	
	@FindBy(xpath="//*[@id=\"header-wrapper\"]/div[1]/div[2]/div/div/div/div/div/ul/li[5]/div[1]/a/span")
	WebElement exclusive;
	
	
	
	
	
	public homepage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public String title()
	{
		String title=driver.getTitle();
		return title;
		
	}
	
	public void logo() throws Exception 
	{
		Thread.sleep(2000);
		Assert.assertTrue(logo.isDisplayed());
	}
	
	public void moveTo()
	{
		Actions a=new Actions(driver);
		a.moveToElement(mat).perform();
		a.moveToElement(machine).perform();
		a.moveToElement(hand).perform();
		a.moveToElement(safety).perform();
		a.moveToElement(exclusive).perform();
		
	}

}
