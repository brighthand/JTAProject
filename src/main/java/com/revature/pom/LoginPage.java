	package com.revature.pom;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	//The Login page object model

	public class LoginPage {
		
		private static WebElement element = null;
		
		public static WebElement user(WebDriver driver) {
			element = driver.findElement(By.name("username"));
			return element;
		}
		
		public static WebElement password(WebDriver driver) {
			element = driver.findElement(By.name("pw"));
			return element;
		}
		
		public static WebElement submit(WebDriver driver) {
			element = driver.findElement(By.name("Login"));
			return element;
		}

}
