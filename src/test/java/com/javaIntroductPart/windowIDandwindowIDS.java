package com.javaIntroductPart;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowIDandwindowIDS {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		 driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		 
		 Set<String> windowids=driver.getWindowHandles();
		 
		 List<String> windowIDList=new  ArrayList(windowids);
     
		 String PatentWindowID=windowIDList.get(0);
		 String ChildWindowID=windowIDList.get(1);
		 
		 System.out.println("Parent WindowID is  "+PatentWindowID);
		 System.out.println("Child WindowID is  "+ChildWindowID);
		 
		 /*driver.switchTo().window(PatentWindowID);
		 System.out.println("this is parent window title "+driver.getTitle());
		 
		 driver.switchTo().window(ChildWindowID);
		 System.out.println("this is child window title "+driver.getTitle());*/
		 
		 //By Using For Each Loop we are switch to windows and same time get titles
		 
		/* for(String winids:windowIDList)
		 {
			 String windowstitles=driver.switchTo().window(winids).getTitle();
			 System.out.println("the windows titles are "+windowstitles);
		 }*/
		 
		 //close single window when open three or more window IDs
		 for(String winids:windowIDList)
		 {
			 String windowtitle=driver.switchTo().window(winids).getTitle();
			 if(windowtitle.equals("Human Resources Management Software | OrangeHRM HR Software"))
			 {
				 driver.close();
			 }
		 }
	}

}
