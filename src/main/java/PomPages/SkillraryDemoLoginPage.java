package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLoginPage 
{
	
	//declration
	@FindBy(id="course")
	private WebElement course;
	
	//gettersmethods
	public WebElement getCourse() 
	{
		return course;
	}

	@FindBy(name="addresstype")
	private WebElement Coursedd;
	
	public WebElement getCoursedd() {
		return Coursedd;
	}

	@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
			private WebElement SeleniumTraining;
	
	
	//initialization
	public SkillraryDemoLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//utilization
		public void SearchDemoLoginPagee()
		{
			SeleniumTraining.click();
		}
	
}
