package ExtentReportDay_12;

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

public class Baseclass12 {
	
	public static WebDriver driver;
	public String screenshotsubfolder;
	public static ExtentTest extentTest;
	public static ExtentReports extentReports;
	
	@BeforeTest
	public void setup(ITestContext context)
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Capabilities capabilities=((RemoteWebDriver) driver).getCapabilities();
		String author=context.getCurrentXmlTest().getParameter("author");
		String device=capabilities.getBrowserName()+capabilities.getBrowserVersion();
		
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
	public void InitiateExentReport()
	{
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter("AllTestsFifteen.html");
		extentReports=new ExtentReports();
		extentReports.attachReporter(sparkReporter);
		extentReports.setSystemInfo("OS", System.getProperty("os.name"));
		extentReports.setSystemInfo("JavaVersion", System.getProperty("java.version"));
	}
	@AfterSuite
	public void generateExtentReport() throws IOException
	{
		extentReports.flush();
		Desktop.getDesktop().browse(new File("AllTestsFifteen.html").toURI());
	}
	@AfterMethod
	public void checkStatus(Method m,ITestResult result) throws IOException
	{
		if(result.getStatus()==result.FAILURE)
		{
			String screenshotpath=null;
			screenshotpath=CaptureScreen(result.getTestContext().getName()+"_"+result.getMethod().getMethodName()+".png");
			extentTest.addScreenCaptureFromPath(screenshotpath);
			extentTest.fail(result.getThrowable());
		}
		if(result.getStatus()==result.SUCCESS)
		{
			extentTest.pass(m.getName()+"this test is passed");
		}
	}
	
	public String CaptureScreen(String imgname) throws IOException
	{
		Date dt=new Date();
		String timestamp=dt.toString().replace(":", "_").replace(" ", "");
		
		String imgstore="./screen121/"+timestamp+imgname;
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(imgstore);
	
		FileUtils.copyFile(src, dst);
		System.out.println("screen shot saved successfully");
		return imgstore;
		
	}
}
