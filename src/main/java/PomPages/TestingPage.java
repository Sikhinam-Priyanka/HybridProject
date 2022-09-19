package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage 
{

	@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
	private WebElement Seleniumtraininggg;
	
	@FindBy(id="mycart")
	private WebElement Cartab;
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[1]")
	private WebElement facebook;

	public TestingPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);;
	}

	public WebElement getSeleniumtraininggg() {
		return Seleniumtraininggg;
	}

	public WebElement getCartab() {
		return Cartab;
	}

	public WebElement getFacebook() {
		return facebook;
	}
	
	public void facebookicon()
	{
		facebook.click();
	}
	
	
}
