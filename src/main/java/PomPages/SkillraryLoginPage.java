package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage 
{

	//Declaration
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbutton;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	
	@FindBy(name="q")
	private WebElement searchtb;
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchbutton;
	
	@FindBy(xpath="//a[@class='close_cookies']")
	private WebElement first;
	
	//initialization
	public SkillraryLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	public void Skillrarydemoapplication()
	{
		skillrarydemoapp.click();
	}

	public void firsts()
	{
		first.click();
	}
	
	public void gearsbutton() 
	{
		
		gearsbutton.click();
	}

	public void searchbutonn()
	{
		searchbutton.click();
	}
	
	public void searchtextbox(String name)
	{
		searchtb.sendKeys(name);
	}
	
}
