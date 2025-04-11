package com.javaIntroductPart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickdemo {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		 driver.switchTo().frame("iframeResult");
		 
		 WebElement box1=driver.findElement(By.id("field1"));
		 WebElement box2=driver.findElement(By.id("field2"));
		 
		 WebElement button=driver.findElement(By.xpath("//button[text()='Copy Text']"));
		 box1.clear();
		 box1.sendKeys("i like you");
		 
		 Actions act=new Actions(driver);
		 act.doubleClick(button).perform();
	}

}
