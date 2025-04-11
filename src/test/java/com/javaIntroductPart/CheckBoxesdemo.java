package com.javaIntroductPart;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBoxesdemo {
	
	@Test
	
	public void verificationOfCheckBoxes()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)", "");
		
		//Click on single CheckBox
		
	//	driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//Total number of days in week
		
		List<WebElement> totaldays=driver.findElements(By.xpath("//input[@type='checkbox']/following::label[contains(text(),'day')]"));
		
		System.out.println("the total number of days  "+totaldays.size());
		
		//clicking on total CheckBoxes
	/*	for(int i=0;i<totaldays.size();i++)
		{
			totaldays.get(i).click();
		}*/
		
		//select multiple check boxes randomily
		
		/*for(WebElement check:totaldays)
		{
			String checkname=check.getAttribute("value");
			if(checkname.equals("sunday") || checkname.equals("tuesday")) 
			{
				check.click();
			}
			
			}*/
		
		/*for(WebElement checks:totaldays)
		{
			checks.click();
		}*/
		
		/*for(int i=3;i<totaldays.size();i++)
		{
			totaldays.get(i).click();
		}(*/
		
		//select first 3 checkboxes
		for(int i=0;i<totaldays.size();i++)
		{
			if(i<3)
			{
				totaldays.get(i).click();
			}
		}
		}
		
	}


