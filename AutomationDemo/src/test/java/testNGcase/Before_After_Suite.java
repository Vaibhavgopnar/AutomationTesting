package testNGcase;

import org.testng.annotations.Test;

public class Before_After_Suite extends CommonDataSetup {

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
	}
	
	@Test(groups="Smoke")
	public void test4() {
		System.out.println("Test 4");
	}
}
