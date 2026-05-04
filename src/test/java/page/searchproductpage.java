package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchproductpage {
	
	WebDriver driver;
	
	@FindBy(name="q")
	WebElement searchbar;
	
	@FindBy(xpath="//*[@id=\"header-wrapper\"]/div[1]/div[1]/div/div/div[2]/search-form/form/button")
	WebElement searchbutton;
	
	public searchproductpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void search(String product)
	{
		searchbar.click();
		searchbar.sendKeys(product);
		searchbutton.click();
	}
	
	

}
