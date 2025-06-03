package com.javaIntroductPart;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationAlertOne {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		Alert alert=driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.sendKeys("this is osky");
		
		driver.switchTo().alert().accept();
		
		driver.close();
		
		

	}

}
