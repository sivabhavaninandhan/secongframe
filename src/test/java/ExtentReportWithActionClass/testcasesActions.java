package ExtentReportWithActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class testcasesActions extends BaseClassAction{
	
	@Test(testName="testaction")
	
	public void doubletest() throws InterruptedException
	{
		driver.get("https://testautomationpractice.blogspot.com/");
		 
		 
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy (0,3000)");
		 
		 WebElement box1=driver.findElement(By.id("field1"));
		 
		 box1.clear();
		 
		 box1.sendKeys("i love you");
		 
		 WebElement copybox=driver.findElement(By.xpath("//button[text()='Copy Text']"));
		
		 
		 Actions act=new Actions(driver);
		 act.doubleClick(copybox).build().perform();
		 
		 Thread.sleep(3000);
	}
		 @Test(testName="TestDragandDrop")
		 public void dragtest() throws InterruptedException
		 {
			 driver.get("https://testautomationpractice.blogspot.com/");
			 JavascriptExecutor js=(JavascriptExecutor)driver;
			 js.executeScript("window.scrollBy (0,3000)");
			 
		 Actions act=new Actions(driver);
		 
		 Thread.sleep(2000);

		WebElement dragbox=driver.findElement(By.xpath("//div[@i='draggable']"));
		
		WebElement dropbox=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Thread.sleep(3000);
		
	  act.dragAndDrop(dragbox, dropbox).perform();
	  }
		
	

	@Test(testName="testDoubleTwo")
	public void doubletwo()
	{
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		 
		 driver.switchTo().frame("iframeResult");
		 
		 WebElement box1=driver.findElement(By.id("fel"));
		 WebElement box2=driver.findElement(By.id("field2"));
		 
		 WebElement button=driver.findElement(By.xpath("//button[text()='Copy Text']"));
		 box1.clear();
		 box1.sendKeys("i like you");
		 
		 Actions act=new Actions(driver);
		 act.doubleClick(button).perform();
	}
}
