package com.revature.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OverviewPage {

	private static WebElement element = null;

	
	public static WebElement tab(WebDriver driver) {
		element = driver.findElement(
				By.xpath("/html/body/div[1]/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[1]/a"));
		return element;
	}
	
	public static WebElement filterLabel(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"view\"]/div/md-card/md-toolbar/div[1]/span"));
		return element;                       
	}

	// Clicking the filter button to reveal options
	public static WebElement filterButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"view\"]/div/md-card/md-toolbar/md-menu/button"));
		return element;                       //*[@id="view"]/div/md-card/md-toolbar/md-menu/button
	}                             
	
	// Filter In progress
	public static WebElement filterInProgress(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"menu_container_1\"]/md-menu-content/md-menu-item[1]/button"));
		return element;                          //*[@id="menu_container_1"]/md-menu-content/md-menu-item[1]/button
	}
	
	// Filter Begin in two weeks
	public static WebElement filterBegTwoWeeks(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"menu_container_0\"]/md-menu-content/md-menu-item[2]/button"));
		return element;                      
	}                                         

	// Filter All
	public static WebElement filterAll(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"menu_container_0\"]/md-menu-content/md-menu-item[3]/button"));
		return element;                       
	}                                          //*[@id=\"menu_container_1\"]/md-menu-content/md-menu-item[3]/button"
	
	// Testing the export csv functionality
	public static WebElement exportCSVButton(WebDriver driver) {
		element = driver.findElement(By.xpath(" //*[@id=\"view\"]/div/md-card/md-toolbar/div[1]/button"));
		return element;                         
	}

}
