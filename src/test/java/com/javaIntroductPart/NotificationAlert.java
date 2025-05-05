package com.javaIntroductPart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NotificationAlert {
	
      static void futureDate(WebDriver driver,String year,String month,String day)
	{
			
	}

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.redbus.in/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		WebElement departure= driver.findElement(By.xpath("//input[@id='src']"));
        departure.sendKeys("Vijayawada");
        
        driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Hyderabad");
        
        driver.findElement(By.xpath("//div[@class='labelCalendarContainer']")).click();
	}

}
