import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BlankEXtentreport {

	public static void main(String[] args) {
		/* ExtentReports extentReports=new ExtentReports();
		 ExtentSparkReporter sparkReporter=new ExtentSparkReporter("C:\\Users\\ASUS\\eclipse-workspace\\secongframe\\report.html");
		 extentReports.attachReporter(sparkReporter);
		 extentReports.flush();*/
		
		ExtentReports extentReports=new ExtentReports();
		ExtentSparkReporter  sparkReporter=new ExtentSparkReporter("report1.html");
		extentReports.attachReporter(sparkReporter);
		extentReports.flush();
		

	}

}
