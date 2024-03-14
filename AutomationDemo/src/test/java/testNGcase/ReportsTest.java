package testNGcase;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReportsTest extends BaseDrivers
{

	@Test
	public void reporttest1() {
		
		Reporter.log("This is Test 1");
		driver.get("http://salesforce.com");
		Assert.assertTrue(true);
	}
	
	@Test
	public void reporttest2() {
		System.out.println("Test 2");
	}
	
	@Test
	public void reporttest3() {
		System.out.println("Test 3");
	}
	
	@Test
	public void reporttest4() {
		System.out.println("Test 4");
	}
}
