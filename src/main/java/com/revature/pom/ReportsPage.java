package com.revature.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReportsPage {
	
	static WebElement e = null;
	
	
	
	public static WebElement tab(WebDriver d) {
		e = d.findElement(By.xpath("/html/body/div[1]/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[7]/a"));
		return e;
	}
	
	public static WebElement togglecontent1(WebDriver d) {
		e = d.findElement(By.cssSelector("#batchArrow"));
		return e;
	}
	
	public static WebElement traineeneeded(WebDriver d) { 
		e = d.findElement(By.cssSelector("#input_27")); 
		return e;
	}
	
	public static WebElement hiredate(WebDriver d) {
		e = d.findElement(By.cssSelector("#input_28")); 
		return e;
	}
	
	public static WebElement curriculum(WebDriver d) {
		e = d.findElement(By.cssSelector("#select_29"));
		return e;
	}
	
	public static WebElement curriculum_option(WebDriver d) {
		e = d.findElement(By.cssSelector("#select_option_35"));
		return e;
	}
	
	
	public static WebElement createbatch(WebDriver d) {
		e = d.findElement(By.cssSelector("#batchCreate > get-batch-gen-template > div > md-content.md-padding._md.layout-xs-column.layout-row.flex-80 > div > md-card > md-card-content > div.container > div"));
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
	//*[@id="input_2"]
	
	

	
	
	
	
	

}
