package testNGcase;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;


public class ListenersDemo extends Utilities implements ITestListener {

	//This Tempararely Using with GroupByTest class
	
	public void onTestStart(ITestResult result)
	{
		System.setProperty("org.uncommons.reportng.title", "AutomationExperts Report");
		Reporter.log("Method Name :- "+result.getName());
		System.out.println("Test case Started");
	}
	
	public void onTestSuccess(ITestResult result)
	{
		Reporter.log("Status of execution is : -"+result.getStatus());
		System.out.println("Test case Success");
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test Failed - Screenshot Captured");
		try {
			getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.setProperty("org.uncommons.reportng.escape-output","false");
		Reporter.log("<a href=\"C:\\java files\\SeleniumTraining\\screenshot\\Tue-Apr-12-20-45-24-IST-2022.png\">Test Results</a>");
	}
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Test skipped");
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		System.out.println("onTestFailedButWithinSuccessPercentage");
	}
	
	public void onStart(ITestResult result)
	{
		System.out.println("Start");
	}
	
	public void onFinish(ITestResult result)
	{
		System.out.println("Test Finish");
	}

}
