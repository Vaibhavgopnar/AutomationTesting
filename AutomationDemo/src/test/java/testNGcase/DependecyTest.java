package testNGcase;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependecyTest {

	@Test
	public void UserResistration() {
		
		Reporter.log("This is Test 1");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods="UserResistration")
	public void UserSearch() {
		System.out.println("Test 2");
	}
	
	@Test(dependsOnMethods="UserResistration",alwaysRun=true)
	public void reporttest3() {
		System.out.println("Test 3");
	}
	
	@Test
	public void reporttest4() {
		System.out.println("Test 4");
	}
}
