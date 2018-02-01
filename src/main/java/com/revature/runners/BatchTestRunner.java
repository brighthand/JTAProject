package com.revature.runners;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.revature.dao.BatchDaoImpl;
import com.revature.model.Batch;
import com.revature.pom.BatchPage;
import com.revature.pom.LoginPage;

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
		
		BatchPage.corecurriculum(wd).click();

		Thread.sleep(1000);
		WebElement selectElement = wd.findElement(By.id("select_container_10")); // containing class id

		List<WebElement> thelist = selectElement.findElements(By.tagName("md-option"));
		System.out.println("test output: " + thelist.size()); // test output
		for (WebElement component : thelist) {
			System.out.println(component.getText());
			if (component.getText().contains(thebatch.getCurriculum())) {
				component.click();
				break;
			} else {
				System.out.println("no match");
				// component.click();
			}
		}
		Thread.sleep(3000);// let the page load
	}
	

	@Test(priority = 5, enabled = true)
	private static void SelectFocus() throws InterruptedException {

		BatchPage.focus(wd).click();

		Thread.sleep(1000);
		WebElement selectElement = wd.findElement(By.id("select_container_12")); // containing class id

		List<WebElement> thelist = selectElement.findElements(By.tagName("md-option"));
		System.out.println("test output: " + thelist.size()); // test output
		for (WebElement component : thelist) {
			System.out.println(component.getText());
			if (component.getText().contains(thebatch.getFocus())) {
				component.click();
				break;
			} else {
				System.out.println("no match");
				// component.click();
			}
		}
		Thread.sleep(3000);// let the page load

	}

	@Test(priority = 6, enabled = true)
	private static void SelectSkills() throws InterruptedException { // XML FILE NEEDED FOR SOURCE

		BatchPage.skills(wd).click();

		Thread.sleep(1000);
		WebElement selectElement = wd.findElement(By.id("select_container_14")); // containing class id

		List<WebElement> thelist = selectElement.findElements(By.tagName("md-option"));
		System.out.println("test output: " + thelist.size()); // test output
		for (WebElement component : thelist) {
			System.out.println(component.getText());
			if (component.getText().contains(thebatch.getSkills())) { // input to be replaced with an xml source
				component.click();
				break;
			} else {
				System.out.println("no match");
				// component.click();
			}
		}
		Thread.sleep(2000);// let the page load
	}

	@Test(priority = 7, enabled = true)
	private static void SelectDates() throws InterruptedException {

		// BatchPage.startdate(wd).click();
		Thread.sleep(1000);
		// BatchPage.selectday(wd, "22").click();

		BatchPage.startdate(wd).sendKeys(thebatch.getStratDate());
		Thread.sleep(1000);
		BatchPage.startdate(wd).sendKeys(Keys.ENTER);
		Thread.sleep(1000);

		BatchPage.enddate(wd).sendKeys(thebatch.getEndDate());
		Thread.sleep(1000);
		BatchPage.enddate(wd).sendKeys(Keys.ENTER);
		Thread.sleep(1000);

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

	@Test(priority = 8, enabled = false)
	private static void SelectTrainer() throws InterruptedException {

		BatchPage.trainer(wd).click();

		WebElement selectElement = wd.findElement(By.id("select_container_22")); // containing class id

		List<WebElement> thelist = selectElement.findElements(By.tagName("md-option"));
		System.out.println("test output: " + thelist.size()); // test output
		for (WebElement component : thelist) {
			System.out.println(component.getText());
			if (component.getText().contains(thebatch.getTrainer())) { // input to be replaced with an xml source
				component.click();
				break;
			} else {
				System.out.println("no match");
				// component.click();
			}
		}
		
		Thread.sleep(2000);

	}

	@Test(priority = 9, enabled = false)
	private static void SelectCotrainer() throws InterruptedException {

		BatchPage.cotrainer(wd).click();

		WebElement selectElement = wd.findElement(By.id("select_container_24"));

		List<WebElement> thelist = selectElement.findElements(By.tagName("md-option"));
		System.out.println("test output: " + thelist.size()); // test output
		for (WebElement component : thelist) {
			System.out.println(component.getText());
			if (component.getText().contains(thebatch.getCotrainer())) {
				component.click();
				break;
			} else {
				System.out.println("no match");
				// component.click();
			}
		}

	}

	@Test(priority = 10, enabled = false)
	private static void SelectLocation() throws InterruptedException {

		BatchPage.location(wd).click();

		WebElement selectElement = wd.findElement(By.id("select_container_26"));

		List<WebElement> thelist = selectElement.findElements(By.tagName("md-option"));
		System.out.println("test output: " + thelist.size()); // test output
		for (WebElement component : thelist) {
			System.out.println(component.getText());
			if (component.getText().contains(thebatch.getLocation())) {
				component.click();
				break;
			} else {
				System.out.println("no match");
				// component.click();
			}
		}

	}

	@Test(priority = 11, enabled = false)
	private static void SelectBuilding() throws InterruptedException {

		BatchPage.building(wd).click();

		WebElement selectElement = wd.findElement(By.id("select_container_28"));

		List<WebElement> thelist = selectElement.findElements(By.tagName("md-option"));
		System.out.println("test output: " + thelist.size()); // test output
		for (WebElement component : thelist) {
			System.out.println(component.getText());
			if (component.getText().contains(thebatch.getBuilding())) {
				component.click();
				break;
			} else {
				System.out.println("no match");
				component.click();
				break;
			}
		}

	}

	@Test(priority = 12, enabled = false)
	private static void SelectRoom() throws InterruptedException {

		BatchPage.room(wd).click();

		WebElement selectElement = wd.findElement(By.id("select_container_30"));

		List<WebElement> thelist = selectElement.findElements(By.tagName("md-option"));
		System.out.println("test output: " + thelist.size()); // test output
		for (WebElement component : thelist) {
			System.out.println(component.getText());
			if (component.getText().contains(Integer.toString(thebatch.getRoom()))) {
				component.click();
				break;
			} else {
				System.out.println("no match");
				component.click();
				break;
			}
		}

	}

	@Test(priority = 13, enabled = false)
	public static void ClickCreate() {

		// click create
		BatchPage.createbatch(wd).click();
	}

	// END CONSTRUCTION ZONE

	@Test(priority = 14, enabled = false)
	private static void CancelBatch() { // takes a batch

		// note: the click() methods are placeholder until appropriate selector input
		// method is found

		BatchPage.corecurriculum(wd).click();
		BatchPage.focus(wd).click();
		BatchPage.skills(wd).click();
		BatchPage.startdate(wd).click();

		// click create
		BatchPage.createbatch(wd).click();
	}
	
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
	}
	
	
	@Test(priority = 16)
	private static void closeApplication() {
		wd.close();
	}

}
