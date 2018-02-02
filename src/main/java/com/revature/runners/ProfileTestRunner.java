package com.revature.runners;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.revature.cukes.ProfileCukes;
import com.revature.pom.LoginPage;
import com.revature.pom.ProfilePage;

public class ProfileTestRunner {
	
	private static WebDriver driver = null;
	
	@Test(priority = 1)
	private static void openApplication() {
		File f1 = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", f1.getAbsolutePath());
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://dev.assignforce.revaturelabs.com");
	}

	@Test(priority = 2)
	private static void testLoginMethod() {
		//LoginPage.user(driver).sendKeys("test.vpoftech@revature.com.int1 ");
		//LoginPage.password(driver).sendKeys("yuvi1712");
		//LoginPage.submit(driver).click();
		
		LoginPage.user(driver).sendKeys("test.trainer@revature.com.int1");
		LoginPage.password(driver).sendKeys("trainer123");
		LoginPage.submit(driver).click();
		
		try {
			ProfileCukes.i_m_in_the_profile_page(driver);
		} catch (Throwable e) {
		
			e.printStackTrace();
		}
	}
	

	//Selecting a skill i.e adding a skill
	//Good
	@Test(priority = 3, enabled = true)
	public static void selectSkill() {
		int before = 0, after = 0;
		try {
			
			//Thread.sleep(2000);
			//ProfileCukes.i_m_in_the_profile_page(driver);
			
			Thread.sleep(2000);
			before = ProfilePage.skillsList(driver);
			System.out.println("before: " + before);
			
			Thread.sleep(2000);
			ProfileCukes.i_select_a_skill(driver);
			
			Thread.sleep(2000);
			after = ProfilePage.skillsList(driver);
			System.out.println("after: " + after);
			
			Thread.sleep(2000);

		} catch (Throwable e) {
			
			e.printStackTrace();
		}
		
		Assert.assertTrue(after < before);
	}

	
	//Remove skill
	//Good
	@Test(priority = 4, enabled = true)
	public static void removeSkill() {
		int before = 0, after = 0;
			
			try {
				
				
				//ProfileCukes.i_m_in_the_profile_page(driver);
				
				Thread.sleep(2000);
				before = ProfilePage.currentskillsList(driver);
				System.out.println("before: " + before);
				
				Thread.sleep(2000);
				ProfileCukes.i_select_a_current_skill(driver);
				
				Thread.sleep(2000);
				before = ProfilePage.currentskillsList(driver);
				System.out.println("after: " + after);
				
				
			} catch (Throwable e) {
				
				e.printStackTrace();
			}
			
			Assert.assertTrue(before > after);
	}
	
	/*
	Scenario: Add certification
    Given I'm in the profile page
    Then I click the add certification button
    Find way to test upload
	 */
	@Test(priority = 5, enabled = false)
	public void addCertification() {
		
		try {
			ProfileCukes.i_m_in_the_profile_page(driver);
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
	}
	

	//Save skills
	//Good
	@Test(priority = 6, enabled = true)
	public void saveSkills() {
		String popupTxt = null;
		
		try {
			
			//Thread.sleep(2000);
			//ProfileCukes.i_m_in_the_profile_page(driver);
			
			Thread.sleep(2000);
			ProfileCukes.i_click_the_save_skills_button(driver);
			
			Thread.sleep(2000);
			popupTxt = ProfilePage.popupBox(driver).getText();
			System.out.println("popupTxt: " + popupTxt);
			
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
		Assert.assertTrue(popupTxt.equals("Skills have been saved!"));
	}
	
	
	//Remove certification
	@Test(priority = 7, enabled = true)
	public void removeCertification() {
		String popupBoxTxt = null;
		try {
			
			//Thread.sleep(2000);
			//ProfileCukes.i_m_in_the_profile_page(driver);
			Thread.sleep(2000);
			ProfileCukes.i_click_the_remove_certification_button(driver);
			popupBoxTxt = ProfilePage.popupBox(driver).getText();
			System.out.println("popupBoxTxt: " + popupBoxTxt);
			
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
		
		Assert.assertTrue(popupBoxTxt.equals("Removed Certification Successfully"));
	}
	
	
	@Test(priority = 7)
	public void closeApplication() {
		driver.close();
	}
	
	

}
