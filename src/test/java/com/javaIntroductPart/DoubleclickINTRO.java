package com.javaIntroductPart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleclickINTRO {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		 driver.switchTo().frame("iframeResult");
		 
	WebElement box1=driver.findElement(By.id("field1"));
	WebElement box2=driver.findElement(By.id("field2"));
	
	box1.clear();
	box1.sendKeys("i like you");
	
	WebElement button=driver.findElement(By.xpath("//button[text()='Copy Text']"));
	
	Actions act=new Actions(driver);
	act.doubleClick(button).perform();
	
	String textbox=box2.getAttribute("value");
	
	System.out.println(textbox);
		if(textbox.equals("i like you"))
		{
			System.out.println("the test is passed");
		}
		else
		{
			System.out.println("the test is failed");	
		}
	}

}
