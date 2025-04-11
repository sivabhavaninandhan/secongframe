package com.javaIntroductPart;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BootStrapDropDownThree {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//a[text()='Select Product Type']")).click();
		
		List<WebElement> SelectOptions=driver.findElements(By.xpath("//div[@class='dropdown open']//ul/li"));
		
		Thread.sleep(3000);
		
		System.out.println("the total options in select dropdown  "+SelectOptions.size());
		SelectOptionFromDropndown(SelectOptions ,"Deposits");
		
		driver.findElement(By.xpath("//a[text()='Select Product']")).click();
		List<WebElement> productselect=driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
		
		System.out.println("the total items in productselect are "+productselect.size());
		SelectOptionFromDropndown(productselect,"Fixed Deposit");
		
	}
public static void SelectOptionFromDropndown(List<WebElement> optn,String value)
{
	for(WebElement optnselect:optn)
	{
		if(optnselect.getText().equals(value))
		{
			optnselect.click();
			break;
		}
	}
}

}
