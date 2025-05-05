package com.javaIntroductPart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextAnggetAttributeintro {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement valueAtr=driver.findElement(By.id("email"));
		
		System.out.println("the Attribute "+valueAtr.getAttribute("placeholder"));
		
		WebElement innertext=driver.findElement(By.xpath("//div[@class='titlewrapper']"));
		
		System.out.println("the text is  "+innertext.getText());
		
	}

}
