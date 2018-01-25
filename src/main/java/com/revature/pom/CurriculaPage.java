package com.revature.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CurriculaPage {

	static WebElement e = null;

	public static WebElement coreCurricula(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"coreArrow\"] "));
		return e;
	}
	
	public static WebElement focuses(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"focusArrow\"] "));
		return e;
	}
	
	
}
