package com.revature.pom;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	private static WebDriver driver = null;
	private static int iCount = 0;

	public static void main(String[] args) {
		openApplication();
		testLoginMethod();
		// testOverviewMethod();
		// testBatchesMethod();
		 testCurriculaMethod();
		// testTrainersMethod();
		//testLocationsMethod();
		// testProfileMethod();
		// testLogoutMethod();
		driver.close();
	}

	private static void openApplication() {
		File f1 = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", f1.getAbsolutePath());
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://dev.assignforce.revaturelabs.com");
	}

	private static void testLoginMethod() {
		LoginPage.user(driver).sendKeys("test.vpoftech@revature.com.int1 ");
		LoginPage.password(driver).sendKeys("yuvi1712");
		
		LoginPage.submit(driver).click();
	}

	private static void testBatchesMethod() {
		BatchesPage.tab(driver).click();
	}

	private static void testOverviewMethod() {

		iCount = (driver.findElements(By.xpath("//*[@id=\"menu_container_0\"]/md-menu-content"))).size();
		System.out.println("iCount: " + iCount);

		// for (int i = 0; i < iCount; i++) {
		OverviewPage.filter(driver).click();
		OverviewPage.filterOptions(driver).click();
		// }

		// Export csv
		// OverviewPage.exportCSV(driver).click();
	}

	
	  private static void testCurriculaMethod() {
	   CurriculaPage.tab(driver).click();
	  
	   //CurriculaPage.toogleCoreCurricula(driver).click();
	   //CurriculaPage.toogleFocuses(driver).click();
	   //CurriculaPage.toogleSkills(driver).click();
	   
	   //Testing Skills
	   CurriculaPage.toogleSkills(driver).click();
	   CurriculaPage.enterSkill(driver).sendKeys("Cloud pipeline");
	   CurriculaPage.createSkill(driver).click();
	   
	  }
	  
	  
	 

	private static void testLocationsMethod() {
		// iCount =
		// (driver.findElements(By.xpath("//*[@id=\"view\"]/md-card/md-content"))).size();
		// System.out.println("iCount: " + iCount);

		//Testing add location
		/*
		LocationsPage.tab(driver).click();
		LocationsPage.addLocation(driver).click();
		LocationsPage.addLocationName(driver).sendKeys("Tampa");
		LocationsPage.addLocationCity(driver).sendKeys("Restbon");
		LocationsPage.addLocationState(driver).sendKeys("FL");
		LocationsPage.saveLocation(driver).click()
		LocationsPage.cancelLocation(driver).click();*/
		
		//Testing add building
		/*
		LocationsPage.tab(driver).click();
		LocationsPage.selectLocation(driver, String.valueOf(1)).click();
		LocationsPage.addBuilding(driver).click();
		LocationsPage.addBuildingName(driver).sendKeys("bldng1");
		LocationsPage.saveBuilding(driver).click();
		//LocationsPage.cancelBuilding(driver).click();*/
		
		//Testing add room
		/*
		LocationsPage.tab(driver).click();
		LocationsPage.selectBuilding(driver, String.valueOf(1)).click();
		LocationsPage.addRoom(driver).click();
		LocationsPage.addRoomNumber(driver).sendKeys("112");
		//LocationsPage.cancelRoom(driver).click();
		LocationsPage.saveRoom(driver).click();*/
		
		//Test edit location
		/*
		LocationsPage.tab(driver).click();
		LocationsPage.selectLocation(driver, String.valueOf(1)).click();
		LocationsPage.edit(driver).click();
		LocationsPage.editLocationName(driver).clear();
		LocationsPage.editLocationName(driver).sendKeys("Mampa");
		LocationsPage.editLocationCity(driver).clear();
		LocationsPage.editLocationCity(driver).sendKeys("Resn");
		LocationsPage.editLocationState(driver).sendKeys("CA");
		LocationsPage.saveEditLocation(driver).click();
		//LocationsPage.cancelEditLocation(driver).click();*/
		
		//Test edit building
		/*
		LocationsPage.tab(driver).click();
		LocationsPage.selectBuilding(driver, String.valueOf(1)).click();
		LocationsPage.edit(driver).click();
		LocationsPage.editBuildingName(driver).clear();
		LocationsPage.editBuildingName(driver).sendKeys("Training");
		//LocationsPage.saveBuilding(driver).click();
		LocationsPage.cancelBuilding(driver).click();*/
		
		//Testing edit room
		/*
		LocationsPage.tab(driver).click();
		LocationsPage.building(driver, String.valueOf(1)).click();
		LocationsPage.selectRoom(driver).click();
		LocationsPage.edit(driver).click();
		LocationsPage.editRoomNumber(driver).clear();
		LocationsPage.editRoomNumber(driver).sendKeys("110");
		//LocationsPage.cancelRoom(driver).click();
		LocationsPage.saveRoom(driver).click();*/
		
	}

	private static void testTrainersMethod() {
		TrainersPage.tab(driver).click();

		TrainersPage.trainer(driver, String.valueOf(2)).click();
		TrainersPage.trainerResume(driver, String.valueOf(2)).click();
	}

	private static void testProfileMethod() {
		ProfilePage.tab(driver).click();
		// ProfilePage.profileFirstName(driver);
		// ProfilePage.profileLastName(driver);
		ProfilePage.addResume(driver).click();
		ProfilePage.saveResume(driver).click();
		ProfilePage.currentSkill(driver).click();
		ProfilePage.addCertifications(driver).click();

	}

	private static void testLogoutMethod() {
		LogoutPage.tab(driver).click();
		LogoutPage.logout(driver).click();
	}

}
