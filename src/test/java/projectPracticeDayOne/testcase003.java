package projectPracticeDayOne;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testcase003 {
	
	private WebDriver driver;
	private String baseURL;
	
	public String FirstName="BERRY";
	public String LastName="BERRYTWO";
	
@BeforeTest

public void setup()
{
	driver=new FirefoxDriver();
	baseURL="https://live.techpanda.org/";
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
//driver.findElement(By.xpath("//div[@class='block-title']/strong/span[text()='Account']//following::ul//following::li[normalize-space()='My Account']")).click();
	
	
}

@Test
public void testcasesix() throws InterruptedException
{
	driver.get(baseURL);
	Thread.sleep(3000);
   WebElement accountlink=driver.findElement(By.xpath("//div[@class='block-title']//following::ul/li[normalize-space()='My Account']"));
   accountlink.click();
   Thread.sleep(3000);
	
}
}
