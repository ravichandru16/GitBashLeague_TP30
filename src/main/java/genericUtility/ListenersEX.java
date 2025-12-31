package genericUtility;
//
//import org.testng.ISuite;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.reporter.ExtentReporter;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import com.aventstack.extentreports.reporter.configuration.Theme;
//
//public class ListenersEX extends BaseClass_Utilities {
//
//	ExtentSparkReporter spark;
//	ExtentReports report;
//	ThreadLocal<ExtentTest>test=new ThreadLocal<ExtentTest>();
//
//	@Override
//	public void OnStart(ISuite suite)
//	{
//	spark = new ExtentSparkReporter("Path");
//	spark.config();
//	spark.config();
//	spark.("Vtiger");
//
//	report= new ExtentReports();
//	report.attachReporter(spark);
//	report.setproperty("browser","Chrome");
//	report.setproperty("Reportername","Ravi");
//	report.setproperty("Platform","Windows");
//
//	}
//
//	@override
//	public void Onstart(ITestContext context)
//	{
//	Sting mnam=context.getmethod().getmethodname();
//	test.get().log(mname+"Start start successfully");
//	}
//
//	@override
//	public void OnTestStart(ITestResult result)
//	{
//	test.get().log(mname+"Test);
//	}
//
//	@override
//	public void OnTestSuccess(ITestResult result)
//	{
//	test.get().log(status.pass,mname+"Passed");
//	}
//
//	@override
//	public void OnTestFailure(ITestResult result)
//	{
//	test.get().log(Status.Fail,mname+"Fail");
//	TakesScreenshot ts=(TakesScreenshot)Baseutility.wdriver.get();
//	String src=ts.getScreenshotAs(OutputType.File);
//	String loc=new File("Path"+sysdatetime);
//	FileHandler.copy(src,loc);
//
//	String path=loc.getabsoultepath();
//	path.attachtoextentreport();
//
//	}
//
//	@override
//	public void OnFinish(ITestContext context)
//	{
//	test.get().log(status.info,"Test Completed");
//	}
//
//	@override
//	public void OnFinish(ISuite suite)
//	{
//	report.flush();
//	}



