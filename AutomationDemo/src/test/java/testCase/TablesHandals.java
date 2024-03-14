package testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TablesHandals {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		/*
		 * switch to frame
		 * 
		 * get row size by xpath; store it into webelement variable;
		 * 
		 * get column size by xpath; store it into webelement variable;
		 * 
		 * for(int i = 0;i<rowsize;i++)
		 * {
		 * 		for(int j=0;j<columnsize;j++)
		 * {
		 * 			print row  .gettext();
		 * }
		 * 
		 * }
		 */

	}

}
