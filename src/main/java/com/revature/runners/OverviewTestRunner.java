package com.revature.runners;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.revature.cukes.LocationCukes;
import com.revature.cukes.OverviewCukes;
import com.revature.pom.CurriculaPage;
import com.revature.pom.LocationsPage;
import com.revature.pom.LoginPage;
import com.revature.pom.OverviewPage;


public class OverviewTestRunner {
	
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
	}
	
	
	//Filter in progress
	//Bad
	@Test(priority = 3, enabled = false)
	public static void filterInProgress() {
		
		String label = null;
		
		try {
			
			//Thread.sleep(2000);
			OverviewCukes.i_m_in_the_overview_page(driver);
			
			//Thread.sleep(5000);
			OverviewCukes.i_click_the_filter_button(driver);
			
			Thread.sleep(5000);
			OverviewCukes.select_in_progress(driver);
			label = OverviewPage.filterLabel(driver).getText();
			
			//Thread.sleep(2000);
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		Assert.assertTrue(label.equals("Active Batches"));
	}
	

	//Filter Beginning In Two Weeks
	//Good
	@Test(priority = 4, enabled = false)
	public static void filterBegInTwoWeeks() {
		String label = null;
		try {
			
			OverviewCukes.i_m_in_the_overview_page(driver);
			OverviewCukes.i_click_the_filter_button(driver);
			
			Thread.sleep(2000);
			OverviewCukes.select_beginning_within_two_weeks(driver);
			
			Thread.sleep(2000);
			label = OverviewPage.filterLabel(driver).getText();
			System.out.println("label: " + label);
			
		} catch (Throwable e) {
	
			e.printStackTrace();
		}
		
		Assert.assertTrue(label.equals("Upcoming Batches"));
	}
	
	//Filter all
	//Good
	@Test(priority = 5, enabled = false)
	public static void filterAll() {
		String label = null;
		try {
			OverviewCukes.i_m_in_the_overview_page(driver);
			Thread.sleep(2000);
			OverviewCukes.i_click_the_filter_button(driver);
			Thread.sleep(2000);
			OverviewCukes.select_all(driver);
			
			label = OverviewPage.filterLabel(driver).getText();
			System.out.println("Label: " + label);
			
		} catch (Throwable e) {
	
			e.printStackTrace();
		}
		
		Assert.assertTrue(label.equals("All Batches"));
	}
	
	
	//Export csv
	@Test(priority = 6, enabled = true)
	public static void exportCSV() {
		String label = null;
		try {
			
			OverviewCukes.i_m_in_the_overview_page(driver);
			
			Thread.sleep(5000);
			OverviewCukes.i_click_the_export_to_csv_button(driver);
			Thread.sleep(5000);
			//label = OverviewPage.filterLabel(driver).getAttribute(arg0)
			
		} catch (Throwable e) {
	
			e.printStackTrace();
		}
		
		//Assert.assertTrue(label.equals("All Batches"));
	}
	
	
	
	@Test(priority = 7)
	public void closeApplication() {
		driver.close();
	}
	
	
}
