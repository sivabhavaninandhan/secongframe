package com.javaIntroductPart;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerIntoduct {
	
	static void  selectFutureDate(WebDriver driver,String date,String month,String year)
	{
		while(true)
		{
			String currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if(currentmonth.equals(month)&&currentyear.equals(year))
			{
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
	  
		//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		
		List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for(WebElement currentdate:dates)
		{
			if(currentdate.getText().equals(date))
			{
				currentdate.click();
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		/*String month="April";
		String year="2026";
		String date="15";*/

		driver.switchTo().frame(0);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		selectFutureDate(driver,"15","April","2026");
		
		
	}

}
