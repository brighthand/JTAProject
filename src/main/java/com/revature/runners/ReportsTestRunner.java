package com.revature.runners;

import java.io.File;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.revature.pom.LoginPage;
import com.revature.pom.LogoutPage;
import com.revature.pom.ReportsPage;

public class ReportsTestRunner {
	
	private static WebDriver driver = null;
	
	WebDriverWait wait = null;

	@BeforeSuite
	private static void openApplication() {
		File f1 = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", f1.getAbsolutePath());
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@BeforeTest
	void testLoginMethod() {
		driver.get("https://dev.assignforce.revaturelabs.com");
		LoginPage.user(driver).sendKeys("test.vpoftech@revature.com.int1 ");
		LoginPage.password(driver).sendKeys("yuvi1712");
		LoginPage.submit(driver).click();
		// LoginPage.user(driver).sendKeys("test.trainer@revature.com.int1");
		// LoginPage.password(driver).sendKeys("trainer123");
	}
	
	@Test(priority = 3)
	public void expandBatchProject() {
		
		ReportsPage.tab(driver).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		ReportsPage.batchArrow(driver).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ReportsPage.numOfTrainees(driver).sendKeys("20");
		ReportsPage.selectCurr(driver).sendKeys("TEST");
		ReportsPage.createBatch(driver).click();
	}
	
	@Test(priority = 4)
	public void addProjBatch() {
		ReportsPage.addBatch(driver).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test(priority = 5)
	public void closeBatchProject() {
		ReportsPage.batchArrow(driver).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(priority = 6)
	public void expandGradBatch() {
		ReportsPage.gradArrow(driver).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(priority = 7)
	public void closeGradBatch() {
		ReportsPage.gradArrow(driver).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(priority = 8)
	public void expandIncBatch() {
		ReportsPage.incArrow(driver).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(priority = 9)
	public void closeIncBatch() {
		ReportsPage.incArrow(driver).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@AfterTest
	private static void logout() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LogoutPage.tab(driver).click();
	}

	@AfterSuite
	void closeApp() {
		driver.quit();
	}
	
	
}


