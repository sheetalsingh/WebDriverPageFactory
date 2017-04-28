package testcases;

import java.net.MalformedURLException;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import helper.PropertyFileReader;
import pages.BasePage;
import pages.FlightStatusPage;
import pages.HomePage;
import pages.HotelsPage;

public class NewsTest {

	WebDriver driver;
	Map<String, String> propertyMap;

	BasePage basePage;
	HomePage homePage;
	HotelsPage hotelsPage;
	FlightStatusPage flightStatusPage;
	Logger log = Logger.getLogger(getClass());
	HomePage hp = new HomePage();

	@BeforeClass
	public void init() throws MalformedURLException {
		PropertyConfigurator.configure("log4j.properties");
		log.info("|| News Before Class, thread: " + Thread.currentThread().getName());
		log.debug("I AM DEBUG");
		

		basePage = BasePage.getInstance();
		// driver = basePage.getDriver();
		basePage.getDriver();
		propertyMap = basePage.getProperties();
		

	}

	@AfterClass
	public void tearDown() throws InterruptedException {
		// Thread.sleep(5000);

		basePage.quit();
		// basePage.close();
	}

	@Test
	public void verifyNews1() throws MalformedURLException, InterruptedException {
		
		log.info("|| News Page Test 1, thread : " + Thread.currentThread().getName());
		basePage.get("https://www.bing.com/");
	}

	@Test
	public void verifyNews2() throws MalformedURLException, InterruptedException {
		log.info("|| News Page Test 2, thread : " + Thread.currentThread().getName());
		basePage.get("http://www.msn.com/en-in/");
//		Thread.sleep(1000);
		Assert.assertTrue(false);
		Thread.sleep(1000);
	}

}
