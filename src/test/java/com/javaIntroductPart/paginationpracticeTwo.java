package com.javaIntroductPart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class paginationpracticeTwo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2500)");
		
		int totalpages=driver.findElements(By.xpath("//ul[@class='pagination']/li")).size();
		
		System.out.println("total pages are "+totalpages);
		
		int totalrows=driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr")).size();
		
		System.out.println("total rows in table "+totalrows);
		
		for(int p=1;p<=totalpages;p++)
		{
			for(int r=1;r<=totalrows;r++)
			{
				driver.findElement(By.xpath("//ul[@class='pagination']/li["+p+"]")).click();
				driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr["+r+"]/td//input")).click();
			}
		}

	}

}
