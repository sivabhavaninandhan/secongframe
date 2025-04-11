package ExtentRepotrpracticeday_02;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class normalExtentReportcreation {

	public static void main(String[] args) throws IOException {
		 ExtentReports extentReports=new ExtentReports();
		 File file=new File("reports.html");
		 ExtentSparkReporter sparkReporter=new ExtentSparkReporter(file);
		 
		 extentReports.attachReporter(sparkReporter);
		 
		 ExtentTest test1=extentReports.createTest("Test1");
		 test1.pass("This test is Passed");
		 
		 ExtentTest test2=extentReports.createTest("Test2");
		 test2.log(Status.FAIL, "This test is Failed");
		 
		 extentReports.createTest("Test3").skip("This test is Skipped");
		 
		 extentReports.flush();
		 
		 Desktop.getDesktop().browse(new File("reports.html").toURI());
		 

	}

}
