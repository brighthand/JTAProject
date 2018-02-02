package com.revature.runners;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.revature.cukes.LocationCukes;
import com.revature.pom.CurriculaPage;
import com.revature.pom.LocationsPage;
import com.revature.pom.LoginPage;

public class LocationTestRunner {
	
	private static WebDriver driver = null;

	@Test(priority = 1)
	private static void openApplication() {
		File f1 = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", f1.getAbsolutePath());
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://dev.assignforce.revaturelabs.com");
	}

	@Test(priority = 2)
	private static void testLoginMethod() {
		LoginPage.user(driver).sendKeys("test.vpoftech@revature.com.int1 ");
		LoginPage.password(driver).sendKeys("yuvi1712");
		LoginPage.submit(driver).click();
		// LoginPage.user(driver).sendKeys("test.trainer@revature.com.int1");
		// LoginPage.password(driver).sendKeys("trainer123");
		try {
			LocationCukes.i_m_on_the_locations_page(driver);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	// Adding new location
	// GOOD
	@Test(priority = 3, enabled = false)
	public void addLocation() {
		int sizeAfter = 0, sizeBefore = 0;
		try {
		
			LocationCukes.i_m_on_the_locations_page(driver);
			
			Thread.sleep(2000);
			LocationCukes.i_click_the_add_location_button(driver);

			Thread.sleep(2000);
			sizeBefore = LocationsPage.locationListSize(driver);
			System.out.println("sizeBefore: " + sizeBefore);

			Thread.sleep(2000);
			LocationCukes.enter_location_information(driver);
			
			Thread.sleep(2000);
			LocationCukes.click_the_save_button(driver);;

			Thread.sleep(2000);
			sizeAfter = LocationsPage.locationListSize(driver);
			System.out.println("sizeAfter: " + sizeAfter);

		} catch (Throwable e) {
			e.printStackTrace();
		}

		Assert.assertTrue(sizeAfter > sizeBefore);
	}

	// Add new building
	// Good
	@Test(priority = 4, enabled = false)
	public void addBuilding() {
		int sizeAfter = 0, sizeBefore = 0;
		try {
			LocationCukes.i_m_on_the_locations_page(driver);
			
			Thread.sleep(2000);
			LocationCukes.i_click_a_location_checkbox(driver);

			Thread.sleep(2000);
			sizeBefore = LocationsPage.buildingListSize(driver);
			System.out.println("sizeBefore: " + sizeBefore);

			Thread.sleep(2000);
			LocationCukes.i_click_add_building_button(driver);

			Thread.sleep(2000);
			LocationCukes.enter_building_information(driver);
			
			Thread.sleep(2000);
			LocationCukes.click_the_save_button(driver);

			Thread.sleep(2000);
			sizeAfter = LocationsPage.buildingListSize(driver);
			
			Thread.sleep(2000);

			System.out.println("sizeAfter: " + sizeAfter);

		} catch (Throwable e) {
			e.printStackTrace();
		}

		Assert.assertTrue(sizeAfter > sizeBefore);
	}

	// Add new room
	// Come back
	@Test(priority = 5, enabled = false)
	public void addRoom() {
		int sizeAfter = 0, sizeBefore = 0;
		try {

			LocationCukes.i_m_on_the_locations_page(driver);
			
			Thread.sleep(2000);
			LocationCukes.i_click_a_building_checkbox(driver);

			Thread.sleep(2000);
			sizeBefore = LocationsPage.roomListSize(driver);
			System.out.println("sizeBefore: " + sizeBefore);
			
			Thread.sleep(2000);
			LocationCukes.i_click_add_room_button(driver);;
			
			Thread.sleep(2000);
			LocationCukes.enter_room_information(driver);
			
			Thread.sleep(2000);
			LocationCukes.click_the_save_button(driver);
			
			Thread.sleep(2000);
			sizeAfter = LocationsPage.roomListSize(driver);
			System.out.println("sizeAfter: " + sizeAfter);

		} catch (Throwable e) {
			e.printStackTrace();
		}

		Assert.assertTrue(sizeAfter > sizeBefore);
	}

	// Edit location
	// GOOD
	@Test(priority = 6, enabled = true)
	public void editLocation() {
		String locationBefore = null, locationAfter = null;

		try {
			LocationCukes.i_m_on_the_locations_page(driver);
			LocationCukes.i_click_a_location_checkbox(driver);
			LocationCukes.i_click_the_edit_button(driver);

			// Get location before edit
			locationBefore = LocationsPage.locationButton(driver).getAttribute("aria-label");

			System.out.println("locationBefore: " + locationBefore);

		    //LocationCukes.i_clear_the_location_form(driver);
			LocationCukes.edit_location_information(driver);
			LocationCukes.click_the_save_button(driver);

			// Get the location after edit
			locationAfter = LocationsPage.locationButton(driver).getAttribute("aria-label");
			System.out.println("locationAfter: " + locationAfter);

		} catch (Throwable e) {
			e.printStackTrace();
		}

		// If the locationAfter is not equal to locationBefore the edit was success
		Assert.assertTrue(!locationAfter.equals(locationBefore));
	}

	// Edit building
	// Good
	@Test(priority = 7, enabled = false)
	public void editBuilding() {
		String buildingBefore = null, buildingAfter = null;

		try {
			LocationCukes.i_m_on_the_locations_page(driver);
			LocationCukes.i_click_a_building_checkbox(driver);
			LocationCukes.i_click_the_edit_button(driver);

			// Get building before edit
			buildingBefore = LocationsPage.buildingButton(driver).getAttribute("aria-label");
			System.out.println("buildingBefore: " + buildingBefore);

			//LocationCukes.i_clear_the_location_form(driver);
			Thread.sleep(2000);
			LocationCukes.edit_building_information(driver);

			Thread.sleep(2000);
			LocationCukes.click_the_save_button(driver);

			// Get building before edit
			buildingAfter = LocationsPage.buildingButton(driver).getAttribute("aria-label");
			System.out.println("buildingBefore: " + buildingAfter);

		} catch (Throwable e) {
			e.printStackTrace();
		}

		// If the buildingAfter is not equal to buildingBefore the edit was a success
		Assert.assertTrue(!buildingAfter.equals(buildingBefore));
	}

	// Edit Room
	//Good clear button
	@Test(priority = 8, enabled = false)
	public void editRoom() {
		String roomBefore = null, roomAfter = null;
		try {

			LocationCukes.i_m_on_the_locations_page(driver);
			LocationCukes.i_click_add_building_button(driver);
			LocationCukes.i_click_a_room_checkbox(driver);

			roomBefore = LocationsPage.roomButton(driver).getAttribute("aria-label");
			System.out.println("roomBefore: " + roomBefore);
			Thread.sleep(2000);

			LocationCukes.i_click_the_edit_button(driver);
			Thread.sleep(2000);

			LocationCukes.enter_room_information(driver);
			
			Thread.sleep(2000);
			LocationCukes.click_the_save_button(driver);

			roomAfter = LocationsPage.roomButton(driver).getAttribute("aria-label");
			System.out.println("roomAfter: " + roomAfter);

		} catch (Throwable e) {
			e.printStackTrace();
		}

		Assert.assertTrue(!roomAfter.equals(roomBefore));
	}

	@Test(priority = 9, enabled = true)
	public void closeApplication() {
		driver.close();
	}
	
	
}