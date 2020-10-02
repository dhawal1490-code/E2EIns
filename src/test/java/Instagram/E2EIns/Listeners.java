package Instagram.E2EIns;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.ExtentReporterNG;


public class Listeners extends base implements ITestListener  {
	ExtentTest test;
	ExtentReports extent = ExtentReporterNG.getReportObject();
	ThreadLocal<ExtentTest> extenttest=new ThreadLocal();
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		try {
			System.out.println("***** Error "+result.getName()+" test has failed *****");
	    	String methodName=result.getName().toString().trim();
	        ITestContext context = result.getTestContext();
	        WebDriver driver = (WebDriver)context.getAttribute("driver");
	        
	        String screenShotPath = getScreenshot(methodName, driver);
	        extenttest.get().log(Status.FAIL, result.getThrowable());
	        extenttest.get().log(Status.FAIL, "Snapshot below: " +  extenttest.get().addScreenCaptureFromPath(screenShotPath));
	        extenttest.get().log(Status.FAIL, "Test Failed");
	        
			 //Object testClass = result.getInstance();
			 //WebDriver webDriver = ((BaseTest) testClass).getDriver();
			//System.out.println(result.getTestClass().getRealClass().getDeclaredField("driver"));
			//driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
			//extenttest.get().fail(result.getThrowable());
			//extenttest.get().addScreenCaptureFromPath(getScreenshot(result.getMethod().getMethodName(),driver));
			
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.print("Extent Test Started");
		test =  extent.createTest(result.getMethod().getMethodName());
		extenttest.set(test);
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.print("Extent Test Passed");
		extenttest.get().log(Status.PASS,"Test Passed");
	}

	public void onFinish(ITestContext arg0) {
		extent.flush();
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext iTestContext) {
		// TODO Auto-generated method stub
		
	}	
}
