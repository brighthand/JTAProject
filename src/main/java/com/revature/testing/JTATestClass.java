package com.revature.testing;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import com.revature.dao.BatchDaoImpl;
import com.revature.model.Batch;
import com.revature.pom.BatchPage;
import com.revature.pom.LoginPage;


public class JTATestClass {
	static WebDriver wd = null;

	public static void main(String[] args) throws InterruptedException {
		
	openApplication();
	LoginMethod();
	HeadToBatches();       //to be reenabled later
	
	
	//for(int x = 1; x < 10; x++) {   //this retrieves the info from the DB
	
	BatchDaoImpl ed = new BatchDaoImpl();
	Batch thebatch = ed.findById(16);
	//System.out.println(thebatch.getCurriculum()); //--this successfully prints data
	SelectCurriculum(thebatch);
	//SelectFocus(thebatch);
	//}
	
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
	
	    String currentCur = batch.getCurriculum();
		BatchPage.corecurriculum(wd).click();
		
		/*switch(currentCur) {
		case "Java":
			System.out.println("Java was returned by the DB");
			BatchPage.corecurriculumModded(wd, "36").click();
			break;
		case ".NET":
			System.out.println(".NET was returned by the DB");
			BatchPage.corecurriculumModded(wd, "37").click();
			break;
		case "SDET":
			System.out.println("SDET was returned by the DB");
			BatchPage.corecurriculumModded(wd, "38").click();
			break;
		case "IntelliJ":
			System.out.println("IntelliJ was returned by the DB");
			BatchPage.corecurriculumModded(wd, "39").click();
			break;
		case "Salesforce":
			System.out.println("Salesforce was returned by the DB");
			BatchPage.corecurriculumModded(wd, "40").click();
			break;
		default:
		    System.out.println("no value matched");
		}*/
		
		WebElement selectElement = wd.findElement(By.id("select_container_10"));  //containing class id
		
		List<WebElement> thelist = selectElement.findElements(By.tagName("md-option"));
		System.out.println("test output: " + thelist.size()); 
		
		/*Select dropdown1 = new Select(BatchPage.corecurriculum(wd));
		dropdown1.selectByVisibleText(batch.getCurriculum());*/
		
}

private static void SelectFocus(Batch batch) throws InterruptedException { 
	
		Select dropdown2 = new Select(BatchPage.focus(wd));
		dropdown2.selectByVisibleText(batch.getFocus());
		
		String currentFocus = batch.getFocus();
		BatchPage.focus(wd).click();
		
		switch(currentFocus) {
		case "Java":
			
			
		case ".Ruby on Rails":
			System.out.println(".NET was returned by the DB");
			BatchPage.corecurriculumModded(wd, "210").click();
			break;
		case "SDET":
			System.out.println("SDET was returned by the DB");
			BatchPage.corecurriculumModded(wd, "211").click();
			break;
		case "IntelliJ":
			System.out.println("IntelliJ was returned by the DB");
			BatchPage.corecurriculumModded(wd, "212").click();
			break;
		case "Salesforce":
			System.out.println("Salesforce was returned by the DB");
			BatchPage.corecurriculumModded(wd, "213").click();
			break;
		default:
			System.out.println("not matching entry in DB");
			BatchPage.corecurriculumModded(wd, "209").click();
		}
		
	}

public static void containing(Batch batch) {
		// skills is a different type of menu- needs research.
		
		//start date requires datepicker knowledge. BatchPage.startdate(wd).click();
		BatchPage.startdate(wd).click();
		BatchPage.selectday(wd, "22").click();
		
		//end date requires datepicker knowledge. BatchPage.enddate(wd).click();
		
		Select dropdown3 = new Select(BatchPage.trainer(wd));
		dropdown3.selectByVisibleText(batch.getTrainer());
		
		Select dropdown4 = new Select(BatchPage.cotrainer(wd));
		dropdown4.selectByVisibleText(batch.getCotrainer());
		
		Select dropdown5 = new Select(BatchPage.location(wd));
		dropdown5.selectByVisibleText(batch.getLocation());
		
		Select dropdown6 = new Select(BatchPage.building(wd));
		dropdown6.selectByVisibleText(batch.getBuilding());
		
		Select dropdown7 = new Select(BatchPage.room(wd));
		dropdown7.selectByValue(Integer.toString(batch.getRoom()));  // <-- pass the string returned by method
		
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
