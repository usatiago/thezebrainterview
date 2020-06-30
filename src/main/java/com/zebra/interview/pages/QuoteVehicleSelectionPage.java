package com.zebra.interview.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QuoteVehicleSelectionPage {
	private WebDriver driver; 
	private	static By vehicleOptionsAssginedToAddress = By.cssSelector("label[for*='.'] div.custom-control-label-wrap");
	private	static By vehicleSelectionSaveButton = By.cssSelector("button[id='vehiclesDetailsSaveBtn']:not(:disabled)");
	
	private List<WebElement> listOfVehicles;

	public QuoteVehicleSelectionPage(WebDriver driver) {
		this.driver = driver;
		getListOfVehicles();
	}
	
	public void clickVehicleSelectionSaveButton() {
		driver.findElement(vehicleSelectionSaveButton);
	}
	
	public void selectVehicles() {
		listOfVehicles.get(0).click();
	}
	
	private int getListOfVehicles() {
		listOfVehicles = driver.findElements(vehicleOptionsAssginedToAddress);
		return listOfVehicles.size();
	}

}
