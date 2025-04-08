package Testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.BaseTest;

public class FitnessTab  extends BaseTest{
	
	private MapTest mapTest;
	
	@Test 
	public void TestfilterTab() throws InterruptedException {
		 
		 mapTest = new MapTest();
		 
		 try {
		 
		 WebElement fitnessTab = driver.findElement(By.xpath("//button[normalize-space()='Fitness']")); 

		// Click the Fitness tab
		fitnessTab.click();
	        Thread.sleep(3000);
	        List<WebElement> images = driver.findElements(By.tagName("img"));

            // Loop through all images and check their 'src' attribute
            System.out.println("List of all images and their URLs:");

            for (WebElement img : images) {
                String imgUrl = img.getAttribute("src");
                System.out.println("Image URL: " + imgUrl);

            }

        } catch (InterruptedException e) {
            e.printStackTrace();
            
		
}

}
}
