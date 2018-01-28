package com.revature.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocationsPage {

	private static WebElement element = null;
	
	//If only one element in table not array
	
	public static WebElement tab(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[3]/a"));
		return element;
	}
	
	//Select location
	public static WebElement location(WebDriver driver, String row) {
		element = driver.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content/md-list/md-list-item[" + row + "]/div[1]/button "));
		return element;
	}
	
	//Select building
	public static WebElement building(WebDriver driver, String row) {
		element = driver.findElement(By.xpath("//*[@id=\"loc1\"]/md-list-item[" + row + "]/div/button "));
		return element;
	}
	
	//Select location with checkbox
	public static WebElement selectLocation(WebDriver driver, String row) {
		element = driver.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content/md-list/md-list-item[" + row + "]/div[1]/div[1]/md-checkbox/div[1] "));
		return element;
	}
	
	//Select room with checkbox
	public static WebElement selectRoom(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"bldg116\"]/md-list-item/div/div[1]/md-checkbox/div[1] "));
		return element;
	}
	
	//Select building with checkbox
	public static WebElement selectBuilding(WebDriver driver, String row) {
		//element = driver.findElement(By.xpath("//*[starts-with(@id=,\"loc " + row + ") \"]/md-list-item[" + row + "]/div/div[1]/md-checkbox/div[1] "));
		element = driver.findElement(By.xpath("//*[@id=\"loc1\"]/md-list-item/div/div[1]/md-checkbox/div[1]"));
		return element;//*[@id="loc1"]/md-list-item[1]/div/div[1]/md-checkbox/div[1]
		
	}
	
	public static WebElement addLocation(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"locAdd\"]/md-icon"));
		return element;
	}
	
	public static WebElement addBuilding(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"bldgAdd\"]/md-icon"));
		return element;
	}
	
	public static WebElement addRoom(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"roomAdd\"]/md-icon"));
		return element;
	}

	public static WebElement edit(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"locEdit\"]/md-icon "));
		return element;
	}
	
	public static WebElement inactivate(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-toolbar/button[5]/md-icon "));
		return element;
	}
	

	//Create new location
	public static WebElement addLocationName(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"input_2\"]"));
		return element;
	}
	
	public static WebElement addLocationCity(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"input_3\"]"));
		return element;
	}
	
	public static WebElement addLocationState(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"select_4\"]"));
		return element;
	}
	
	public static WebElement saveLocation(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[3]/md-dialog/form/md-dialog-actions/button[1] "));
		return element;
	}
	
	public static WebElement cancelLocation(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[3]/md-dialog/form/md-dialog-actions/button[2]/span "));
		return element;///html/body/div[3]/md-dialog/form/md-dialog-actions/button[2]/span
	}
	
	//Create new building
	public static WebElement addBuildingName(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"input_1\"]"));
		return element;
	}
	
	public static WebElement saveBuilding(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[3]/md-dialog/form/div/md-dialog-actions/button[1]/span"));
		return element;
	}
	
	public static WebElement cancelBuilding(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[3]/md-dialog/form/div/md-dialog-actions/button[2]/span"));
		return element;
	}
	
	//Create new room
	public static WebElement addRoomNumber(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"input_1\"]"));
		return element;
	}
	
	public static WebElement saveRoom(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[3]/md-dialog/form/div/md-dialog-actions/button[1]/span"));
		return element;
	}
	
	public static WebElement cancelRoom(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[3]/md-dialog/form/div/md-dialog-actions/button[2]/span"));
		return element;
	}
	
	
	//Edit location
	public static WebElement editLocationName(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"input_2\"]"));
		return element;
	}
	
	public static WebElement editLocationCity(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"input_3\"]"));
		return element;
	}
	
	public static WebElement editLocationState(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"select_value_label_1\"]"));
		return element;
	}
	
	public static WebElement saveEditLocation(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[3]/md-dialog/form/md-dialog-actions/button[1]"));
		return element;
	}
	
	public static WebElement cancelEditLocation(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[3]/md-dialog/form/md-dialog-actions/button[2]/span"));
		return element;
	}
	
	//Edit building
	public static WebElement editBuildingName(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"input_1\"]"));
		return element;
	}
	
	public static WebElement saveEditBuilding(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[3]/md-dialog/form/div/md-dialog-actions/button[1]/span"));
		return element;
	}
	
	public static WebElement cancelEditBuilding(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[3]/md-dialog/form/div/md-dialog-actions/button[2]"));
		return element;
	}
	
	//Create new room
	public static WebElement editRoomNumber(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"input_1\"] "));
		return element;
	}
	
	public static WebElement saveEditRoom(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[3]/md-dialog/form/div/md-dialog-actions/button[1]/span "));
		return element;
	}
	
	public static WebElement cancelEditRoom(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[3]/md-dialog/form/div/md-dialog-actions/button[2]/span"));
		return element;
	}
	
	
}
