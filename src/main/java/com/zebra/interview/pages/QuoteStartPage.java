package com.zebra.interview.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QuoteStartPage {
	private WebDriver driver; 
	private	static By currentStatusInsuranceYes = By.cssSelector("label[for='currently_insured-1start'] div.custom-control-label-wrap");
	private	static By currentStatusInsuranceNo = By.cssSelector("label[for='currently_insured-0start'] div.custom-control-label-wrap");
	
	private	static By homeOwnershipStatusOwnHome = By.cssSelector("label[for='residence_ownership-0start'] div.custom-control-label-wrap");
	private	static By homeOwnershipStatusOwnCondo = By.cssSelector("label[for='residence_ownership-1start'] div.custom-control-label-wrap");
	private	static By homeOwnershipStatusRent = By.cssSelector("label[for='residence_ownership-2start'] div.custom-control-label-wrap");
	private	static By homeOwnershipStatusOther = By.cssSelector("label[for='residence_ownership-3start'] div.custom-control-label-wrap");

	private	static By reasonForInsuranceTooMuch = By.cssSelector("label[for='user_intent-PAYING_TOO_MUCHstart'] div.custom-control-label-wrap");
	private	static By reasonForInsuranceBuyingCar = By.cssSelector("label[for='user_intent-BUYING_CAR_SOONstart'] div.custom-control-label-wrap");
	private	static By reasonForInsuranceLifeEvent = By.cssSelector("label[for='user_intent-LIFE_EVENTstart'] div.custom-control-label-wrap");
	private	static By reasonForInsuranceJustLooking = By.cssSelector("label[for='user_intent-JUST_LOOKINGstart'] div.custom-control-label-wrap");
		
	private	static By startSaveButton = By.cssSelector("button[id='startSaveBtn']:not(:disabled)");

	public QuoteStartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setInsuranceCurrentStatus(int option) {
		System.out.println("Insurance Yes visible?" + driver.findElement(currentStatusInsuranceYes).isEnabled());
		if (option == 1) {
			driver.findElement(currentStatusInsuranceYes).click();
		}
		else if (option == 2) {
			driver.findElement(currentStatusInsuranceNo).click();
		}
	}
	
	public void setHomeOwnershipStatus(int option) {
		System.out.println("Insurance Yes visible?" + driver.findElement(homeOwnershipStatusOwnHome).isEnabled());
		if (option == 1) {
			//wait.until(ExpectedConditions.presenceOfElementLocated(homeOwnershipStatusOwnHome));
			driver.findElement(homeOwnershipStatusOwnHome).click();
		}
		else if (option == 2) {
			//wait.until(ExpectedConditions.presenceOfElementLocated(homeOwnershipStatusOwnCondo));
			driver.findElement(homeOwnershipStatusOwnCondo).click();
		}
		else if (option == 3) {
			//wait.until(ExpectedConditions.presenceOfElementLocated(homeOwnershipStatusRent));
			driver.findElement(homeOwnershipStatusRent).click();
		}
		else if (option == 4) {
			//wait.until(ExpectedConditions.presenceOfElementLocated(homeOwnershipStatusOther));
			driver.findElement(homeOwnershipStatusOther).click();
		}
	}

	public void setWhyLookingForInsurance(int option) {
		System.out.println("Insurance Yes visible?" + driver.findElement(reasonForInsuranceTooMuch).isEnabled());
		if (option == 1) {
			//wait.until(ExpectedConditions.presenceOfElementLocated(reasonForInsuranceTooMuch));
			driver.findElement(reasonForInsuranceTooMuch).click();
		}
		else if (option == 2) {
			//wait.until(ExpectedConditions.presenceOfElementLocated(reasonForInsuranceBuyingCar));
			driver.findElement(reasonForInsuranceBuyingCar).click();
		}
		else if (option == 3) {
			//wait.until(ExpectedConditions.presenceOfElementLocated(reasonForInsuranceLifeEvent));
			driver.findElement(reasonForInsuranceLifeEvent).click();
		}
		else if (option == 4) {
			//wait.until(ExpectedConditions.presenceOfElementLocated(reasonForInsuranceJustLooking));
			driver.findElement(reasonForInsuranceJustLooking).click();
		}
	}
	
	public void clickCompareSubmitButton() {
		//wait.until(ExpectedConditions.presenceOfElementLocated(startSaveButton));
		System.out.println("Insurance Yes visible?" + driver.findElement(startSaveButton).isEnabled());
		driver.findElement(startSaveButton).click();
	}
}
