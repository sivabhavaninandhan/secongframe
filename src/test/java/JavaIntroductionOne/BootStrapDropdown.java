package JavaIntroductionOne;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class BootStrapDropdown {
	
	public static WebDriver driver;
	
	@Test
	public void dropdowncheck() throws InterruptedException
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.hdfcbank.com/");
		driver.findElement(By.xpath("//a[text()='Select Product Type']")).click();
		
	List<WebElement> Selectoption=driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
	
	int totalopts=Selectoption.size();
	System.out.println("the total options in drop down  "+totalopts);
	for(WebElement Selectopt:Selectoption)
	{
		if(Selectopt.getText().equals("Accounts"))
		{
			Selectopt.click();
			break;
		}
	}
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//a[text()='Select Product']")).click();
	
	List<WebElement>  SelectSecond=driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
	
	System.out.println("the total options in second drop down is "+SelectSecond.size());
	
	for(WebElement secondoptions:SelectSecond)
	{
		if(secondoptions.getText().equals("Savings Accounts"))
		{
			secondoptions.click();
			break;
		}
	}
	}
		
		
	}


