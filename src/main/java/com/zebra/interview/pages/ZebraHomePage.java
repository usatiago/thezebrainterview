package com.zebra.interview.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ZebraHomePage {
	private WebDriver driver; 
	private	static By postalCodeTextBox = By.cssSelector("input[name='zipcode']:first-of-type");
	private static By compareNowButton = By.cssSelector("button:first-of-type:not(:disabled)");

	public ZebraHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setTextPostalCodeTextBox(String postalCode) {
		driver.findElement(postalCodeTextBox).sendKeys(postalCode);
	}

	public void clickCompareSubmitButton() {
		driver.findElement(compareNowButton).submit();
	}
}
