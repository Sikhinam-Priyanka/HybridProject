package genericLibrary;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities 
{
	//dropdown
	public void dropdown(WebElement ele,String text)
	{
		Select s = new Select(ele);
		s.selectByVisibleText(text);
	}
	
	//MouseHover
	public void mousehover(WebDriver driver,WebElement ele)
	{
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
	}
	
	
	//doubleclick
	public void doubleclick(WebDriver driver,WebElement ele)
	{
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();
	}
	
	//RightClick
	public void Rightclick(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
	}
	
	//DragDrop
	public void DragDrop(WebDriver driver,WebElement source,WebElement target)
	{
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target);
	}
	
	//Frames(Switching)
	public void SwitchFrame(WebDriver driver)
	{
		driver.switchTo().frame(0);
	}
	
	//Frames Switchback
	public void FrameSwitchback(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	
	//Altert Popup
	public void Altertpopup(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	//childbrowser
	public void Switchingtabs(WebDriver driver)
	{
		Set<String> child = driver.getWindowHandles();
		for(String b:child)
		{
			driver.switchTo().window(b);
		}
	}
	
	//ScrollBar
	public void ScrollBar(WebDriver driver,int X,int Y)
	{
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("windows.scrollBy("+X+","+Y+")");
	}
	
}
