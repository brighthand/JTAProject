package com.revature.cukes;

import org.openqa.selenium.WebDriver;

import com.revature.pom.TrainersPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TrainersCukes {
	
	
	static WebDriver driver = null;
	
	@Given("^VP clicked on the trainer Matt Barkley$")
	public static void vp_clicked_on_the_trainer_Matt_Barkley(WebDriver driver) throws Throwable {
    
    TrainersPage.clickTrainer(driver).click();
}

	@Then("^the page changes to Matt Barkley's info$")
	public static void the_page_changes_to_Matt_Barkley_s_info(WebDriver driver) throws Throwable {
		TrainersPage.trainerFirstName(driver);
		TrainersPage.trainerLastName(driver);
    
}
	
	
	@Given("^VP clicked on the Trainers tab$")
	public static void vp_clicked_on_the_Trainers_tab(WebDriver driver) throws Throwable {
		TrainersPage.tab(driver).click();
	}

	@When("^VP clicked on the add trainer button$")
	public static void vp_clicked_on_the_add_trainer_button(WebDriver driver) throws Throwable {
		TrainersPage.addTrainer(driver).click();
	}

	@When("^VP entered Richard first name$")
	public static void vp_entered_Richard_first_name(WebDriver driver) throws Throwable {
		
		TrainersPage.FirstName(driver).sendKeys("David");
	   
	}

	@When("^VP entered Bumer last name$")
	public static void vp_entered_Bumer_last_name(WebDriver driver) throws Throwable {
		TrainersPage.LastName(driver).sendKeys("Smith");
	}

	@When("^VP clicks on save$")
	public static void vp_clicks_on_save(WebDriver driver) throws Throwable {
		TrainersPage.save(driver).click();
	}

	@Then("^Size of inactive trainers is increased by (\\d+)$")
	public static void size_of_inactive_trainers_is_increased_by(WebDriver driver) throws Throwable {
		TrainersPage.size_of_inactivetrainers(driver);
	}

	@Given("^VP clicks on add trainer button$")
	public static void vp_clicks_on_add_trainer_button(WebDriver driver) throws Throwable {
		TrainersPage.addTrainer(driver).click();
	}

	@When("^VP enters Randy for first name$")
	public static void vp_enters_Randy_for_first_name(WebDriver driver) throws Throwable {
		TrainersPage.FirstName(driver).sendKeys("Randy");
	}

	@When("^VP enters Jackson for last name$")
	public static void vp_enters_Jackson_for_last_name(WebDriver driver) throws Throwable {
		TrainersPage.LastName(driver).sendKeys("Jackson");
	}

	@When("^VP clicks on cancel$")
	public static void vp_clicks_on_cancel(WebDriver driver) throws Throwable {
		TrainersPage.cancel(driver).click();
	}


	@Then("^Size of inactive trainers remains the same$")
	public static void size_of_inactive_trainers_remains_the_same(WebDriver driver) throws Throwable {
		
		TrainersPage.popup(driver);
	}

	@Given("^VP clicks on the deactivate button for Matt Patinos$")
	public static void vp_clicks_on_the_deactivate_button_for_Matt_Patinos(WebDriver driver) throws Throwable {
		
		TrainersPage.deactivate(driver, String.valueOf(6)).click();
	}

	@Then("^Size of trainers decreases by (\\d+)$")
	public static void size_of_trainers_decreases_by(WebDriver driver) throws Throwable {
	    TrainersPage.size_of_activetrainers(driver);
	}

	@Given("^VP clicked on the activate button for inactive trainer Richard Smith$")
	public static void vp_clicked_on_the_activate_button_for_inactive_trainer_Richard_Smith(WebDriver driver) throws Throwable {
		TrainersPage.reactivate(driver, String.valueOf(4)).click();
	}

	@Then("^Size of inactive trainers is decreased by (\\d+)$")
	public static void size_of_inactive_trainers_is_decreased_by(WebDriver driver) throws Throwable {
		TrainersPage.size_of_inactivetrainers(driver);
	}

	@Given("^VP clicks on the calendar button$")
	public static void vp_clicks_on_the_calendar_button(WebDriver driver) throws Throwable {
		TrainersPage.calendar(driver).click();
	}

	@When("^VP clicks on new pto request$")
	public static void vp_clicks_on_new_pto_request(WebDriver driver) throws Throwable {
		TrainersPage.requestpto(driver).click();
	    
	}

	@When("^VP  clicks on start date$")
	public static void vp_clicks_on_start_date(WebDriver driver) throws Throwable {
		TrainersPage.requestpto_start(driver).click();
	    
	}

	@When("^VP clicks on month April (\\d+)$")
	public static void vp_clicks_on_month_April(WebDriver driver) throws Throwable {
		TrainersPage.requestpto_start_year_month1(driver).click();
	}

	@When("^VP clicks on the (\\d+)th day$")
	public static void vp_clicks_on_the_th_day(WebDriver driver) throws Throwable {
		TrainersPage.requestpto_start_date1(driver).click();
	}

	@When("^VP clicks on end date$")
	public static void vp_clicks_on_end_date(WebDriver driver) throws Throwable {
		TrainersPage.requestpto_end(driver).click();
	}

	@When("^VP clicks on month May (\\d+)$")
	public static void vp_clicks_on_month_May(WebDriver driver) throws Throwable {
		
		TrainersPage.requestpto_end_year_month1(driver).click();
	    
	}

	@When("^VP clicks on (\\d+)th day$")
	public static void vp_clicks_on_th_day(WebDriver driver) throws Throwable {
		
		TrainersPage.requestpto_end_date1(driver).click();
	    
	}

	@When("^VP clicks cancel$")
	public static void vp_clicks_cancel(WebDriver driver) throws Throwable {
		
		TrainersPage.requestpto_cancel(driver).click();
	    
	}

	@When("^VP clicks cancel pto request$")
	public static void vp_clicks_cancel_pto_request(WebDriver driver) throws Throwable {
		
		TrainersPage.cancelpto(driver).click();
	    
	}

	@Then("^VP is directed to the trainers home page$")
	public static void vp_is_directed_to_the_trainers_home_page(WebDriver driver) throws Throwable {
		
		TrainersPage.pagedisplayed(driver);
	    
	}

	@Given("^VP clicked on the calendar button$")
	public static void vp_clicked_on_the_calendar_button(WebDriver driver) throws Throwable {
	    
		TrainersPage.calendar(driver).click();
	}

	@When("^VP clicked on new pto request button$")
	public static void vp_clicked_on_new_pto_request_button(WebDriver driver) throws Throwable {
		
		TrainersPage.requestpto(driver).click();
	    
	}

	@When("^VP clicked on start date$")
	public static void vp_clicked_on_start_date(WebDriver driver) throws Throwable {
		
		TrainersPage.requestpto_start(driver).click();
	    
	}

	@When("^VP clicked on month February (\\d+)$")
	public static void vp_clicked_on_month_February(WebDriver driver) throws Throwable {
		
		TrainersPage.requestpto_start_year_month(driver).click();
	    
	}

	@When("^VP clicked on the (\\d+)th day$")
	public static void vp_clicked_on_the_th_day(WebDriver driver) throws Throwable {
		
		TrainersPage.requestpto_start_date(driver).click();
	    
	}

	@When("^VP clicked on the end date$")
	public static void vp_clicked_on_the_end_date(WebDriver driver) throws Throwable {
		
		TrainersPage.requestpto_end(driver).click();
	    
	}

	@When("^VP clicked on month March (\\d+)$")
	public static void vp_clicked_on_month_March(WebDriver driver) throws Throwable {
		
		TrainersPage.requestpto_end_year_month(driver).click();
	    
	}
	
	@When("^VP clicked on (\\d+)th day$")
	public static void vp_clicked_on_th_day(WebDriver driver) throws Throwable {
	
		TrainersPage.requestpto_end_date(driver).click();
    
}

	@When("^VP clicked on send$")
	public static void vp_clicked_on_send(WebDriver driver) throws Throwable {
		
		TrainersPage.requestpto_send(driver);
	}

	@Then("^VP is directed to choose a Gmail account$")
	public static void vp_is_directed_to_choose_a_Gmail_account(WebDriver driver) throws Throwable {
		
		System.out.println("VP has reached Gmail account page. Test Failed");
	    
	}

}
