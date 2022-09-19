package genericLibrary;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Photo 
{
	public void getPhoto(WebDriver driver,String name) throws IOException
	
	{
		Date d=new Date();
		String Currentdate=d.toString().replaceAll(":", "-");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File destn=new File(AutoConstants.Photopath+Currentdate+name+".png");
		FileUtils.copyFile(Source, destn);
	}

	
		
	}
