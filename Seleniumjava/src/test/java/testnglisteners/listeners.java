package testnglisteners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class listeners extends TestListenerAdapter
{
	public void onTestStart(ITestResult tr)
	{
		System.out.println("Test method is strated");
	}
	
	public void onTestSuccess(ITestResult tr)
	{
		System.out.println("Test method passed");
	}
	
	public void onTestFailure(ITestResult tr)
	{
		System.out.println("Test method failure");
	}
	
	public void onTestSkipped(ITestResult tr)
	{
		System.out.println("Test method skipped");
	}
	

}
