package com.javaIntroductPart;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LinksPractice {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
       options.addArguments("--disable-notifications");
       
       WebDriver driver=new ChromeDriver(options);
       driver.get("https://www.rediff.com/");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       
       List<WebElement> link=driver.findElements(By.tagName("a"));
       
       System.out.println("total links are "+link.size());
       
      /* for(int i=0;i<=100;i++)
       {
    	   String linktext=link.get(i).getText();
    	   String linkattr=link.get(i).getAttribute("href");
    	   System.out.println(i+1+"  ."+linktext+"---->"+linkattr);
       }*/
       
	  List<WebElement> images=driver.findElements(By.tagName("img"));
	  
	  System.out.println("total images are "+images.size());
	  
	  if(link.size()>images.size())
	  {
		  System.out.println("number of the links are more ");
	  }
	  else
	  {
		  System.out.println("number of the images are more ");
	  }
	}
}
