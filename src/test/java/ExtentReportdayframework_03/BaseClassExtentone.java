package ExtentReportdayframework_03;

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

public class BaseClassExtentone {
	
	public static WebDriver driver;
	public static String screenshotsubfolder;
	public static ExtentReports extentReports;
	public static ExtentTest extentTest;
	@BeforeTest
	public void setup(ITestContext context)
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
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
	public void initializeExtentReport()
	{
		ExtentSparkReporter sparkReporter_All=new ExtentSparkReporter("AllTeststwo.html");
		extentReports=new ExtentReports();
		extentReports.attachReporter(sparkReporter_All);
		extentReports.setSystemInfo("OS", System.getProperty("os.name"));
		extentReports.setSystemInfo("JavaVersion", System.getProperty("java.version"));
		
	}
    @AfterSuite
    public void generateExtentReport() throws IOException
    {
    	extentReports.flush();
    	Desktop.getDesktop().browse(new File("AllTeststwo.html").toURI());
    }
    
    @AfterMethod
    public void checkStatus(Method m,ITestResult result) throws IOException
    {
    	if(result.getStatus()==result.FAILURE)
    	{
    		String screnshotpath=null;
    		screnshotpath=Capturingphoto(result.getTestContext().getName()+"_"+result.getMethod().getMethodName()+".png");
    		extentTest.addScreenCaptureFromPath(screnshotpath);
    		extentTest.fail(result.getThrowable());	
    	}
    	else if(result.getStatus()==result.SUCCESS)
    	{
    		extentTest.pass(m.getName()+"This test is passed");
    	}
    }
    
    public String Capturingphoto(String imgname) throws IOException
    {
    	Date dt=new Date();
    	String timestamp=dt.toString().replace(":", "_").replace(" ", "");
    	
    	String path="./Screen001/"+timestamp+imgname;
    	
    	TakesScreenshot ts=(TakesScreenshot)driver;
    	File source=ts.getScreenshotAs(OutputType.FILE);
    	File desti=new File(path);
    	FileUtils.copyFile(source, desti);
    	
    	return path;
    }
}
