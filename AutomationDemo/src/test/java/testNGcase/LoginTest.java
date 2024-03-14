package testNGcase;

import org.testng.annotations.Test;

public class LoginTest {

	@Test(priority=2,description="This is login Test")
	public void logintest() {
		
		System.out.println("Login successful");
	}
	
	@Test(priority=1,description="This is logout Test")
	public void logouttest() {
		System.out.println("Logout successfull");
	}
}
