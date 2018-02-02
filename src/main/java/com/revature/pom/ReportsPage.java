package com.revature.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReportsPage {
	
	static WebElement e = null;
	
	
	
	public static WebElement tab(WebDriver d) {
		e = d.findElement(By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[7]/a"));
		return e;
	}
	
	public static WebElement togglecontent1(WebDriver d) {
		e = d.findElement(By.xpath("/html/body/div/div[2]/div/md-card/md-card[1]/get-batch-gen-table-toolbar/md-toolbar/button[2]"));
		return e;
	}
	
	public static WebElement traineeneeded(WebDriver d) { 
		e = d.findElement(By.id("input_2")); 
		return e;
	}
	
	public static WebElement hiredate(WebDriver d) {
		e = d.findElement(By.id("input_3")); 
		return e;
	}
	
	public static WebElement curriculum(WebDriver d) {
		e = d.findElement(By.id("select_4"));
		return e;
	}
	
	public static WebElement curriculum_option(WebDriver d) {
		e = d.findElement(By.cssSelector("#select_option_22"));
		return e;
	}
	
	
	public static WebElement createbatch(WebDriver d) {
		e = d.findElement(By.xpath("//html/body/div/div[2]/div/md-card/md-card[1]/md-card-content/get-batch-gen-template/div/md-content[1]/div/md-card/md-card-content/div[3]/div"));
		
		return e;
	}
	
	public static WebElement createall(WebDriver d) {
		e = d.findElement(By.cssSelector("#batchCreate > get-batch-gen-template > div > md-content.md-padding._md.layout-xs-column.layout-align-center-center.layout-column.flex-20 > div > md-card > md-card-content > div.container > div"));
		return e;
	}
	
	public static WebElement addnew(WebDriver d) {
		e = d.findElement(By.cssSelector("#view > md-card > md-card.ng-scope._md > get-batch-gen-table-toolbar > md-toolbar > button:nth-child(3)"));
		return e;
	}

	
	// Graduate Summary
	public static WebElement togglecontent2(WebDriver d) {
		e = d.findElement(By.cssSelector("#view > md-card > md-card:nth-child(3) > get-grad-table-toolbar > md-toolbar > button:nth-child(6)"));
		return e;
	}
	
	public static WebElement settings(WebDriver d) {
		e = d.findElement(By.cssSelector("#view > md-card > md-card:nth-child(3) > get-grad-table-toolbar > md-toolbar > md-menu > button"));
		return e;
	}
	
	public static WebElement csv(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-card[2]/get-grad-table-toolbar/md-toolbar/button[1]"));
		return e;
	}
	
	public static WebElement year(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"input_44\"]")); 
		return e;
	}
	
	public static WebElement batch(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"input_45\"]"));
		return e;
	}
	
	
	// Incoming Trainee Summary
	public static WebElement togglecontent3(WebDriver d) {
		e = d.findElement(By.cssSelector("#view > md-card > md-card:nth-child(4) > get-train-table-toolbar > md-toolbar > button:nth-child(5)"));
		return e;
	}
	
	public static WebElement settings2(WebDriver d) {
		e = d.findElement(By.cssSelector("#view > md-card > md-card:nth-child(4) > get-train-table-toolbar > md-toolbar > md-menu > button"));
		return e;
	}
	
	public static WebElement csv2(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-card[3]/get-train-table-toolbar/md-toolbar/button[1]"));
		return e;
	}
	
	public static WebElement year2(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"input_50\"]")); 
		return e;
	}
	
	public static WebElement batch2(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"input_51\"]"));
		return e;
	}
	
	

	
	
	
	
	

}
