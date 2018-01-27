package com.revature.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReportsPage {
	
	static WebElement e = null;
	
	public static WebElement waitForLoad(WebDriver driver, String xpath) {
        int times = 0;
        WebElement element = null;
        while(element == null) {
            try {
                element = driver.findElement(By.xpath(xpath));
            } catch(NoSuchElementException e) {
                if(times < 20) {
                    try {
                        times++;
                        Thread.sleep(200);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                }
                else {
                    e.printStackTrace();
                    throw new NoSuchElementException("Element did not load in time", e);
                }
            }
        }
        return element;
    }
	
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
	
	
	
	

}
