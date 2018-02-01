package com.revature.pom;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass2 {
	private static WebDriver driver = null;
	
	@BeforeSuite(groups="iteration1")
	private static void openApplication() {
		File f1 = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", f1.getAbsolutePath());
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}


	@BeforeTest(groups="iteration1")
	void testLoginMethod() {
		driver.get("https://dev.assignforce.revaturelabs.com");
		LoginPage.user(driver).sendKeys("test.vpoftech@revature.com.int1 ");
		LoginPage.password(driver).sendKeys("yuvi1712");
		LoginPage.submit(driver).click();
		//LoginPage.user(driver).sendKeys("test.trainer@revature.com.int1");
		//LoginPage.password(driver).sendKeys("trainer123");
	}

	@Test(enabled = false, priority=0, groups ="iteration2")
	private static void testsettings() throws InterruptedException {
		Thread.sleep(1000);
		GlobalSettingsPage.tab(driver).click();
		GlobalSettingsPage.timelineTypeVP(driver).clear();
		GlobalSettingsPage.timelineTypeVP(driver).sendKeys(String.valueOf(15));
		GlobalSettingsPage.reportsGrads(driver).clear();
		GlobalSettingsPage.reportsGrads(driver).sendKeys(String.valueOf(30));
		GlobalSettingsPage.reportsCandidates(driver).clear();
		GlobalSettingsPage.reportsCandidates(driver).sendKeys(String.valueOf(20));
		GlobalSettingsPage.defaultBatchLocation(driver).click();
		GlobalSettingsPage.defaultBatchLocation_option(driver, String.valueOf(17)).click();
		GlobalSettingsPage.defaultBatchBuilding(driver).click();
		GlobalSettingsPage.defaultBatchBuilding_option(driver, String.valueOf(31)).click();
		GlobalSettingsPage.minimumBatchSize(driver).clear();
		GlobalSettingsPage.minimumBatchSize(driver).sendKeys(String.valueOf(40));
		GlobalSettingsPage.maximumBatchSize(driver).clear();
		GlobalSettingsPage.maximumBatchSize(driver).sendKeys(String.valueOf(50));
		GlobalSettingsPage.defaultBatchLength(driver).clear();
		GlobalSettingsPage.defaultBatchLength(driver).sendKeys(String.valueOf(60));
		GlobalSettingsPage.minimumBatches(driver).clear();
		GlobalSettingsPage.minimumBatches(driver).sendKeys(String.valueOf(70));
		GlobalSettingsPage.save(driver).click();
		GlobalSettingsPage.okay(driver).click();
		Thread.sleep(5000);
	}
	
	
	@Test(enabled = true, priority = 0, groups ="iteration1")
	private static void testTrainers() throws InterruptedException  {
		
		TrainersPage.tab(driver).click();
		//TrainersPage.addTrainer(driver).click();
		//TrainersPage.FirstName(driver).sendKeys("Richard");
		//TrainersPage.LastName(driver).sendKeys("Smith");
		//TrainersPage.save(driver).click();
		System.out.println(TrainersPage.size_of_inactivetrainers(driver));
		TrainersPage.deactivate(driver).click();
		Thread.sleep(3000);
		TrainersPage.reactivate(driver, String.valueOf(9)).click();
		Thread.sleep(7000);
		TrainersPage.calendar(driver).click();
		TrainersPage.requestpto(driver).click();
		TrainersPage.requestpto_start(driver).click();
		TrainersPage.requestpto_start_year_month(driver).click();
		TrainersPage.requestpto_start_date(driver).click();
		TrainersPage.requestpto_send(driver).click();
		TrainersPage.requestpto_end(driver).click();
		TrainersPage.requestpto_end_year_month(driver).click();
		TrainersPage.requestpto_end_date(driver).click();
		TrainersPage.requestpto_send(driver).click();
		TrainersPage.signin(driver).sendKeys("asharif3003@gmail.com");
		TrainersPage.next(driver).click();
		
		
		
		
		
	}
	
	
	@Test(enabled = false, priority = 0, groups ="iteration1")
	private static void testReports() throws InterruptedException  {
		
		 Thread.sleep(1000);
		 ReportsPage.tab(driver).click();
		 Thread.sleep(1000);
		 ReportsPage.togglecontent1(driver).click();
		 
		 ReportsPage.traineeneeded(driver).click();
		 Thread.sleep(1000);
		 ReportsPage.traineeneeded(driver).sendKeys(String.valueOf(28));
		 Thread.sleep(1000);
		 ReportsPage.hiredate(driver).sendKeys("12/15/2018");
		 Thread.sleep(1000);
		 ReportsPage.hiredate(driver).sendKeys(Keys.ENTER);
		 Thread.sleep(1000);
		 ReportsPage.curriculum(driver).click();
		 Thread.sleep(1000);
		 ReportsPage.curriculum_option(driver).click();
		 Thread.sleep(1000);
		 ReportsPage.createbatch(driver).click();
		 try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 /*
		 ReportsPage.createall(driver).click();
		 try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ReportsPage.togglecontent1(driver).click();
		
		ReportsPage.togglecontent2(driver).click();
		ReportsPage.togglecontent2(driver).click();
		ReportsPage.csv(driver).click();
		ReportsPage.csv(driver).click();
		
		ReportsPage.togglecontent3(driver).click();
		ReportsPage.togglecontent3(driver).click();
		ReportsPage.csv2(driver).click();
		ReportsPage.csv2(driver).click();
		
		/*
		ReportsPage.tab(driver).click();
		ReportsPage.settings(driver).click();
		ReportsPage.year(driver).click();
		ReportsPage.year(driver).clear();
		ReportsPage.year(driver).sendKeys(String.valueOf(2019));
		ReportsPage.batch(driver).click();
		ReportsPage.batch(driver).clear();
		ReportsPage.batch(driver).sendKeys(String.valueOf(26));
		*/
		
		/*
		 ReportsPage.tab(driver).click(); 
		 ReportsPage.togglecontent1(driver).click();
		 // ReportsPage.traineeneeded(driver).click();
		 // ReportsPage.traineeneeded(driver).sendKeys(String.valueOf(28));
		 // ReportsPage.hiredate(driver).sendKeys("12152018");
		 ReportsPage.curriculum(driver).click();
		 ReportsPage.curriculum_option(driver).click();
		 ReportsPage.createbatch(driver).click();
		 ReportsPage.createall(driver).click();
		 */
		 
		 

	}

	
	
	
	@AfterTest(groups="iteration1")
	private static void logout() {
		LogoutPage.tab(driver).click();
	}
	
	@AfterSuite(groups="iteration1")
	void closeApp(){
		driver.quit();
	}
	
	

	/*
	static WebDriver wd = null;
	
	@BeforeSuite(groups="iteration1")
	private static void openApplication() {
		File f1 = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", f1.getAbsolutePath());
		wd = new ChromeDriver();
	}

	@BeforeTest(groups="iteration1")
	void login() {
		wd.get("http://newtours.demoaut.com");
		LoginPage2.user(wd).sendKeys("yuvi1");
		LoginPage2.password(wd).sendKeys("yuvi1");
		LoginPage2.signin(wd).submit();
	}
	
	//@Ignore
	@Test(priority=0, enabled=true, groups ="iteration1")
	void verifyLogin() {
		String s1 = wd.findElement(By.xpath("//a[@href=\"mercurysignoff.php\"]")).getText();
		assertEquals(s1, "SIGN-OFF");
	}
	
	@Test(enabled = true, priority=1, groups ="iteration2")
	private static void navigateToFlightFinder() {
		FlightFinder.tripType(wd).click();
		FlightFinder.departFrom(wd).sendKeys("Paris");
		FlightFinder.arriveTo(wd).sendKeys("Frankfurt");
		FlightFinder.airline(wd).sendKeys("No Preference");
		FlightFinder.findFlightsButton(wd).click();
	}
	
	@AfterTest(groups="iteration1")
	void logout() {
		Logout2.signoff(wd).click();
	}
	
	@AfterSuite(groups="iteration1")
	void closeApp(){
		wd.quit();
	}
	
	*/
}
