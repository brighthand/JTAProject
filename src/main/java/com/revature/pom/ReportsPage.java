package com.revature.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReportsPage {
	
	static WebElement e = null;
	/*
	@FindBy(xpath = "//*[@id=\"batchArrow\"]")
	public WebElement batchArrow;
	@FindBy(xpath = "//*[@id=\"input_2\"]")
	public static WebElement numOfTrainees;
	@FindBy(xpath = "//*[@id=\"view\"]/md-card/md-card[1]/get-batch-gen-table-toolbar/md-toolbar/button[1]/md-icon")
	public WebElement addBatch;
	@FindBy(xpath = "//*[@id=\"batchCreate\"]/get-batch-gen-template/div/md-content[2]/div/md-card/md-card-content/div[7]/div")
	public WebElement createAll;
	@FindBy(xpath = "//*[@id=\"batchCreate\"]/get-batch-gen-template/div/md-content[1]/div/md-card/md-card-content/md-card-title/button")
	public WebElement deleteBatch;
	@FindBy(xpath = "//*[@id=\"batchCreate\"]/get-batch-gen-template/div/md-content[1]/div/md-card/md-card-content/div[3]/div")
	public WebElement createBatch;
	@FindBy(xpath = "//*[@id=\"select_140\"]")
	public WebElement selectCurr;
	// graduated section
	@FindBy(xpath = "//*[@id=\"gradArrow\"]")
	public WebElement gradArrow;
	@FindBy(xpath = "//*[@id=\"view\"]/md-card/md-card[2]/get-grad-table-toolbar/md-toolbar/button[1]/md-icon")
	public WebElement downloadGrad;
	@FindBy(xpath = "//*[@id=\"view\"]/md-card/md-card[2]/get-grad-table-toolbar/md-toolbar/md-menu/button/md-icon")
	public WebElement gradSettings;
	@FindBy(xpath = "//*[@id=\"gradTable\"]/md-card[1]/get-grad-table-template/md-table-container/table/thead/tr/th[1]/md-icon")
	public WebElement gradCurricSort;
	// incoming section
	@FindBy(xpath = "//*[@id=\"incArrow\"]")
	public WebElement incArrow;
	@FindBy(xpath = "//*[@id=\"view\"]/md-card/md-card[3]/get-train-table-toolbar/md-toolbar/button[1]/md-icon")
	public WebElement downloadInc;
	@FindBy(xpath = "//*[@id=\"view\"]/md-card/md-card[3]/get-train-table-toolbar/md-toolbar/md-menu/button/md-icon")
	public WebElement incSettings;
	@FindBy(xpath = "//*[@id=\"incomingTable\"]/md-card[1]/get-train-table-template/div/div/md-table-container/table/thead/tr/th[1]/md-icon")
	public WebElement incCurricSort;
	
	*/
	
	
	public static WebElement tab(WebDriver d) {
		e = d.findElement(By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[7]/a"));
<<<<<<< HEAD
=======
		return e;
	}
	
	public static WebElement batchArrow(WebDriver d) {
		e = d.findElement(By.id("batchArrow"));
		// /html/body/div/div[2]/div/md-card/md-card[1]/get-batch-gen-table-toolbar/md-toolbar/button[2]
		return e;
	}
	
	public static WebElement numOfTrainees(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"input_2\"]"));	
		//*[@id="input_2"]
		return e;
	}
	
	public static WebElement addBatch(WebDriver d) { 
		e = d.findElement(By.xpath("/html/body/div/div[2]/div/md-card/md-card[1]/get-batch-gen-table-toolbar/md-toolbar/button[1]"));
		// e = d.findElement(By.xpath("//*[@id=\"input_2\"]")); 
		
		//*[@id="input_2"]
		return e;
	}
	
	public static WebElement createAll(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"batchCreate\"]/get-batch-gen-template/div/md-content[2]/div/md-card/md-card-content/div[7]/div")); 
		//*[@id="select_3"]
		return e;
	}
	
	public static WebElement deleteBatch(WebDriver d) {
		// e = d.findElement(By.id("select_7"));
		e = d.findElement(By.xpath("//*[@id=\\\"batchCreate\\\"]/get-batch-gen-template/div/md-content[1]/div/md-card/md-card-content/md-card-title/button"));
		return e;
	}
	
	public static WebElement createBatch(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\\\"batchCreate\\\"]/get-batch-gen-template/div/md-content[1]/div/md-card/md-card-content/div[3]/div"));
		//e = d.findElement(By.xpath("/html/body/div[1]/div[2]/div/md-card/md-card[1]/md-card-content/get-batch-gen-template/div/md-content[1]/div/md-card/md-card-content/div[3]/div"));
		//*[@id="batchCreate"]
		// e = d.findElement(By.xpath("//*[@id=\\\"batchCreate\\\"]/get-batch-gen-template/div/md-content[1]/div/md-card/md-card-content/div[3]/div"));
		return e;
	}
	
	public static WebElement selectCurr(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"select_4\"]"));
		// e = d.findElement(By.xpath("//*[@id=\\\"select_140\\\"]"));
		return e;
	}
	
	public static WebElement gradArrow(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"gradArrow\"]"));
		
		return e;
	}
	
	public static WebElement downloadGrad(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-card[2]/get-grad-table-toolbar/md-toolbar/button[1]/md-icon"));
		
		return e;
	}
	
	public static WebElement gradSettings(WebDriver d) {
		e = d.findElement(By.xpath("/html/body/div[1]/div[2]/div/md-card/md-card[1]/md-card-content/get-batch-gen-template/div/md-content[2]/div/md-card/md-card-content/div[7]/div"));
		return e;
	}
	
	public static WebElement gradCurricSort(WebDriver d) {
		e = d.findElement(By.xpath("/html/body/div/div[2]/div/md-card/md-card[1]/get-batch-gen-table-toolbar/md-toolbar/button[1]"));
		// get-batch-gen-table-toolbar.ng-scope > md-toolbar:nth-child(1) > button:nth-child(3)
		// #view > md-card > md-card.ng-scope._md > get-batch-gen-table-toolbar > md-toolbar > button:nth-child(3)
		return e;
	}
	
	public static WebElement incArrow(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"incArrow\"]"));
		
		return e;
	}
	
	// Graduate Summary
	public static WebElement downloadInc(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-card[3]/get-train-table-toolbar/md-toolbar/button[1]/md-icon"));
		return e;
	}
	
	public static WebElement incSettings(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"incomingTable\"]/md-card[1]/get-train-table-template/div/div/md-table-container/table/thead/tr/th[1]/md-icon"));
		return e;
	}
	

	
	
	
	
	

}

	
	
	
	
	
	
	
	
	
	
	
	/*
	public static WebElement tab(WebDriver d) {
		e = d.findElement(By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[7]/a"));
>>>>>>> stephen_oduor_backup
		return e;
	}
	
	public static WebElement togglecontent1(WebDriver d) {
<<<<<<< HEAD
		e = d.findElement(By.xpath("/html/body/div/div[2]/div/md-card/md-card[1]/get-batch-gen-table-toolbar/md-toolbar/button[2]"));
=======
		e = d.findElement(By.xpath("/html/body/div/div[2]/div/md-card/md-card[1]/get-batch-gen-table-toolbar/md-toolbar/button[2]"));							
>>>>>>> stephen_oduor_backup
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
<<<<<<< HEAD
		e = d.findElement(By.id("select_4"));
=======
		// e = d.findElement(By.id("select_7"));
		e = d.findElement(By.xpath("//*[@id=\"select_4\"]"));
>>>>>>> stephen_oduor_backup
		return e;
	}
	
	public static WebElement curriculum_option(WebDriver d) {
<<<<<<< HEAD
		e = d.findElement(By.cssSelector("#select_option_22"));
=======
		e = d.findElement(By.xpath("//*[@id=\"select_option_26\"]"));
		return e;
	}
	
	public static WebElement curriculum1(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\\\"select_4\\\"]"));
>>>>>>> stephen_oduor_backup
		return e;
	}
	
	public static WebElement curriculum_option1(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"select_option_11\"]"));
		return e;
	}
	
	public static WebElement createbatch(WebDriver d) {
<<<<<<< HEAD
		e = d.findElement(By.xpath("//html/body/div/div[2]/div/md-card/md-card[1]/md-card-content/get-batch-gen-template/div/md-content[1]/div/md-card/md-card-content/div[3]/div"));
=======
		e = d.findElement(By.xpath("/html/body/div[1]/div[2]/div/md-card/md-card[1]/md-card-content/get-batch-gen-template/div/md-content[1]/div/md-card/md-card-content/div[3]/div"));
>>>>>>> stephen_oduor_backup
		
		return e;
	}
	
	public static WebElement createall(WebDriver d) {
		e = d.findElement(By.xpath("/html/body/div[1]/div[2]/div/md-card/md-card[1]/md-card-content/get-batch-gen-template/div/md-content[2]/div/md-card/md-card-content/div[7]/div"));
		return e;
	}
	
	public static WebElement addnew(WebDriver d) {
		e = d.findElement(By.xpath("/html/body/div/div[2]/div/md-card/md-card[1]/get-batch-gen-table-toolbar/md-toolbar/button[1]"));
		// get-batch-gen-table-toolbar.ng-scope > md-toolbar:nth-child(1) > button:nth-child(3)
		// #view > md-card > md-card.ng-scope._md > get-batch-gen-table-toolbar > md-toolbar > button:nth-child(3)
		return e;
	}
	
	public static WebElement removecard(WebDriver d) {
		e = d.findElement(By.xpath("/html/body/div/div[2]/div/md-card/md-card[1]/md-card-content/get-batch-gen-template/div/md-content[1]/div/md-card/md-card-content/md-card-title/button"));
		
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
<<<<<<< HEAD
	
	
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
=======
>>>>>>> stephen_oduor_backup
	
	
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
	
	

	*/
	
	
	
