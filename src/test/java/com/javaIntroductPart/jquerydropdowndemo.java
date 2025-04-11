package com.javaIntroductPart;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jquerydropdowndemo {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		 driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
		 
		 List<WebElement> dropcheck=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		 System.out.println("the total checkboxes are "+dropcheck.size());
		 
		for(WebElement dropselect:dropcheck) 
		{
			
			dropselect.click();
			Thread.sleep(1000);
		}

	}

}
