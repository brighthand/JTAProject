package com.revature.pom;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		openApplication();
		testLoginMethod();
		//testOverviewMethod();
		testBatchesMethod();
		//testCurriculaMethod();
		//testTrainersMethod();
		//testLocationsMethod();
		//testProfileMethod();
		//testLogoutMethod();
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
		LoginPage.user(driver).sendKeys("test.trainer@revature.com.int1");
		LoginPage.password(driver).sendKeys("trainer123");
		LoginPage.submit(driver).click();
	}
	
	private static void testBatchesMethod() {
		BatchesPage.tab(driver).click();
	}
	
	private static void testOverviewMethod() {
		//In progress
		OverviewPage.filter(driver).click();
		OverviewPage.inProgress(driver).click();
		
		/*
		//Beginning in two weeks
		OverviewPage.filter(driver).click();
		OverviewPage.begTwoWeeks(driver).click();
		
		//All
		OverviewPage.filter(driver).click();
		OverviewPage.all(driver).click();
		
		//Export csv
		OverviewPage.exportCSV(driver).click();*/
	}
	
	private static void testCurriculaMethod() {
		CurriculaPage.tab(driver).click();
		
		CurriculaPage.coreCurricula(driver).click();
		
		CurriculaPage.focuses(driver).click();
	}
	
	private static void testLocationsMethod() {
		
		LocationsPage.tab(driver).click();
		LocationsPage.revature11730Location(driver).click();
		LocationsPage.revatureHQLocation(driver).click();
		
		
		LocationsPage.nycLocation(driver).click();
		LocationsPage.cunyQueensLocation(driver);
		LocationsPage.cunySPSLocation(driver);
	}
	
	private static void testTrainersMethod() {
		TrainersPage.tab(driver).click();
		
		TrainersPage.trainer(driver, String.valueOf(2)).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TrainersPage.trainerResume(driver, String.valueOf(2)).click();
	}

	private static void testProfileMethod() {
		ProfilePage.tab(driver).click();
		//ProfilePage.profileFirstName(driver);
		//ProfilePage.profileLastName(driver);
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
