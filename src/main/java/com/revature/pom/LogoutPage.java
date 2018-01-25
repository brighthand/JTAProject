package com.revature.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutPage {

	private static WebElement element = null;
	
	public static WebElement logout(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[9]/button/span/span "));
		return element;
	}
	
	
}
