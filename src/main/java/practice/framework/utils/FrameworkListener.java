package practice.framework.utils;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * @author Dzmitry_Malchanau
 *
 */
public class FrameworkListener extends WebDriverHandler
		implements ITestListener, ISuiteListener, IInvokedMethodListener {

	public void afterInvocation(IInvokedMethod method, ITestResult result) {

		Logger.info("TEST " + method.getTestMethod().getMethodName() + " invoked");
		Logger.info("Result " + result.getStatus());

	}

	public void beforeInvocation(IInvokedMethod method, ITestResult result) {
		Logger.info("Starting Test " + method.getTestMethod().getMethodName() + " invoketion...");
	}

	public void onFinish(ISuite arg0) {
		// System.out.println("-----ON FINISH SUITE "+arg0.getName());

	}

	public void onStart(ISuite arg0) {
		// System.out.println("-----ON START SUITE "+arg0.getName());

	}

	public void onFinish(ITestContext testContext) {
		Logger.info("EXECUTION SUMMARY:");
		Logger.info("PASSED TEST CASES:");
		testContext.getPassedTests().getAllResults().forEach(result -> {
			Logger.info(result.getName());
		});

		Logger.info("FAILED TEST CASES:");
		testContext.getFailedTests().getAllResults().forEach(result -> {
			Logger.info(result.getName());
		});

		Logger.info("SKIPPED TEST CASES:");
		testContext.getSkippedTests().getAllResults().forEach(result -> {

			Logger.info(result.getName());
		});

		Logger.info("Test completed on: " + testContext.getEndDate().toString());
		

	}

	public void onStart(ITestContext arg0) {
		

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {

	}

	public void onTestFailure(ITestResult testResult) {
		captureScreenShot();
	    // testResult.getThrowable().printStackTrace(); temporary commented since a lot of exceptions in log output - comment out when in 'prod'

	}

	public void onTestSkipped(ITestResult arg0) {
		Logger.info("TEST " + arg0.getName() + " Skipped");

	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

}
