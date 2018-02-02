package com.revature.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

// each class has methods corresponding to each of the elements that the user can interact with.

public class BatchPage { 
	
	static WebElement e = null;

	public static WebElement batchestab(WebDriver d) {
		e = d.findElement(By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[2]/a/span/span"));
		return e;
	}
	
	
	
	
	//CONSTRUCTION ZONE
	public static WebElement corecurriculum(WebDriver d) {
		e = d.findElement(By.id("select_9")); //*[@id="select_9"]
		return e;
	}
	
	public static WebElement corecurriculum2(WebDriver d) {
		e = d.findElement(By.tagName("md-content"));
		return e;
	}
	
	public static WebElement corecurriculumModded(WebDriver d, String choice) {  //for use in switch statement in the test class
		e = d.findElement(By.id("select_option_" + choice + ""));
		return e;
	}
	
	/*public static void StringMethod() {  //for testing
	String choice = "36";
	System.out.println("select_option_" + choice + "");
	}*/
	
	
		/*WebElement mySelectElm = driver.findElement(By.id("mySelectID")); 
	Select mySelect= new Select(mySelect);
	List<WebElement> options = mySelect.getOptions();
	for (WebElement option : options) {
	    if (option.getText().equalsIgnoreCase("Option") {
	        option.click();
	    }
	}*/
	
	//END CONSTRUCTION ZONE
	
	
	public static WebElement focus(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"select_11\"]"));
		return e;
	}
	
	public static WebElement focus2(WebDriver d, String choice) {  //for use in switch statement in the test class
		e = d.findElement(By.id("select_option_" + choice + ""));
		return e;
	}
	
	
	
	public static WebElement skills(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"select_13\"]"));
		return e;
	}
	
	//Batch name text field
	public static WebElement name(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"select_13\"]"));
		return e;
	}
	
	
	//these two methods are paired
	public static WebElement startdate(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"input_16\"]"));
		//*[@id="select_container_12"]  xpath of input box
		return e;
	}
	
	public static WebElement startdate2(WebDriver d) {
		//e = d.findElement(By.xpath("//*[@id=\"md-date-pane15\"]/div[1]"));
		e = d.findElement(By.cssSelector("#input_19"));
		return e;
	}
	
	
	public static WebElement selectday(WebDriver d, String day) {
		
		e = d.findElement(By.xpath("//*[@id=\"md-1-month-2018-0-" + day + "\"]/span"));
		
		//e = d.findElement(By.cssSelector("#md-1-month-2018-0-" + day ));
		//#md-1-month-2018-0-22  //csselector
		
		//e = d.findElement(By.id("md-3-month-2018-0-" + day ));
		
		System.out.println("attempting to print xpath");
		System.out.println("//*[@id=\"md-1-month-2018-0-" + day + "\"]/span"); //prints the following: //*[@id="md-1-month-2018-0-22"]/span
		System.out.println("attempting to print cssSelector");
		System.out.println("#md-1-month-2018-0-" + day);
		System.out.println("md-3-month-2018-0-" + day ); //this is by id
		
		
		
		return e;
		//*[@id="md-1-month-2018-0-22"]/span  --this is the xpath
		//*[@id="md-1-month-2018-0-22"]/span
		
	}
	//end of pairing
	
	
	public static WebElement enddate(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"input_18\"]"));
		return e;
	}
	
	public static WebElement trainer(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"select_21\"]"));
		return e;
	}
	
	public static WebElement cotrainer(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"select_23\"]"));
		return e;
	}
	
	public static WebElement location(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"select_25\"]")); 
		return e;       //*[@id="select_option_690"]
	}
	
	public static WebElement locationCheckbox(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"select_option_690\"] "));
		return e;
	}
	
	public static WebElement building(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"select_27\"]"));
		return e;
	}
	
	public static WebElement room(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"select_29\"]"));
		return e;
	}
	
	//Batch checkbox
	public static WebElement batchCheckbox(WebDriver d, int row) {
		e = d.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content[2]/div/md-table-container/table/tbody/tr[" + row + "]/td[" + row + "]/md-checkbox "));
		return e;
	}
	
	//Delete batches button
	public static WebElement deleteBatchButton(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content[2]/md-toolbar/button[1]"));
		return e;
	}
	
	//meta functionality
	public static WebElement createbatch(WebDriver d) {
		//e = d.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content[1]/form/md-toolbar/button[1]/md-icon"));
		e = d.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content[1]/form/md-toolbar/button[1]"));
		return e;
	}
	
	public static WebElement cancel(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content[1]/form/md-toolbar/button[2]/md-icon"));
		return e;
	}
	
	public static WebElement pullnewentries(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content[2]/md-toolbar/button[2]/md-icon"));
		return e;
	}
	
	
	//edit individual tuples
	public static WebElement edit(WebDriver d) {
		e = d.findElement(By.xpath("<moving xpath solution required>"));
		return e;
	}
	
	
	//chart functionality
	public static WebElement hideconcluded(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content[3]/div/div[1]/div[1]/div[8]/md-checkbox[1]/div[1]"));
		return e;
	}
	
	public static WebElement hidebatchless(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content[3]/div/div[1]/div[1]/div[8]/md-checkbox[2]/div[1]"));
		return e;
	}
	
	public static WebElement selectdatesautomatically(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content[3]/div/div[1]/div[1]/div[1]/div[2]/md-checkbox/div[1]"));
		return e;
	}
	
	public static WebElement nextpage(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"nextTrainerPageButton\"]/md-icon"));
		return e;
	}
	
	public static WebElement jumptolastpage(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"lastTrainerPageButton\"]/md-icon"));
		return e;
	}
	
	
	//*************NUMBER OF ROWS IN THE BATCHES TABLE*************************
	public static int batchesSize(WebDriver driver) {
		// int size = 0;
		List<WebElement> list = driver
				.findElements(By.xpath("//*[@id=\"view\"]/md-card/md-content[2]/div/md-table-container/table/tbody/*"));
		return list.size();             
	}

	
	
	

}
