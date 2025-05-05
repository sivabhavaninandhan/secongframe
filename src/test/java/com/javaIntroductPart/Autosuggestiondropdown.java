package com.javaIntroductPart;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestiondropdown {

	public static void main(String[] args) {
		
		 WebDriver driver=new ChromeDriver();
		    driver.get("https://www.google.co.in/");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		    driver.findElement(By.name("q")).sendKeys("hyderabad");
		    
		   List<WebElement> autosug=driver.findElements(By.xpath("//div[@role='presentation']/ul/li]"));
		   System.out.println("total auto sugestions are "+autosug.size());
		   
		   

	}

}
