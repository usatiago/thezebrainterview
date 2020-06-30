package com.zebra.interview.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QuoteStartDetailsPage {
	private WebDriver driver; 
	private	static By addressTextBox = By.cssSelector("input[id='garaging_addressInput']");
	private	static By unitTextBox = By.cssSelector("input[name='unit']");
	
	private	static By firstNameTextBox = By.cssSelector("input[name='fname']");
	private	static By lastNameTextBox = By.cssSelector("input[name='lname']");
	private	static By birthdayTextBox = By.cssSelector("input[name='date']");
	
	private	static By saveContinueButton = By.cssSelector("button[id='startDetailsSaveBtn']:not(:disabled)");
	
	public QuoteStartDetailsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setOvernightParkingAddress(String address, String unit) {
		driver.findElement(addressTextBox).sendKeys(address);
		driver.findElement(unitTextBox).sendKeys(unit);
	}
	
	public void setBioInfo(String fname, String lname, String bday) {
		driver.findElement(firstNameTextBox).sendKeys(fname);
		driver.findElement(lastNameTextBox).sendKeys(lname);
		driver.findElement(birthdayTextBox).sendKeys(bday);
	}
	
	public void clickSaveContinue() {
		driver.findElement(saveContinueButton).click();
	}
}
