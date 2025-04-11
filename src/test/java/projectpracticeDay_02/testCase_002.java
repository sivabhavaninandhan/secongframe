package projectpracticeDay_02;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testCase_002 {
	
	private WebDriver driver;
	private String baseURL;
	
	@BeforeTest
	public void setup()
	{
		baseURL="https://live.techpanda.org";
		driver=new ChromeDriver();
	
		
	}

	@Test
	public void testcasefive() throws InterruptedException
	{
         driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//a[text()='Mobile']")).click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy (0,500)");
		
		driver.findElement(By.xpath("//a[@title='Xperia']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Add to Compare']")).click();	driver.findElement(By.xpath("//a[text()='Mobile']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='IPhone']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Add to Compare']")).click();
		
	}
}
