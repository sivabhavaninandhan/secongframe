package ExtentReportsecondframeday_02;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testclassextentseve extends BaseClassExtent{
	
	@Test(testName="TestGoogle")
	public void testGoogle()
	{
		driver.get("https://www.google.co.in/");
		String acttitle=driver.getTitle();
		String exptitle="Google";
		Assert.assertEquals(acttitle, exptitle);
		extentTest.info("Assertion is passed test is passed");
	}
   @Test(testName="TestORGHRM")
   public void testORGhrm()
 {
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	String acttitle=driver.getTitle();
	String exptitle="OrangeHRM";
	Assert.assertEquals(acttitle, exptitle);
	extentTest.info("Assertion is passed test is passed");

 }
   @Test(testName="TestFaceBook")
   public void testFaceBook()
   {
	   driver.get("https://www.facebook.com/");
	   String acttitle=driver.getTitle();
	   String exptitle="Facebook – log in or sign upp";
	   Assert.assertEquals(acttitle, exptitle);
	   extentTest.info("Assertion  is failed for this test");
   }


}
