package com.zebra.interview.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QuoteDriverDetailsPage {
	private WebDriver driver; 
	
	private static By driverGenderMale = By.cssSelector("div[class*='gender'] label[for*='gender-0-'] div.custom-control-label-wrap");
	private static By driverGenderFemale = By.cssSelector("div[class*='gender'] label[for*='gender-1-'] div.custom-control-label-wrap");

	private static By driverMaritalStatusSingle = By.cssSelector("//TODO");
	private static By driverMaritalStatusMarried = By.cssSelector("//TODO");
	private static By driverMaritalStatusDivorced = By.cssSelector("//TODO");
	private static By driverMaritalStatusWidowed = By.cssSelector("//TODO");

	private static By driverCreditScoreBracketExcellent = By.cssSelector("//TODO");
	private static By driverCreditScoreBracketGood = By.cssSelector("//TODO");
	private static By driverCreditScoreBracketAverage = By.cssSelector("//TODO");
	private static By driverCreditScoreBracketPoor = By.cssSelector("//TODO");

	private static By driverHighestLevelEducationDoctoral = By.cssSelector("//TODO");
	private static By driverHighestLevelEducationMaster = By.cssSelector("//TODO");
	private static By driverHighestLevelEducationBachelor = By.cssSelector("//TODO");
	private static By driverHighestLevelEducationHS = By.cssSelector("//TODO");
	private static By driverHighestLevelEducationNoDiploma = By.cssSelector("//TODO");

	private static By driverContinuousCoverageLength3yr = By.cssSelector("//TODO");
	private static By driverContinuousCoverageLength1_3yr = By.cssSelector("//TODO");
	private static By driverContinuousCoverageLength6_12mo = By.cssSelector("//TODO");
	private static By driverContinuousCoverageLengthLess6mo = By.cssSelector("//TODO");

	private static By driverCurrentInsuranceProvider = By.cssSelector("//TODO");
	
	private static By driverRecentAccidentsYes = By.cssSelector("//TODO");
	private static By driverRecentAccidentsNo = By.cssSelector("//TODO");
	
	private static By driverAccidentsAtFaultPlus = By.cssSelector("//TODO");
	private static By driverAccidentsNotAtFaultPlus = By.cssSelector("//TODO");
	private static By driverClaimsPlus = By.cssSelector("//TODO");
	private static By driverTicketsViolationsPlus = By.cssSelector("//TODO");
	
	private static By driverViolationTypeSpeeding5_24Plus = By.cssSelector("//TODO");
	private static By driverViolationTypeSpeeding25OverPlus = By.cssSelector("//TODO");
	private static By driverViolationTypeMajorPlus = By.cssSelector("//TODO");
	private static By driverViolationTypeMinorPlus = By.cssSelector("//TODO");
	private static By driverViolationTypeDUIPlus = By.cssSelector("//TODO");
	private static By driverViolationTypeOtherPlus = By.cssSelector("//TODO");
	
	private static By driverEmail = By.cssSelector("//TODO");
	
	private static By driverApplicableDiscountsFullTimeEmployed = By.cssSelector("//TODO");
	private static By driverApplicableDiscountsMilitary = By.cssSelector("//TODO");
	private static By driverApplicableDiscountsPayFullAtStart = By.cssSelector("//TODO");
	private static By driverApplicableDiscountsAutoPay = By.cssSelector("//TODO");
	private static By driverApplicableDiscountsPaperless = By.cssSelector("//TODO");
	
	private static By driverReferralOriginDropdown = By.cssSelector("//TODO");

	private static By addAnotherDriverYes = By.cssSelector("//TODO");
	private static By addAnotherDriverNo = By.cssSelector("//TODO");
	
	private	static By saveShowQuoteButton = By.cssSelector("button[id='summaryShowQuotesBtn']:not(:disabled)");
	
	public QuoteDriverDetailsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickShowQuoteButton() {
		driver.findElement(saveShowQuoteButton).click();
	}
	
	public void setDriverGender(String gender) {
		if (gender.toLowerCase().trim() == "male") {
			driver.findElement(driverGenderMale).click();
			
		} else if (gender.toLowerCase().trim() == "female") {
			driver.findElement(driverGenderFemale).click();
		}
	}
	
	public void setDriverMaritalStatus(String maritalStatus) {
		if (maritalStatus.toLowerCase().trim() == "single") {
			driver.findElement(driverMaritalStatusSingle).click();
		} else if (maritalStatus.toLowerCase().trim() == "married") {
			driver.findElement(driverMaritalStatusMarried).click();
		} else if (maritalStatus.toLowerCase().trim() == "divorced") {
			driver.findElement(driverMaritalStatusDivorced).click();
		} else if (maritalStatus.toLowerCase().trim() == "widowed") {
			driver.findElement(driverMaritalStatusWidowed).click();
		}
	}
	
	public void setDriverCreditScoreBracket(String creditBracket) {
		if (creditBracket.toLowerCase().trim() == "excellent") {
			driver.findElement(driverCreditScoreBracketExcellent).click();
		} else if (creditBracket.toLowerCase().trim() == "good") {
			driver.findElement(driverCreditScoreBracketGood).click();
		} else if (creditBracket.toLowerCase().trim() == "average") {
			driver.findElement(driverCreditScoreBracketAverage).click();
		} else if (creditBracket.toLowerCase().trim() == "poor") {
			driver.findElement(driverCreditScoreBracketPoor).click();
		}
	}

	public void setDriverHighestLevelEducation(int educationLevel) {
		if (educationLevel == 1) {
			driver.findElement(driverHighestLevelEducationDoctoral).click();
		} else if (educationLevel == 2) {
			driver.findElement(driverHighestLevelEducationMaster).click();
		} else if (educationLevel == 3) {
			driver.findElement(driverHighestLevelEducationBachelor).click();
		} else if (educationLevel == 4) {
			driver.findElement(driverHighestLevelEducationHS).click();
		} else if (educationLevel == 5) {
			driver.findElement(driverHighestLevelEducationNoDiploma).click();
		}
	}
	
	public void setDriverContinuousCoverageLength(int continuousLengthBracket) {
		if (continuousLengthBracket == 1) {
			driver.findElement(driverContinuousCoverageLength3yr).click();
		} else if (continuousLengthBracket == 2) {
			driver.findElement(driverContinuousCoverageLength1_3yr).click();
		} else if (continuousLengthBracket == 3) {
			driver.findElement(driverContinuousCoverageLength6_12mo).click();
		} else if (continuousLengthBracket == 4) {
			driver.findElement(driverContinuousCoverageLengthLess6mo).click();
		}
	}

	public void setDriverCurrentInsuranceProvider(String insuranceCompany) {
		driver.findElement(driverCurrentInsuranceProvider).sendKeys(insuranceCompany);

	}
	
	public void setDriverRecentAccidents(boolean accidents) {
		if (!accidents) {
			driver.findElement(driverRecentAccidentsNo).click();
		} else { 
			driver.findElement(driverRecentAccidentsYes).click();
		}
	}
	
	 public void setAccidentDetails(int atFault, int notAtFault, int claims, int ticketViolations) {
		for (int i=0 ; i < atFault ; i++) {
			driver.findElement(driverAccidentsAtFaultPlus).click();			
		}
		for (int i=0 ; i < notAtFault ; i++) {
			driver.findElement(driverAccidentsNotAtFaultPlus).click();			
		}
		for (int i=0 ; i < claims ; i++) {
			driver.findElement(driverClaimsPlus).click();	
		}
		for (int i=0 ; i < ticketViolations ; i++) {
			driver.findElement(driverTicketsViolationsPlus).click();		
		}
	}
	 
	 public void setTicketsViolationsDetails(int speeding1, int speeding2, int major, int minor, int dui, int other) {
		for (int i=0 ; i < speeding1 ; i++) {
			driver.findElement(driverViolationTypeSpeeding5_24Plus).click();			
		}
		for (int i=0 ; i < speeding2 ; i++) {
			driver.findElement(driverViolationTypeSpeeding25OverPlus).click();			
		}
		for (int i=0 ; i < major ; i++) {
			driver.findElement(driverViolationTypeMajorPlus).click();	
		}
		for (int i=0 ; i < minor ; i++) {
			driver.findElement(driverViolationTypeMinorPlus).click();		
		}
		for (int i=0 ; i < dui ; i++) {
			driver.findElement(driverViolationTypeDUIPlus).click();		
		}
		for (int i=0 ; i < other ; i++) {
			driver.findElement(driverViolationTypeOtherPlus).click();		
		}
	}
	 
	public void setDriverEmailForQuote(String emailAddress) {
		driver.findElement(driverEmail).sendKeys(emailAddress);
	}

	public void setDriverApplicableDiscounts(int[] listOfDiscounts) {
		//this is an approach I usually use for checkboxes)
		if(listOfDiscounts.length > 0){
			for(int i=0 ; i < listOfDiscounts.length; i++) {
				if(listOfDiscounts[i] == 1) {
					if (!driver.findElement(driverApplicableDiscountsFullTimeEmployed).isSelected()) 
						driver.findElement(driverApplicableDiscountsFullTimeEmployed).click();
				} else if (listOfDiscounts[i] == 2) {
					if (!driver.findElement(driverApplicableDiscountsMilitary).isSelected()) 
						driver.findElement(driverApplicableDiscountsMilitary).click();
				} else if (listOfDiscounts[i] == 3) {
					if (!driver.findElement(driverApplicableDiscountsPayFullAtStart).isSelected()) 
						driver.findElement(driverApplicableDiscountsPayFullAtStart).click();
				} else if (listOfDiscounts[i] == 4) {
					if (!driver.findElement(driverApplicableDiscountsAutoPay).isSelected()) 
						driver.findElement(driverApplicableDiscountsAutoPay).click();
				} else if (listOfDiscounts[i] == 5) {
					if (!driver.findElement(driverApplicableDiscountsPaperless).isSelected()) 
						driver.findElement(driverApplicableDiscountsPaperless).click();
				}
			}
		}
	}
	
	public void setDriverReferralOrigin(String referralOrigin) {
		driver.findElement(driverReferralOriginDropdown).sendKeys(referralOrigin);		
	}
	
	public void setAdditionalDriver(boolean additionalDriver) {
		if (additionalDriver) {
			driver.findElement(addAnotherDriverYes).click();
		} else { 
			driver.findElement(addAnotherDriverNo).click();
		}
	}
	
}
