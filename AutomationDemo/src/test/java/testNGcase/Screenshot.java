package testNGcase;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
	
	@Test
	public  void screenshot() throws IOException {
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		Date date = new Date();
		String screenshotfile = date.toString().replace(" ", "-").replace(":", "-");
		
		driver.get("https://www.ebay.com/");
		File screenshort = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshort, new File(".//screenshot/"+screenshotfile+".png"));
		
		driver.close();
	}
}
