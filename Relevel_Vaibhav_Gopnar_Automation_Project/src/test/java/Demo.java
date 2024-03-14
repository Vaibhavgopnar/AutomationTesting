
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");

        // Configure Chrome options (optional)
        ChromeOptions options = new ChromeOptions();
        // Add any specific Chrome options here, if needed

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver(options);

        try {
            // Navigate to the login page
            driver.get("https://google.com/login");

            // Find the username/email input element and enter your username/email
            WebElement usernameField = driver.findElement(By.id("username"));
            usernameField.sendKeys("your_username");

            // Find the password input element and enter your password
            WebElement passwordField = driver.findElement(By.id("password"));
            passwordField.sendKeys("your_password");

            // Find and click the login button
            WebElement loginButton = driver.findElement(By.id("login-button"));
            loginButton.click();

            // Add a wait to ensure the login is complete or check for a success message
            // You can use WebDriverWait for more robust waits
            Thread.sleep(5000); // Wait for 5 seconds (adjust as needed)

            // Add additional actions or assertions as needed

            System.out.println("Login successful!");
        } catch (Exception e) {
            System.err.println("Login failed: " + e.getMessage());
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
