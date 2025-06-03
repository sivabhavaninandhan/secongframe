package ExtentReportDay_16;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.sql.Date;
import java.time.Duration;

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

public class BaseClassSixte {
	
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
		String  author=context.getCurrentXmlTest().getParameter("author");
		String  device=capabilities.getBrowserName()+capabilities.getBrowserVersion();
		
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
	public void InitializeExtentReports()
	{
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter("AllTestfirst.html");
		extentReports=new ExtentReports();
		extentReports.attachReporter(sparkReporter);
		extentReports.setSystemInfo("OS", System.getProperty("os.name"));
		extentReports.setSystemInfo("Java Version", System.getProperty("java.version"));
	}
	@AfterSuite
	public void generateExtentReports() throws IOException
	{
		extentReports.flush();
		Desktop.getDesktop().browse(new File("AllTestfirst.html").toURI());
	}
	@AfterMethod
	public void checkstatus(Method m,ITestResult result) throws IOException
	{
		if(result.getStatus()==result.FAILURE)
		{
		String screenshotsubfolder=null;
		screenshotsubfolder=Capturescreen(result.getTestContext().getName()+"_"+result.getMethod().getMethodName()+".png");
		extentTest.addScreenCaptureFromPath(screenshotsubfolder);
		extentTest.fail(result.getThrowable());
		}
		else if(result.getStatus()==result.SUCCESS)
		{
			extentTest.pass(m.getName()+"This test is passed");
		}
	}
	public String Capturescreen(String imagename) throws IOException
	{
		Date dt=new Date(0);
		String timestamp=dt.toString().replace(":", "_").replace(" ", "");
		
		String path="./screen909/"+timestamp+imagename;
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File srce=ts.getScreenshotAs(OutputType.FILE);
		File dste=new File(path);
	
		FileUtils.copyFile(srce, dste);
		
		return path;
	}
}
