package testNGcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Before_After_Method_Test {

	@BeforeTest
	public void logintoapp()
	{
		System.out.println("Login To Application");
	}
	
	@AfterTest
	public void logoutapp()
	{
		System.out.println("Logout from Application");
	}
	
	@BeforeMethod
	public void connectDB()
	{
		System.out.println("DB Connected");
	}
	
	@AfterMethod
	public void disconnectDB()
	{
		System.out.println("DB Disconnected");
	}
	
	@Test(priority=1,description="This is login Test")
	public void test1() {
		
		System.out.println("Test 1");
	}
	
	@Test(priority=2,description="This is logout Test")
	public void test2() {
		System.out.println("Test 2");
	}

}
