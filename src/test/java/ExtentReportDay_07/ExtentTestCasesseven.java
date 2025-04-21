package ExtentReportDay_07;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import ExtentReportPracticeday_05.DataproviderExtentTestcase;

public class ExtentTestCasesseven extends BaseClass07{
	
	@Test(testName="TestORNG",dataProvider="validation",dataProviderClass=DataproviderExtentTestcase.class)
	public void testORG(String user,String pass)
	{

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys(user);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']/child::img")).click();
		driver.findElement(By.xpath("//ul[@class='oxd-dropdown-menu']/li[4]")).click();
	}
	
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
