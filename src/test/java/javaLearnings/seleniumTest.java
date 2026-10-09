package javaLearnings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class seleniumTest {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        // Replace "path/to/chromedriver" with the actual path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver\\chromedriver.exe");

        // Initialize a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();


     // Set Chrome options
ChromeOptions options = new ChromeOptions();
options.addArguments("--remote-allow-origins=*");

            // Navigate to a website
            driver.get("https://www.google.com");
    }
}
