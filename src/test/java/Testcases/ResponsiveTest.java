package Testcases;

import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

import Base.BaseTest;

public class ResponsiveTest extends BaseTest{
	
	private MapTest mapTest;
	
	//public static void main(String[] args) {
		
		@Test 
		public void ResponseTest() throws InterruptedException {
			 
			 mapTest = new MapTest();
			 
	try {
        // Open the page
      //  driver.get("https://staging-website.privilee.ae/map");
//
//        // Test for Mobile Resolution
        driver.manage().window().setSize(new Dimension(375, 667));  // Mobile screen size
        System.out.println("Mobile resolution tested.");
//
//         Test for Tablet Resolution
        driver.manage().window().setSize(new Dimension(768, 1024));  // Tablet screen size
        System.out.println("Tablet resolution tested.");

        // Test for Desktop Resolution
        driver.manage().window().setSize(new Dimension(1366, 768));  // Desktop screen size
        System.out.println("Desktop resolution tested.");

    } catch (Exception e) {
        e.printStackTrace();


}
}
}
