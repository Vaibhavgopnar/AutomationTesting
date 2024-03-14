package testCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllLinkPrint {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.freshersnow.com/capgemini-off-campus/#");
		driver.manage().window().maximize();
		
		List<WebElement> alltags = driver.findElements(By.tagName("a"));
		System.out.println("Total lnks are : "+alltags.size());
		
		for(int i=0;i<alltags.size();i++)
		{
			System.out.println("Link on page : "+alltags.get(i).getAttribute("href"));
			System.out.println("Link on page : "+alltags.get(i).getText());
		}
		
		driver.close();

	}

}
