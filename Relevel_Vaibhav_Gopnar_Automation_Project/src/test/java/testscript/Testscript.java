package testscript;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testscript {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		driver = new ChromeDriver(options);
		
		driver.get("https://www.nobroker.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//div[@class='nb__17yFj nb__1Z-uW'])[1]")).click();
		WebElement searchcity = driver.findElement(By.id("searchCity"));
	
		System.out.println(searchcity);

		searchcity.click();
		Thread.sleep(4000);
		searchcity.sendKeys(Keys.ARROW_DOWN);
		searchcity.sendKeys(Keys.ENTER);
//		Select select = new Select(searchcity);		
//		select.selectByIndex(0);
		
		WebElement search = driver.findElement(By.id("listPageSearchLocality"));
		search.sendKeys("BTM");
		Thread.sleep(5000);
		search.sendKeys(Keys.ARROW_DOWN);
		search.sendKeys(Keys.ENTER);
		
		WebElement fullhousecheckbox = driver.findElement(By.id("RENT"));
		System.out.println("FullHouse checkbox is selected: "+fullhousecheckbox.isSelected());
		
		WebElement aparttype = driver.findElement(By.xpath("(//div[@class='nb-select__placeholder'])[1]"));
		System.out.println("Apartment Type is displayed "+aparttype.isDisplayed());
		System.out.println(aparttype.getText());

		WebElement availability = driver.findElement(By.xpath("(//div[@class='css-151xaom-placeholder nb-select__placeholder'])[1]"));
		System.out.println("Availability is displayed "+availability.isDisplayed());
		System.out.println(availability.getText());
		
		driver.findElement(By.id("SHARED")).click();
		
		WebElement dropdown = driver.findElement(By.xpath("(//div[@class='nb-select__placeholder'])[1]"));
		System.out.println(dropdown.getText());
		System.out.println("Tenant Type is displayed "+dropdown.isDisplayed());
		
		WebElement dropdown2 = driver.findElement(By.xpath("(//div[@class='css-151xaom-placeholder nb-select__placeholder'])[1]"));
		System.out.println(dropdown2.getText());
		System.out.println("Room Type is displayed "+dropdown2.isDisplayed());
		
		dropdown.click();
		dropdown.sendKeys(Keys.ARROW_DOWN);
		dropdown.sendKeys(Keys.ENTER);
		dropdown2.click();
		dropdown2.sendKeys(Keys.ENTER);
		dropdown2.sendKeys(Keys.ENTER);
		
		
		driver.findElement(By.xpath("(//button[normalize-space()='Search'])[1]")).click();
		
		
		WebElement filter = driver.findElement(By.id("roomtype_single"));
		System.out.println("On the filter section selected Room Type is single "+filter.isSelected());
		
		WebElement filter2 = driver.findElement(By.id("tenant_male"));
		System.out.println("On the filter section selected  Tenant Type male "+filter2.isSelected());
		
		
		driver.close();
		
		

	}
}
