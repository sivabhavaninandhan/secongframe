package com.javaIntroductPart;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebtablePractice {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dynamic-table");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy (0,1000)");
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@class='table table-striped']/tbody//tr//td[1]"));
		
		System.out.println("the total rows are "+rows.size());
		
		for(int r=1;r<=rows.size();r++)
		{
			WebElement names=driver.findElement(By.xpath("//table[@class='table table-striped']/tbody//tr["+r+"]//td[1]"));
			
			if(names.getText().equals("Chrome"))
			{
				String cpuload=driver.findElement(By.xpath("//td[normalize-space()='Chrome']//following-sibling::*[contains(text(),'%')]")).getText();
				String value=driver.findElement(By.xpath("//p[@id='chrome-cpu']")).getText();
				if(value.contains(cpuload))
				{
					System.out.println("cpu load of chrome is equal");
				}
				else
				{
					System.out.println("cpu load of chrome is not equal");
				}
				break;
			}
			
		}
		

	}

}
