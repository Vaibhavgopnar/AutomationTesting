package testscript.Relevel_VaibhavGopnar;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testscript {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.maxhealthcare.in/");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]")).click();
		
		
		HomePage home = new HomePage(driver);
		
		Thread.sleep(2000);
		home.searchdoctor().sendKeys("CARD");
		Thread.sleep(4000);
		home.speceality1().click();
		Thread.sleep(2000);
		home.speceality2().click();
		Thread.sleep(2000);
		home.speceality3().click();
		
		Thread.sleep(5000);
		home.clearbtn().click();

		Thread.sleep(2000);
		home.speceality1().click();
		
		Thread.sleep(2000);
		home.applybtn().click();
		
		Thread.sleep(2000);
		home.location().click();
		Thread.sleep(2000);
		home.delhincr().click();
		
		driver.close();

	}
}
