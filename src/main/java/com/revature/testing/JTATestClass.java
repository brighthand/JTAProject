package com.revature.testing;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.revature.dao.BatchDaoImpl;
import com.revature.model.Batch;
import com.revature.pom.BatchPage;
import com.revature.pom.LoginPage;


public class JTATestClass {
	
	static WebDriver wd = null;
	static WebDriverWait wait;

	public static void main(String[] args) throws InterruptedException {
		
	openApplication();
	LoginMethod();
	HeadToBatches();      
	
	BatchDaoImpl ed = new BatchDaoImpl();
	Batch thebatch = ed.findById(5);
	//System.out.println(thebatch.getCurriculum()); //--this successfully prints data
	
	SelectDates(thebatch);
	SelectCurriculum(thebatch);
	SelectFocus(thebatch);
	//SelectSkills(thebatch); disabled for now
	
	SelectTrainer(thebatch);
	SelectCotrainer(thebatch);
	SelectLocation(thebatch);
	SelectBuilding(thebatch);
	SelectRoom(thebatch);
	ClickCreate();
	
	
	//CancelBatch();
		
	}
	
	private static void openApplication() {
		File f1 = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", f1.getAbsolutePath());
		wd = new ChromeDriver();
		wd.get("https://dev.assignforce.revaturelabs.com");
	}
	
	private static void LoginMethod() throws InterruptedException {
		
		LoginPage.user(wd).sendKeys("test.vpoftech@revature.com.int1");
		LoginPage.password(wd).sendKeys("yuvi1712");
		LoginPage.submit(wd).submit();
		Thread.sleep(2000);//let the page load
	}
	
