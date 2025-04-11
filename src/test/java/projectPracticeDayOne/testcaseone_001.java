package projectPracticeDayOne;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testcaseone_001 {
	
	private WebDriver driver;
	private String baseURL;
	
	@BeforeTest
	public void setup()
	{
	driver=new ChromeDriver();
	baseURL="https://live.techpanda.org/";
	}
   //go to URL
	@Test
	public void testCase4() throws InterruptedException
	{
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//click on mobile link
		driver.findElement(By.xpath("//a[text()='Mobile']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='IPhone']/img")).click();
		Thread.sleep(2000);
	
			driver.findElement(By.xpath("//a[text()='Mobile']")).click();
			Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Xperia']/img")).click();
		
		String mainMobile1=driver.findElement(By.xpath("//span[text()='Sony Xperia']")).getText();
		System.out.println(" mainMobile  "+mainMobile1);
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//img[@id='product-collection-image-2']")).click();
		Thread.sleep(2000);
	}
	
	
}
