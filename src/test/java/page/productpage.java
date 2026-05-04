package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productpage {
	
	WebDriver driver;
	
	@FindBy(xpath="//div[@class='product-form_quantity js-product-quantity']/button")
	WebElement button;
	
	@FindBy(xpath="//div[@class='modal-buttons']/a[2]")
	WebElement alertcart;
	
	public productpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void scroll() throws Exception
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500)"); 
		Thread.sleep(2000);
	}
	
	public void add() throws Exception
	{
		button.click();
		Thread.sleep(2000);
	}
	
	public void alert()
	{
		alertcart.click();
	}

}