	private static void HeadToBatches() throws InterruptedException {
		
		BatchPage.batchestab(wd).click();
		Thread.sleep(2000);//let the page load
	}
	
	
	//CONSTRUCTION ZONE
	
private static void SelectCurriculum(Batch batch) throws InterruptedException {  //can't create a batch without a batch!
	
		BatchPage.corecurriculum(wd).click();
		
		WebElement selectElement = wd.findElement(By.id("select_container_10"));  //containing class id
		
		List<WebElement> thelist = selectElement.findElements(By.tagName("md-option"));
		System.out.println("test output: " + thelist.size()); //test output
		for (WebElement component : thelist) {
			System.out.println(component.getText());
			if (component.getText().contains(batch.getCurriculum())) {
				component.click();
				break;
			}
			else {
				System.out.println("no match");
				//component.click();
			}
		}
		Thread.sleep(2000);//let the page load
}

private static void SelectFocus(Batch batch) throws InterruptedException { 
	
	BatchPage.focus(wd).click(); 
	
	WebElement selectElement = wd.findElement(By.id("select_container_12"));  //containing class id
	
	List<WebElement> thelist = selectElement.findElements(By.tagName("md-option"));
	System.out.println("test output: " + thelist.size()); //test output
	for (WebElement component : thelist) {
		System.out.println(component.getText());
		if (component.getText().contains(batch.getFocus())) {
			component.click();
			break;
		}
		else {
			System.out.println("no match");
			//component.click();
		}
	}	
	Thread.sleep(2000);//let the page load
					
}



private static void SelectSkills(Batch batch) throws InterruptedException { //XML FILE NEEDED FOR SOURCE
	
	BatchPage.skills(wd).click(); 
	
	WebElement selectElement = wd.findElement(By.id("select_container_14"));  //containing class id
	
	List<WebElement> thelist = selectElement.findElements(By.tagName("md-option"));
	System.out.println("test output: " + thelist.size()); //test output
	for (WebElement component : thelist) {
		System.out.println(component.getText());
		if (component.getText().contains(batch.getSkills())) {  //input to be replaced with an xml source
			component.click();
			break;
		}
		else {
			System.out.println("no match");
			//component.click();
		}
	}			
	Thread.sleep(2000);//let the page load				
}

private static void SelectDates(Batch batch) throws InterruptedException {  //WORK IN PROGRESS
	
	//BatchPage.startdate(wd).click(); 
	Thread.sleep(1000);
			//BatchPage.selectday(wd, "22").click();
	
	BatchPage.startdate(wd).sendKeys("1/15/2018");
	Thread.sleep(1000);
	BatchPage.startdate(wd).sendKeys(Keys.ENTER);
	Thread.sleep(1000);
	
	
	BatchPage.enddate(wd).sendKeys("3/16/2018");
	Thread.sleep(1000);
	BatchPage.enddate(wd).sendKeys(Keys.ENTER);
	Thread.sleep(1000);
	 
	
	/*String day = "22";
	WebElement selectDay = wd.findElement(By.xpath("//*[@id=\"md-1-month-2018-0-" + day + "\"]/span")); FAIL CODE!
	System.out.println("md-3-month-2018-0-" + day );
	selectDay.click();*/
	
	/*String day = "22";
	wait = new WebDriverWait(wd, 5);  //for waiting, I guess
	WebElement dateWidget = wd.findElement(By.cssSelector("#md-date-pane15 > div.md-datepicker-calendar"));
	
	List<WebElement> rows = dateWidget.findElements(By.tagName("tr"));
	List<WebElement> columns = dateWidget.findElements(By.tagName("td"));
	
	for (WebElement cell: columns) {
		System.out.println(cell.getText()); //successfully prints column data
		if (cell.getText().equals(day)) {
			System.out.println("found a date");
			//cell.findElement(By.linkText("22")).click();
			cell.findElement(By.xpath("//*[@id=\"md-1-month-2018-0-" + day + "\"]/span")).click();
			break;
		}
	}*/
	
	
					
}


private static void SelectTrainer(Batch batch) throws InterruptedException { 
	
	BatchPage.trainer(wd).click(); 
	
	WebElement selectElement = wd.findElement(By.id("select_container_22"));  //containing class id
	
	List<WebElement> thelist = selectElement.findElements(By.tagName("md-option"));
	System.out.println("test output: " + thelist.size()); //test output
	for (WebElement component : thelist) {
		System.out.println(component.getText());
		if (component.getText().contains(batch.getTrainer())) {  //input to be replaced with an xml source
			component.click();
			break;
		}
		else {
			System.out.println("no match");
			//component.click();
		}
	}			
					
}


private static void SelectCotrainer(Batch batch) throws InterruptedException { 
	
	BatchPage.cotrainer(wd).click(); 
	
	WebElement selectElement = wd.findElement(By.id("select_container_24")); 
	
	List<WebElement> thelist = selectElement.findElements(By.tagName("md-option"));
	System.out.println("test output: " + thelist.size()); //test output
	for (WebElement component : thelist) {
		System.out.println(component.getText());
		if (component.getText().contains(batch.getCotrainer())) {  
			component.click();
			break;
		}
		else {
			System.out.println("no match");
			//component.click();
		}
	}			
					
}


private static void SelectLocation(Batch batch) throws InterruptedException { 
	
	BatchPage.location(wd).click(); 
	
	WebElement selectElement = wd.findElement(By.id("select_container_26")); 
	
	List<WebElement> thelist = selectElement.findElements(By.tagName("md-option"));
	System.out.println("test output: " + thelist.size()); //test output
	for (WebElement component : thelist) {
		System.out.println(component.getText());
		if (component.getText().contains(batch.getLocation())) {  
			component.click();
			break;
		}
		else {
			System.out.println("no match");
			//component.click();
		}
	}			
					
}

private static void SelectBuilding(Batch batch) throws InterruptedException { 
	
	BatchPage.building(wd).click(); 
	
	WebElement selectElement = wd.findElement(By.id("select_container_28")); 
	
	List<WebElement> thelist = selectElement.findElements(By.tagName("md-option"));
	System.out.println("test output: " + thelist.size()); //test output
	for (WebElement component : thelist) {
		System.out.println(component.getText());
		if (component.getText().contains(batch.getBuilding())) {  
			component.click();
			break;
		}
		else {
			System.out.println("no match");
			component.click();
			break;
		}
	}			
					
}


private static void SelectRoom(Batch batch) throws InterruptedException { 
	
	BatchPage.room(wd).click(); 
	
	WebElement selectElement = wd.findElement(By.id("select_container_30")); 
	
	List<WebElement> thelist = selectElement.findElements(By.tagName("md-option"));
	System.out.println("test output: " + thelist.size()); //test output
	for (WebElement component : thelist) {
		System.out.println(component.getText());
		if (component.getText().contains(Integer.toString(batch.getRoom()))) {  
			component.click();
			break;
		}
		else {
			System.out.println("no match");
			component.click();
			break;
		}
	}			
					
}

public static void ClickCreate() {
			
		//click create
		BatchPage.createbatch(wd).click();
	}

//END CONSTRUCTION ZONE


private static void CancelBatch(Batch batch) {  //takes a batch
	
	//note: the click() methods are placeholder until appropriate selector input method is found
	
		BatchPage.corecurriculum(wd).click();
		BatchPage.focus(wd).click();
		BatchPage.skills(wd).click();
		BatchPage.startdate(wd).click();
	
		//click create
		BatchPage.createbatch(wd).click();
}
	
private static void EditBatch(Batch batch) {  //pass a batch in to make some changes with
	
	BatchPage.edit(wd).click();
	
	BatchPage.corecurriculum(wd).click();
	BatchPage.focus(wd).click();
	BatchPage.skills(wd).click();
	BatchPage.startdate(wd).click();
	BatchPage.cotrainer(wd).click();
	BatchPage.location(wd).click();
	BatchPage.building(wd).click();
	BatchPage.room(wd).click();

	//click create
	BatchPage.createbatch(wd).click();
}

}
