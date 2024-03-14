package testNGcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertion_Soft_Hard {

	@Test
	public void titletest()
	{
		SoftAssert softassert = new SoftAssert();
		String expectedtitle = "Electronics,  Cars, Fashion, Collectibles & More | eBay";
		String expectedtext = "Search";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		String actualtitle = driver.getTitle();
		System.out.println("Verifying Title");
		softassert.assertEquals(actualtitle, expectedtitle);
		
		String actualtext = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
		System.out.println("Verifying Text");
		softassert.assertEquals(actualtext, expectedtext);
		System.out.println("Closing Browser");
		driver.close();
		softassert.assertAll();
	}
}
