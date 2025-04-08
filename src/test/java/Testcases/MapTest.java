package Testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.BaseTest;

public class MapTest extends BaseTest {
	
	
	@Test
    public void locationTest() throws InterruptedException {

        // Implicit wait to wait for elements to load
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 WebElement searchInput = driver.findElement(By.xpath("(//input[@placeholder='Search for venue'])[1]"));
	       // searchInput.clear();
//		 List<WebElement> elements = driver.findElements(By.name("name"));
//	        System.out.println("Number of elements:" +elements.size());
	        searchInput.sendKeys("Al Habtoor Polo Resort");
	        
	        
	        WebElement searchBtn = driver.findElement(By.xpath("//span[normalize-space()='Al Habtoor Polo Resort']"));
	        searchBtn.click();
	        
	       
	       
	        
	}
}

