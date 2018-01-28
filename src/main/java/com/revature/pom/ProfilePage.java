package com.revature.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilePage {
	
	private static WebElement element = null;
	
	//Trainer's tab
	public static WebElement tab(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[6]/a"));
		return element;
	}
	
	//Trainer's first name
	public static WebElement profileFirstName(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"input_1\"] "));
		return element;
	}
	
	//Trainer's last name
	public static WebElement profileLastName(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"input_2\"] "));
		return element;
	}
	
	//Trainer can add resume
	public static WebElement addResume(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"view\"]/md-card[1]/md-content[1]/div/div[3]/label/md-icon "));
		return element;
	}
	
	//Trainer can save resume
	public static WebElement saveResume(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"view\"]/md-card[1]/md-content[2]/md-toolbar/div/button/i "));
		return element;
	}
	
	//Trainer can select skill
	public static WebElement selectSkill(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"view\"]/md-card[1]/md-content[2]/div/md-chips/md-chips-wrap/md-chip[1]/div/span "));
		return element;
	}
	
	//Trainer current skill
	public static WebElement currentSkill(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"view\"]/md-card[1]/md-content[2]/div/md-list/button[1] "));
		return element;
	}
	
	//Trainer add certification
	public static WebElement addCertifications(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"view\"]/md-card[1]/md-content[3]/md-toolbar/div/label/md-icon "));
		return element;
	}
	
	
	
	
	

}
