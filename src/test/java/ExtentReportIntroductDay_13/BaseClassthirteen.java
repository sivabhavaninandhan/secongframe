package ExtentReportIntroductDay_13;

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

public class BaseClassthirteen {
	
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
    	driver.close();
    }
    
    @BeforeSuite
    public void InitiateExtentReport()
    {
    	ExtentSparkReporter sparkReporter=new ExtentSparkReporter("AllTestfifteen.html");
    	extentReports=new ExtentReports();
    	extentReports.attachReporter(sparkReporter);
    	extentReports.setSystemInfo("OS", System.getProperty("os.name"));
    	extentReports.setSystemInfo("JavaVersion", System.getProperty("java.version"));
    }

    @AfterSuite
    public void generateExtentReports() throws IOException
    {
    	extentReports.flush();
    	Desktop.getDesktop().browse(new File("AllTestfifteen.html").toURI());
    }
    @AfterMethod
    public void checkStatus(Method m,ITestResult result) throws IOException
    {
    	if(result.getStatus()==result.FAILURE)
    	{
    		String screenshotpath=null;
    		screenshotpath=Capturescreen(result.getTestContext().getName()+"_"+result.getMethod().getMethodName()+".png");
    		extentTest.addScreenCaptureFromPath(screenshotpath);
    		extentTest.fail(result.getThrowable());	
    	}
    	else if(result.getStatus()==result.SUCCESS)
    	{
    		extentTest.pass(m.getName()+" this test is passed");
    	}
    }
    
    public String Capturescreen(String imgname) throws IOException
    {
    	Date dt=new Date();
    	String timestamp=dt.toString().replace(":", "_").replace(" ", "");
    	
    	String path="./Screen119/"+timestamp+imgname;
    	
    	TakesScreenshot ts=(TakesScreenshot)driver;
    	File src=ts.getScreenshotAs(OutputType.FILE);
    	File dst=new File(path);
    	FileUtils.copyFile(src, dst);
    	System.out.println("screenshot saved successfully");
    	return path;
    }
}
