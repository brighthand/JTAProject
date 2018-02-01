package com.revature.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CurriculaPage {

	static WebElement element = null;

	public static WebElement tab(WebDriver d) {
		element = d.findElement(By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[4]/a/span/span"));
		return element;
	}
	
	//************** TOOGLE BUTTONS ***********************
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
	
	//**************LABELS ****************************
	public static WebElement curriculaLabel(WebDriver d) {
		element = d.findElement(By.xpath("//*[@id=\"core\"]/md-list/md-list-item[1]/div[1]/h3"));
		return element;
	}
	
	public static WebElement curriculaSkillsLabel(WebDriver d) {
		element = d.findElement(By.xpath("//*[@id=\"core\"]/md-list/md-list-item[1]/div[1]/p"));
		return element;
	}
	
	public static WebElement focusLabel(WebDriver d) {
		element = d.findElement(By.xpath("//*[@id=\"focus\"]/md-list/md-list-item[1]/div[1]/h3"));
		return element;
	}
	
	public static WebElement focusSkillsLabel(WebDriver d) {
		element = d.findElement(By.xpath("//*[@id=\"focus\"]/md-list/md-list-item[1]/div[1]/p"));
		return element;
	}

	//********************ADD BUTTONS ****************************
	public static WebElement addCurriculumButton(WebDriver d) {
		element = d.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content/md-card[1]/md-toolbar/div/button[1]"));
		return element;                  
	}
	
	public static WebElement addFocusButton(WebDriver d) {
		element = d.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content/md-card[2]/md-toolbar/div/button[1]"));
		return element;                //*[@id="view"]/md-card/md-content/md-card[2]/md-toolbar/div/button[1]
	}
	
	
	//********************EDIT BUTTONS ****************************
	public static WebElement editCurriculumButton(WebDriver d) {
		element = d.findElement(By.xpath("//*[@id=\"core\"]/md-list/md-list-item[1]/button[1]"));
		return element;                 
	}

	public static WebElement editFocusButton(WebDriver d) {
		element = d.findElement(By.xpath("//*[@id=\"focus\"]/md-list/md-list-item[1]/button[1]"));
		return element;
	}
	
	//*********************REMOVE BUTTONS **************************************
	public static WebElement removeCoreButton(WebDriver d) {
		element = d.findElement(By.xpath("//*[@id=\"core\"]/md-list/md-list-item[1]/button[2]"));
		return element;                   //*[@id="core"]/md-list/md-list-item[1]/button[2]
	}                                     //*[@id="core"]/md-list/md-list-item[1]/button[2] 

	public static WebElement removeFocusButton(WebDriver d) {
		element = d.findElement(By.xpath("//*[@id=\"focus\"]/md-list/md-list-item[2]/button[2]"));
		return element;
	}
	
	//*****************CREATE NEW SKILLS *********************************************
	public static WebElement enterSkill(WebDriver d) {
		element = d.findElement(By.xpath("//*[@id=\"input_1\"]"));
		return element;
	}

	public static WebElement createSkillButton(WebDriver d) {
		element = d.findElement(By.xpath("//*[@id=\"skill\"]/form/div/div/div/span "));
		return element;
	}
	
	//********************* ADD NEW CURRICULUM FORM ****************************************
	//********************* Same as edit curriculum and edit focus **************************
	
	//Curriculum text field in add, edit form
	public static WebElement curriculumName(WebDriver d) {
		element = d.findElement(By.cssSelector("h4 + input[id^=\"input_\"]"));
		return element;                       //*[@id="input_471"]
	}

	//Curriculum skills drop down menu
	public static WebElement curriculumSkills(WebDriver d) {
		element = d.findElement(By.cssSelector("h4 + [id^=\"select_\"]"));
		return element;
	}
	
	public static WebElement cancelButton(WebDriver d) {
		element = d.findElement(By.xpath("/html/body/div[3]/md-dialog/md-dialog-actions/button[1]"));
		return element;
	}
	
	public static WebElement saveButton(WebDriver d) {
		element = d.findElement(By.xpath("/html/body/div[3]/md-dialog/md-dialog-actions/button[2]"));
		return element;               //  /html/body/div[3]/md-dialog/md-dialog-actions/button[2]
	}
	
	//*********************REMOVE DIALOG BOX ****************************************
	//********************* Same as remove curricular and remove focus**************************
	
	public static WebElement removeButton(WebDriver d) {
		element = d.findElement(By.xpath("html/body/div[3]/md-dialog/md-dialog-actions/button[2]"));
		return element;             
	}                              
	
	//Cancel button in remove dialog box
	public static WebElement rCancelButton(WebDriver d) {
		element = d.findElement(By.xpath("/html/body/div[3]/md-dialog/md-dialog-actions/button[2]"));
		return element;                   
	}
	
	
	//*************NUMBER OF ELEMENTS IN THE LIST*************************
	public static int curriculaListSize(WebDriver driver) {
		// int size = 0;
		List<WebElement> list = driver
				.findElements(By.xpath("//*[@id=\"core\"]/md-list/*"));
		                                 
		return list.size();             
	}
	
	public static int focusListSize(WebDriver driver) {
		// int size = 0;
		List<WebElement> list = driver
				.findElements(By.xpath("//*[@id=\"focus\"]/md-list/*"));
		                                 
		return list.size();             
	}
	
	

	
}
