package ExtentReportWithActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://testautomationpractice.blogspot.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy (0,3500)");
		 
		 WebElement box1=driver.findElement(By.id("field1"));
		 
		 box1.clear();
		 
		 box1.sendKeys("i love you");
		 
		 WebElement copybox=driver.findElement(By.xpath("//button[text()='Copy Text']"));
		 
		 Actions act=new Actions(driver);
		 
		 Thread.sleep(3000);
		 
		 act.doubleClick(copybox).build().perform();
		 
		 Thread.sleep(2000);

		WebElement dragbox=driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement dropbox=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Thread.sleep(3000);
		
	  act.dragAndDrop(dragbox, dropbox).perform();
	}

}
