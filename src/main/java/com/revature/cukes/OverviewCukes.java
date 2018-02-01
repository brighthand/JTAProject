package com.revature.cukes;

import org.openqa.selenium.WebDriver;

import com.revature.pom.OverviewPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class OverviewCukes {
	
	@Given("^I'm in the overview page$")
	public static void i_m_in_the_overview_page(WebDriver driver) throws Throwable {
	    OverviewPage.tab(driver).click();
	}

	@When("^I click the filter button$")
	public static void i_click_the_filter_button(WebDriver driver) throws Throwable {
	    OverviewPage.filterButton(driver).click();
	}

	@When("^Select in progress$")
	public static void select_in_progress(WebDriver driver) throws Throwable {
	  OverviewPage.filterInProgress(driver).click();
	}

	@When("^Select beginning within two weeks$")
	public static void select_beginning_within_two_weeks(WebDriver driver) throws Throwable {
	    OverviewPage.filterBegTwoWeeks(driver).click();
	}

	@When("^Select all$")
	public static void select_all(WebDriver driver) throws Throwable {
	    OverviewPage.filterAll(driver).click();
	}

	@Given("^I click the export to csv button$")
	public static void i_click_the_export_to_csv_button(WebDriver driver) throws Throwable {
	    OverviewPage.exportCSVButton(driver).click();
	}
	

}
