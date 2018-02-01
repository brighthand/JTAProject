package com.revature.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CurriculaPage {

	static WebElement element = null;

	public static WebElement tab(WebDriver d) {
		element = d.findElement(By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[4]/a/span/span"));
		return element;
	}
	
	public static WebElement toogleCoreCurricula(WebDriver d) {
		element = d.findElement(By.xpath("//*[@id=\"coreArrow\"]"));
		return element;
	}
	
	public static WebElement toogleFocuses(WebDriver d) {
		element = d.findElement(By.xpath("//*[@id=\"focusArrow\"]"));
		return element;
	}
	
	public static WebElement toogleSkills(WebDriver d) {
		element = d.findElement(By.xpath("//*[@id=\"skillArrow\"]"));
		return element;
	}
	
	public static WebElement add(WebDriver d, String row) {
		element = d.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content/md-card[" + row + "]/md-toolbar/div/button[1]/md-icon "));
		return element;
	}
	
	//Substitute core with name i.e focus
	public static WebElement edit(WebDriver d, String name) {
		element = d.findElement(By.xpath("//*[@id=\"core\"]/md-list/md-list-item[1]/button[1]/i "));
		return element;
	}
	
	//Substitute core with name i.e focus and md-list-item with row
	public static WebElement remove(WebDriver d, String name, String row) {
		element = d.findElement(By.xpath("//*[@id=\"core\"]/md-list/md-list-item[1]/button[2]/i "));
		return element;
	}
	
	public static WebElement enterSkill(WebDriver d) {
		element = d.findElement(By.xpath("//*[@id=\"input_1\"]"));
		return element;
	}

	public static WebElement createSkill(WebDriver d) {
		element = d.findElement(By.xpath("//*[@id=\"skill\"]/form/div/div/div/span "));
		return element;
	}
	
}