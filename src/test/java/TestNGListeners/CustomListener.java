package TestNGListeners;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.ITestListener;
import org.testng.Reporter;

import Base.BaseSetup;

public class CustomListener extends BaseSetup implements ITestListener {

	public void onTestStart(ITestResult result) {
		Reporter.log("Test started running:"  + result.getMethod().getMethodName());
		logger.info("******************* START TEST ********************");
		logger.info("Test started running:"  + result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		logger.info("Test SUCCESS:"  + result.getMethod().getMethodName());
		
	}

	public void onTestFailure(ITestResult result) {
		Reporter.log(result.getName()+ "--Test method failed\n");
		logger.info("Test FAILED:"  + result.getMethod().getMethodName() + result.getThrowable().getMessage());
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		logger.info("!!!!!!!!!!!!!!!!!!!!!!!!!! START TEST SUITE !!!!!!!!!!!!!!!!!!!!!!!!!!");
	}

	public void onFinish(ITestContext context) {
		logger.info("!!!!!!!!!!!!!!!!!!!!!!!!!! END TEST SUITE !!!!!!!!!!!!!!!!!!!!!!!!!!");
		
	}
	
}