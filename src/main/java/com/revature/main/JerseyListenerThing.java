package com.revature.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.testng.TestNG;
import org.testng.collections.Lists;

@Path("testresults")
public class JerseyListenerThing {




@GET
public InputStream getIt() {
		
	//TestListenerAdapter tla = new TestListenerAdapter();
	TestNG testng = new TestNG();
	List<String> suites = Lists.newArrayList();
	suites.add("C:\\SpringToolSuite\\Workspace\\TA_Framework_WebService\\src\\main\\java\\TestNGXML");//path to xml..
	testng.setTestSuites(suites);
	testng.run();

	
	File f = new File("C:\\SpringToolSuite\\Workspace\\TA_Framework_WebService\\test-output\\index.html");
	try {
		return new FileInputStream(f);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return null;
	}
}}

