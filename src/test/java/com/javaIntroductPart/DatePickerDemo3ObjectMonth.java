package com.javaIntroductPart;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerDemo3ObjectMonth {
	
	static Month ConvertMonth(String month)
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
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String requiredYear="2029";
		String requiredMonth="June";
		String requiredDate="29";
		
    WebElement  CurrentMonth=driver.findElement(By.xpath("zxcv=qwerty"));
    Select syear=new Select(CurrentMonth);
    syear.selectByVisibleText("2029");
    while(true)
    {
    	String displayMonth=driver.findElement(By.xpath("//input[@id='qwasdfg']")).getText();
    	
    	Month ExpectedMonth=ConvertMonth(requiredMonth);
    	Month RequiredMonth=ConvertMonth(displayMonth);
    	
    	int result=ExpectedMonth.compareTo(RequiredMonth);
    	if(result<0)
    	{
    		driver.findElement(By.xpath("//button[@class='zxcvasdf']")).click();
    	}
    	if(result>0)
    	{
    		driver.findElement(By.xpath("//button[@id='sdfghrty']")).click();
    	}
    	else
    	{
    		break;
    	}
    }

	}

}
