package Scripts;

import java.io.IOException;

import org.openqa.selenium.Point;

import org.testng.annotations.Test;

import PomPages.SkillraryDemoLoginPage;
import PomPages.SkillraryLoginPage;
import PomPages.TestingPage;
import genericLibrary.BaseClass;

public class TestCase2 extends BaseClass
{
	@Test
	public void tc2() throws IOException, InterruptedException
	{
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.Skillrarydemoapplication();
	
	
		SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
		utilities.Switchingtabs(driver);
		utilities.dropdown(sd.getCoursedd(), pdata.gerPropertydata("coursedd"));
		
		
		TestingPage t=new TestingPage(driver);
		utilities.DragDrop(driver, t.getSeleniumtraininggg(), t.getCartab());
		
		 Point loc = t.getFacebook().getLocation();
		int x = loc.getX();
		int y = loc.getY();
		
		utilities.ScrollBar(driver, x, y);
		t.facebookicon();
	}

	
	
}
