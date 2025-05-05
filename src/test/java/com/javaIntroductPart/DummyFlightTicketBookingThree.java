package com.javaIntroductPart;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DummyFlightTicketBookingThree {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//input[@id='product_549']")).click();
		driver.findElement(By.xpath("//input[@id='travname']")).sendKeys("Bhavani");
		driver.findElement(By.xpath("//input[@id='travlastname']")).sendKeys("kadali");
		
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		
		WebElement month=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select selmonth=new Select(month);
		selmonth.selectByVisibleText("May");
		
		WebElement year=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select selyear=new Select(year);
		selyear.selectByVisibleText("2025");
		
		String departureDate="15";
		List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr/td"));
		
		for(WebElement seldate:dates)
		{
			if(seldate.getText().equals(departureDate))
			{
				seldate.click();
				break;
			}
		}
		
		driver.findElement(By.xpath("//input[@id='sex_2']")).click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		driver.findElement(By.xpath("//input[@id='fromcity']")).sendKeys("Vijayawada");
		driver.findElement(By.xpath("//input[@id='tocity']")).sendKeys("Hyderabad");
		
		driver.findElement(By.xpath("//span[@id='select2-reasondummy-container']")).click();
		
		List<WebElement> dropdownoptns=driver.findElements(By.xpath("//ul[@id='select2-reasondummy-results']/li"));
		
		System.out.println("the toal options in drop down "+dropdownoptns.size());
		
		for(WebElement seloptns: dropdownoptns)
		{
			if(seloptns.getText().equals("Proof of return at airport"))
			{
				seloptns.click();
				break;
			}
		}
		
	driver.findElement(By.xpath("//input[@id='deliverymethod_2']")).click();
	
	driver.findElement(By.xpath("//input[@id='billname']")).sendKeys("kadalisAirlines.bhavani");
	driver.findElement(By.xpath("//input[@id='billing_phone']")).sendKeys("9908555321");
	driver.findElement(By.xpath("//input[@id='billing_email']")).sendKeys("gangakadali@gamil.com");
	
	driver.findElement(By.xpath("//span[@id='select2-billing_country-container']")).click();
	
	List<WebElement> totalcitys=driver.findElements(By.xpath("//ul[@class='select2-results__options']/li"));
	
	System.out.println("total citys are "+totalcitys.size());
	
	for(WebElement citys:totalcitys)
	{
		if(citys.getText().equals("Brazil"))
				{
		         citys.click();
		         break;
				}
	}
			

	}

}
