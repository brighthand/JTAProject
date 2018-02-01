package com.revature.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GlobalSettingsPage {

	static WebElement e = null;
	
	public static WebElement tab(WebDriver d) {
		// /html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[8]/a
		// /html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[8]/a
	
		e = d.findElement(By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[8]/a"));
		return e;
	}
		
	public static WebElement timelineTypeVP(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"input_3\"]"));
		return e;
	}
	
	//*[@id="input_4"]
	//*[@id="input_4"]
	
	public static WebElement reportsGrads(WebDriver d) { 
		e = d.findElement(By.xpath("//*[@id=\"input_4\"]"));
		return e;
	}
	
	//*[@id="input_5"]
	//*[@id="input_5"]
	public static WebElement reportsCandidates(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"input_5\"]"));
		return e;
	}
	
	
	
	public static WebElement defaultBatchLocation(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"select_value_label_1\"]"));
		return e;
		
	}
	
	//*[@id="select_option_18"]
	//*[@id="select_option_17"]
	
	
	//*[@id=\"select_option_17\"]
	public static WebElement defaultBatchLocation_option(WebDriver d, String num) {
		e = d.findElement(By.xpath("//*[@id=\"select_option_"+num+"\"]"));
		return e;
	}
	
	//*[@id="select_8"]
	//*[@id="select_8"]
	//*[@id="select_8"]
	public static WebElement defaultBatchBuilding(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"select_8\"]"));
		return e;
	}
	
	//*[@id="select_option_30"]
	//*[@id="select_option_27"]
	//*[@id=\"select_option_31\"]
	public static WebElement defaultBatchBuilding_option(WebDriver d, String num) {
		e = d.findElement(By.xpath("//*[@id=\"select_option_"+num+"\"]"));
		return e;
	}
	
	//*[@id="input_10"]
	//*[@id="input_10"]
	public static WebElement minimumBatchSize(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"input_10\"]"));
		return e;
	}
	
	//*[@id="input_11"]
	//*[@id="input_11"]
	public static WebElement maximumBatchSize(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"input_11\"]"));
		return e;
	}
	
	//*[@id="input_12"]
	//*[@id="input_12"]
	public static WebElement defaultBatchLength(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"input_12\"]"));
		return e;
	}
	
	//*[@id="input_13"]
	//*[@id="input_13"]
	public static WebElement minimumBatches(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"input_13\"]"));
		return e;
	}
	
	public static WebElement save(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content/md-list/section/button[1]"));
		return e;
	}
	
	public static WebElement reset(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content/md-list/section/button[2]"));
		return e;
	}
	
	public static WebElement okay(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content/md-list/section/button[1]"));
		return e;
	}
	

}
