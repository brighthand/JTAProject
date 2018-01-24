package com.revature.pom;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		openApplication();
		testMethod();
		//driver.close();
	}
	
	private static void openApplication() {
		File f1 = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", f1.getAbsolutePath());
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://dev.assignforce.revaturelabs.com");
	}
	
	private static void testMethod() {
		LoginPage.user(driver).sendKeys("test.trainer@revature.com.int1");
		LoginPage.password(driver).sendKeys("p@$$w0rd2");
		LoginPage.submit(driver).click();
	}
	
	
	
	
	
	
	
	

}
