package testNGcase;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonDataSetup {

	@BeforeSuite
	public void datasetup()
	{
		System.out.println("Common data setup");
	}
	
	@AfterSuite
	public void dataTearDpwn()
	{
		System.out.println("Common data cleanup");
	}
	
}
