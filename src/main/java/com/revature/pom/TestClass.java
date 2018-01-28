package com.revature.pom;

import java.io.File;
import java.util.concurrent.TimeUnit;

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

		LoginPage.user(driver).sendKeys("test.trainer@revature.com.int1");
		LoginPage.password(driver).sendKeys("trainer123");
		LoginPage.submit(driver).click();
	}

	private static void testBatchesMethod() {
		BatchesPage.tab(driver).click();
	}

	private static void testOverviewMethod() {
		// In progress
		OverviewPage.filter(driver).click();
		OverviewPage.inProgress(driver).click();

		/*
		 * //Beginning in two weeks OverviewPage.filter(driver).click();
		 * OverviewPage.begTwoWeeks(driver).click();
		 * 
		 * //All OverviewPage.filter(driver).click(); OverviewPage.all(driver).click();
		 * 
		 * //Export csv OverviewPage.exportCSV(driver).click();
		 */
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
