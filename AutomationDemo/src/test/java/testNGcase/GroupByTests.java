package testNGcase;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test(groups="User Authentication")
public class GroupByTests {


	@Test(priority=1,groups="Regression")
	public void test1() {
		
		System.out.println("Test 1");
	}
	
	@Test(priority=2,groups="Regression")
	public void test2() {
		System.out.println("Test 2");
	}
	
	@Test(groups={"Regression","Smoke"})
	public void test3() {
		System.out.println("Test 3");
		Assert.assertTrue(false);
	}
	
	@Test(groups="Smoke")
	public void test4() {
		System.out.println("Test 4");
	}
}
