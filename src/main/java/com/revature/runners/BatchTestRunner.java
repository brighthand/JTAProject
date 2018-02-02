package com.revature.runners;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.revature.dao.BatchDaoImpl;
import com.revature.model.Batch;
import com.revature.pom.BatchPage;
import com.revature.pom.LoginPage;
import com.revature.pom.ProfilePage;

public class BatchTestRunner {

	static WebDriver wd = null;
	static WebDriverWait wait;
	
	static BatchDaoImpl ed = new BatchDaoImpl();
	static Batch thebatch = ed.findById(5);
	
	@Test(priority = 1)
	private static void openApplication() {
		File f1 = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", f1.getAbsolutePath());
		wd = new ChromeDriver();
		wd.get("https://dev.assignforce.revaturelabs.com");
	}
	
	@Test(priority = 2)
	private static void LoginMethod() throws InterruptedException {

		LoginPage.user(wd).sendKeys("test.vpoftech@revature.com.int1");
		LoginPage.password(wd).sendKeys("yuvi1712");
		LoginPage.submit(wd).submit();
		Thread.sleep(2000);// let the page load
	}

	@Test(priority = 3)
	private static void HeadToBatches() throws InterruptedException {

		BatchPage.batchestab(wd).click();
		Thread.sleep(1000);// let the page load
	}

	
	//Select curriculum
	@Test(priority = 4, enabled = true)
	private static void SelectCurriculum() throws InterruptedException { // can't create a batch without a
																					// batch!
		String curriculum = null, placeholder = null;
		
		BatchPage.corecurriculum(wd).click();
		placeholder = BatchPage.corecurriculum(wd).getAttribute("aria-label");
		System.out.println("Placeholder: " + placeholder);

		Thread.sleep(1000);
		WebElement selectElement = wd.findElement(By.id("select_container_10")); // containing class id

		List<WebElement> thelist = selectElement.findElements(By.tagName("md-option"));
		//System.out.println("test output: " + thelist.size()); // test output
		for (WebElement component : thelist) {
			//System.out.println(component.getText());
			if (component.getText().contains(thebatch.getCurriculum())) {
				component.click();
				break;
			} else {
				//System.out.println("no match");
				// component.click();
			}
		}
		curriculum = BatchPage.corecurriculum(wd).getText();
		System.out.println("After Curriculum: " + curriculum );
		
		Thread.sleep(3000);// let the page load
		
		Assert.assertTrue(!curriculum.equals(placeholder));
	}
	

	@Test(priority = 5, enabled = true)
	private static void SelectFocus() throws InterruptedException {

		String pHoldFocus = null, pHoldSkills = null, focus = null, skills = null;
		
		BatchPage.focus(wd).click();
		
		pHoldFocus = BatchPage.focus(wd).getAttribute("aria-label");
		pHoldSkills = BatchPage.skills(wd).getAttribute("aria-label");

		Thread.sleep(1000);
		WebElement selectElement = wd.findElement(By.id("select_container_12")); // containing class id

		List<WebElement> thelist = selectElement.findElements(By.tagName("md-option"));
		//System.out.println("test output: " + thelist.size()); // test output
		for (WebElement component : thelist) {
			//System.out.println(component.getText());
			if (component.getText().contains(thebatch.getFocus())) {
				component.click();
				break;
			} else {
				//System.out.println("no match");
				// component.click();
			}
			
			focus = BatchPage.focus(wd).getText();
			skills = BatchPage.skills(wd).getText();
		}
		

		Thread.sleep(3000);// let the page load
		
		Assert.assertTrue(!focus.equals(pHoldFocus) && !skills.equals(pHoldSkills));
	}

	@Test(priority = 6, enabled = false)
	private static void SelectSkills() throws InterruptedException { // XML FILE NEEDED FOR SOURCE

		BatchPage.skills(wd).click();

		//Thread.sleep(1000);
		WebElement selectElement = wd.findElement(By.id("select_container_14")); // containing class id

		List<WebElement> thelist = selectElement.findElements(By.tagName("md-option"));
		//System.out.println("test output: " + thelist.size()); // test output
		for (WebElement component : thelist) {
			//System.out.println(component.getText());
			if (component.getText().contains(thebatch.getSkills())) { // input to be replaced with an xml source
				//component.click();
				break;
			} else {
				//System.out.println("no match");
				// component.click();
			}
		}
		//Thread.sleep(2000);// let the page load
	}

