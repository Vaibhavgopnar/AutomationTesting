package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSegetionDropDpwn {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.freshersnow.com/capgemini-off-campus/#");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"td-header-search-button\"]/i")).click();
		Thread.sleep(2000);
		 WebElement from = driver.findElement(By.xpath("//*[@id=\"td-header-search\"]"));
		 from.sendKeys("TCS");
			Thread.sleep(2000);
		from.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		from.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		driver.close();
	}

}
