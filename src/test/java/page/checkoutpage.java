package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class checkoutpage {
	
	WebDriver driver;
	
	@FindBy(xpath="//div[@class='form-group province']/div/select")
	WebElement dropdown;
	
	@FindBy(xpath="//div[@class='form-group zip']/input")
	WebElement pincode;
	
	@FindBy(xpath="//div[@class='cart-summary_footer']/button")
	WebElement chkbutton;
	
	public checkoutpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void scrollDown()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500)"); 
	}
	
	public void fillValue()
	{
		Select s=new Select(dropdown);
		s.selectByVisibleText("Kerala");
		pincode.clear();
		pincode.sendKeys("678001");
	}
	
	public void clickCheckout()
	{
		chkbutton.click();
	}

}
