package com.javaIntroductPart;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatepickerDemoThreePractice {

	static Month convertMonth(String month)
	{
		HashMap<String,Month> monthMap=new HashMap<String,Month>();
		
		monthMap.put("January", Month.JANUARY);
		monthMap.put("February", Month.FEBRUARY);
		monthMap.put("March", Month.MARCH);
		monthMap.put("April", Month.APRIL);
		monthMap.put("May", Month.MAY);
		monthMap.put("June", Month.JUNE);
		monthMap.put("July", Month.JULY);
		monthMap.put("August", Month.AUGUST);
		monthMap.put("September", Month.SEPTEMBER);
		monthMap.put("October", Month.OCTOBER);
		monthMap.put("November", Month.NOVEMBER);
		monthMap.put("December", Month.DECEMBER);
		
		Month vmonth=monthMap.get(month);
		if(vmonth==null)
		{
			System.out.println("invalid month");
		}
		
		return vmonth;
	}
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		String requiredYear="2026";
		String requiredMonth="July";
		String requiredDate="29";
		
		WebElement seleyear=driver.findElement(By.xpath("//select[@id='pprtey']"));
		Select selyear=new Select(seleyear);
		selyear.selectByVisibleText("2026");
		
		while(true)
		{
			String displayMonth=driver.findElement(By.id("month")).getText();
			
			Month expectedMonth=convertMonth(requiredMonth);
			Month actualMonth=convertMonth(displayMonth);
			
			int result=expectedMonth.compareTo(actualMonth);
			
			if(result<0)
			{
				driver.findElement(By.xpath("//div[@class='dis-wsdfrt-ouyp-w']")).click();
			}
			else if(result>0)
			{
				driver.findElement(By.xpath("//div[@class='dis-wsdfrt-ouyp-e']")).click();
			}
			else
			{
				break;
			}
		}
		

	}

}
