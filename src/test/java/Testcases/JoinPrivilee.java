package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.BaseTest;

public class JoinPrivilee extends BaseTest{
	
private MapTest mapTest;
	 
	
	@Test 
	public void joinprivileeTest() throws InterruptedException {
		 
		 mapTest = new MapTest();
		 
	     // Find the link by its exact text and click
	        WebElement signUpLink = driver.findElement(By.linkText("Join Privilee today!"));

	        // Click the link
	        signUpLink.click();
	        Thread.sleep(6000);

		
}
}
