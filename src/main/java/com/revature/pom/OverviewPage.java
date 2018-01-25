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
	
	public static WebElement inProgress(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"menu_container_0\"]/md-menu-content/md-menu-item[1]/button"));
		return element;
	}
	
	public static WebElement begTwoWeeks(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"menu_container_0\"]/md-menu-content/md-menu-item[2]/button/span"));
		return element;
	}
	
	public static WebElement all(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"menu_container_0\"]/md-menu-content/md-menu-item[3]/button"));
		return element;
	}
	

}
