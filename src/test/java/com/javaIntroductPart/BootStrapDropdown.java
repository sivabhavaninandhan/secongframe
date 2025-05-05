package com.javaIntroductPart;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BootStrapDropdown {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//a[text()='Select Product Type']")).click();
		
		List<WebElement> selectproducts=driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		System.out.println("The total list is  "+selectproducts.size());
		SelectOptionFromeDropdown(selectproducts,"Deposits");
		
		driver.findElement(By.xpath("//a[text()='Select Product']")).click();
		List<WebElement> productselect=driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
		System.out.println("the total items in productselect are "+productselect.size());
		SelectOptionFromeDropdown(productselect,"Fixed Deposit");
		//Fixed Deposit
	}
	public static void SelectOptionFromeDropdown(List<WebElement> option,  String value)
	{
		for(WebElement optionselect:option)
		{
			if(optionselect.getText().equals(value))
			{
				optionselect.click();
				break;
			}
		}
	}

}
