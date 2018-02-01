package com.revature.cukes;


import org.openqa.selenium.WebDriver;

import com.revature.pom.LocationsPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//Tests add feature
public class LocationCukes {
	@Given("^I'm on the locations page$")
	public static void i_m_on_the_locations_page(WebDriver driver) throws Throwable {
	    LocationsPage.tab(driver).click();
	}

	@When("^I click the add location button$")
	public static void i_click_the_add_location_button(WebDriver driver) throws Throwable {
	    LocationsPage.addLocationButton(driver).click();
	}

	@Then("^Enter location information$")
	public static void enter_location_information(WebDriver driver) throws Throwable {
			LocationsPage.addLocationName(driver).sendKeys("Vietnam");
			LocationsPage.addLocationCity(driver).sendKeys("Restbon");
			LocationsPage.addLocationState(driver).sendKeys("FL");
	}

	@When("^I click a location checkbox$")
	public static void i_click_a_location_checkbox(WebDriver driver) throws Throwable {
	  LocationsPage.selectLocation(driver, String.valueOf(1)).click();
	}

	@Then("^I click add building button$")
	public static void i_click_add_building_button(WebDriver driver) throws Throwable {
	LocationsPage.addBuildingButton(driver).click();
	}

	@Then("^Enter building information$")
	public static void enter_building_information(WebDriver driver) throws Throwable { 
	LocationsPage.addBuildingName(driver).sendKeys("blg3"); 
	}

	@When("^I click a building checkbox$")
	public static void i_click_a_building_checkbox(WebDriver driver) throws Throwable {
	    LocationsPage.selectBuilding(driver).click();
	}

	@Then("^I click add room button$")
	public static void i_click_add_room_button(WebDriver driver) throws Throwable {
	  LocationsPage.addRoomButton(driver).click();
	}

	@Then("^Enter room information$")
	public static void enter_room_information(WebDriver driver) throws Throwable {
	LocationsPage.addRoomNumber(driver).sendKeys("120");
	}

	@Then("^I click the edit button$")
	public static void i_click_the_edit_button(WebDriver driver) throws Throwable {
	    LocationsPage.editButton(driver).click();
	}

	@Then("^I clear the location form$")
	public static void i_clear_the_location_form(WebDriver driver) throws Throwable {
	   		LocationsPage.addLocationName(driver).clear();
			LocationsPage.addLocationCity(driver).clear();
			LocationsPage.addLocationState(driver).clear();
	}

	@Then("^Edit location information$")
	public static void edit_location_information(WebDriver driver) throws Throwable {
	   	LocationsPage.addLocationName(driver).sendKeys("Kampa");
			LocationsPage.addLocationCity(driver).sendKeys("Westbon");
			LocationsPage.addLocationState(driver).sendKeys("AL");
	}

	@Then("^click the save button$")
	public static void click_the_save_button(WebDriver driver) throws Throwable {
	  	LocationsPage.saveLocationButton(driver).click();
	}

	@Then("^I clear the building form$")
	public static void i_clear_the_building_form(WebDriver driver) throws Throwable {
	LocationsPage.addBuildingName(driver).clear(); 
	    
	}

	@Then("^Edit building information$")
	public static void edit_building_information(WebDriver driver) throws Throwable {
	 LocationsPage.addBuildingName(driver).sendKeys("Closet");
	}

	@When("^I click a room checkbox$")
	public static void i_click_a_room_checkbox(WebDriver driver) throws Throwable {
	  		LocationsPage.selectRoom(driver).click();
	}

	@Then("^I clear the room form$")
	public static void i_clear_the_room_form(WebDriver driver) throws Throwable {
	   LocationsPage.addRoomNumber(driver).clear();
	}

	@Then("^Edit room information$")
	public static void edit_room_information(WebDriver driver) throws Throwable {
	   LocationsPage.addRoomNumber(driver).sendKeys("140");
	}

	@Then("^I click the inactivate button$")
	public static void i_click_the_inactivate_button(WebDriver driver) throws Throwable {
	   LocationsPage.inactivateButton(driver).click();
	}


	


	
	//*****************INACTIVATE LOCATION ***************************
	
	 
}
