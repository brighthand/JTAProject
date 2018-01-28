package com.revature.pom;

import org.openqa.selenium.By;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class TrainersPage {
	
static WebElement e = null;
	
	
//Trainer tab on nav bar
	public static WebElement tab(WebDriver driver) {
		e = driver.findElement(By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[5]/a/span/span "));
		return e;
	}
	
	public static WebElement cancelelement1(WebDriver driver) {
		e = driver.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content[2]/md-list/md-list-item[7]"));
		return e;
	}
	
	public static WebElement cancelelement2(WebDriver driver) {
		e = driver.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content[2]/md-list/md-list-item[8]"));
		return e;
	}
	
	public static WebElement cancelelement3(WebDriver driver) {
		e = driver.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content[2]/md-list/md-list-item[9]"));
		return e;
	}
	
	
	public static WebElement addTrainer(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-toolbar[1]/div/button[1]/md-icon"));
		return e;
	}
	
	
	public static WebElement FirstName(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"input_61\"]"));
		return e;
	}
	//*[@id="input_61"]
	
	public static WebElement LastName(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"input_62\"]"));
		return e;
	}
	//*[@id="input_44"]
	
	public static WebElement save(WebDriver d) {
		e = d.findElement(By.xpath("/html/body/div[3]/md-dialog/form/md-dialog-actions/button[1]"));
		return e;
	}
	
	public static WebElement cancel(WebDriver d) {
		e = d.findElement(By.xpath("/html/body/div[3]/md-dialog/form/md-dialog-actions/button[2]"));
		return e;
	}
	
	
	public static WebElement deactivate(WebDriver d, String row) {
		e = d.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content[1]/md-list/md-list-item[" + row + "]/div/div[1]/button[2]"));
		return e;
	}
	
	public static WebElement deactivate1(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content[1]/md-list/md-list-item[5]/div/div[1]/button[2]"));
		return e;
	}
	
	public static WebElement reactivate(WebDriver d, String row) {
		e = d.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content[2]/md-list/md-list-item[" + row + "]/button"));
		return e;
	}
	
	public static WebElement reactivate1(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content[2]/md-list/md-list-item[14]/button"));
		return e;
	}
	
	
	public static WebElement calendar(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-toolbar[1]/div/button[2]"));
		return e;
	}
	
	
	public static WebElement requestpto(WebDriver d) {
		e = d.findElement(By.xpath("//*[starts-with(@id=\"dialogContent_1\")]/md-dialog-actions/button[1]"));
		return e;
	}
	//*[@id="dialogContent_1"]/md-dialog-actions/button[1]
	
	public static WebElement cancelpto(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"dialogContent_1\"]/md-dialog-actions/button[2]"));
		return e;
	}
	
	public static WebElement requestpto_start(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"input_3\"]"));
		return e;
	}
	
	public static WebElement requestpto_start_year_month(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"md-2-year-2018-1-1\"]"));  
		return e;
	}
	//*[@id="md-2-year-2018-1-1"]
	//*[@id="md-1-year-2018-1-1"]
	//*[@id="md-2-year-2018-2-1"]
	//*[@id="md-2-year-2018-4-1"]
	//*[@id="md-2-year-2018-6-1"]
	
	//*[@id="md-3-year-2022-1-1"]
	
	public static WebElement requestpto_start_date(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"md-4-month-2018-1-9\"]"));
		return e;
	}
	//*[@id="md-1-month-2018-1-9"]
	//*[@id="md-5-month-2015-6-15"]
	//*[@id="md-2-month-2018-1-6"]
	//*[@id="md-4-month-2019-2-13"]
	
	
	public static WebElement requestpto_end(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"input_5\"]"));
		return e;
	}
	
	public static WebElement requestpto_end_year_month(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"md-5-year-2018-2-1\"]"));
		return e;
	}
	//*[@id="md-2-year-2018-2-1"]
	
	public static WebElement requestpto_end_date(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"md-5-month-2018-2-21\"]"));
		return e;
	}
	
	//*[@id="md-2-month-2018-2-5"]
	
	public static WebElement requestpto_send(WebDriver d) {
		e = d.findElement(By.xpath("/html/body/div[3]/md-dialog/form/md-dialog-actions/button[1]"));
		return e;
	}
	
	public static WebElement requestpto_cancel(WebDriver d) {
		e = d.findElement(By.xpath("/html/body/div[3]/md-dialog/form/md-dialog-actions/button[2]"));
		return e;
	}

	
}
