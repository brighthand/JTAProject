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
	/*
	public static WebElement reportsCandidates(WebDriver d) {
		e = d.findElement(By.id("input_287"));
		return e;
	}

	public static WebElement defaultBatchLocation(WebDriver d) {
		e = d.findElement(By.id("select_value_label_283"));
		return e;
	}

	public static WebElement defaultBatchBuilding(WebDriver d) {
		e = d.findElement(By.id("select_290"));
		return e;
	}
	public static WebElement minimumBatchSize(WebDriver d) {
		e = d.findElement(By.id("input_292"));
		return e;
	}
	public static WebElement maximumBatchSize(WebDriver d) {
		e = d.findElement(By.id("input_293"));
		return e;
	}
	public static WebElement defaultBatchLength(WebDriver d) {
		e = d.findElement(By.id("input_294"));
		return e;
	}
	public static WebElement minimumBatches(WebDriver d) {
		e = d.findElement(By.name("input_295"));
		return e;
	}
	*/

}
