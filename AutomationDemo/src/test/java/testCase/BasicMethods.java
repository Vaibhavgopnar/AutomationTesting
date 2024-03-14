package testCase;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicMethods {

	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) {

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		// get();
		driver.get("http://www.saucedemo.com/");
		driver.manage().window().maximize(); // manage - window - maximize

		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);

		String title = driver.getTitle();
		System.out.println(title);

		String pagesource = driver.getPageSource();
		System.out.println(pagesource);

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("user-name")).getAttribute("class");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

		List<WebElement> webelements = driver.findElements(By.xpath("//div[@class=\"inventory_list\"]/div"));
		System.out.println(webelements);

		driver.navigate().to("https://www.freshersnow.com/capgemini-off-campus/");
		String windowhandal = driver.getWindowHandle();
		System.out.println(windowhandal);

		System.out.println(driver.findElement(By.xpath("//*[@id=\"menu-header-menu-1\"]/li[5]/a")).getCssValue("text-transform"));  //getsize,.getlocation ,.gettext, .gettagname, .isdisplayed, .isenabled, .isselected.
		driver.findElement(By.xpath("//*[@id=\"menu-header-menu-1\"]/li[5]/a")).click();
		Set<String> windowhandals = driver.getWindowHandles();
		System.out.println(windowhandals);

		driver.quit();

	}

}
