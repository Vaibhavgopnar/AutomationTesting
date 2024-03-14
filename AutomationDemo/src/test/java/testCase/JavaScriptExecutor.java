package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_default");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		// Print the title of pagee
		String script = "document.title;";
		String title = (String) jse.executeScript(script);
		System.out.println(title);
		
		// click button
		driver.switchTo().frame("iframeResult");
		jse.executeScript("myFunction()");
		Thread.sleep(2000);
		
		// highlight
		WebElement button = driver.findElement(By.xpath("/html/body/button"));
		jse.executeScript("arguments[0].style.background='yellow'", button);

		// Scroll
		driver.navigate().to("https://www.w3schools.com/");
		WebElement scrollbutton = driver.findElement(By.xpath("//*[@id=\"main\"]/div[6]/div/div[1]/a[1]"));
		jse.executeScript("argument[0].scrollIntoView(true);", scrollbutton);
		

	}

}
