package Base;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver;

	@BeforeMethod
    public void setUp() {
        // Automatically download the appropriate driver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();  // Maximize the browser window
        driver.get("https://staging-website.privilee.ae/map");

        // Implicit wait to wait for elements to load
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
    }

	

	@AfterMethod
	
	public void tearDown() {
		driver.close();

	}

}
