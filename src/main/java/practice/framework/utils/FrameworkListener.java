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
		// System.out.println("Default");

	}

	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
		// System.out.println("-----BEFORE INVOKATION-----");

	}

	public void onFinish(ISuite arg0) {
		// System.out.println("-----ON FINISH SUITE "+arg0.getName());

	}

	public void onStart(ISuite arg0) {
		// System.out.println("-----ON START SUITE "+arg0.getName());

	}

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {

	}

	public void onTestFailure(ITestResult testResult) {
		captureScreenShot();
		// testResult.getThrowable().printStackTrace();

	}

	public void onTestSkipped(ITestResult arg0) {

	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

}
