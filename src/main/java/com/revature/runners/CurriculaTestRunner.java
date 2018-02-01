package com.revature.runners;


import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.revature.cukes.CurriculaCukes;
import com.revature.pom.CurriculaPage;
import com.revature.pom.LoginPage;

public class CurriculaTestRunner {
	
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
		LoginPage.user(driver).sendKeys("test.vpoftech@revature.com.int1");
		LoginPage.password(driver).sendKeys("yuvi1712");
		LoginPage.submit(driver).click();
		// LoginPage.user(driver).sendKeys("test.trainer@revature.com.int1");
		// LoginPage.password(driver).sendKeys("trainer123");
	}
	
	//Add new curriculum
	//Good
	@Test(priority = 3, enabled = false)
	public static void addCurriculum() {
		int before = 0, after = 0;
		
		try {
			
			CurriculaCukes.i_m_on_the_curricula_page(driver);
			CurriculaCukes.i_click_the_add_new_curriculum_button(driver);
			
			//Get the number of curricular before adding
			before = CurriculaPage.curriculaListSize(driver);
			System.out.println("beforeList: " + before);
			
			CurriculaCukes.clear_form_contents(driver);
			CurriculaCukes.enter_curriculum_information(driver);
			
			CurriculaCukes.click_the_save_button(driver);
			
			after = CurriculaPage.curriculaListSize(driver);
			System.out.println("afterList: " + after);
			
		} catch (Throwable e) {
		
			e.printStackTrace();
		}
		
		Assert.assertTrue(after > before);
	}

	//Edit curriculum
	//Good
	@Test(priority = 4, enabled = false)
	public static void editCurriculum() {
		
		String beforeCurricula = null , afterCurricula = null;
		String beforeSkills = null , afterSkills = null;
		
		try {
			
			CurriculaCukes.i_m_on_the_curricula_page(driver);
			
			beforeCurricula = CurriculaPage.curriculaLabel(driver).getText();
			beforeSkills = CurriculaPage.curriculaSkillsLabel(driver).getText();
			System.out.println("beforeCurricula: " + beforeCurricula);
			System.out.println("beforeSkills: " + beforeSkills);

			Thread.sleep(2000);
			CurriculaCukes.i_click_the_edit_curricula_button(driver);
			System.out.println("Clicked edit button");
			
			CurriculaCukes.clear_form_contents(driver);
			CurriculaCukes.edit_curriculum_information(driver);
			CurriculaCukes.click_the_save_button(driver);
			
			afterCurricula = CurriculaPage.curriculaLabel(driver).getText();
		    afterSkills = CurriculaPage.curriculaSkillsLabel(driver).getText();
			System.out.println("afterCurricula: " + afterCurricula);
			System.out.println("afterSkills: " + afterSkills);
			
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
		
		//Assert.assertTrue(!afterCurricula.equals(beforeCurricula) || !afterSkills.equals(beforeSkills));
	}
	

	//Remove core curriculum
	//Good 
	@Test(priority = 5, enabled = false)
	public static void removCore() {
		int before = 0, after = 0;
		try {
			
			CurriculaCukes.i_m_on_the_curricula_page(driver);
			
			before = CurriculaPage.curriculaListSize(driver);
			System.out.println("beforeList: " + before);
			
			Thread.sleep(2000);
			
			CurriculaCukes.i_click_the_remove_core_button(driver);
			
			Thread.sleep(2000);
			
			CurriculaCukes.click_the_form_remove_button(driver);
			
			Thread.sleep(2000);
			
			after = CurriculaPage.curriculaListSize(driver);
			System.out.println("afterList: " + after);
			
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
		
		Assert.assertTrue(after < before);
	}
	

	//Add focus
	//Good
	@Test(priority = 6, enabled = false)
	public static void addFocus() {
		int before = 0, after = 0;
		try {
			
			CurriculaCukes.i_m_on_the_curricula_page(driver);
			Thread.sleep(2000);
			CurriculaCukes.i_click_the_add_new_focus_button(driver);
			Thread.sleep(2000);
			
			//List size before adding
			
			before = CurriculaPage.focusListSize(driver);
			System.out.println("before: " + before);
			
			CurriculaCukes.clear_form_contents(driver);
			Thread.sleep(2000);
			
			CurriculaCukes.enter_focus_information(driver);
			Thread.sleep(2000);
			
			CurriculaCukes.click_the_save_button(driver);
			Thread.sleep(2000);
			
			//List size after adding
			after = CurriculaPage.focusListSize(driver);
			System.out.println("after: " + after);
			
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
		
		Assert.assertTrue(after > before);
	}
	

	//Edit focus
	//Good
	@Test(priority = 7, enabled = false)
	public void editFocus() {
		
		String beforeFocus = null , afterFocus = null;
		String beforeSkills = null , afterSkills = null;
		
		
		try {
			CurriculaCukes.i_m_on_the_curricula_page(driver);
			
			Thread.sleep(2000);
			beforeFocus = CurriculaPage.focusLabel(driver).getText();
			beforeSkills = CurriculaPage.focusSkillsLabel(driver).getText();
			System.out.println("beforeFocus: " + beforeFocus);
			System.out.println("beforeSkills: " + beforeSkills);
			
			Thread.sleep(2000);
			CurriculaCukes.i_click_the_edit_focus_button(driver);
			
			Thread.sleep(2000);
			CurriculaCukes.clear_form_contents(driver);
			
			Thread.sleep(5000);
			CurriculaCukes.edit_focus_information(driver);
			
			Thread.sleep(5000);
			CurriculaCukes.click_the_save_button(driver);
			
			Thread.sleep(5000);
			afterFocus = CurriculaPage.focusLabel(driver).getText();
			afterSkills = CurriculaPage.focusSkillsLabel(driver).getText();
			System.out.println("afterFocus: " + afterFocus);
			System.out.println("afterSkills: " + afterSkills);

			
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
		
		Assert.assertTrue(!afterFocus.equals(beforeFocus) || !afterSkills.equals(beforeSkills));
	}
	
	//Remove focus
	//Good
	@Test(priority = 9, enabled = false)
	public void removeFocus() {
		int before = 0, after = 0;
		try {
			
			CurriculaCukes.i_m_on_the_curricula_page(driver);
			
			before = CurriculaPage.focusListSize(driver);
			System.out.println("beforeList: " + before);
			
			CurriculaCukes.i_click_the_remove_focus_button(driver);
			
			Thread.sleep(3000);
			CurriculaCukes.click_the_form_remove_button(driver);
			
			Thread.sleep(3000);
			after = CurriculaPage.focusListSize(driver);
			System.out.println("afterList: " + after);
			
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
		
		Assert.assertTrue(after < before);
	}
	
	
	//Create skill
	//Problematic
	@Test(priority = 10, enabled = false)
	public static void createSkill() {
		int before = 0, after = 0;
		try {
			//Test verification by comparing size of skill list before and after.
			CurriculaCukes.i_m_on_the_curricula_page(driver);
			CurriculaCukes.enter_a_new_skill(driver);
			CurriculaCukes.click_the_create_button(driver);
			
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	
	@Test(priority = 11)
	public void closeApplication() {
		driver.close();
	}
}
