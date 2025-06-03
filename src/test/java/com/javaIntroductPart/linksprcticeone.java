package com.javaIntroductPart;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class linksprcticeone {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> pagelinks=driver.findElements(By.tagName("a"));
		
		System.out.println("total links are "+pagelinks.size());
		
		for(int i=0;i<pagelinks.size( );i++)
		{
			String linkText=pagelinks.get(i).getText();
			
			if(linkText.startsWith("W"))
			{
				System.out.println(i+1+"total links related "+linkText);
			}
		}
		

	}

}
