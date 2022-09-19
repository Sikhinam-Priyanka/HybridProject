package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCart 
{
	@FindBy(id="add")
	private WebElement Addbtn;
	
	public WebElement getAddbtn() {
		return Addbtn;
	}

	@FindBy(xpath="//button[@ondblclick='addtocart()']")
	private WebElement Addtocartbtn;
	
	
	public AddtoCart(WebDriver driver)
	{
	PageFactory.initElements(driver,this);
	}
	
	public void Addtocartpage()
	{
		Addtocartbtn.click();
	}
}
