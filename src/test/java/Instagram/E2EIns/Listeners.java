package Instagram.E2EIns;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.ExtentReporterNG;


public class Listeners extends ExtentReporterNG implements ITestListener  {
	ExtentTest test;
	ExtentReports extent = ExtentReporterNG.getReportObject();
	//ThreadLocal<ExtentTest> extenttest=new ThreadLocal();
	public void onFinish(ITestResult  result) {
		// TODO Auto-generated method stub
		extent.flush();
	}

	public void onStart(ITestResult  result) {
		// TODO Auto-generated method stub
		System.out.print("Extent Test Started");
		test =  extent.createTest(result.getMethod().getMethodName());
//		extenttest.set(test);
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
	//	extenttest.get().fail(result.getThrowable());
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.print("Extent Test Passed");
		test.log(Status.PASS,"Test Passed");
	}

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}	

}
