package com.javaIntroductPart;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BootStrapDroptwopractice {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//a[text()='Select Product Type']")).click();
		List<WebElement> selectoptions=driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		
		System.out.println("the total options are  "+selectoptions.size());
		selectOptionFromDropdown(selectoptions,"Life Insurance");
		
		driver.findElement(By.xpath("//a[text()='Select Product']")).click();
		List<WebElement> productselect=driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
		
		
		System.out.println("the total items in productselect are "+productselect.size());
		 selectOptionFromDropdown(productselect,"Child Insurance Plans");
		//Child Insurance Plans

	}
 
	public static void selectOptionFromDropdown(List<WebElement> options , String value)
	{
		for(WebElement chooseoptions:options)
		{
			if(chooseoptions.getText().equals(value))
			{
				chooseoptions.click();
				break;
			}
		}
	}
}
