package testNgDay4;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListerners implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
		// After method will execute irrespective  whether the test case is failed or pass
		
		
		// onTestStary method will execute only when the testcase is passed
		
	}

	public void onTestSuccess(ITestResult result) {
		
		
		// TODO Auto-generated method stub
		
		System.out.println("I successfully executed Listerners Pass code");
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		// screen short code 
		// reponse code if the API is failed
		
		System.out.println("I failed listeners pass code");
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
	
	// Only two topics 
	
	//Running 	Tests in parallel with TestNg
	
	//TestNg listerners 

}
