package ExtentReportPracticeday_05;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import ExtentReportPracticeDay_06.dataproviderExtentTest;

public class ExtenttestcasesDataprovider extends BaseClassfive{
	
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
	public void testgoogle()
	{
		driver.get("https://www.google.co.in/");
		String Acttit=driver.getTitle();
		String Exptit="goooleee";
		Assert.assertEquals(Acttit,Exptit );
	}
	
	@Test(testName="TestFacebook")
	public void testfacebook()
	{
		driver.get("https://www.facebook.com/");
		String Acttit=driver.getTitle();
		String Exptit="goooleee";
		Assert.assertEquals(Acttit,Exptit );
	}

}
