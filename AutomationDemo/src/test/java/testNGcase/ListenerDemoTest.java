package testNGcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenerDemoTest extends BaseDrivers{

	@Test(retryAnalyzer = Retry.class)
	public void launchApp()
	{
		driver.get("http://ebay.com");
		Assert.assertTrue(false);
	}
}
