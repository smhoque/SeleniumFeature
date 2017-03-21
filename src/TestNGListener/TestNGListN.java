package TestNGListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListN implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("TestCases are started and TestCase details are:" + result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("TestCases are success and TestCase details are:" + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("TestCases are failed and TestCase details are:" + result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("TestCases are skipped and TestCase details are:" + result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		
	}

}
