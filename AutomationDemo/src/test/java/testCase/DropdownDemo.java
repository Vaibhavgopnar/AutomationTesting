package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownDemo {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.freshersnow.com/capgemini-off-campus/#");
		driver.manage().window().maximize();
		
		WebElement dropdown = driver.findElement(By.className("td-icon-menu-down"));
		
		Select select = new Select(dropdown);
		
		select.selectByIndex(0);
//		select.selectByValue(null);
//		select.selectByVisibleText(null);
//		
//		select.getFirstSelectedOption();
//		select.getAllSelectedOptions();
		
	}

}
