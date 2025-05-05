package com.javaIntroductPart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorPractice {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://testautomationpractice.blogspot.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement name=driver.findElement(By.id("name"));
		WebElement emailbox=driver.findElement(By.id("email"));
		WebElement phonebox=driver.findElement(By.id("phone"));
		WebElement maleradio=driver.findElement(By.id("male"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//this is java script executor instead of send keys
		js.executeScript("arguments[0].setAttribute('value','raju')", name);
		js.executeScript("arguments[0].setAttribute('value','komal2345@gamil.com')", emailbox);
		js.executeScript("arguments[0].setAttribute('value','9987432198')",phonebox);
		//this javaScript for instead of click() method
		js.executeScript("arguments[0].click()", maleradio);
		//this is for scrolling of WEBPAGE
		js.executeScript("window.scrollBy(0,900)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		//this is for scrolling of browser into view element
		WebElement viewele=driver.findElement(By.xpath("//h2[text()='Dynamic Web Table']"));
		
		js.executeScript("arguments[0].scrollIntoView();",viewele);
		
		//zooming of browser 
		
		js.executeScript("document.body.style.zoom='100%'");
		
		
		
	}

}
