package testNGcase;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Utilities extends BaseDrivers {

	public void getScreenshot() throws IOException
	{
		Date date = new Date();
		String screenshotfile = date.toString().replace(" ", "-").replace(":", "-");
		
		File screenshort = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshort, new File(".//screenshot/"+screenshotfile+".png"));
	}
}
