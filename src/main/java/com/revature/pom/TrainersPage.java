package com.revature.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TrainersPage {
	
	private static WebElement element = null;
	
	//Trainer tab on nav bar
	public static WebElement tab(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[5]/a/span/span "));
		return element;
	}
	
	//Trainer tab
	public static WebElement trainer(WebDriver driver, String row) {
		element = driver.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content[1]/md-list/md-list-item[" + row + "]/div/button"));
		return element;
	}
	
	//Download Trainer Resume
	public static WebElement trainerResume(WebDriver driver, String row) {
		element = driver.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content[1]/md-list/md-list-item[" + row + "]/div/div[1]/button[1]/i "));
		return element;
	}
	
	//*[@id="view"]/md-card/md-content[1]/md-list/md-list-item[3]/div/button
	
	
	
	
	
	
	
}
