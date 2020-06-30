package com.zebra.interview.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QuoteVehicleDetailsPage {
	private WebDriver driver; 
	private	static By numberOfVehicles = By.cssSelector("div[class='section-page-questions-response']");
	private static By levelOfOwnershipOptions = By.cssSelector("div[class='section-page-questions-response'] div[class*='ownership'] label[for*='ownership-'] div.custom-control-label-wrap");
	private static By usageTypeOptions = By.cssSelector("div[class='section-page-questions-response'] div[class*='primary_use'] label[for*='primary_use-'] div.custom-control-label-wrap");
	private static By milesPerTimeUnit = By.cssSelector("input[id*='miles-input-']");
	private static By unitOfTimeOptions = By.cssSelector("div[id*='mileage_period-Per']");
	private static By unitOfTimeDropdown = By.cssSelector("svg[class*='dropdown-select-icon']");
	
	private List<WebElement> listOfVehicles;
	private List<WebElement> listOfOwnershipOptions;
	private List<WebElement> listOfUsageTypeOptions;
	private List<WebElement> listOfMilesTextbox;
	private List<WebElement> listOfUnitOfTimeOptions;
	private List<WebElement> listOfUnitOfTimeDropdowns;
	
	private	static By vehicleDetailsSaveButton = By.cssSelector("button[id='vehiclesDetailsSaveBtn']:not(:disabled)");

	public QuoteVehicleDetailsPage(WebDriver driver) {
		this.driver = driver;
		getNumberOfVehicles();
		getSizeListOfOwnershipOptions();
		getSizeListUsageTypeOptions();
		getSizeListMilesTextbox();
		getListOfUnitOfTimeDropdowns();
		getSizeListTimeUnitOptions();
	}
	
	public void setVehicleInfo(int ownership, int typeOfUsage, String miles, int timeUnit) {
		int i = 0;
		int j = ownership-1;
		int k = typeOfUsage-1;
		int l = timeUnit-1;
		while (i < getNumberOfVehicles()) {
			listOfOwnershipOptions.get(j).click();
			listOfUsageTypeOptions.get(k).click();
			listOfMilesTextbox.get(i).sendKeys(miles);
			listOfUnitOfTimeDropdowns.get(i).click();
			listOfUnitOfTimeOptions.get(l).click();
			i++;
			j = j + 3;
			k = k + 4;
			l = l + 4;
		}
	}
	
	public void clickVehicleDetailsSaveButton() {
		driver.findElement(vehicleDetailsSaveButton);
	}
	
	private int getNumberOfVehicles() {
		listOfVehicles = driver.findElements(numberOfVehicles);
		return listOfVehicles.size();
	}
	
	private int getSizeListOfOwnershipOptions() {
		listOfOwnershipOptions = driver.findElements(levelOfOwnershipOptions);
		return listOfOwnershipOptions.size();
	}
	
	private int getSizeListUsageTypeOptions() {
		listOfUsageTypeOptions = driver.findElements(usageTypeOptions);
		return listOfUsageTypeOptions.size();
	}
	
	private int getSizeListMilesTextbox() {
		listOfMilesTextbox = driver.findElements(milesPerTimeUnit);
		return listOfMilesTextbox.size();
	}
	
	private int getListOfUnitOfTimeDropdowns() {
		listOfUnitOfTimeDropdowns = driver.findElements(unitOfTimeDropdown);
		return listOfUnitOfTimeDropdowns.size();
	}
	
	private int getSizeListTimeUnitOptions() {
		listOfUnitOfTimeOptions = driver.findElements(unitOfTimeOptions);
		return listOfUnitOfTimeOptions.size();
	}
	
}
