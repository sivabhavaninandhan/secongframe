package com.javaIntroductPart;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesIntroduction {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/java/nested-frames-selenium-webdriver");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

}
