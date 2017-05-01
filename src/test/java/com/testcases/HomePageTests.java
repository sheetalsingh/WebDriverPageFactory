package com.testcases;

import java.net.MalformedURLException;
import java.util.Map;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.BasePageClass;
import com.pages.FlightStatusPage;
import com.pages.HomePage;
import com.pages.HotelsPage;

public class HomePageTests {

	WebDriver driver;
	Map<String, String> propertyMap;

	BasePageClass basePage;
	HomePage homePage;
	HotelsPage hotelsPage;
	FlightStatusPage flightStatusPage;

	Logger log = Logger.getLogger(HomePageTests.class);
    
	@BeforeClass
	public void init() throws MalformedURLException {
		//PropertyConfigurator.configure("log4j.properties");
		log.info("|| Homepage Before Class: " + Thread.currentThread().getName());

		basePage = BasePageClass.getInstance();
		driver = basePage.getDriver();
		propertyMap = basePage.getProperties();
		log.debug("Home page driver hashcode: "+driver.hashCode());

	}

	/**
	 * quit(): getDriver() method break as quit() doesn't make driver as null
	 * also looses current running firefox context
	 * 
	 * close(): last running test class will not close browser - todo
	 * 
	 * thread local should be implemented to avoid such issue, parallel mode
	 * 
	 * @throws InterruptedException
	 */
	@AfterClass
	public void tearDown() throws InterruptedException {
		basePage.quit();
	}

	@Test
	public void verifyFlightStatusTab() throws MalformedURLException, InterruptedException {
		log.info("|| Home Page Test 1, thread: " + Thread.currentThread().getName());
//		 basePage.get("https://book2.spicejet.com/");
//		 homePage = new HomePage(driver);
//		 homePage.isHomePageLoaded();
//		 homePage.clickFlighStatusTab();
//		 Thread.sleep(2000);
//		 flightStatusPage = new FlightStatusPage(driver);
//		 Assert.assertTrue(flightStatusPage.isFlightStatusPageLoaded(),"Flight Status page not loaded");
//		 Thread.sleep(2000);
		//basePage.get(propertyMap.get("server"));  obj.getServer();
		basePage.get("https://www.google.com/");
		Assert.assertTrue(false);
	}

	@Test
	public void verifyHotelsTab() throws MalformedURLException, InterruptedException {
		log.info("|| Home Page Test 2 >> " + Thread.currentThread().getName());

//		 basePage.get("https://book2.spicejet.com/");
//		 homePage = new HomePage(driver);
//		 homePage.isHomePageLoaded();
//		 homePage.clickHotelsTab();
//		
//		 Thread.sleep(2000);
//		
//		 hotelsPage = new HotelsPage(driver);
//		 Assert.assertTrue(hotelsPage.isHotelsPageLoaded(), "Hotels page not loaded");

		basePage.get("https://www.asklaila.com/");
		
	}

}