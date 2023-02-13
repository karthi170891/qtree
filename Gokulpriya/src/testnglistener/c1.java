package testnglistener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class c1 implements ITestListener {

	//ITestListener :  OnStart, OnFinish, OnTestSuccess, OnTestFailure 
		// class<=> interface :   implements interface name 
	    // right click=> source=> override/implement method
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TEst case is passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("failed");
	}

	@Override
	public void onStart(ITestContext context) {
	System.out.println("started");
	}

	@Override
	public void onFinish(ITestContext context) {

		System.out.println("finished ");
	}
	
	
}
