package TestNG_22;

import javax.naming.spi.DirStateFactory.Result;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listner_00 implements ITestListener{

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("TC failed and TC details....:"+result.getName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("TC Skipped and TC details....:"+result.getName());
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("TC Started and TC details....:"+result.getName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TC Success and TC details....:"+result.getName());
	}

}
