import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,500)");
		
		
		WebElement FirstName=driver.findElement(By.id("name"));
		
       js.executeScript("arguments[0].setAttribute('value','satya')",FirstName );
       
       WebElement LastName=driver.findElement(By.id("email"));
       js.executeScript("arguments[0].setAttribute('value','ganga')", LastName);
       
       WebElement phoneNum=driver.findElement(By.id("phone"));
       js.executeScript("arguments[0].setAttribute('value','9878654321')",phoneNum );
       
       WebElement Address=driver.findElement(By.id("textarea"));
       js.executeScript("arguments[0].setAttribute('value','myalavaram')", Address);
       
       js.executeScript("window.scrollBy(0,500)");
       //done Click() Method by JavascriptExecutor 
       WebElement RadioButton=driver.findElement(By.id("male"));
       
       js.executeScript("arguments[0].click()", RadioButton);
	}

}
