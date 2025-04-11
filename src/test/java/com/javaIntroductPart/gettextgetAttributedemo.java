package com.javaIntroductPart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class gettextgetAttributedemo {
	
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://tutorialsninja.com/demo/index.php?");
	}
@Test
public void verification()
{
	WebElement searchbox=driver.findElement(By.xpath("//input[@placeholder='Search']"));
	System.out.println("return the gatAttribut "+searchbox.getAttribute("class"));
	
	WebElement phones=driver.findElement(By.linkText("Phones & PDAs"));
	System.out.println("return the getText  "+phones.getText());
}
@AfterTest
public void teardown()
{
	driver.close();
}
}
