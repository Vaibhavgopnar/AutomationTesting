package testNGcase;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTest {

	Boolean datasetup = true;
	
	@Test(enabled=false)
	public void skipTest1()
	{
		System.out.println("Skipping this test as it is not completed");
	}
	
	@Test
	public void skipTest2()
	{
		System.out.println("Skipping this test Forcefully");
		throw new SkipException("skipping this test");
	}
	
	@Test
	public void skipTest3()
	{
		System.out.println("Skipping this test based on conditions");
		if(datasetup==true)
		{
			System.out.println("Execute the test");
		}
		else
		{
			System.out.println("Don't execute test");
			throw new SkipException("Do not execute Test");
		}
	}
	
	@Test
	public void skipTest4()
	{
		System.out.println("Skipping this test as it is not completed");
	}

}
