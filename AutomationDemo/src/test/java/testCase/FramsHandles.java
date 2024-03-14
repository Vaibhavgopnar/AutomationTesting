package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramsHandles {

	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_default");
		driver.manage().window().maximize();

		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("/html/body/button")).click();
		driver.switchTo().parentFrame();
		System.out.println(driver.getTitle());
	}

}
