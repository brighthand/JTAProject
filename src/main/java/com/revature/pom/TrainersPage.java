package com.revature.pom;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class TrainersPage {
	
static WebElement e = null;
	
	
//Trainer tab on nav bar
	public static WebElement tab(WebDriver driver) {
		e = driver.findElement(By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[5]/a"));
		return e;
	}
	
	public static WebElement clickTrainer(WebDriver d) {
		e = d.findElement(By.xpath("/html/body/div/div[2]/div/md-card/md-content[1]/md-list/md-list-item[5]/div/button"));
		return e;
	}
	
	public static WebElement trainerFirstName(WebDriver d) {
		e = d.findElement(By.xpath("/html/body/div/div[2]/div/md-card[2]/md-content[1]/div/div[1]/form/md-input-container[1]/h3"));
		return e;
	}
	
	public static WebElement trainerLastName(WebDriver d) {
		e = d.findElement(By.xpath("/html/body/div/div[2]/div/md-card[2]/md-content[1]/div/div[1]/form/md-input-container[2]/h3"));
		return e;
	} 
	
	public static WebElement addTrainer(WebDriver d) {
		e = d.findElement(By.xpath("/html/body/div/div[2]/div/md-card/md-toolbar[1]/div/button[1]"));
		return e;
	}
	
	
	public static WebElement FirstName(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"input_1\"]"));
		return e;
	}
	//*[@id="input_61"]
	
	public static WebElement LastName(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"input_2\"]"));
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
	
	
	public static WebElement deactivate(WebDriver d) {
		// e = d.findElement(By.xpath("/html/body/div/div[2]/div/md-card/md-content[1]/md-list/md-list-item["+row+"]/div/div[1]/button[2]"));
		
		e = d.findElement(By.xpath("/html/body/div/div[2]/div/md-card/md-content[1]/md-list/md-list-item[5]/div/div[1]/button[2]"));
		return e;
	}
	
	public static WebElement deactivate1(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content[1]/md-list/md-list-item[5]/div/div[1]/button[2]"));
		return e;
	}
	
	public static WebElement reactivate(WebDriver d, String row) {
		e = d.findElement(By.xpath("/html/body/div/div[2]/div/md-card/md-content[2]/md-list/md-list-item["+row+"]/button"));
		return e;
	}
	
	public static WebElement calendar(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-toolbar[1]/div/button[2]"));
		return e;
	}
	
	
	public static WebElement requestpto(WebDriver d) {
		e = d.findElement(By.xpath("/html/body/div[3]/md-dialog/md-dialog-actions/button[1]"));
		return e;					
	}
	//*[@id="dialogContent_1"]/md-dialog-actions/button[1]
	
	public static WebElement cancelpto(WebDriver d) {
		e = d.findElement(By.xpath("/html/body/div[3]/md-dialog/md-dialog-actions/button[2]"));
		return e;
	}
	
	public static WebElement requestpto_start(WebDriver d) {
		e = d.findElement(By.xpath("/html/body/div[3]/md-dialog/form/md-dialog-content/div/md-input-container[1]/md-datepicker/div/button"));	//*[@id=\"input_3\"]"
		return e;
		
	}
	
	public static WebElement requestpto_start_year_month(WebDriver d) {
		e = d.findElement(By.xpath("/html/body/div[4]/div[2]/md-calendar/div/md-calendar-year/div/md-virtual-repeat-container/div/div[2]/table/tbody[4]/tr[1]/td[3]/span"));
		return e;
	}
	
	public static WebElement requestpto_start_year_month1(WebDriver d) {
		e = d.findElement(By.xpath("/html/body/div[4]/div[2]/md-calendar/div/md-calendar-year/div/md-virtual-repeat-container/div/div[2]/table/tbody[4]/tr[1]/td[5]/span"));  
		return e;
	}
	
	public static WebElement requestpto_start_date(WebDriver d) {
		e = d.findElement(By.xpath("/html/body/div[4]/div[2]/md-calendar/div/md-calendar-month/div/md-virtual-repeat-container/div/div[2]/table/tbody[4]/tr[2]/td[5]/span"));
		return e;
	}
	
	public static WebElement requestpto_start_date1(WebDriver d) {
		e = d.findElement(By.xpath("/html/body/div[4]/div[2]/md-calendar/div/md-calendar-month/div/md-virtual-repeat-container/div/div[2]/table/tbody[4]/tr[3]/td[2]/span"));
		return e;
	}
	
	public static WebElement requestpto_end(WebDriver d) {
		e = d.findElement(By.xpath("/html/body/div[3]/md-dialog/form/md-dialog-content/div/md-input-container[2]/md-datepicker/div[1]"));
		return e;
	}
	
	public static WebElement requestpto_end_year_month(WebDriver d) {
		e = d.findElement(By.xpath("/html/body/div[4]/div[2]/md-calendar/div/md-calendar-year/div/md-virtual-repeat-container/div/div[2]/table/tbody[4]/tr[1]/td[4]/span"));
		return e;
	}
	
	public static WebElement requestpto_end_date(WebDriver d) {
		e = d.findElement(By.xpath("/html/body/div[4]/div[2]/md-calendar/div/md-calendar-month/div/md-virtual-repeat-container/div/div[2]/table/tbody[4]/tr[2]/td[6]/span"));
		return e;
	}
	
	public static WebElement requestpto_end_year_month1(WebDriver d) {
		e = d.findElement(By.xpath("/html/body/div[4]/div[2]/md-calendar/div/md-calendar-year/div/md-virtual-repeat-container/div/div[2]/table/tbody[4]/tr[1]/td[6]/span"));
		return e;
	}
	
	public static WebElement requestpto_end_date1(WebDriver d) {
		e = d.findElement(By.xpath("/html/body/div[4]/div[2]/md-calendar/div/md-calendar-month/div/md-virtual-repeat-container/div/div[2]/table/tbody[4]/tr[3]/td[1]/span"));
		return e;
	}
	
	
	public static WebElement requestpto_send(WebDriver d) {
		e = d.findElement(By.xpath("/html/body/div[3]/md-dialog/form/md-dialog-actions/button[1]"));
									
		return e;
	}
	
	public static WebElement requestpto_cancel(WebDriver d) {
		e = d.findElement(By.xpath("/html/body/div[3]/md-dialog/form/md-dialog-actions/button[2]"));
		return e;
	}
	
	public static int  size_of_inactivetrainers(WebDriver d) {
		List<WebElement> list = d.findElements(By.xpath("//*[@id=\"view\"]/md-card/md-content[2]/md-list/*"));

		return list.size();
	}
	
	public static int  size_of_activetrainers(WebDriver d) {
		List<WebElement> list = d.findElements(By.xpath("//*[@id=\"view\"]/md-card/md-content[1]/md-list/*"));

		return list.size();
	}
	
	public static WebElement account(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"view_container\"]/form/div[2]/div/div/div/ul/li[1]/div"));
		return e;
		
	}
	
	
	
	public static WebElement allow(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"submit_approve_access\"]/content/span"));
		return e;
		
	}
	
	public static WebElement signin(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"identifierId\"]"));
		return e;
		
	}
	
	public static WebElement next(WebDriver d) {
		e = d.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/form/div[2]/div/div[2]/div[1]/div/content/span"));
		return e;
		
	}
	
	public static WebElement pagedisplayed(WebDriver d) {
		e = d.findElement(By.xpath("/html/body/div"));
		return e;
	}
	
	
	
	
}
