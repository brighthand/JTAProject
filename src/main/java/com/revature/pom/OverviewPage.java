package com.revature.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OverviewPage {
	
	private static WebElement element = null;
	
	//Clicking the filter button to reveal options
	public static WebElement filter(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"view\"]/div/md-card/md-toolbar/md-menu/button/md-icon"));
		return element;
	}
	
	//In progress, Begin in two weeks, All
	public static WebElement filterOptions(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"menu_container_0\"]/md-menu-content/md-menu-item[2]/button"));
		return element;
	}
	

	
	//Testing the export csv functionality
	public static WebElement exportCSV(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"view\"]/div/md-card/md-toolbar/div[1]/button/md-icon"));
		return element;
	}
	
	
	
	

}
