package com.javaIntroductPart;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowIDStwo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		Set<String> winidsset=driver.getWindowHandles();
		
		List<String> winidelist=new ArrayList(winidsset);
		
		String ParentWinID=winidelist.get(0);
		String ChildWinID=winidelist.get(1);
		
		System.out.println("the windowIDS are "+ParentWinID+"            "+ChildWinID);
		
		for(String winstring:winidelist)
		{
			String windowtitles=driver.switchTo().window(winstring).getTitle();
			System.out.println("the windows tiltes are "+windowtitles);
			if(windowtitles.equals("Human Resources Management Software | OrangeHRM HR Software"))
			{
				driver.close();
			}
		}
		

	}

}
