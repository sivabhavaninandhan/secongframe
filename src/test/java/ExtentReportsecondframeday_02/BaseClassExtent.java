package ExtentReportsecondframeday_02;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseClassExtent {
	
	public static WebDriver driver;
	public static ExtentReports extentReports;
	public static ExtentTest extentTest;
	
	@BeforeTest
	public void setupone(ITestContext context)
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Capabilities capabilities=((RemoteWebDriver) driver).getCapabilities();
		String device=capabilities.getBrowserName()+capabilities.getBrowserVersion();
		String author=context.getCurrentXmlTest().getParameter("author");
		
		extentTest=extentReports.createTest(context.getName());
		extentTest.assignAuthor(author);
		extentTest.assignDevice(device);
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
 @BeforeSuite
 public void initializeextentreport()
 {
	 ExtentSparkReporter sparkreporter_All=new ExtentSparkReporter("AllTests.html");
	 extentReports=new ExtentReports();
	 extentReports.attachReporter(sparkreporter_All);
	 extentReports.setSystemInfo("OS",System.getProperty("os.name"));
	 extentReports.setSystemInfo("Java Version", System.getProperty("java.version"));
	 
 }
 @AfterSuite
 public void  generateextentreport() throws IOException
 {
	 extentReports.flush();
	 Desktop.getDesktop().browse(new File("AllTests.html").toURI());
 }
 @AfterMethod
 public void checkstatus(Method m,ITestResult result) throws IOException
 {
	 if(result.getStatus()==result.FAILURE)
	 {
		 String screenshotpath=null;
		 screenshotpath=capturing(result.getTestContext().getName()+"_"+result.getMethod().getMethodName()+".png");
		 extentTest.addScreenCaptureFromPath(screenshotpath);
		 extentTest.fail(result.getThrowable());
	 }
	 else if(result.getStatus()==result.SUCCESS)
	 {
		 extentTest.pass(m.getName()+"  This Test is Passed");
	 }
 }
 
 public String capturing(String img) throws IOException
 {
	 Date dt=new Date();
	 String timestamp=dt.toString().replace(":", "_").replace(" ", "");
	 
	 String path="./Sceen105/"+timestamp+img;
	 
	 TakesScreenshot ts=(TakesScreenshot)driver;
	 File ssr=ts.getScreenshotAs(OutputType.FILE);
	 File dds=new File(path);
	 FileUtils.copyFile(ssr, dds);
	 System.out.println("screen shot saved successfully");
	 return path;
	 
 }
}
