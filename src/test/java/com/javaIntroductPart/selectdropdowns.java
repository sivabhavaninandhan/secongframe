package com.javaIntroductPart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class selectdropdowns {

	WebDriver driver;
	@BeforeTest
	public void setup()
	{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://testautomationpractice.blogspot.com/");
	}
	
	@Test 
	
	public void Verification()
	{
	WebElement Country=driver.findElement(By.xpath("//select[@id='country']"));
	Select countryone=new Select(Country);
	countryone.selectByVisibleText("Germany");
	}
}
