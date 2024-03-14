package testCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardEvents {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://extendsclass.com/xpath-tester.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement frame1 = driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]"));
		WebElement frame2 = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[6]/div[2]/div/div[6]"));
		
		Actions action = new Actions(driver);
		
		action.keyDown(frame1, Keys.CONTROL).sendKeys("a").sendKeys("c").perform();
		action.keyDown(frame2, Keys.CONTROL).sendKeys("a").sendKeys("v").perform();
		

	}

}
