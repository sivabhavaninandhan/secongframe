package com.javaIntroductPart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptPracticeTwo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement inbox1=driver.findElement(By.id("name"));
		
		js.executeScript("arguments[0].setAttribute('value','roja')", inbox1);
		
		WebElement emailbox=driver.findElement(By.id("email"));
		
		js.executeScript("arguments[0].setAttribute('value','hello1233@gamil.com')", emailbox);
		
		WebElement phonebox=driver.findElement(By.id("phone"));
		
		js.executeScript("arguments[0].setAttribute('value','8956734214')", phonebox);

		WebElement radiobtn=driver.findElement(By.xpath("//input[@id='male']"));
		
		js.executeScript("arguments[0].click()", radiobtn);
		
		//scrolling of the browser
		
		js.executeScript("window.scrollBy(0,1000)");
		
		js.executeScript("document.body.style.zoom='50%'");
	}

}
