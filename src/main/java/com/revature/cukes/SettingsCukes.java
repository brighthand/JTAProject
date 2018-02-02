package com.revature.cukes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.revature.pom.GlobalSettingsPage;
import com.revature.pom.ReportsPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SettingsCukes {
	
	
	
	static WebDriver driver = null;





	@Given("^I clicked on the Settings tab$")
	public static void i_clicked_on_the_Settings_tab(WebDriver driver) throws Throwable {
		GlobalSettingsPage.tab(driver).click();
		
	   
	}

	@When("^I enter a value of (\\d+) for timeline trainers$")
	public static void i_enter_a_value_of_for_timeline_trainers(WebDriver driver) throws Throwable {
		GlobalSettingsPage.timelineTypeVP(driver).clear();
		GlobalSettingsPage.timelineTypeVP(driver).sendKeys(String.valueOf(15));
		
	}

	@When("^I enter a value of (\\d+) for reports outgoing grads$")
	public static void i_enter_a_value_of_for_reports_outgoing_grads(WebDriver driver) throws Throwable {
		GlobalSettingsPage.reportsGrads(driver).clear();
		GlobalSettingsPage.reportsGrads(driver).sendKeys(String.valueOf(30));
	    
	}

	@When("^I enter a value of (\\d+) for reports candidates coming$")
	public static void i_enter_a_value_of_for_reports_candidates_coming(WebDriver driver) throws Throwable {
		GlobalSettingsPage.reportsCandidates(driver).clear();
		GlobalSettingsPage.reportsCandidates(driver).sendKeys(String.valueOf(20));
	}

	@When("^I click on Tempe as the default batch location$")
	public static void i_click_on_Tempe_as_the_default_batch_location(WebDriver driver) throws Throwable {
		//GlobalSettingsPage.defaultBatchLocation(driver).click();
		//GlobalSettingsPage.defaultBatchLocation_option(driver, String.valueOf(17)).click();
	    
		
		GlobalSettingsPage.defaultBatchLocation(driver).click();
		WebElement selectElement = driver.findElement(By.id("select_container_7"));

		List<WebElement> componentList = selectElement.findElements(By.tagName("md-option"));
		for (WebElement component : componentList){
		    if (component.getText().contains("Tempe")){
		        component.click();
		        break;
		    }
		    else{
		    }
		}
	}
	
	
	@When("^I click on reston 45 as the default batch building$")
	public static void i_click_on_bbb_as_the_default_batch_building(WebDriver driver) throws Throwable {
		//GlobalSettingsPage.defaultBatchBuilding(driver).click();
		//GlobalSettingsPage.defaultBatchBuilding_option(driver, String.valueOf(82)).click();
	    
		GlobalSettingsPage.defaultBatchBuilding(driver).click();
		WebElement selectElement = driver.findElement(By.id("select_container_9")); // select_option_116, select_option_117
		
		List<WebElement> componentList = selectElement.findElements(By.tagName("md-option"));
		for (WebElement component : componentList){
		    if (component.getText().contains("ju")){ // reston 45, Cali Test 1
		        component.click();
		        break;
		    }
		    else{
		    }
		}
		
		
	}
	

	
	
	@When("^I enter (\\d+) for minimum batch size$")
	public static void i_enter_for_minimum_batch_size(WebDriver driver) throws Throwable {
		GlobalSettingsPage.minimumBatchSize(driver).clear();
		GlobalSettingsPage.minimumBatchSize(driver).sendKeys(String.valueOf(40));
	    
	}

	@When("^I enter (\\d+) for maximum batch size$")
	public static void i_enter_for_maximum_batch_size(WebDriver driver) throws Throwable {
		GlobalSettingsPage.maximumBatchSize(driver).clear();
		GlobalSettingsPage.maximumBatchSize(driver).sendKeys(String.valueOf(50));
	   
	}

	@When("^I enter (\\d+) for default batch length$")
	public static void i_enter_for_default_batch_length(WebDriver driver) throws Throwable {
		GlobalSettingsPage.defaultBatchLength(driver).clear();
		GlobalSettingsPage.defaultBatchLength(driver).sendKeys(String.valueOf(60));
	    
	}

	@When("^I enter (\\d+) for minimum day between trainers batch$")
	public static void i_enter_for_minimum_day_between_trainers_batch(WebDriver driver) throws Throwable {
		GlobalSettingsPage.minimumBatches(driver).clear();
		GlobalSettingsPage.minimumBatches(driver).sendKeys(String.valueOf(70));
	    
	}

	@When("^I click save$")
	public static void i_click_save(WebDriver driver) throws Throwable {
		GlobalSettingsPage.save(driver).click();
	    
	}

	@Then("^I should be able to see that all settings have been updated popup message$")
	public static void i_should_be_able_to_see_that_all_settings_have_been_updated_popup_message(WebDriver driver) throws Throwable {
		GlobalSettingsPage.timelineTypeVP(driver).getAttribute("value");
		GlobalSettingsPage.reportsGrads(driver).getAttribute("value");
		GlobalSettingsPage.reportsCandidates(driver).getAttribute("value");
		GlobalSettingsPage.defaultBatchLocation(driver).getText();
		GlobalSettingsPage.defaultBatchBuilding(driver).getText();
		GlobalSettingsPage.minimumBatchSize(driver).getAttribute("value");
		GlobalSettingsPage.maximumBatchSize(driver).getAttribute("value");
		GlobalSettingsPage.defaultBatchLength(driver).getAttribute("value");
		GlobalSettingsPage.minimumBatches(driver).getAttribute("value");
	}
	

	
	
	
	
	
	@Given("^VP click on the Settings tab$")
	public static void vp_click_on_the_Settings_tab(WebDriver driver) throws Throwable {
		GlobalSettingsPage.tab(driver).click();
	}

	@When("^VP enter a value of (\\d+) for timeline trainers$")
	public static void vp_enter_a_value_of_for_timeline_trainers(WebDriver driver) throws Throwable {
		GlobalSettingsPage.timelineTypeVP(driver).clear();
		GlobalSettingsPage.timelineTypeVP(driver).sendKeys(String.valueOf(14));
	}

	@When("^VP enter a value of (\\d+) for reports candidates coming$")
	public static void vp_enter_a_value_of_for_reports_candidates_coming(WebDriver driver) throws Throwable {
		GlobalSettingsPage.reportsCandidates(driver).clear();
		GlobalSettingsPage.reportsCandidates(driver).sendKeys(String.valueOf(18));
	}

	@When("^VP enter (\\d+) for minimum batch size$")
	public static void vp_enter_for_minimum_batch_size(WebDriver driver) throws Throwable {
		GlobalSettingsPage.minimumBatchSize(driver).clear();
		GlobalSettingsPage.minimumBatchSize(driver).sendKeys(String.valueOf(24));
	}

	@When("^VP click save$")
	public static void vp_click_save(WebDriver driver) throws Throwable {
		GlobalSettingsPage.save(driver).click();
	}

	@Then("^VP should be able to see that all settings have been updated popup message$")
	public static void vp_should_be_able_to_see_that_all_settings_have_been_updated_popup_message(WebDriver driver) throws Throwable {
		GlobalSettingsPage.okay(driver).click();
	}
	
	
	
	
	
	
	
	@Given("^VP clicks on the Settings tab$")
	public static void vp_clicks_on_the_Settings_tab(WebDriver driver) throws Throwable {
		GlobalSettingsPage.tab(driver).click();
    
}

	@When("^VP enters a value of (\\d+) for timeline trainers$")
	public static void vp_enters_a_value_of_for_timeline_trainers(WebDriver driver) throws Throwable {
		GlobalSettingsPage.timelineTypeVP(driver).clear();
		GlobalSettingsPage.timelineTypeVP(driver).sendKeys(String.valueOf(19));
		
    
}

	@When("^VP enters a value of (\\d+) for reports outgoing grads$")
	public static void vp_enters_a_value_of_for_reports_outgoing_grads(WebDriver driver) throws Throwable {
		GlobalSettingsPage.reportsGrads(driver).clear();
		GlobalSettingsPage.reportsGrads(driver).sendKeys(String.valueOf(26));
    
}

	@When("^VP clicks on New York City as the default batch location$")
	public static void vp_clicks_on_New_York_City_as_the_default_batch_location(WebDriver driver) throws Throwable {
		//GlobalSettingsPage.defaultBatchLocation(driver).click();
		//GlobalSettingsPage.defaultBatchLocation_option(driver, String.valueOf(27)).click();
		
		GlobalSettingsPage.defaultBatchLocation(driver).click();
		WebElement selectElement = driver.findElement(By.id("select_container_7"));

		List<WebElement> componentList = selectElement.findElements(By.tagName("md-option"));
		for (WebElement component : componentList){
		    if (component.getText().contains("New York City")){
		        component.click();
		        break;
		    }
		    else{
		    }
		}
		
}

	@When("^VP enters (\\d+) for minimum days between trainer batches$")
	public static void vp_enters_for_minimum_days_between_trainer_batches(WebDriver driver) throws Throwable {
		GlobalSettingsPage.minimumBatches(driver).clear();
		GlobalSettingsPage.minimumBatches(driver).sendKeys(String.valueOf(93));
    
}
	@When("^VP clicks on reset$")
	public static void vp_clicks_on_reset(WebDriver driver) throws Throwable {
    	GlobalSettingsPage.reset(driver).click();
}

	@Then("^VP should be able to see the settings reset popup message$")
	public static void vp_should_be_able_to_see_the_settings_reset_popup_message(WebDriver driver) throws Throwable {
		
		GlobalSettingsPage.timelineTypeVP(driver).getAttribute("value");
		GlobalSettingsPage.timelineTypeVP(driver).getAttribute("value");
		GlobalSettingsPage.defaultBatchLocation(driver).getText();
		//GlobalSettingsPage.timelineTypeVP_initial(driver).getAttribute("value");
		
		//GlobalSettingsPage.reportsGrads_initial(driver).getAttribute("value");
		
		GlobalSettingsPage.minimumBatches(driver).getAttribute("value");
		
		
}
	
	
	
	
	
	@Given("^I clicked on the tab for Settings$")
	public static void i_clicked_on_the_tab_for_Settings(WebDriver driver) throws Throwable {
	GlobalSettingsPage.tab(driver).click();
    
}
	@When("^I enter alphabetical characters for timeline trainers$")
	public static void i_enter_alphabetical_characters_for_timeline_trainers(WebDriver driver) throws Throwable {
		GlobalSettingsPage.timelineTypeVP(driver).clear();
		GlobalSettingsPage.timelineTypeVP(driver).sendKeys("asdfjkl");
	}

	@When("^I enter non number characters for reports candidates incoming$")
	public static void i_enter_non_number_characters_for_reports_candidates_incoming(WebDriver driver) throws Throwable {
		GlobalSettingsPage.reportsCandidates(driver).clear();
		GlobalSettingsPage.reportsCandidates(driver).sendKeys("!@#$%");
	}

	@When("^I enter non number characters for default batch length$")
	public static void i_enter_non_number_characters_for_default_batch_length(WebDriver driver) throws Throwable {
		GlobalSettingsPage.defaultBatchLength(driver).clear();
		GlobalSettingsPage.defaultBatchLength(driver).sendKeys("^&*_");
	}
	
	@When("^I click on the save button$")
	public static void i_click_on_the_save_button(WebDriver driver) throws Throwable {
    	GlobalSettingsPage.okay(driver).click();
}

	@Then("^I should be able to see blank input for timeline trainers, reports candidates incoming, and default batch length$")
	public static void i_should_be_able_to_see_blank_input_for_timeline_trainers_reports_candidates_incoming_and_default_batch_length(WebDriver driver) throws Throwable {
	    GlobalSettingsPage.timelineTypeVP(driver).getAttribute("value");
	    GlobalSettingsPage.reportsCandidates(driver).getAttribute("value");
	    GlobalSettingsPage.defaultBatchLength(driver).getAttribute("value");
	}
	
	
	
	
	
	
	
	
	
	
	@Given("^VP clicked on the Settings tab$")
	public static void vp_clicked_on_the_Settings_tab(WebDriver driver) throws Throwable {
		GlobalSettingsPage.tab(driver).click();
	}

	@When("^VP entered empty text for reports outgoing candidates$")
	public static void vp_entered_empty_text_for_reports_outgoing_candidates(WebDriver driver) throws Throwable {
		GlobalSettingsPage.reportsCandidates(driver).clear();
	   
	}

	@When("^VP entered empty text for minimum batch size$")
	public static void vp_entered_empty_text_for_minimum_batch_size(WebDriver driver) throws Throwable {
		GlobalSettingsPage.minimumBatchSize(driver).clear();
	}

	@When("^VP entered empty text for maximum batch size$")
	public static void vp_entered_empty_text_for_maximum_batch_size(WebDriver driver) throws Throwable {
		GlobalSettingsPage.maximumBatchSize(driver).clear();
	}
	
	@When("^I click on save$")
	public static void i_click_on_save(WebDriver driver) throws Throwable {
    	GlobalSettingsPage.okay(driver).click();
    
}

	@Then("^VP should see blank input for timeline trainers$")
	public static void vp_should_see_blank_input_for_timeline_trainers(WebDriver driver) throws Throwable {
	    System.out.println(GlobalSettingsPage.reportsCandidates(driver).getAttribute("value"));
	    System.out.println(GlobalSettingsPage.minimumBatchSize(driver).getAttribute("value"));
	    System.out.println(GlobalSettingsPage.maximumBatchSize(driver).getAttribute("value"));
	}
	
	
	
}
