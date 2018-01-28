package com.revature.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocationsPage {

	private static WebElement element = null;
	
	
	public static WebElement tab(WebDriver driver) {
		element = driver.findElement(By.xpath(" /html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[3]/a/span/span "));
		return element;
	}
	
	public static WebElement revatureHQLocation(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content/md-list/md-list-item[1]/div[1]/button "));
		return element;
	}
	
	public static WebElement revature11730Location(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"loc1\"]/md-list-item/div/button "));
		return element;
	}
	
	public static WebElement cunyQueensLocation(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"loc3\"]/md-list-item[1]/div/button "));
		return element;
	}
	
	public static WebElement cunySPSLocation(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"loc3\"]/md-list-item[2]/div/button "));
		return element;
	}
	
	
	public static WebElement nycLocation(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content/md-list/md-list-item[2]/div[1]/button "));
		return element;
	}
	
	
}
