package com.javaIntroductPart;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getwindowIDSintroduct {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		Set<String> winidsset=driver.getWindowHandles();
		List<String> winidslist=new ArrayList(winidsset);
		
		for(String windidtext:winidslist)
		{
		String winidtitle=driver.switchTo().window(windidtext).getTitle();
		System.out.println("the titles of winids  "+winidtitle);
		if(winidtitle.equals("OrangeHRM"))
		{
			driver.close();
		}
		}
		

	}

}
