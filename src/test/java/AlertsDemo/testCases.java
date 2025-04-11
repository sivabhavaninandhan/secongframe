package AlertsDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class testCases extends BaseClassAlert{
	
	@Test
	
	public void alertAccept() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
	}
	@Test
	public void alertDismiss() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().dismiss();
	}
  @Test
  public void alertwithInbox() throws InterruptedException
  {
	  driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	  Thread.sleep(3000);
	  
	  Alert alertwindow=driver.switchTo().alert();
	  System.out.println("the text inside the Alert "+alertwindow.getText());
	  Thread.sleep(2000);
	  alertwindow.sendKeys("good vibes");
	  Thread.sleep(2000);
	  alertwindow.accept();
  }

}
