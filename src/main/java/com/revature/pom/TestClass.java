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
		testOverviewMethod();
		driver.close();
	}
	
	private static void openApplication() {
		File f1 = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", f1.getAbsolutePath());
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://dev.assignforce.revaturelabs.com");
	}
	
	private static void testLoginMethod() {
		LoginPage.user(driver).sendKeys("test.trainer@revature.com.int1");
		LoginPage.password(driver).sendKeys("p@$$w0rd2");
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
		
		//Testing 
		OverviewPage.exportCSV(driver).click();
	}
	
	
	
	
	
	
	
	
	

}