	@Test(priority = 7, enabled = true)
	private static void SelectDates() throws InterruptedException {

		String bStartSize = null , bEndSize = null;
		String aStartSize = null, aEndSize = null;
		
		// BatchPage.startdate(wd).click();
		Thread.sleep(1000);
		// BatchPage.selectday(wd, "22").click();
		
		bStartSize = BatchPage.startdate(wd).getAttribute("size");
		bEndSize = BatchPage.enddate(wd).getAttribute("size");
		
		System.out.println("start: " + bStartSize);
		System.out.println("end: " + bEndSize);
		

		BatchPage.startdate(wd).sendKeys(thebatch.getStratDate());
		Thread.sleep(1000);
		BatchPage.startdate(wd).sendKeys(Keys.ENTER);
		Thread.sleep(1000);

		BatchPage.enddate(wd).sendKeys(thebatch.getEndDate());
		Thread.sleep(1000);
		BatchPage.enddate(wd).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		aStartSize = BatchPage.startdate(wd).getAttribute("size");
		aEndSize = BatchPage.enddate(wd).getAttribute("size");
		
		System.out.println("start: " + bEndSize);
		System.out.println("end: " + aEndSize);
		

		Assert.assertTrue(Integer.parseInt(bStartSize) < Integer.parseInt(aStartSize) &&
				Integer.parseInt(bEndSize) < Integer.parseInt(aEndSize));
		
		/*
		 * String day = "22"; WebElement selectDay =
		 * wd.findElement(By.xpath("//*[@id=\"md-1-month-2018-0-" + day + "\"]/span"));
		 * FAIL CODE! System.out.println("md-3-month-2018-0-" + day );
		 * selectDay.click();
		 */

		/*
		 * String day = "22"; wait = new WebDriverWait(wd, 5); //for waiting, I guess
		 * WebElement dateWidget =
		 * wd.findElement(By.cssSelector("#md-date-pane15 > div.md-datepicker-calendar")
		 * );
		 * 
		 * List<WebElement> rows = dateWidget.findElements(By.tagName("tr"));
		 * List<WebElement> columns = dateWidget.findElements(By.tagName("td"));
		 * 
		 * for (WebElement cell: columns) { System.out.println(cell.getText());
		 * //successfully prints column data if (cell.getText().equals(day)) {
		 * System.out.println("found a date");
		 * //cell.findElement(By.linkText("22")).click();
		 * cell.findElement(By.xpath("//*[@id=\"md-1-month-2018-0-" + day +
		 * "\"]/span")).click(); break; } }
		 */

	}

	@Test(priority = 8, enabled = true)
	private static void SelectTrainer() throws InterruptedException {

		String trainer = null, placeholder = null;
		
		BatchPage.trainer(wd).click();

		placeholder = BatchPage.trainer(wd).getAttribute("aria-label");
		
		WebElement selectElement = wd.findElement(By.id("select_container_22")); // containing class id

		Thread.sleep(2000);
		List<WebElement> thelist = selectElement.findElements(By.tagName("md-option"));
		//System.out.println("test output: " + thelist.size()); // test output
		for (WebElement component : thelist) {
			//System.out.println(component.getText());
			if (component.getText().contains(thebatch.getTrainer())) { // input to be replaced with an xml source
				component.click();
				break;
			} else {
				//System.out.println("no match");
				// component.click();
			}
		}
		
		trainer = BatchPage.trainer(wd).getText();
		Assert.assertTrue(!trainer.equals(placeholder));
		
		Thread.sleep(2000);

	}

	@Test(priority = 9, enabled = true)
	private static void SelectCotrainer() throws InterruptedException {
		String coTrainer = null, placeholder = null;
		BatchPage.cotrainer(wd).click();

		placeholder = BatchPage.cotrainer(wd).getAttribute("aria-label");
		
		WebElement selectElement = wd.findElement(By.id("select_container_24"));

		List<WebElement> thelist = selectElement.findElements(By.tagName("md-option"));
		//System.out.println("test output: " + thelist.size()); // test output
		for (WebElement component : thelist) {
			//System.out.println(component.getText());
			if (component.getText().contains(thebatch.getCotrainer())) {
				component.click();
				break;
			} else {
				//System.out.println("no match");
				// component.click();
			}
		}
		
		coTrainer = BatchPage.cotrainer(wd).getText();
		Assert.assertTrue(!coTrainer.equals(placeholder));

	}

