package com.revature.pom;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.revature.cukes.SettingsCukes;
import com.revature.cukes.TrainersCukes;

public class TestRunner {

	private static WebDriver driver = null;

	@Test(priority=1)
	private static void openApplication() {
		File f1 = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", f1.getAbsolutePath());
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test(priority=2)
	void testLoginMethod() {
		driver.get("https://dev.assignforce.revaturelabs.com");
		LoginPage.user(driver).sendKeys("test.vpoftech@revature.com.int1 ");
		LoginPage.password(driver).sendKeys("yuvi1712");
		LoginPage.submit(driver).click();
		// LoginPage.user(driver).sendKeys("test.trainer@revature.com.int1");
		// LoginPage.password(driver).sendKeys("trainer123");
	}

	/*
	 * @Test(enabled = false, priority=0, groups ="iteration2") private static void
	 * testsettings() throws InterruptedException { Thread.sleep(1000);
	 * GlobalSettingsPage.tab(driver).click();
	 * GlobalSettingsPage.timelineTypeVP(driver).clear();
	 * GlobalSettingsPage.timelineTypeVP(driver).sendKeys(String.valueOf(15));
	 * GlobalSettingsPage.reportsGrads(driver).clear();
	 * GlobalSettingsPage.reportsGrads(driver).sendKeys(String.valueOf(30));
	 * GlobalSettingsPage.reportsCandidates(driver).clear();
	 * GlobalSettingsPage.reportsCandidates(driver).sendKeys(String.valueOf(20));
	 * GlobalSettingsPage.defaultBatchLocation(driver).click();
	 * GlobalSettingsPage.defaultBatchLocation_option(driver).click();
	 * GlobalSettingsPage.defaultBatchBuilding(driver).click();
	 * GlobalSettingsPage.defaultBatchBuilding_option(driver).click();
	 * GlobalSettingsPage.minimumBatchSize(driver).clear();
	 * GlobalSettingsPage.minimumBatchSize(driver).sendKeys(String.valueOf(40));
	 * GlobalSettingsPage.maximumBatchSize(driver).clear();
	 * GlobalSettingsPage.maximumBatchSize(driver).sendKeys(String.valueOf(50));
	 * GlobalSettingsPage.defaultBatchLength(driver).clear();
	 * GlobalSettingsPage.defaultBatchLength(driver).sendKeys(String.valueOf(60));
	 * GlobalSettingsPage.minimumBatches(driver).clear();
	 * GlobalSettingsPage.minimumBatches(driver).sendKeys(String.valueOf(70));
	 * GlobalSettingsPage.save(driver).click(); Thread.sleep(5000); }
	 */
	
	@Test(priority=3, enabled = true) 
	public void Trainer_Info() {
		String name1 = null;
		String name2 = null;
		try {
			TrainersCukes.vp_clicked_on_the_Trainers_tab(driver);
			Thread.sleep(2000);
			TrainersCukes.vp_clicked_on_the_trainer_Matt_Barkley(driver);
			Thread.sleep(2000);
			TrainersCukes.the_page_changes_to_Matt_Barkley_s_info(driver);
			Thread.sleep(2000);
			name1 = TrainersPage.trainerFirstName(driver).getText();
			name2 = TrainersPage.trainerLastName(driver).getText();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name1);
		System.out.println(name2);
		Assert.assertTrue(name1.equals("Matt"));
		Assert.assertTrue(name2.equals("Barkley"));
		
	}
	
	
	@Test(priority=3, enabled = false) 
	public void VP_Adds_Trainer() {
		
		int size_of_inactive_before=0;
		int size_of_inactive_after=0;
		try {
			
			TrainersCukes.vp_clicked_on_the_Trainers_tab(driver);
			System.out.println("The number of inactive trainers before VP adds a trainer: " + TrainersPage.size_of_inactivetrainers(driver));
			size_of_inactive_before = TrainersPage.size_of_inactivetrainers(driver);
			Thread.sleep(3000);
			TrainersCukes.vp_clicked_on_the_add_trainer_button(driver);
			Thread.sleep(2000);
			TrainersCukes.vp_entered_Richard_first_name(driver);
			Thread.sleep(2000);
			TrainersCukes.vp_entered_Bumer_last_name(driver);
			Thread.sleep(2000);
			TrainersCukes.vp_clicks_on_save(driver);
			Thread.sleep(5000);
			TrainersCukes.size_of_inactive_trainers_is_increased_by(driver);
			
			System.out.println("The number of inactive trainers after VP adds a trainer: " + TrainersPage.size_of_inactivetrainers(driver));
			size_of_inactive_after = TrainersPage.size_of_inactivetrainers(driver); 
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Assert.assertTrue(!Integer.valueOf(size_of_inactive_before).equals(Integer.valueOf(size_of_inactive_after)));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

@Test(priority=3, enabled = false) 
public void VP_Cancels_Trainer() {
		
		int size_of_inactive_before = 0;
		int size_of_inactive_after = 0;
		try {
			
			TrainersCukes.vp_clicked_on_the_Trainers_tab(driver);
			System.out.println("The number of inactive trainers before VP cancels a trainer: " + TrainersPage.size_of_inactivetrainers(driver));
			size_of_inactive_before = TrainersPage.size_of_inactivetrainers(driver);
			Thread.sleep(3000);
			TrainersCukes.vp_clicks_on_add_trainer_button(driver);
			Thread.sleep(3000);
			TrainersCukes.vp_enters_Randy_for_first_name(driver);
			Thread.sleep(3000);
			TrainersCukes.vp_enters_Jackson_for_last_name(driver);
			Thread.sleep(3000);
			TrainersCukes.vp_clicks_on_cancel(driver);
			Thread.sleep(5000);
			TrainersCukes.size_of_inactive_trainers_remains_the_same(driver);
			
			System.out.println("The number of inactive trainers after VP cancels a trainer: " + TrainersPage.size_of_inactivetrainers(driver));
			size_of_inactive_after = TrainersPage.size_of_inactivetrainers(driver); 
				
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Assert.assertTrue(Integer.valueOf(size_of_inactive_before).equals(Integer.valueOf(size_of_inactive_after)));
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

@Test(priority=3, enabled = false)  
public void VP_Deactivates_Trainer() {
	
	int size_of_active_before = 0;
	int size_of_active_after = 0;
	try {
		
		TrainersCukes.vp_clicked_on_the_Trainers_tab(driver);
		System.out.println("The number of active trainers before VP deactivates a trainer: " + TrainersPage.size_of_activetrainers(driver));
		size_of_active_before = TrainersPage.size_of_activetrainers(driver);
		Thread.sleep(5000);
		TrainersCukes.vp_clicks_on_the_deactivate_button_for_Matt_Patinos(driver);
		Thread.sleep(3000);
		TrainersCukes.size_of_trainers_decreases_by(driver);
		
		System.out.println("The number of active trainers after VP deactivates a trainer: " + TrainersPage.size_of_activetrainers(driver));
		size_of_active_after = TrainersPage.size_of_activetrainers(driver); 	
		
	} catch (Throwable e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	Assert.assertTrue(!Integer.valueOf(size_of_active_before).equals(Integer.valueOf(size_of_active_after)));
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

@Test(priority=3, enabled = false) 
public void VP_Activates_Trainer() {
	
	int size_of_inactive_before = 0;
	int size_of_inactive_after = 0;
	try {
		
		TrainersCukes.vp_clicked_on_the_Trainers_tab(driver);
		System.out.println("The number of inactive trainers before VP activates a trainer: " + TrainersPage.size_of_inactivetrainers(driver));
		size_of_inactive_before = TrainersPage.size_of_inactivetrainers(driver);
		
		Thread.sleep(3000);
		TrainersCukes.vp_clicked_on_the_activate_button_for_inactive_trainer_Richard_Smith(driver);
		Thread.sleep(3000);
		TrainersCukes.size_of_inactive_trainers_is_decreased_by(driver);
		
		System.out.println("The number of inactive trainers after VP activates a trainer: " + TrainersPage.size_of_inactivetrainers(driver));
		size_of_inactive_after = TrainersPage.size_of_activetrainers(driver); 	
		 	
		
	} catch (Throwable e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	Assert.assertTrue(!Integer.valueOf(size_of_inactive_before).equals(Integer.valueOf(size_of_inactive_after)));
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

@Test(priority=3, enabled = false) 
public void VP_Cancels_PTO() {
	
	
	try {
		
		TrainersCukes.vp_clicked_on_the_Trainers_tab(driver);
		Thread.sleep(3000);
		TrainersCukes.vp_clicks_on_the_calendar_button(driver);
		Thread.sleep(3000);
		TrainersCukes.vp_clicks_on_new_pto_request(driver);
		Thread.sleep(3000);
		TrainersCukes.vp_clicks_on_start_date(driver);
		Thread.sleep(3000);
		TrainersCukes.vp_clicks_on_month_April(driver);
		Thread.sleep(4000);
		TrainersCukes.vp_clicks_on_the_th_day(driver);
		Thread.sleep(4000);
		TrainersCukes.vp_clicks_on_end_date(driver);
		Thread.sleep(3000);
		TrainersCukes.vp_clicks_on_month_May(driver);
		Thread.sleep(4000);
		TrainersCukes.vp_clicks_on_th_day(driver);
		Thread.sleep(4000);
		TrainersCukes.vp_clicks_cancel(driver);
		Thread.sleep(3000);
		TrainersCukes.vp_clicks_cancel_pto_request(driver);
		Thread.sleep(3000);
		TrainersCukes.vp_is_directed_to_the_trainers_home_page(driver);
		Thread.sleep(3000);
		 	
		
	} catch (Throwable e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	WebElement trainerspage = driver.findElement(By.xpath("/html/body/div"));
	
	Assert.assertTrue(trainerspage.isDisplayed());
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

@Test(priority=3, enabled = false) 
public void VP_Creates_PTO() {
	
	
	try {
		
		TrainersCukes.vp_clicked_on_the_Trainers_tab(driver);
		Thread.sleep(2000);
		TrainersCukes.vp_clicked_on_the_calendar_button(driver);
		Thread.sleep(3000);
		TrainersCukes.vp_clicked_on_new_pto_request_button(driver);
		Thread.sleep(3000);
		TrainersCukes.vp_clicked_on_start_date(driver);
		Thread.sleep(2000);
		TrainersCukes.vp_clicked_on_month_February(driver);
		Thread.sleep(2000);
		TrainersCukes.vp_clicked_on_the_th_day(driver);
		Thread.sleep(2000);
		TrainersCukes.vp_clicked_on_the_end_date(driver);
		Thread.sleep(2000);
		TrainersCukes.vp_clicked_on_month_March(driver);
		Thread.sleep(2000);
		TrainersCukes.vp_clicked_on_th_day(driver);
		Thread.sleep(2000);
		TrainersCukes.vp_clicked_on_send(driver);
		Thread.sleep(2000);
		TrainersCukes.vp_is_directed_to_choose_a_Gmail_account(driver);
		Thread.sleep(3000);
		 	
		
	} catch (Throwable e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	// Assert.assertTrue(false);
	
}
	

	@Test(priority=3, enabled=false)
	public void VP_Edits_Settings() {
		
		String valueBefore= null, valueBefore2=null, valueBefore3=null, valueBefore4=null, valueBefore5=null, valueBefore6=null, valueBefore7=null, valueBefore8=null, valueBefore9=null;
		String input1=null, input2=null, input3=null, input4=null, input5=null, input6=null, input7=null, input8=null, input9=null;
		String valueAfter=null, valueAfter2=null, valueAfter3=null, valueAfter4=null, valueAfter5=null, valueAfter6=null, valueAfter7=null, valueAfter8=null, valueAfter9=null;
		try {
			
			
			SettingsCukes.i_clicked_on_the_Settings_tab(driver);
			
			valueBefore= GlobalSettingsPage.timelineTypeVP(driver).getAttribute("value");
			System.out.println("Value of timeline trainers before: " + valueBefore);
			SettingsCukes.i_enter_a_value_of_for_timeline_trainers(driver);
			input1= GlobalSettingsPage.timelineTypeVP(driver).getAttribute("value");
			System.out.println("Value of timeline trainers new input: " + input1);
			
			
			valueBefore2= GlobalSettingsPage.reportsGrads(driver).getAttribute("value");
			System.out.println("Value of outgoing grads before: " + valueBefore2);
			SettingsCukes.i_enter_a_value_of_for_reports_outgoing_grads(driver);
			input2= GlobalSettingsPage.reportsGrads(driver).getAttribute("value");
			System.out.println("Value of outgoing grads new input: " + input2);
			
			valueBefore3= GlobalSettingsPage.reportsCandidates(driver).getAttribute("value");
			System.out.println("Value of reports candidates incoming before : " + valueBefore3);
			SettingsCukes.i_enter_a_value_of_for_reports_candidates_coming(driver);
			input3= GlobalSettingsPage.reportsCandidates(driver).getAttribute("value");
			System.out.println("Value of reports candidates incoming new input : " + input3);
			
			valueBefore4= GlobalSettingsPage.defaultBatchLocation(driver).getText();
			System.out.println("Value of default batch location before : " + valueBefore4);
			SettingsCukes.i_click_on_Tempe_as_the_default_batch_location(driver);
			input4= GlobalSettingsPage.defaultBatchLocation(driver).getText();
			System.out.println("Value of default batch location new input : " + input4);
			
			
			valueBefore5= GlobalSettingsPage.defaultBatchBuilding(driver).getText();
			System.out.println("Value of default batch building before : " + valueBefore5);
			SettingsCukes.i_click_on_bbb_as_the_default_batch_building(driver);
			input5= GlobalSettingsPage.defaultBatchBuilding(driver).getText();
			System.out.println("Value of default batch building new input : " + input5);
			
			
			valueBefore6= GlobalSettingsPage.minimumBatchSize(driver).getAttribute("value");
			System.out.println("Value of minimum batch size before : " + valueBefore6);
			SettingsCukes.i_enter_for_minimum_batch_size(driver);
			input6= GlobalSettingsPage.minimumBatchSize(driver).getAttribute("value");
			System.out.println("Value of minimum batch size new input : " + input6);
			
			valueBefore7= GlobalSettingsPage.maximumBatchSize(driver).getAttribute("value");
			System.out.println("Value of maximum batch size before : " + valueBefore7);
			SettingsCukes.i_enter_for_maximum_batch_size(driver);
			input7= GlobalSettingsPage.maximumBatchSize(driver).getAttribute("value");
			System.out.println("Value of maximum batch size new input : " + input7);
			
			valueBefore8= GlobalSettingsPage.defaultBatchLength(driver).getAttribute("value");
			System.out.println("Value of default batch length before : " + valueBefore8);
			SettingsCukes.i_enter_for_default_batch_length(driver);
			input8= GlobalSettingsPage.defaultBatchLength(driver).getAttribute("value");
			System.out.println("Value of default batch length new input : " + input8);
			
			valueBefore9= GlobalSettingsPage.minimumBatches(driver).getAttribute("value");
			System.out.println("Value of minimum day between trainers batch before : " + valueBefore9);
			SettingsCukes.i_enter_for_minimum_day_between_trainers_batch(driver);
			input9= GlobalSettingsPage.minimumBatches(driver).getAttribute("value");
			System.out.println("Value of minimum day between trainers batch new input : " + input9);
			
			SettingsCukes.i_click_save(driver);
			
			SettingsCukes.i_should_be_able_to_see_that_all_settings_have_been_updated_popup_message(driver);
			
			valueAfter = GlobalSettingsPage.timelineTypeVP(driver).getAttribute("value");
			System.out.println("Value of timeline trainers after saving: " + valueAfter);
			
			valueAfter2 = GlobalSettingsPage.reportsGrads(driver).getAttribute("value");
			System.out.println("Value of outgoing grads after saving: " + valueAfter2);
			
			valueAfter3 = GlobalSettingsPage.reportsCandidates(driver).getAttribute("value");
			System.out.println("Value of reports candidates incoming after saving: " + valueAfter3);
			
			valueAfter4 = GlobalSettingsPage.defaultBatchLocation(driver).getText();
			System.out.println("Value of default batch location after saving: " + valueAfter4);
			
			
			valueAfter5 = GlobalSettingsPage.defaultBatchBuilding(driver).getText();
			System.out.println("Value of default batch building after saving: " + valueAfter5);
			
			
			valueAfter6 = GlobalSettingsPage.minimumBatchSize(driver).getAttribute("value");
			System.out.println("Value of minimum batch size after saving: " + valueAfter6);
			
			valueAfter7 = GlobalSettingsPage.maximumBatchSize(driver).getAttribute("value");
			System.out.println("Value of maximum batch size after saving: " + valueAfter7);
			
			valueAfter8 = GlobalSettingsPage.defaultBatchLength(driver).getAttribute("value");
			System.out.println("Value of default batch length after saving: " + valueAfter8);
			
			valueAfter9 = GlobalSettingsPage.minimumBatches(driver).getAttribute("value");
			System.out.println("Value of minimum day between trainers batch after saving: " + valueAfter9);
			
		} catch (Throwable e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		Assert.assertTrue(input1.equals(valueAfter));
		Assert.assertTrue(input2.equals(valueAfter2));
		Assert.assertTrue(input3.equals(valueAfter3));
		Assert.assertTrue(input4.equals(valueAfter4));
		Assert.assertTrue(input5.equals(valueAfter5));
		Assert.assertTrue(input6.equals(valueAfter6));
		Assert.assertTrue(input7.equals(valueAfter7));
		Assert.assertTrue(input8.equals(valueAfter8));
		Assert.assertTrue(input9.equals(valueAfter9));
		
	}
	
	@Test(priority=4, enabled = false)
	public void VP_edits_some_settings() {
		String valueBefore= null, valueBefore2=null, valueBefore3=null;
		String input1=null, input2=null, input3=null;
		String valueAfter=null, valueAfter2=null, valueAfter3=null;
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			
			SettingsCukes.vp_click_on_the_Settings_tab(driver);
			
			valueBefore= GlobalSettingsPage.timelineTypeVP(driver).getAttribute("value");
			System.out.println("Value of timeline trainers before: " + valueBefore);
			SettingsCukes.vp_enter_a_value_of_for_timeline_trainers(driver);
			input1= GlobalSettingsPage.timelineTypeVP(driver).getAttribute("value");
			System.out.println("Value of timeline trainers new input: " + input1);
			
			valueBefore2= GlobalSettingsPage.reportsCandidates(driver).getAttribute("value");
			System.out.println("Value of reports candidates incoming before : " + valueBefore2);
			SettingsCukes.vp_enter_a_value_of_for_reports_candidates_coming(driver);
			input2= GlobalSettingsPage.reportsCandidates(driver).getAttribute("value");
			System.out.println("Value of reports candidates incoming new input : " + input2);
			
			valueBefore3= GlobalSettingsPage.minimumBatchSize(driver).getAttribute("value");
			System.out.println("Value of minimum batch size before : " + valueBefore3);
			SettingsCukes.vp_enter_for_minimum_batch_size(driver);
			input3= GlobalSettingsPage.minimumBatchSize(driver).getAttribute("value");
			System.out.println("Value of minimum batch size new input : " + input3);
			
			SettingsCukes.vp_click_save(driver);
			SettingsCukes.vp_should_be_able_to_see_that_all_settings_have_been_updated_popup_message(driver);
			Thread.sleep(5000);
			
			valueAfter = GlobalSettingsPage.timelineTypeVP(driver).getAttribute("value");
			System.out.println("Value of timeline trainers after saving: " + valueAfter);
			
			valueAfter2 = GlobalSettingsPage.reportsCandidates(driver).getAttribute("value");
			System.out.println("Value of reports candidates incoming after saving: " + valueAfter2);
			
			valueAfter3 = GlobalSettingsPage.minimumBatchSize(driver).getAttribute("value");
			System.out.println("Value of minimum batch size after saving: " + valueAfter3);
			
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Assert.assertTrue(input1.equals(valueAfter));
		Assert.assertTrue(input2.equals(valueAfter2));
		Assert.assertTrue(input3.equals(valueAfter3));
	}
	
	
	@Test(priority=5, enabled = false)
	public void VP_resets_their_edits() {
		String valueBefore = null, valueAfter= null;
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
			
			// Comparing the values of TimeLine Trainers Per Page before and after the resets
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
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//If aftervalue is different than before value then changed
		//Assert.assertTrue(!valueAfter.equals(valueBefore));
		Assert.assertTrue(!valueAfter.equals(valueAfterReset));
		Assert.assertTrue(!valueAfter1.equals(valueAfterReset2));
		Assert.assertTrue(!valueAfter2.equals(valueAfterReset3));
		Assert.assertTrue(!valueAfter3.equals(valueAfterReset4));
	}
	
	
	@Test(priority=6, enabled = false)
	public void I_enter_invalid_input() {
	
		String inputValue = null, inputValue2= null, inputValue3= null;
		String valueAfter = null, valueAfter2= null, valueAfter3= null;
		
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
			inputValue= GlobalSettingsPage.timelineTypeVP(driver).getAttribute("value");
			System.out.println("Value of timeline trainers after entering input: " + inputValue);
			
			SettingsCukes.i_enter_non_number_characters_for_reports_candidates_incoming(driver);
			inputValue2= GlobalSettingsPage.reportsCandidates(driver).getAttribute("value");
			System.out.println("Value of reports candidates incoming after entering input: " + inputValue2);
			
			SettingsCukes.i_enter_non_number_characters_for_default_batch_length(driver);
			inputValue3= GlobalSettingsPage.defaultBatchLength(driver).getAttribute("value");
			System.out.println("Value of default batch length after entering input: " + inputValue3);
			
			SettingsCukes.i_click_on_the_save_button(driver);
			
			SettingsCukes.i_should_be_able_to_see_blank_input_for_timeline_trainers_reports_candidates_incoming_and_default_batch_length(driver);
			
			valueAfter = GlobalSettingsPage.timelineTypeVP(driver).getAttribute("value");
			System.out.println("Value of timeline trainers after saving: " + valueAfter);
			
			valueAfter2 = GlobalSettingsPage.reportsCandidates(driver).getAttribute("value");
			System.out.println("Value of reports candidates incoming after saving: " + valueAfter2);
			
			valueAfter3 = GlobalSettingsPage.defaultBatchLength(driver).getAttribute("value");
			System.out.println("Value of default batch length after saving: " + valueAfter3);
			
			Thread.sleep(7000);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Assert.assertTrue(inputValue.equals(valueAfter));
		Assert.assertTrue(inputValue2.equals(valueAfter2));
		Assert.assertTrue(inputValue3.equals(valueAfter3));
	}
	
	@Test(priority=7, enabled = false)
	public void VP_saves_empty_input() {
		
		String valueBefore = null, valueBefore2 = null, valueBefore3 = null;
		String inputValue = null, inputValue2= null, inputValue3= null;
		String valueAfterSave = null, valueAfterSave2= null, valueAfterSave3= null;
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			SettingsCukes.vp_clicked_on_the_Settings_tab(driver);
			
			valueBefore= GlobalSettingsPage.reportsCandidates(driver).getAttribute("value");
			System.out.println("Value of reports candidates incoming before: " + valueBefore);
			SettingsCukes.vp_entered_empty_text_for_reports_outgoing_candidates(driver);
			inputValue= GlobalSettingsPage.reportsCandidates(driver).getAttribute("value");
			System.out.println("Value of reports candidates incoming after entering input: " + inputValue);
			
			valueBefore2= GlobalSettingsPage.minimumBatchSize(driver).getAttribute("value");
			System.out.println("Value of minimum batch size before: " + valueBefore2);
			SettingsCukes.vp_entered_empty_text_for_minimum_batch_size(driver);
			inputValue2= GlobalSettingsPage.minimumBatchSize(driver).getAttribute("value");
			System.out.println("Value of minimum batch size after entering input: " + inputValue2);
			
			valueBefore3= GlobalSettingsPage.maximumBatchSize(driver).getAttribute("value");
			System.out.println("Value of maximum batch size before: " + valueBefore3);
			SettingsCukes.vp_entered_empty_text_for_maximum_batch_size(driver);
			inputValue3= GlobalSettingsPage.maximumBatchSize(driver).getAttribute("value");
			System.out.println("Value of maximum batch size after entering input: " + inputValue3);
			
			SettingsCukes.i_click_on_save(driver);
			
			
			SettingsCukes.vp_should_see_blank_input_for_timeline_trainers(driver);
			
			valueAfterSave = GlobalSettingsPage.reportsCandidates(driver).getAttribute("value");
			System.out.println("Value of reports candidates incoming after saving: " + valueAfterSave);
			
			valueAfterSave2 = GlobalSettingsPage.minimumBatchSize(driver).getAttribute("value");
			System.out.println("Value of minimum batch size after saving: " + valueAfterSave2);
			
			valueAfterSave3 = GlobalSettingsPage.maximumBatchSize(driver).getAttribute("value");
			System.out.println("Value of maximum batch size after saving: " + valueAfterSave3);
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Assert.assertTrue(inputValue.equals(valueAfterSave));
		Assert.assertTrue(inputValue2.equals(valueAfterSave2));
		Assert.assertTrue(inputValue3.equals(valueAfterSave3));
	}
	
	

	/*
	 * @Test
	 * 
	 * try {
	 * SettingsCukes.i_click_on_New_York_City_as_the_default_batch_location(driver);
	 * } catch (Throwable e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 * 
	 * try { SettingsCukes.i_enter_for_minimum_days_between_trainer_batches(driver);
	 * } catch (Throwable e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 * 
	 * try {
	 * SettingsCukes.i_should_be_able_to_see_the_settings_reset_popup_message(driver
	 * ); } catch (Throwable e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 * 
	 * try {
	 * SettingsCukes.i_enter_alphabetical_characters_for_timeline_trainers(driver);
	 * } catch (Throwable e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 * 
	 * try {
	 * SettingsCukes.i_enter_non_number_characters_for_reports_candidates_incoming(
	 * driver); } catch (Throwable e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 * 
	 * try {
	 * SettingsCukes.i_enter_non_number_characters_for_default_batch_length(driver);
	 * } catch (Throwable e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 * 
	 * try { SettingsCukes.
	 * i_should_be_able_to_see_blank_input_for_timeline_trainers_reports_candidates_incoming_and_default_batch_length
	 * (driver); } catch (Throwable e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 * 
	 * try {
	 * SettingsCukes.i_should_be_able_to_see_blank_input_for_timeline_trainers(
	 * driver); } catch (Throwable e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 * 
	 * 
	 * 
	 * }
	 */

	@Test(priority=8)
	private static void logout() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LogoutPage.tab(driver).click();
	}

	@Test(priority=9)
	void closeApp() {
		driver.quit();
	}

	/*
	 * static WebDriver wd = null;
	 * 
	 * @BeforeSuite(groups="iteration1") private static void openApplication() {
	 * File f1 = new File("src/main/resources/chromedriver.exe");
	 * System.setProperty("webdriver.chrome.driver", f1.getAbsolutePath()); wd = new
	 * ChromeDriver(); }
	 * 
	 * @BeforeTest(groups="iteration1") void login() {
	 * wd.get("http://newtours.demoaut.com"); LoginPage2.user(wd).sendKeys("yuvi1");
	 * LoginPage2.password(wd).sendKeys("yuvi1"); LoginPage2.signin(wd).submit(); }
	 * 
	 * //@Ignore
	 * 
	 * @Test(priority=0, enabled=true, groups ="iteration1") void verifyLogin() {
	 * String s1 =
	 * wd.findElement(By.xpath("//a[@href=\"mercurysignoff.php\"]")).getText();
	 * assertEquals(s1, "SIGN-OFF"); }
	 * 
	 * @Test(enabled = true, priority=1, groups ="iteration2") private static void
	 * navigateToFlightFinder() { FlightFinder.tripType(wd).click();
	 * FlightFinder.departFrom(wd).sendKeys("Paris");
	 * FlightFinder.arriveTo(wd).sendKeys("Frankfurt");
	 * FlightFinder.airline(wd).sendKeys("No Preference");
	 * FlightFinder.findFlightsButton(wd).click(); }
	 * 
	 * @AfterTest(groups="iteration1") void logout() { Logout2.signoff(wd).click();
	 * }
	 * 
	 * @AfterSuite(groups="iteration1") void closeApp(){ wd.quit(); }
	 * 
	 */
}
