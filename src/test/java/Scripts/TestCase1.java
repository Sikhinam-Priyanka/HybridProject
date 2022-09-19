package Scripts;

import org.testng.annotations.Test;

import PomPages.AddtoCart;
import PomPages.SkillraryDemoLoginPage;
import PomPages.SkillraryLoginPage;
import genericLibrary.BaseClass;

public class TestCase1 extends BaseClass
{
@Test
public void tc1()
{
	SkillraryLoginPage s=new SkillraryLoginPage(driver);
	s.gearsbutton();
	s.Skillrarydemoapplication();
	
	utilities.Switchingtabs(driver);
	
	SkillraryDemoLoginPage sd = new SkillraryDemoLoginPage(driver);
	utilities.mousehover(driver, sd.getCourse());
	sd.SearchDemoLoginPagee();
	
	AddtoCart ab=new AddtoCart(driver);
	utilities.doubleclick(driver, ab.getAddbtn());
	ab.Addtocartpage();
	utilities.Altertpopup(driver);
	
}
}
