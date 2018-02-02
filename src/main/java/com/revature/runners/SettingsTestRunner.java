package com.revature.runners;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.revature.cukes.SettingsCukes;
import com.revature.pom.GlobalSettingsPage;
import com.revature.pom.LoginPage;
import com.revature.pom.LogoutPage;
import com.revature.pom.TrainersPage;

public class SettingsTestRunner {

	private static WebDriver driver = null;

	@Test(priority = 1)
	private static void openApplication() {
		File f1 = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", f1.getAbsolutePath());
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test(priority = 2)
	void testLoginMethod() {
		driver.get("https://dev.assignforce.revaturelabs.com");
		LoginPage.user(driver).sendKeys("test.vpoftech@revature.com.int1 ");
		LoginPage.password(driver).sendKeys("yuvi1712");
		LoginPage.submit(driver).click();
		// LoginPage.user(driver).sendKeys("test.trainer@revature.com.int1");
		// LoginPage.password(driver).sendKeys("trainer123");
	}
	
	@Test(priority = 3, enabled = true)
	public void VP_Edits_Settings() {
		//String popup = null;
		String valueBefore = null, valueBefore2 = null, valueBefore3 = null, valueBefore4 = null, valueBefore5 = null,
				valueBefore6 = null, valueBefore7 = null, valueBefore8 = null, valueBefore9 = null;
		String input1 = null, input2 = null, input3 = null, input4 = null, input5 = null, input6 = null, input7 = null,
				input8 = null, input9 = null;
		String valueAfter = null, valueAfter2 = null, valueAfter3 = null, valueAfter4 = null, valueAfter5 = null,
				valueAfter6 = null, valueAfter7 = null, valueAfter8 = null, valueAfter9 = null;
		try {

			SettingsCukes.i_clicked_on_the_Settings_tab(driver);

			valueBefore = GlobalSettingsPage.timelineTypeVP(driver).getAttribute("value");
			System.out.println("Value of timeline trainers before: " + valueBefore);
			SettingsCukes.i_enter_a_value_of_for_timeline_trainers(driver);
			input1 = GlobalSettingsPage.timelineTypeVP(driver).getAttribute("value");
			System.out.println("Value of timeline trainers new input: " + input1);

			valueBefore2 = GlobalSettingsPage.reportsGrads(driver).getAttribute("value");
			System.out.println("Value of outgoing grads before: " + valueBefore2);
			SettingsCukes.i_enter_a_value_of_for_reports_outgoing_grads(driver);
			input2 = GlobalSettingsPage.reportsGrads(driver).getAttribute("value");
			System.out.println("Value of outgoing grads new input: " + input2);

			valueBefore3 = GlobalSettingsPage.reportsCandidates(driver).getAttribute("value");
			System.out.println("Value of reports candidates incoming before : " + valueBefore3);
			SettingsCukes.i_enter_a_value_of_for_reports_candidates_coming(driver);
			input3 = GlobalSettingsPage.reportsCandidates(driver).getAttribute("value");
			System.out.println("Value of reports candidates incoming new input : " + input3);

			valueBefore4 = GlobalSettingsPage.defaultBatchLocation(driver).getText();
			System.out.println("Value of default batch location before : " + valueBefore4);
			SettingsCukes.i_click_on_Tempe_as_the_default_batch_location(driver);
			input4 = GlobalSettingsPage.defaultBatchLocation(driver).getText();
			System.out.println("Value of default batch location new input : " + input4);
			
			/*
			valueBefore5 = GlobalSettingsPage.defaultBatchBuilding(driver).getText();
			System.out.println("Value of default batch building before : " + valueBefore5);
			SettingsCukes.i_click_on_bbb_as_the_default_batch_building(driver);
			input5 = GlobalSettingsPage.defaultBatchBuilding(driver).getText();
			System.out.println("Value of default batch building new input : " + input5);
			*/
			
			valueBefore6 = GlobalSettingsPage.minimumBatchSize(driver).getAttribute("value");
			System.out.println("Value of minimum batch size before : " + valueBefore6);
			SettingsCukes.i_enter_for_minimum_batch_size(driver);
			input6 = GlobalSettingsPage.minimumBatchSize(driver).getAttribute("value");
			System.out.println("Value of minimum batch size new input : " + input6);

			valueBefore7 = GlobalSettingsPage.maximumBatchSize(driver).getAttribute("value");
			System.out.println("Value of maximum batch size before : " + valueBefore7);
			SettingsCukes.i_enter_for_maximum_batch_size(driver);
			input7 = GlobalSettingsPage.maximumBatchSize(driver).getAttribute("value");
			System.out.println("Value of maximum batch size new input : " + input7);

			valueBefore8 = GlobalSettingsPage.defaultBatchLength(driver).getAttribute("value");
			System.out.println("Value of default batch length before : " + valueBefore8);
			SettingsCukes.i_enter_for_default_batch_length(driver);
			input8 = GlobalSettingsPage.defaultBatchLength(driver).getAttribute("value");
			System.out.println("Value of default batch length new input : " + input8);

			valueBefore9 = GlobalSettingsPage.minimumBatches(driver).getAttribute("value");
			System.out.println("Value of minimum day between trainers batch before : " + valueBefore9);
			SettingsCukes.i_enter_for_minimum_day_between_trainers_batch(driver);
			input9 = GlobalSettingsPage.minimumBatches(driver).getAttribute("value");
			System.out.println("Value of minimum day between trainers batch new input : " + input9);

			SettingsCukes.i_click_save(driver);
			//popup = TrainersPage.popup(driver).getText();
			//System.out.println(popup);

			SettingsCukes.i_should_be_able_to_see_that_all_settings_have_been_updated_popup_message(driver);

			valueAfter = GlobalSettingsPage.timelineTypeVP(driver).getAttribute("value");
			System.out.println("Value of timeline trainers after saving: " + valueAfter);

			valueAfter2 = GlobalSettingsPage.reportsGrads(driver).getAttribute("value");
			System.out.println("Value of outgoing grads after saving: " + valueAfter2);

			valueAfter3 = GlobalSettingsPage.reportsCandidates(driver).getAttribute("value");
			System.out.println("Value of reports candidates incoming after saving: " + valueAfter3);

			valueAfter4 = GlobalSettingsPage.defaultBatchLocation(driver).getText();
			System.out.println("Value of default batch location after saving: " + valueAfter4);
			
			/*
			valueAfter5 = GlobalSettingsPage.defaultBatchBuilding(driver).getText();
			System.out.println("Value of default batch building after saving: " + valueAfter5);
			*/
			valueAfter6 = GlobalSettingsPage.minimumBatchSize(driver).getAttribute("value");
			System.out.println("Value of minimum batch size after saving: " + valueAfter6);

			valueAfter7 = GlobalSettingsPage.maximumBatchSize(driver).getAttribute("value");
			System.out.println("Value of maximum batch size after saving: " + valueAfter7);

			valueAfter8 = GlobalSettingsPage.defaultBatchLength(driver).getAttribute("value");
			System.out.println("Value of default batch length after saving: " + valueAfter8);

			valueAfter9 = GlobalSettingsPage.minimumBatches(driver).getAttribute("value");
			System.out.println("Value of minimum day between trainers batch after saving: " + valueAfter9);
			System.out.println();
			System.out.println();
			System.out.println();

		} catch (Throwable e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		Assert.assertTrue(input1.equals(valueAfter));
		Assert.assertTrue(input2.equals(valueAfter2));
		Assert.assertTrue(input3.equals(valueAfter3));
		Assert.assertTrue(input4.equals(valueAfter4));
		// Assert.assertTrue(input5.equals(valueAfter5));
		Assert.assertTrue(input6.equals(valueAfter6));
		Assert.assertTrue(input7.equals(valueAfter7));
		Assert.assertTrue(input8.equals(valueAfter8));
		Assert.assertTrue(input9.equals(valueAfter9));
		//Assert.assertTrue(popup.equals("All settings have been updated"));

	}

	@Test(priority = 4, enabled = true)
	public void VP_edits_some_settings() {
		//String popup = null;
		String valueBefore = null, valueBefore2 = null, valueBefore3 = null;
		String input1 = null, input2 = null, input3 = null;
		String valueAfter = null, valueAfter2 = null, valueAfter3 = null;

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {

			SettingsCukes.vp_click_on_the_Settings_tab(driver);

			valueBefore = GlobalSettingsPage.timelineTypeVP(driver).getAttribute("value");
			System.out.println("Value of timeline trainers before: " + valueBefore);
			SettingsCukes.vp_enter_a_value_of_for_timeline_trainers(driver);
			input1 = GlobalSettingsPage.timelineTypeVP(driver).getAttribute("value");
			System.out.println("Value of timeline trainers new input: " + input1);

			valueBefore2 = GlobalSettingsPage.reportsCandidates(driver).getAttribute("value");
			System.out.println("Value of reports candidates incoming before : " + valueBefore2);
			SettingsCukes.vp_enter_a_value_of_for_reports_candidates_coming(driver);
			input2 = GlobalSettingsPage.reportsCandidates(driver).getAttribute("value");
			System.out.println("Value of reports candidates incoming new input : " + input2);

			valueBefore3 = GlobalSettingsPage.minimumBatchSize(driver).getAttribute("value");
			System.out.println("Value of minimum batch size before : " + valueBefore3);
			SettingsCukes.vp_enter_for_minimum_batch_size(driver);
			input3 = GlobalSettingsPage.minimumBatchSize(driver).getAttribute("value");
			System.out.println("Value of minimum batch size new input : " + input3);

			SettingsCukes.vp_click_save(driver);
			//popup = TrainersPage.popup(driver).getText();
			//System.out.println(popup);
			SettingsCukes.vp_should_be_able_to_see_that_all_settings_have_been_updated_popup_message(driver);
			Thread.sleep(5000);

			valueAfter = GlobalSettingsPage.timelineTypeVP(driver).getAttribute("value");
			System.out.println("Value of timeline trainers after saving: " + valueAfter);

			valueAfter2 = GlobalSettingsPage.reportsCandidates(driver).getAttribute("value");
			System.out.println("Value of reports candidates incoming after saving: " + valueAfter2);

			valueAfter3 = GlobalSettingsPage.minimumBatchSize(driver).getAttribute("value");
			System.out.println("Value of minimum batch size after saving: " + valueAfter3);
			

			System.out.println();
			System.out.println();
			System.out.println();

		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Assert.assertTrue(input1.equals(valueAfter));
		Assert.assertTrue(input2.equals(valueAfter2));
		Assert.assertTrue(input3.equals(valueAfter3));
		//Assert.assertTrue(popup.equals("All settings have been updated"));
	}

	@Test(priority = 5, enabled = true)
	public void VP_resets_their_edits() {
		//String popup = null;
		String valueBefore = null, valueAfter = null;
		String valueBefore1 = null, valueAfter1 = null;
		String valueBefore2 = null, valueAfter2 = null;
		String valueBefore3 = null, valueAfter3 = null;
		String valueAfterReset = null, valueAfterReset2 = null, valueAfterReset3 = null, valueAfterReset4 = null;

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			SettingsCukes.vp_clicks_on_the_Settings_tab(driver);

			// Comparing the values of TimeLine Trainers Per Page before and after the
			// resets
			valueBefore = GlobalSettingsPage.timelineTypeVP(driver).getAttribute("value");
			System.out.println("Value of timeline trainers before input: " + valueBefore);
			SettingsCukes.vp_enters_a_value_of_for_timeline_trainers(driver);
			valueAfter = GlobalSettingsPage.timelineTypeVP(driver).getAttribute("value");
			System.out.println("Value of timeline trainers after input: " + valueAfter);
			SettingsCukes.vp_enters_a_value_of_for_timeline_trainers(driver);

			valueBefore1 = GlobalSettingsPage.reportsGrads(driver).getAttribute("value");
			System.out.println("Value of outgoing grads before input: " + valueBefore1);
			SettingsCukes.vp_enters_a_value_of_for_reports_outgoing_grads(driver);
			valueAfter1 = GlobalSettingsPage.reportsGrads(driver).getAttribute("value");
			System.out.println("Value of outgoing grads after input: " + valueAfter1);

			valueBefore2 = GlobalSettingsPage.defaultBatchLocation(driver).getText();
			System.out.println("Value of default batch location before input: " + valueBefore2);
			SettingsCukes.vp_clicks_on_New_York_City_as_the_default_batch_location(driver);
			valueAfter2 = GlobalSettingsPage.defaultBatchLocation(driver).getText();
			System.out.println("Value of default batch location after input: " + valueAfter2);

			valueBefore3 = GlobalSettingsPage.minimumBatches(driver).getAttribute("value");
			System.out.println("Value of minimum days between trainer batches before input: " + valueBefore3);
			SettingsCukes.vp_enters_for_minimum_days_between_trainer_batches(driver);
			valueAfter3 = GlobalSettingsPage.minimumBatches(driver).getAttribute("value");
			System.out.println("Value of minimum days between trainer batches after input: " + valueAfter3);

			// VP clicks on reset
			SettingsCukes.vp_clicks_on_reset(driver);

			// Reset pop-up message is displayed
			SettingsCukes.vp_should_be_able_to_see_the_settings_reset_popup_message(driver);

			valueAfterReset = GlobalSettingsPage.timelineTypeVP(driver).getAttribute("value");
			System.out.println("Value of timeline trainers after reset: " + valueAfterReset);

			valueAfterReset2 = GlobalSettingsPage.reportsGrads(driver).getAttribute("value");
			System.out.println("Value of outgoing grads after reset: " + valueAfterReset2);

			valueAfterReset3 = GlobalSettingsPage.defaultBatchLocation(driver).getText();
			System.out.println("Value of default batch location after reset: " + valueAfterReset3);

			valueAfterReset4 = GlobalSettingsPage.minimumBatches(driver).getAttribute("value");
			System.out.println("Value of minimum days between trainer batches after reset: " + valueAfterReset4);
			//popup = TrainersPage.popup(driver).getText();
			//System.out.println(popup);
			System.out.println();
			System.out.println();
			System.out.println();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// If aftervalue is different than before value then changed
		// Assert.assertTrue(!valueAfter.equals(valueBefore));
		Assert.assertTrue(!valueAfter.equals(valueAfterReset));
		Assert.assertTrue(!valueAfter1.equals(valueAfterReset2));
		Assert.assertTrue(!valueAfter2.equals(valueAfterReset3));
		Assert.assertTrue(!valueAfter3.equals(valueAfterReset4));
		//Assert.assertTrue(popup.equals("Settings reset."));
	}

	@Test(priority = 6, enabled = true)
	public void I_enter_invalid_input() {
		
		//String popup = null;

		String inputValue = null, inputValue2 = null, inputValue3 = null;
		String valueAfter = null, valueAfter2 = null, valueAfter3 = null;

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			Thread.sleep(4000);
			SettingsCukes.i_clicked_on_the_tab_for_Settings(driver);

			SettingsCukes.i_enter_alphabetical_characters_for_timeline_trainers(driver);
			inputValue = GlobalSettingsPage.timelineTypeVP(driver).getAttribute("value");
			System.out.println("Value of timeline trainers after entering input: " + inputValue);

			SettingsCukes.i_enter_non_number_characters_for_reports_candidates_incoming(driver);
			inputValue2 = GlobalSettingsPage.reportsCandidates(driver).getAttribute("value");
			System.out.println("Value of reports candidates incoming after entering input: " + inputValue2);

			SettingsCukes.i_enter_non_number_characters_for_default_batch_length(driver);
			inputValue3 = GlobalSettingsPage.defaultBatchLength(driver).getAttribute("value");
			System.out.println("Value of default batch length after entering input: " + inputValue3);

			SettingsCukes.i_click_on_the_save_button(driver);

			SettingsCukes
					.i_should_be_able_to_see_blank_input_for_timeline_trainers_reports_candidates_incoming_and_default_batch_length(
							driver);

			valueAfter = GlobalSettingsPage.timelineTypeVP(driver).getAttribute("value");
			System.out.println("Value of timeline trainers after saving: " + valueAfter);

			valueAfter2 = GlobalSettingsPage.reportsCandidates(driver).getAttribute("value");
			System.out.println("Value of reports candidates incoming after saving: " + valueAfter2);

			valueAfter3 = GlobalSettingsPage.defaultBatchLength(driver).getAttribute("value");
			System.out.println("Value of default batch length after saving: " + valueAfter3);
			
			// popup = TrainersPage.popup(driver).getText();
			// System.out.println(popup);

			Thread.sleep(7000);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Assert.assertTrue(inputValue.equals(valueAfter));
		Assert.assertTrue(inputValue2.equals(valueAfter2));
		Assert.assertTrue(inputValue3.equals(valueAfter3));
		// Assert.assertTrue(popup.equals("All settings have been updated"));
		
	}

	@Test(priority = 7, enabled = true)
	public void VP_saves_empty_input() {
		String popup = null;
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			SettingsCukes.vp_clicked_on_the_Settings_tab(driver);

			
			SettingsCukes.vp_entered_empty_text_for_reports_outgoing_candidates(driver);
			

			
			SettingsCukes.vp_entered_empty_text_for_minimum_batch_size(driver);
			

			SettingsCukes.vp_entered_empty_text_for_maximum_batch_size(driver);
			

			SettingsCukes.i_click_on_save(driver);

			SettingsCukes.vp_should_see_blank_input_for_timeline_trainers(driver);

			
			popup = TrainersPage.popup(driver).getText();
			System.out.println(popup);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Assert.assertTrue(popup.equals("All settings have been updated"));

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(priority = 8)
	private static void logout() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LogoutPage.tab(driver).click();
	}

	@Test(priority = 9)
	void closeApp() {
		driver.quit();
	}
}
