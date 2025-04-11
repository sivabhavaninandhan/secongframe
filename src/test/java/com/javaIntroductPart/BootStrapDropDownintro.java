package com.javaIntroductPart;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BootStrapDropDownintro {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		 WebDriver driver=new ChromeDriver(options);
		 driver.get("https://www.hdfcbank.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		 driver.findElement(By.xpath("//div[@class='drp1']")).click();
		 
		 List<WebElement> selectoptions=driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		 
		 System.out.println("the total options are  "+selectoptions.size());
		 
		 
		 for(WebElement select:selectoptions )
		 {
			 String selecttext=select.getText();
			 if(select.getText().equals("Accounts"))
			 {
				 select.click();
			 }
		 }
		 
		 
		driver.findElement(By.xpath("//div[@class='drp2']")).click();
		
		List<WebElement> second=driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
		
		System.out.println("the total second options "+second.size());
		
		for(WebElement opt:second)
		{
			String optiontext=opt.getText();
			if(opt.getText().equals("Savings Accounts"))
			{
				opt.click();
			}
		}

	}

}
