package com.revature.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GlobalSettingsPage {

	static WebElement e = null;

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
		e = d.findElement(By.xpath("//*[@id=\"select_value_label_1\"]"));
		return e;
	}

	public static WebElement defaultBatchBuilding(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"select_8\"]"));
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
