package com.revature.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocationsPage {

	private static WebElement element = null;

	// If only one element in table not array

	public static WebElement tab(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[3]/a"));
		return element;
	}

	// ************BUTTONS**********************
	//Buttons on the navigation pane and body

	// Location Button Virginia
	public static WebElement locationButton(WebDriver driver) {
		element = driver
				.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content/md-list/md-list-item[1]/div[1]/button"));
		return element;
	}

	// Building Button //Revature
	public static WebElement buildingButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"loc1\"]/md-list-item[1]/div/button"));
		return element;                       //*[@id="loc335"]/md-list-item[1]/div/div[1]/md-checkbox/div[1]
	}
	
	// Building Button //Revature
	public static WebElement roomButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"bldg116\"]/md-list-item[1]/div/button"));
		return element;
	}
	
	//Edit Button
	public static WebElement editButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"locEdit\"]"));
		return element;
	}
	
	//Add location button
	public static WebElement addLocationButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"locAdd\"]/md-icon"));
		return element;
	}
	
	// click add building button
	public static WebElement addBuildingButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"bldgAdd\"]/md-icon"));
		return element;
	}

	// click add room button
	public static WebElement addRoomButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"roomAdd\"]/md-icon"));
		return element;
	}
	
	public static WebElement inactivateButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-toolbar/button[5]/md-icon"));
		return element;
	}
	

	//******************CHECKBOXES********************************
	// Select location with checkbox
	public static WebElement selectLocation(WebDriver driver, String row) {
		element = driver.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content/md-list/md-list-item[" + row
				+ "]/div[1]/div[1]/md-checkbox/div[1] "));
		return element;
	}

	// Select room with checkbox
	public static WebElement selectRoom(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"bldg226\"]/md-list-item/div/div[1]/md-checkbox"));
		return element;
	}

	// Select building with checkbox
	public static WebElement selectBuilding(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"loc335\"]/md-list-item[1]/div/div[1]/md-checkbox"));
		return element;                        
	}                                          //*[starts-with(@id=\"loc\")]/md-list-item[1]/div/div[1]/md-checkbox

	
	//***********ADD LOCATION FORM ****************
	//***********SAME AS EDIT***************
	
	// Create new location
	public static WebElement addLocationName(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"input_2\"]"));
		return element;                         //*[@id="input_2"]
	}

	public static WebElement addLocationCity(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"input_3\"]"));
		return element;
	}

	public static WebElement addLocationState(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"select_4\"]"));
		return element;
	}
	
	public static WebElement saveLocationButton(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[3]/md-dialog/form/md-dialog-actions/button[1]/span"));
		return element;                      
	}
	
	public static WebElement cancelLocationButton(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[3]/md-dialog/form/md-dialog-actions/button[2]/span"));
		return element;                     
	}
	
	//*****************ADD BUILDING FORM *******************
	//*****************SAME AS EDIT ************************
	// Create new building
	public static WebElement addBuildingName(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"input_1\"]"));  
		return element;
	}

	public static WebElement saveBuildingButton(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[3]/md-dialog/form/div/md-dialog-actions/button[1]"));
		return element;    //                "/html/body/div[3]/md-dialog/form/md-dialog-actions/button[1]/span"
	}

	public static WebElement cancelBuildingButton(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[3]/md-dialog/form/div/md-dialog-actions/button[2]/span"));
		return element;
	}

	//************ADD ROOM FORM ***********************************
	//************SAME AS EDIT ************************************
	public static WebElement addRoomNumber(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"input_1\"]"));
		return element;
	}
	
	public static WebElement saveRoomButton(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[3]/md-dialog/form/div/md-dialog-actions/button[1]/span"));
		return element;                      
	}

	public static WebElement cancelRoomButton(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[3]/md-dialog/form/div/md-dialog-actions/button[2]/span"));
		return element;
	}
	
	//******************INACTIVATE LOCATION *************************************
	public static WebElement deleteButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"dialogContent_10\"]/div/md-dialog-actions/button[1]"));
		return element;
	}

	public static WebElement deleteCancelButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"dialogContent_10\"]/div/md-dialog-actions/button[2]"));
		return element;
	}
	

	
	//*************NUMBER OF ELEMENTS IN THE LIST*************************
	public static int locationListSize(WebDriver driver) {
		// int size = 0;
		List<WebElement> list = driver
				.findElements(By.xpath("//*[@id=\"view\"]/md-card/md-content/md-list/*/div[1]/button "));
		return list.size();             //*[@id="view"]/md-card/md-content/md-list/md-list-item[1]/div[1]/button
	}

	public static int buildingListSize(WebDriver driver) {
		List<WebElement> list = driver
				.findElements(By.xpath("//*[@id=\"loc1\"]/*/div/button"));
		return list.size();            //*[@id="loc1"]/md-list-item[1]/div/button
	}                                  

	//Room list size for Training building Revature HQ
	public static int roomListSize(WebDriver driver) {
		List<WebElement> list = driver
				.findElements(By.xpath("//*[@id=\\\"bldg116\\\"]/md-list-item/*/div[1]/md-checkbox/div[1]"));
		return list.size();   
		
	}
	


}
