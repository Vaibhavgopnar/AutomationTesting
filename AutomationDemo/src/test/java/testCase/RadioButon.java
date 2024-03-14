package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButon {

	public static WebDriver driver;
	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://sarathi.parivahan.gov.in/sarathiservice/newLL_displayNewLL.do");
		driver.manage().window().maximize();
		
		WebElement radio1 = driver.findElement(By.id("licenceType1"));
		WebElement radio2 = driver.findElement(By.id("licenceType2"));
		
		radio2.click();
		
		System.out.println(radio1.isSelected());
		System.out.println(radio2.isSelected());
		
		System.out.println(driver.findElement(By.xpath("//*[@type=\"radio\"]")).getSize());
	}

}
