package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.BaseTest;

public class FilterTest extends BaseTest {
	
	private MapTest mapTest;
	 
	
	@Test 
	public void testfilter() throws InterruptedException {
		 
		 mapTest = new MapTest();
		 // Implicit wait to wait for elements to load
	        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	        
	            // Step 2: Find the filter button (use the appropriate selector here)
	            WebElement filterButton = driver.findElement(By.xpath("//button[@class='sc-445d4fd4-5 BZOKq']//*[name()='svg']"));  // Replace with actual selector

	            // Step 3: Click the filter button
	            filterButton.click();

	            // Optionally, wait for some time to observe the result (not recommended for production)
	          //  Thread.sleep(4000);  // Sleep for 2 seconds, adjust based on your needs
                
	            WebElement venutype = driver.findElement(By.xpath("(//span[normalize-space()='Hotel'])[1]"));  // Replace with actual selector
                
	            venutype.click();
	            
	          //  Thread.sleep(4000);
WebElement showvenue = driver.findElement(By.xpath("//button[normalize-space()='Show 75 venues']"));  // Replace with actual selector
                
showvenue.click();
	            
//Thread.sleep(4000); 
	    }
		

	}


