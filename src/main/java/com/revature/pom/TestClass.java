package com.revature.pom;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	private static WebDriver driver = null;

	public static void main(String[] args) {
		openApplication();
		// testLoginTrainer();
		testLoginVP();
		// testsettings();
		testReports();
		// testTrainersmethod();

		testLoginMethod();
		// testOverviewMethod();

		testBatchesMethod();
		// testCurriculaMethod();
		// testTrainersMethod();
		// testLocationsMethod();

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
		//LoginPage.user(driver).sendKeys("test.trainer@revature.com.int1");
		//LoginPage.password(driver).sendKeys("trainer123");
	}



	private static void testBatchesMethod() {
		BatchesPage.tab(driver).click();
	}

	private static void testOverviewMethod() {
		OverviewPage.filter(driver).click();
		OverviewPage.filterOptions(driver).click();
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

	private static void testLoginVP() {
		LoginPage.user(driver).sendKeys("test.vpoftech@revature.com.int1");
		LoginPage.password(driver).sendKeys("yuvi1712");
		LoginPage.submit(driver).click();
	}

	private static void testTrainersmethod() {

		TrainersPage.tab(driver).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		TrainersPage.tab(driver).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		TrainersPage.addTrainer(driver).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		TrainersPage.FirstName(driver).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		TrainersPage.FirstName(driver).sendKeys("Test11");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		TrainersPage.LastName(driver).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		TrainersPage.LastName(driver).sendKeys("Test12");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// TrainersPage.save(driver).click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		TrainersPage.reactivate1(driver).click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		TrainersPage.deactivate1(driver).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		TrainersPage.calendar(driver).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * TrainersPage.requestpto(driver).click();
		 * TrainersPage.requestpto_start(driver).click();
		 * TrainersPage.requestpto_start_year_month(driver).click();
		 * TrainersPage.requestpto_start_date(driver).click();
		 * TrainersPage.requestpto_end(driver).click();
		 * TrainersPage.requestpto_end_year_month(driver).click();
		 * TrainersPage.requestpto_end_date(driver).click();
		 * TrainersPage.requestpto_cancel(driver).click();
		 * TrainersPage.cancelpto(driver).click();
		 */

	}

	private static void testsettings() {
		GlobalSettingsPage.tab(driver).click();
		GlobalSettingsPage.timelineType(driver).clear();
		GlobalSettingsPage.timelineType(driver).sendKeys(String.valueOf(15));
		GlobalSettingsPage.reportsGrads(driver).clear();
		GlobalSettingsPage.reportsGrads(driver).sendKeys(String.valueOf(30));
		GlobalSettingsPage.reportsCandidates(driver).clear();
		GlobalSettingsPage.reportsCandidates(driver).sendKeys(String.valueOf(20));
		GlobalSettingsPage.defaultBatchLocation(driver).click();
		GlobalSettingsPage.defaultBatchLocation_option(driver).click();
		GlobalSettingsPage.defaultBatchBuilding(driver).click();
		GlobalSettingsPage.defaultBatchBuilding_option(driver).click();
		GlobalSettingsPage.minimumBatchSize(driver).clear();
		GlobalSettingsPage.minimumBatchSize(driver).sendKeys(String.valueOf(40));
		GlobalSettingsPage.maximumBatchSize(driver).clear();
		GlobalSettingsPage.maximumBatchSize(driver).sendKeys(String.valueOf(50));
		GlobalSettingsPage.defaultBatchLength(driver).clear();
		GlobalSettingsPage.defaultBatchLength(driver).sendKeys(String.valueOf(60));
		GlobalSettingsPage.minimumBatches(driver).clear();
		GlobalSettingsPage.minimumBatches(driver).sendKeys(String.valueOf(70));
	}

	private static void testReports() {
		ReportsPage.tab(driver).click();
		ReportsPage.togglecontent2(driver).click();
		ReportsPage.togglecontent2(driver).click();
		ReportsPage.csv(driver).click();
		ReportsPage.csv(driver).click();
		ReportsPage.settings(driver).click();
		// ReportsPage.year(driver).click();
		ReportsPage.year(driver).clear();
		ReportsPage.year(driver).sendKeys(String.valueOf(2019));
		// ReportsPage.batch(driver).click();
		ReportsPage.batch(driver).clear();
		ReportsPage.batch(driver).sendKeys(String.valueOf(26));

		/*
		 * ReportsPage.tab(driver).click(); ReportsPage.togglecontent1(driver).click();
		 * ReportsPage.traineeneeded(driver).click();
		 * ReportsPage.traineeneeded(driver).sendKeys(String.valueOf(28));
		 * ReportsPage.hiredate(driver).sendKeys("12152018");
		 * ReportsPage.curriculum(driver).click();
		 * ReportsPage.curriculum_option(driver).click();
		 * ReportsPage.createbatch(driver).click();
		 * ReportsPage.createall(driver).click();
		 */

	}
}
