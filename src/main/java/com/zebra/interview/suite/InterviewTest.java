package com.zebra.interview.suite;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.zebra.interview.pages.*;

public class InterviewTest {
	private static WebDriver driver;
	
	@BeforeTest
	public void testSetUp() {
		System.getProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
	
	@Test
	public static void TestStep01() {
		ZebraHomePage homePage = new ZebraHomePage(driver);
		driver.get("https://www.thezebra.com/");
		assertEquals(true, driver.getTitle().contains("The Zebra"));
		homePage.setTextPostalCodeTextBox("78640");
		homePage.clickCompareSubmitButton();
	}
	
	@Test
	public static void TestStep02() {
		QuoteStartPage quotePage = new QuoteStartPage(driver);
		quotePage.setInsuranceCurrentStatus(1);
		quotePage.setHomeOwnershipStatus(1);
		quotePage.setWhyLookingForInsurance(1);
		quotePage.clickCompareSubmitButton();
	}
	
	@Test
	public static void TestStep03() {
		QuoteStartDetailsPage quoteBioPage = new QuoteStartDetailsPage(driver);
		quoteBioPage.setOvernightParkingAddress("401 Kai Vista Drive", "1A");
		quoteBioPage.setBioInfo("Tiago", "Garcia", "08121982");
		quoteBioPage.clickSaveContinue();
	}
	
	@Test
	public static void TestStep04() {
		QuoteVehicleSelectionPage quoteVehicleSelectionPage = new QuoteVehicleSelectionPage(driver);
		quoteVehicleSelectionPage.selectVehicles();
		quoteVehicleSelectionPage.clickVehicleSelectionSaveButton();
	}
	
	@Test
	public static void TestStep05() {
		QuoteVehicleDetailsPage quoteVehiclesDetailsPage = new QuoteVehicleDetailsPage(driver);
		/* if multiple drivers, can pull from file (i.e. Apache POI to access a Excel spreadsheet), then load driver data on a List
		 * and iterate over that list to include multiple drivers
		*/
		quoteVehiclesDetailsPage.setVehicleInfo(1, 1, "99999", 1);
		quoteVehiclesDetailsPage.clickVehicleDetailsSaveButton();
	}	
	
	@Test
	public static void TestStep06() {
		QuoteDriverDetailsPage quoteDriverDetailsPage = new QuoteDriverDetailsPage(driver);
		/* if multiple drivers, can pull from file (i.e. Apache POI to access a Excel spreadsheet), then load driver data on a List
		 * and iterate over that list to include multiple drivers before calling method to click on the submit button
		*/
		quoteDriverDetailsPage.setDriverGender("male");
		quoteDriverDetailsPage.setDriverMaritalStatus("single");
		quoteDriverDetailsPage.setDriverCreditScoreBracket("excellent");
		quoteDriverDetailsPage.setDriverHighestLevelEducation(3);
		quoteDriverDetailsPage.setDriverContinuousCoverageLength(1);
		quoteDriverDetailsPage.setDriverCurrentInsuranceProvider("Geico");
		quoteDriverDetailsPage.setDriverRecentAccidents(true);
		quoteDriverDetailsPage.setAccidentDetails(2, 1, 0, 0);
		/* if there were any tickets or violations the following method could be called to
		 * set details of Tickets and Violations:
		 *  	quoteDriverDetailsPage.setTicketsViolationsDetails(speeding1, speeding2, major, minor, dui, other);
		 */
		quoteDriverDetailsPage.setDriverEmailForQuote("tiago.f.garcia@gmail.com");
		quoteDriverDetailsPage.setDriverApplicableDiscounts(new int[]{1,3,4,5});
		quoteDriverDetailsPage.setDriverReferralOrigin("other");
		quoteDriverDetailsPage.setAdditionalDriver(false);
	
		quoteDriverDetailsPage.clickShowQuoteButton();
		}
	
	@AfterTest
	public void testTearDown() {
		driver.quit();
	}
}
