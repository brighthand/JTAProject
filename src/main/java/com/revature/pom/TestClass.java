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
		//testCurriculaMethod();
		testTrainersMethod();
		//testLocationsMethod();
		//testLogoutMethod();
		//driver.close();
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
	
	
	private static void testOverviewMethod() {
		//In progress
		OverviewPage.filter(driver).click();
		OverviewPage.inProgress(driver).click();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Beginning in two weeks
		OverviewPage.filter(driver).click();
		OverviewPage.begTwoWeeks(driver).click();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//All
		OverviewPage.filter(driver).click();
		OverviewPage.all(driver).click();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Export csv
		OverviewPage.exportCSV(driver).click();
	}
	
	private static void testCurriculaMethod() {
		CurriculaPage.tab(driver).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		CurriculaPage.coreCurricula(driver).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		CurriculaPage.focuses(driver).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	private static void testLocationsMethod() {
		
		LocationsPage.tab(driver).click();
		LocationsPage.revature11730Location(driver).click();
		LocationsPage.revatureHQLocation(driver).click();
		
		
		LocationsPage.nycLocation(driver).click();
		LocationsPage.cunyQueensLocation(driver);
		LocationsPage.cunySPSLocation(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	private static void testTrainersMethod() {
		TrainersPage.tab(driver).click();
		
		TrainersPage.trainerSalvatore(driver);
		TrainersPage.trainerSalvatoreResume(driver);
		
		TrainersPage.trainerFoles(driver);
		TrainersPage.trainerFolesResume(driver);

		TrainersPage.trainerSteves(driver);
		TrainersPage.trainerStevesResume(driver);
		
		TrainersPage.trainerTestingP(driver);
		TrainersPage.trainerTestingPResume(driver);
		
		TrainersPage.trainerTesting(driver);
		TrainersPage.trainerTestingResume(driver);
		
		TrainersPage.trainerTomBrady(driver);
		TrainersPage.trainerTomBradyResume(driver);
	}
	
	private static void testLogoutMethod() {
		LogoutPage.tab(driver).click();
		LogoutPage.logout(driver).click();
	}
	
	
	
	
	
	
	

}
