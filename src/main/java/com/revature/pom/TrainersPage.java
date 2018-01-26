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
	
	//Damon Salvatore
	public static WebElement trainerSalvatore(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content[1]/md-list/md-list-item[1]/div/button "));
		return element;
	}
	
	//Downloads Damon Salvatore resume
	public static WebElement trainerSalvatoreResume(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content[1]/md-list/md-list-item[1]/div/div[1]/button[1]/i "));
		return element;
	}
	
	//Nick Foles
	public static WebElement trainerFoles(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content[1]/md-list/md-list-item[2]/div/button "));
		return element;
	}
	
	//Downloads Nick Foles resume
	public static WebElement trainerFolesResume(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content[1]/md-list/md-list-item[2]/div/div[1]/button[1]/i"));
		return element;
	}

	//Steve Steves
	public static WebElement trainerSteves(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content[1]/md-list/md-list-item[3]/div/button"));
		return element;
	}
	
	//Downloads Steve Steves resume
	public static WebElement trainerStevesResume(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content[1]/md-list/md-list-item[3]/div/div[1]/button[1]/i "));
		return element;
	}
	
	//T TestingP
	public static WebElement trainerTestingP(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content[1]/md-list/md-list-item[4]/div/button"));
		return element;
	}
	
	//Download T TestingP Resume
	public static WebElement trainerTestingPResume(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content[1]/md-list/md-list-item[4]/div/div[1]/button[1]/i "));
		return element;
	}
	
	//TestTrainer
	public static WebElement trainerTesting(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content[1]/md-list/md-list-item[5]/div/button "));
		return element;
	}
	
	//Download TestTrainer Resume
	public static WebElement trainerTestingResume(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content[1]/md-list/md-list-item[5]/div/div[1]/button[1]/i "));
		return element;
	}
	
	//Tom Brady
	public static WebElement trainerTomBrady(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content[1]/md-list/md-list-item[6]/div/button"));
		return element;
	}
	
	//Download Tom Brady Resume
	public static WebElement trainerTomBradyResume(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content[1]/md-list/md-list-item[6]/div/div[1]/button[1]/i "));
		return element;
	}
	
	
	
	
	
	
	
}
