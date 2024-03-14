package testscript.Relevel_VaibhavGopnar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;
	}

	private By searchdoctor = By.xpath("(//input[@role='combobox'])[1]");
	
	private By speceality1 = By.xpath("(//div[@class='blocker'])[1]");
	private By speceality2 = By.xpath("(//div[@class='blocker'])[2]");
	private By speceality3 = By.xpath("(//div[@class='blocker'])[3]");
	
	private By clearbtn = By.xpath("(//span[@title='Clear all'])[1]");
	private By applybtn = By.xpath("/html/body/main/section[1]/div[2]/app-appointment-box/div/form/div[1]/app-speciality-search/div/ng-select/ng-dropdown-panel/div[1]/div/button");
	
	private By location = By.xpath("(//input[@role='combobox'])[2]");
	private By delhincr = By.xpath("(//div[@class='blocker'])[1]");

	public WebElement searchdoctor() {
		return driver.findElement(searchdoctor);

	}

	public WebElement speceality1() {
		return driver.findElement(speceality1);

	}

	public WebElement speceality2() {
		return driver.findElement(speceality2);

	}

	public WebElement speceality3() {
		return driver.findElement(speceality3);

	}

	public WebElement clearbtn() {
		return driver.findElement(clearbtn);
	}
	
	public WebElement location() {
		return driver.findElement(location);
	}
	
	public WebElement delhincr() {
		return driver.findElement(delhincr);
	}
	
	public WebElement applybtn() {
		return driver.findElement(applybtn);
	}
}
