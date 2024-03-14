package testCase;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiWindows {

	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.salesforce.com/in/crm/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"c360-hgf-nav\"]//header/div/div[1]/div[1]/div[5]/hgf-button")).click();

		Set<String> windowhandal = driver.getWindowHandles();
		System.out.println(windowhandal);

		Iterator<String> iterator = windowhandal.iterator();

		String parentwindow = iterator.next();
		System.out.println(parentwindow);
		String childwindow = iterator.next();
		System.out.println(childwindow);
		driver.switchTo().window(childwindow);

		driver.findElement(By.name("UserFirstName")).sendKeys("Vaibhav");
		driver.findElement(By.name("UserLastName")).sendKeys("Patil");

		driver.switchTo().window(parentwindow);

	}

}
