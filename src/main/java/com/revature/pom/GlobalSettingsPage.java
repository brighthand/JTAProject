package com.revature.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GlobalSettingsPage {

	static WebElement e = null;
	
	public static WebElement tab(WebDriver d) {
		e = d.findElement(By.xpath("/html/body/div[1]/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[8]/a"));
		return e;
	}
	
	//elementfindbyModel
	public static WebElement timelineType(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"input_3\"]"));
		return e;
	}

	public static WebElement reportsGrads(WebDriver d) { 
		e = d.findElement(By.xpath("//*[@id=\"input_4\"]"));
		return e;
	}
	
	public static WebElement reportsCandidates(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"input_5\"]"));
		return e;
	}

	public static WebElement defaultBatchLocation(WebDriver d) {
		e = d.findElement(By.cssSelector("#select_value_label_1"));
		// e = d.findElement(By.xpath("//*[@id=\"select_option_16\"]"));
		return e;
		//*[@id="select_value_label_108"]
		//*[@id="view"]/md-card/md-content/md-list/md-list-item[4]
		//*[@id="select_value_label_108"]
	}
	public static WebElement defaultBatchLocation_option(WebDriver d) {
		e = d.findElement(By.cssSelector("#select_option_17"));
		return e;
	}
	public static WebElement defaultBatchBuilding(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"select_8\"]"));
		return e;
	}
	public static WebElement defaultBatchBuilding_option(WebDriver d) {
		e = d.findElement(By.cssSelector("#select_option_25"));
		return e;
	}
	public static WebElement minimumBatchSize(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"input_10\"]"));
		return e;
	}
	public static WebElement maximumBatchSize(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"input_11\"]"));
		return e;
	}
	public static WebElement defaultBatchLength(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"input_12\"]"));
		return e;
	}
	public static WebElement minimumBatches(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"input_13\"]"));
		return e;
	}
	

}
