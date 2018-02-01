package com.revature.cukes;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.revature.pom.CurriculaPage;
import com.revature.pom.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CurriculaCukes {
	
	@Given("^I'm on the curricula page$")
	public static void i_m_on_the_curricula_page(WebDriver driver) throws Throwable {
	    CurriculaPage.tab(driver).click();
	}

	@When("^I click the add new curriculum button$")
	public static void i_click_the_add_new_curriculum_button(WebDriver driver) throws Throwable {
	    CurriculaPage.addCurriculumButton(driver).click();
	}

	@Then("^Enter curriculum information$")
	public static void enter_curriculum_information(WebDriver driver) throws Throwable {
	    CurriculaPage.curriculumName(driver).sendKeys("Test Curricular");
	    CurriculaPage.curriculumSkills(driver).sendKeys("a");
	}
	
	@Then("^Edit curriculum information$")
	public static void edit_curriculum_information(WebDriver driver) throws Throwable {
	    CurriculaPage.curriculumName(driver).sendKeys("SQL");
	    CurriculaPage.curriculumSkills(driver).sendKeys("a");
	}

	@Then("^Click the save button$")
	public static void click_the_save_button(WebDriver driver) throws Throwable {
	    CurriculaPage.saveButton(driver).click();
	}

	@Then("^Click the cancel button$")
	public static void click_the_cancel_button(WebDriver driver) throws Throwable {
		 CurriculaPage.cancelButton(driver).click();
	}

	@When("^I click the toogle curricula button$")
	public static void i_click_the_toogle_curricula_button(WebDriver driver) throws Throwable {
	    CurriculaPage.toogleCoreCurricula(driver).click();
	}

	@Then("^I click the edit curricula button$")
	public static void i_click_the_edit_curricula_button(WebDriver driver) throws Throwable {
	    CurriculaPage.editCurriculumButton(driver).click();
	    
	}

	@Then("^I click the remove core button$")
	public static void i_click_the_remove_core_button(WebDriver driver) throws Throwable {
	    CurriculaPage.removeCoreButton(driver).click();
	}

	@Then("^Click the form remove button$")
	public static void click_the_form_remove_button(WebDriver driver) throws Throwable {
		 CurriculaPage.removeButton(driver).click();
	}

	@When("^I click the add new focus button$")
	public static void i_click_the_add_new_focus_button(WebDriver driver) throws Throwable {
	    CurriculaPage.addFocusButton(driver).click();
	    
	}

	@Then("^Enter focus information$")
	public static void enter_focus_information(WebDriver driver) throws Throwable {
	    CurriculaPage.curriculumName(driver).sendKeys("Test Focus");
	    CurriculaPage.curriculumSkills(driver).sendKeys("a");   
	}
	
	@Then("^Edit focus information$")
	public static void edit_focus_information(WebDriver driver) throws Throwable {
	    CurriculaPage.curriculumName(driver).sendKeys("Edit Test Focus");
	    CurriculaPage.curriculumSkills(driver).sendKeys("a");   
	}
	

	@When("^I click the toogle focus button$")
	public static void i_click_the_toogle_focus_button(WebDriver driver) throws Throwable {
	    CurriculaPage.toogleFocuses(driver).click();
	    
	}

	//Edit focus button
	@Then("^I click the edit focus button$")
	public static void i_click_the_edit_focus_button(WebDriver driver) throws Throwable {
	    CurriculaPage.editFocusButton(driver).click();
	    
	}

	//Remove focus button
	@Then("^I click the remove focus button$")
	public static void i_click_the_remove_focus_button(WebDriver driver) throws Throwable {
	    CurriculaPage.removeFocusButton(driver).click();
	    
	}

	//Toogle skills
	@When("^I click the toogle skills button$")
	public static void i_click_the_toogle_skills_button(WebDriver driver) throws Throwable {
		 CurriculaPage.toogleFocuses(driver).click();
	    
	}

	//Enter a new skill
	@When("^Enter a new skill$")
	public static void enter_a_new_skill(WebDriver driver) throws Throwable {
	    CurriculaPage.enterSkill(driver).sendKeys("Test Skills");
	    
	}

	//Create Button
	@Then("^Click the create button$")
	public static void click_the_create_button(WebDriver driver) throws Throwable {
	    CurriculaPage.createSkillButton(driver).click();
	}
	
	//Clear form
	@Then("^Clear form contents$")
	public static void clear_form_contents(WebDriver driver) throws Throwable {
	    CurriculaPage.curriculumName(driver).clear();
	}
	
}
