package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addtocartpage {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"section-template--18320763224108__main\"]/div/div[1]/div/div[31]/product-card/section/header/div[2]/a/span/img")
	WebElement product;
	
	
	public addtocartpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	
	public void scrolldown() throws Exception
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1500)"); 
		Thread.sleep(2000);
	}
	
	public void productClick()
	{
		product.click();
	}

}
