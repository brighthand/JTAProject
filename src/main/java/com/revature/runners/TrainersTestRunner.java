package com.revature.runners;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.revature.cukes.ReportsCukes;
import com.revature.cukes.SettingsCukes;
import com.revature.cukes.TrainersCukes;
import com.revature.pom.GlobalSettingsPage;
import com.revature.pom.LoginPage;
import com.revature.pom.LogoutPage;
import com.revature.pom.TrainersPage;

public class TrainersTestRunner {
	
	
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

	
	@Test(priority = 4, enabled = true)
	public void Resume() {

		String popup = null;

		try {
			
			TrainersCukes.vp_clicked_on_the_Trainers_tab(driver);
			Thread.sleep(3000);
			TrainersPage.resume(driver, String.valueOf(1)).click();
			Thread.sleep(3000);
			popup = TrainersPage.popup(driver).getText();
			System.out.println(popup);

		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Assert.assertTrue(popup.equals("Add Test does not have any resume uploaded."));


		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	@Test(priority = 5, enabled = true)
	public void Trainer_Info() {
		String name1 = null;
		String name2 = null;
		try {
			TrainersCukes.vp_clicked_on_the_Trainers_tab(driver);
			Thread.sleep(2000);
			TrainersPage.clickTrainer(driver).click();
			Thread.sleep(2000);
			Thread.sleep(2000);
			name1 = TrainersPage.trainerFirstName(driver).getText();
			Thread.sleep(2000);
			name2 = TrainersPage.trainerLastName(driver).getText();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name1);
		System.out.println(name2);
		Assert.assertTrue(name1.equals("Add"));
		Assert.assertTrue(name2.equals("Test"));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 3, enabled = true)
	public void VP_Adds_Trainer() {

		String popup = null;
		try {

			TrainersCukes.vp_clicked_on_the_Trainers_tab(driver);
			Thread.sleep(2000);
			TrainersCukes.vp_clicked_on_the_add_trainer_button(driver);
			Thread.sleep(2000);
			TrainersCukes.vp_entered_Richard_first_name(driver);
			Thread.sleep(2000);
			TrainersCukes.vp_entered_Bumer_last_name(driver);
			Thread.sleep(2000);
			TrainersCukes.vp_clicks_on_save(driver);
			Thread.sleep(3000);

			popup = TrainersPage.popup(driver).getText();
			System.out.println(popup);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Assert.assertTrue(popup.equals("Trainer Added."));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * @Test(priority=4, enabled = true) public void VP_Cancels_Trainer() {
	 * 
	 * String popup = null; try {
	 * 
	 * Thread.sleep(3000); Thread.sleep(1000);
	 * TrainersCukes.vp_clicks_on_add_trainer_button(driver); Thread.sleep(2000);
	 * TrainersPage.FirstName(driver).sendKeys("Rand");
	 * //TrainersCukes.vp_enters_Randy_for_first_name(driver); Thread.sleep(2000);
	 * TrainersPage.LastName(driver).sendKeys("Jacks");
	 * //TrainersCukes.vp_enters_Jackson_for_last_name(driver); Thread.sleep(2000);
	 * TrainersCukes.vp_clicks_on_cancel(driver); Thread.sleep(4000);
	 * TrainersCukes.size_of_inactive_trainers_remains_the_same(driver); popup =
	 * TrainersPage.popup(driver).getText();
	 * 
	 * 
	 * 
	 * 
	 * } catch (Throwable e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 * 
	 * Assert.assertTrue(popup.equals("Failed to add trainer."));
	 * 
	 * try { Thread.sleep(3000); } catch (InterruptedException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); } }
	 * 
	 */

	
	@Test(priority = 6, enabled = true)
	public void VP_Deactivates_Trainer() {

		String popup = null;

		try {

			TrainersCukes.vp_clicked_on_the_Trainers_tab(driver);
			Thread.sleep(3000);
			//TrainersCukes.vp_clicks_on_the_deactivate_button_for_Matt_Patinos(driver);
			TrainersPage.deactivate(driver, String.valueOf(1)).click();
			Thread.sleep(3000);
			popup = TrainersPage.popup(driver).getText();
			System.out.println(popup);

		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Assert.assertTrue(popup.equals("Add Test was removed successfully."));

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	
	@Test(priority = 7, enabled = true)
	public void VP_Activates_Trainer() {

		String popup = null;

		try {
			
			
			Thread.sleep(2000);
			TrainersCukes.vp_clicked_on_the_Trainers_tab(driver);
			Thread.sleep(3000);
			//TrainersCukes.vp_clicked_on_the_activate_button_for_inactive_trainer_Richard_Smith(driver);
			TrainersPage.reactivate(driver, String.valueOf(1)).click();
			// /html/body/div/div[2]/div/md-card/md-content[1]/md-list/md-list-item[1]/div/div[1]/button[2]
			// /html/body/div/div[2]/div/md-card/md-content[1]/md-list/md-list-item[2]/div/div[1]/button[2]		
			Thread.sleep(3000);
			TrainersCukes.size_of_inactive_trainers_is_decreased_by(driver);
			popup = TrainersPage.popup(driver).getText();
			System.out.println(popup);

		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Assert.assertTrue(popup.equals("Add Test Activated"));

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	@Test(priority = 8, enabled = true)
	public void VP_Cancels_PTO() {

		try {

			TrainersCukes.vp_clicked_on_the_Trainers_tab(driver);
			Thread.sleep(2000);
			TrainersCukes.vp_clicks_on_the_calendar_button(driver);
			Thread.sleep(2000);
			TrainersCukes.vp_clicks_on_new_pto_request(driver);
			Thread.sleep(2000);
			TrainersCukes.vp_clicks_on_start_date(driver);
			Thread.sleep(2000);
			TrainersCukes.vp_clicks_on_month_April(driver);
			Thread.sleep(2000);
			TrainersCukes.vp_clicks_on_the_th_day(driver);
			Thread.sleep(2000);
			TrainersCukes.vp_clicks_on_end_date(driver);
			Thread.sleep(2000);
			TrainersCukes.vp_clicks_on_month_May(driver);
			Thread.sleep(2000);
			TrainersCukes.vp_clicks_on_th_day(driver);
			Thread.sleep(2000);
			TrainersCukes.vp_clicks_cancel(driver);
			Thread.sleep(2000);
			TrainersCukes.vp_clicks_cancel_pto_request(driver);
			Thread.sleep(2000);
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

	@Test(priority = 9, enabled = true)
	public void VP_Creates_PTO() {

		try {

			TrainersCukes.vp_clicked_on_the_Trainers_tab(driver);
			Thread.sleep(1000);
			TrainersCukes.vp_clicked_on_the_calendar_button(driver);
			Thread.sleep(1000);
			TrainersCukes.vp_clicked_on_new_pto_request_button(driver);
			Thread.sleep(1000);
			TrainersCukes.vp_clicked_on_start_date(driver);
			Thread.sleep(1000);
			TrainersCukes.vp_clicked_on_month_February(driver);
			Thread.sleep(1000);
			TrainersCukes.vp_clicked_on_the_th_day(driver);
			Thread.sleep(1000);
			TrainersCukes.vp_clicked_on_the_end_date(driver);
			Thread.sleep(1000);
			TrainersCukes.vp_clicked_on_month_March(driver);
			Thread.sleep(1000);
			TrainersCukes.vp_clicked_on_th_day(driver);
			Thread.sleep(1000);
			TrainersCukes.vp_clicked_on_send(driver);
			Thread.sleep(1000);
			TrainersCukes.vp_is_directed_to_choose_a_Gmail_account(driver);
			Thread.sleep(1000);

		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Assert.assertFalse(true);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

	@Test(priority = 10)
	private static void logout() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LogoutPage.tab(driver).click();
	}

	@Test(priority = 11)
	void closeApp() {
		driver.quit();
	}

}

	
