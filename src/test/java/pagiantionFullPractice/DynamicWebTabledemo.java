package pagiantionFullPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTabledemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy (0,2500)");
		
		int  pages=driver.findElements(By.xpath("//ul[@id='pagination']/li")).size();
		int  rows=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
		
		System.out.println("the total pages are "+pages +" the total rows are "+rows);
		
		for(int p=1;p<=pages;p++)
		{
			for(int r=1;r<=rows;r++)
			{
				driver.findElement(By.xpath("//ul[@id='pagination']/li["+p+"]")).click();
				driver.findElement(By.xpath("//table[@id='productTable']//tr["+r+"]//td//input[@type='checkbox']")).click();
			}
		}
		
		
		
		}

}
