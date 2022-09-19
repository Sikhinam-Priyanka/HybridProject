package Scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import PomPages.CoreJavaPage;
import PomPages.SkillraryLoginPage;
import PomPages.WishListPage;
import genericLibrary.BaseClass;

public class TestCase3 extends BaseClass
{
	@Test
	public void tc3() throws IOException, InterruptedException
	{
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.firsts();
		s.searchtextbox(pdata.gerPropertydata("cdata"));
		s.searchbutonn();
		
		CoreJavaPage j=new CoreJavaPage(driver);
		j.seleniumtraining();
		
		WishListPage w=new WishListPage(driver);
		w.closee();
		utilities.SwitchFrame(driver);
		w.playbutton();
		Thread.sleep(8000);
		w.pausebutton();
		utilities.FrameSwitchback(driver);
		w.addtowishlist();
		
	}
}
