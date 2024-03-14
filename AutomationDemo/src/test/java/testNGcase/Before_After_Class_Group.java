package testNGcase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Before_After_Class_Group extends CommonDataSetup{

	@BeforeClass
	public void beforeclass() {
		
		System.out.println("Run Test Before class");
	}
	
	@AfterClass
	public void afterclass() {
		
		System.out.println("Run Test After class");
	}
	
	@BeforeGroups(value="Regression")
	public void beforegroup() {
		
		System.out.println("Run Test Before Regression Group");
	}
	
	@AfterGroups(value="Regression")
	public void aftergroup() {
		
		System.out.println("Run Test After Regression Group");
	}
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
