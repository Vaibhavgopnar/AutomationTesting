package testNGcase;

import org.testng.annotations.Test;

public class DataProviderToFiles {

	@Test(dataProvider = "create", dataProviderClass = DataProvidertest.class)
	public void test(String username, String password)
	{
		System.out.println(username+"======"+password);
	}
	
	@Test(dataProvider = "create",  dataProviderClass = DataProvidertest.class)
	public void test1(String username, String password,String test)
	{
		System.out.println(username+"======"+password+"====="+test);
	}
}
