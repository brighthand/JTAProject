package com.revature.cukes;

import org.openqa.selenium.WebDriver;

import com.revature.pom.ReportsPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ReportsCukes {
	/*
	
	static WebDriver driver = null;
	
	@Given("^I clicked on the Reports tab$")
	public static void i_clicked_on_the_Reports_tab(WebDriver driver) throws Throwable {
		ReportsPage.tab(driver).click();
	}

	@When("^I clicked on toggled content$")
	public static void i_clicked_on_toggled_content(WebDriver driver) throws Throwable {
	    ReportsPage.togglecontent1(driver).click();
	}

	@When("^I entered (\\d+) as the number of trainee's needed$")
	public static void i_entered_as_the_number_of_trainee_s_needed(WebDriver driver) throws Throwable {
		ReportsPage.traineeneeded(driver).sendKeys(String.valueOf(28));
	}

	@When("^I entered the hire date as (\\d+)/(\\d+)/(\\d+)$")
	public static void i_entered_the_hire_date_as(WebDriver driver) throws Throwable {
		ReportsPage.hiredate(driver).sendKeys("12152018");
	}

	@When("^I entered Java as the curriculum$")
	public static void i_entered_Java_as_the_curriculum(WebDriver driver) throws Throwable {
		ReportsPage.curriculum(driver).click();
		ReportsPage.curriculum_option(driver).click();
	}

	@When("^I clicked create batch$")
	public static void i_clicked_create_batch(WebDriver driver) throws Throwable {
		ReportsPage.createbatch(driver).click();
	}

	@Then("^I should be able to see successfully created batch popup message$")
	public static void i_should_be_able_to_see_successfully_created_batch_popup_message(WebDriver driver) throws Throwable {
	    
	}

	@Given("^I click on the Reports tab$")
	public static void i_click_on_the_Reports_tab(WebDriver driver) throws Throwable {
		ReportsPage.tab(driver).click();
	}

	@When("^I click on toggled content$")
	public static void i_click_on_toggled_content(WebDriver driver) throws Throwable {
		ReportsPage.togglecontent1(driver).click();
	}

	@When("^I entered (\\d+) as the amount of trainee's needed$")
	public static void i_entered_as_the_amount_of_trainee_s_needed(WebDriver driver) throws Throwable {
		ReportsPage.traineeneeded(driver).sendKeys(String.valueOf(24));
	}

	@When("^I selected Java-TEST as curriculum$")
	public static void i_selected_Java_TEST_as_curriculum(WebDriver driver) throws Throwable {
		ReportsPage.curriculum1(driver).click();
		ReportsPage.curriculum_option1(driver).click();
	}

	@When("^I clicked remove card$")
	public static void i_clicked_remove_card(WebDriver driver) throws Throwable {
	    ReportsPage.removecard(driver).click();
	}

	@Then("^I should see the card removed$")
	public static void i_should_see_the_card_removed(WebDriver driver) throws Throwable {
	    
	}

	@Given("^VP clicks on the Reports tab$")
	public static void vp_clicks_on_the_Reports_tab(WebDriver driver) throws Throwable {
	    
	}

	@When("^VP clicks on toggled content$")
	public static void vp_clicks_on_toggled_content(WebDriver driver) throws Throwable {
	    
	}

	@When("^VP clicks on add new card$")
	public static void vp_clicks_on_add_new_card(WebDriver driver) throws Throwable {
	    
	}

	@When("^VP enters (\\d+) as the number of trainee's needed$")
	public static void vp_enters_as_the_number_of_trainee_s_needed(WebDriver driver) throws Throwable {
	    
	}

	@When("^VP enters curriculum as \\.NET$")
	public static void vp_enters_curriculum_as_NET(WebDriver driver) throws Throwable {
	    
	}

	@When("^VP clicks create batch button$")
	public static void vp_clicks_create_batch_button(WebDriver driver) throws Throwable {
	    
	}

	@Then("^I should see the batch created successfully$")
	public static void i_should_see_the_batch_created_successfully(WebDriver driver) throws Throwable {
	    
	}

	@Given("^I am on the settings tab$")
	public static void i_am_on_the_settings_tab(WebDriver driver) throws Throwable {
	    
	}

	@When("^I click on graduate summary toggle content$")
	public static void i_click_on_graduate_summary_toggle_content(WebDriver driver) throws Throwable {
	    ReportsPage.togglecontent2(driver).click();
	}

	@When("^I click on the settings icon$")
	public static void i_click_on_the_settings_icon(WebDriver driver) throws Throwable {
		ReportsPage.settings(driver).click();
	}

	@When("^VP enters (\\d+) for year$")
	public static void vp_enters_for_year(WebDriver driver) throws Throwable {
		ReportsPage.year(driver).sendKeys(String.valueOf(2019));
	}

	@When("^VP enters (\\d+) for graduates per batch$")
	public static void vp_enters_for_graduates_per_batch(WebDriver driver) throws Throwable {
		ReportsPage.batch(driver).click();
		ReportsPage.batch(driver).clear();
		ReportsPage.batch(driver).sendKeys(String.valueOf(26));
	}

	@When("^VP clicks on the download csv icon$")
	public static void vp_clicks_on_the_download_csv_icon(WebDriver driver) throws Throwable {
	    
	}

	@Then("^I should see the (\\d+) report as a csv file$")
	public static void i_should_see_the_report_as_a_csv_file(WebDriver driver) throws Throwable {
	    
	}

	@Given("^VP clicks on the settings tab$")
	public static void vp_clicks_on_the_settings_tab(WebDriver driver) throws Throwable {
	    
	}

	@When("^VP clicks on incoming trainee toggle content$")
	public static void vp_clicks_on_incoming_trainee_toggle_content(WebDriver driver) throws Throwable {
	   
	}

	@When("^VP clicks on the settings icon$")
	public static void vp_clicks_on_the_settings_icon(WebDriver driver) throws Throwable {
	    
	}

	@When("^VP enters (\\d+) for trainees per batch$")
	public static void vp_enters_for_trainees_per_batch(WebDriver driver) throws Throwable {
	    
	}

	@When("^VP clicks on the download csv incoming trainee summary icon$")
	public static void vp_clicks_on_the_download_csv_incoming_trainee_summary_icon(WebDriver driver) throws Throwable {
	    
	}

	@Then("^I should see a (\\d+) report csv file downloaded$")
	public static void i_should_see_a_report_csv_file_downloaded(WebDriver driver) throws Throwable {
	    
	}

*/

}
