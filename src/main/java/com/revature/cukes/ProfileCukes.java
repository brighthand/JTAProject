package com.revature.cukes;

import org.openqa.selenium.WebDriver;

import com.revature.pom.ProfilePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProfileCukes {
	
	
	@Given("^I'm in the profile page$")
	public static void i_m_in_the_profile_page(WebDriver driver) throws Throwable {
	    ProfilePage.tab(driver).click();
	}

	@When("^I select a skill$")
	public static void i_select_a_skill(WebDriver driver) throws Throwable {
	    ProfilePage.selectSkill(driver).click();
	}

	
	@When("^I select a current skill$")
	public static void i_select_a_current_skill(WebDriver driver) throws Throwable {
	    ProfilePage.currentSkill(driver).click();
	}


	@Then("^I click the add certification button$")
	public static void i_click_the_add_certification_button(WebDriver driver) throws Throwable {
	    ProfilePage.addCertification(driver).click();
	}

	@Then("^I click the remove certification button$")
	public static void i_click_the_remove_certification_button(WebDriver driver) throws Throwable {
	    ProfilePage.removeCertification(driver).click();
	    
	}

	@Then("^I click the save skills button$")
	public static void i_click_the_save_skills_button(WebDriver driver) throws Throwable {
	    ProfilePage.saveSkills(driver).click();
	}

	
	
	
	
	
	
	
	
	
	
	
	

}
