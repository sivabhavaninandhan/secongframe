package ExtentReportday_05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class testcasesfive extends BaseClass{
	
	@Test(testName="TestAutomation")
	public void testpaginationdemo()
	{
		driver.get("https://testautomationpractice.blogspot.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy (0,2900)");
		
		List<WebElement> pages=driver.findElements(By.xpath("//ul[@class='pagination']"));
		
		int totpages=pages.size();
		System.out.println("the total pages are "+pages);
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr"));
		int totrow=rows.size();
		System.out.println("total rows are "+totrow);
		
		for(int p=1;p<=totpages;p++)
		{
			for(int r=1;r<=totrow;r++)
			{
				driver.findElement(By.xpath("//ul[@class='pagination']/li["+p+"]")).click();
				driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr["+r+"]/td/input[@type='checkboxx']")).click();
				
			}
		}
		
	}
	@Test(testName="TestBootstrap")
	
	public void BootStrapDropdown()
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		 WebDriver driver=new ChromeDriver(options);
		 driver.get("https://www.hdfcbank.com/");
		 
		 driver.findElement(By.xpath("//div[@class='drp1']")).click();
		 
		 List<WebElement> selectoptions=driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		 
		 System.out.println("the total options are  "+selectoptions.size());
		 
		 
		 for(WebElement select:selectoptions )
		 {
			 String selecttext=select.getText();
			 if(select.getText().equals("Accounts"))
			 {
				 select.click();
			 }
		 }
		 
		 
		driver.findElement(By.xpath("//div[@class='drp2']")).click();
		
		List<WebElement> second=driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
		
		System.out.println("the total second options "+second.size());
		
		for(WebElement opt:second)
		{
			String optiontext=opt.getText();
			if(opt.getText().equals("Savings Accounts"))
			{
				opt.click();
			}
		}

	}
}