	@Test(priority = 10, enabled = true)
	private static void SelectLocation() throws InterruptedException {

		String location = null, placeholder = null;
		
		BatchPage.location(wd).click();
		placeholder = BatchPage.location(wd).getAttribute("aria-label");

		WebElement selectElement = wd.findElement(By.id("select_container_26"));

		List<WebElement> thelist = selectElement.findElements(By.tagName("md-option"));
		//System.out.println("test output: " + thelist.size()); // test output
		for (WebElement component : thelist) {
			//System.out.println(component.getText());
			if (component.getText().contains(thebatch.getLocation())) {
				component.click();
				break;
			} else {
				//System.out.println("no match");
				// component.click();
			}
		}
		
		location = BatchPage.location(wd).getText();
		Assert.assertTrue(!location.equals(placeholder));
		//BatchPage.location(wd).sendKeys("Future Gadget Lab - Akihabara, VA");

	}

	@Test(priority = 11, enabled = true)
	private static void SelectBuilding() throws InterruptedException {

		String building = null, placeholder = null;
		
		BatchPage.building(wd).click();
		placeholder = BatchPage.building(wd).getAttribute("aria-label");
		WebElement selectElement = wd.findElement(By.id("select_container_28"));

		List<WebElement> thelist = selectElement.findElements(By.tagName("md-option"));
		//System.out.println("test output: " + thelist.size()); // test output
		for (WebElement component : thelist) {
			//System.out.println(component.getText());
			if (component.getText().contains(thebatch.getBuilding())) {
				component.click();
				break;
			} else {
				//System.out.println("no match");
				component.click();
				break;
			}
		}
		
		building = BatchPage.building(wd).getText();
		//BatchPage.location(wd).sendKeys("Test Building");
		
		Assert.assertTrue(!building.equals(placeholder));

	}

	@Test(priority = 12, enabled = true)
	private static void SelectRoom() throws InterruptedException {
		String room = null, placeholder = null;
		
		BatchPage.room(wd).click();
		placeholder = BatchPage.room(wd).getAttribute("aria-label");

		WebElement selectElement = wd.findElement(By.id("select_container_30"));

		List<WebElement> thelist = selectElement.findElements(By.tagName("md-option"));
		//System.out.println("test output: " + thelist.size()); // test output
		for (WebElement component : thelist) {
		//	System.out.println(component.getText());
			if (component.getText().contains(Integer.toString(thebatch.getRoom()))) {
				component.click();
				break;
			} else {
				//System.out.println("no match");
				component.click();
				break;
			}
		}
		
		room = BatchPage.room(wd).getText();
		
		//BatchPage.location(wd).sendKeys("101");
		Assert.assertTrue(!room.equals(placeholder));
	}

	@Test(priority = 13, enabled = true)
	public static void ClickCreate() {
		int before = 0, after = 0;
		
		try {
			Thread.sleep(2000);
			before = BatchPage.batchesSize(wd);
			
			BatchPage.createbatch(wd).click();
			
			Thread.sleep(2000);
			after = BatchPage.batchesSize(wd);
			
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}

		
		System.out.println("size before: " + before);
		System.out.println("size after: " + after);
		
		Assert.assertTrue(after > before);
	}

	// END CONSTRUCTION ZONE

	@Test(priority = 14, enabled = false)
	private static void CancelBatch() { // takes a batch

		int before = 0, after = 0;
		
		try {
			Thread.sleep(2000);
			before = BatchPage.batchesSize(wd);
			
			BatchPage.cancel(wd).click();
			
			Thread.sleep(2000);
			after = BatchPage.batchesSize(wd);
			
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	
		System.out.println("size before: " + before);
		System.out.println("size after: " + after);
		
		// note: the click() methods are placeholder until appropriate selector input
		// method is found

		/*
		BatchPage.corecurriculum(wd).click();
		BatchPage.focus(wd).click();
		BatchPage.skills(wd).click();
		BatchPage.startdate(wd).click();

		// click create
		BatchPage.createbatch(wd).click();*/
	}
	
	//Delete batch
	/*
	@Test(priority = 15, enabled = true)
	private static void deleteBatch() {
		//Select batch
		for(int i = 1; i < 3; i++) {
		  BatchPage.batchCheckbox(wd,1).click();
		}
		
		//Delete button
		BatchPage.deleteBatchButton(wd).click;	
	}*/
	
	
	/*
	//Can't do this
	@Test(priority = 15, enabled = false)
	private static void EditBatch() { // pass a batch in to make some changes with

		BatchPage.edit(wd).click();

		BatchPage.corecurriculum(wd).click();
		BatchPage.focus(wd).click();
		BatchPage.skills(wd).click();
		BatchPage.startdate(wd).click();
		BatchPage.cotrainer(wd).click();
		BatchPage.location(wd).click();
		BatchPage.building(wd).click();
		BatchPage.room(wd).click();

		// click create
		BatchPage.createbatch(wd).click();
	}*/
	
	
	@Test(priority = 15)
	private static void closeApplication() {
		wd.close();
	}

}
