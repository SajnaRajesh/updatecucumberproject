package com.cucumber.runner;



import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;
import com.cucumber.utilities.ConfigReader;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.base.Base_class;

@RunWith(Cucumber.class)
@CucumberOptions(
	plugin = {"com.cucumber.listener.ExtentCucumberFormatter:src\\test\\resources\\reports\\report.html",
			//"pretty",
			//"html:src\\test\\resources\\com\\cucumber\\report",
				//"json:src\\test\\resources\\com\\cucumber\\report\\cucumber.json",
				//"junit:src\\test\\resource\\com\\cucumber\\report\\cucumber.xml"
	},
	
		
		features="src\\test\\java\\com\\cucumber\\feature",
		glue = "com.cucumber.stepdefinition",
		tags = {"@testt" ,"~@Ignore"}
		
		)

public class AdactinRunner {
	public static WebDriver driver;
	@BeforeClass
	public static void driverInitialization() throws Exception {
		ConfigReader con=new ConfigReader();
		System.out.println("Test1");
		System.out.println(con.getBrowsername());
		driver=Base_class.getDriver(con.getBrowsername());
		System.out.println("Test2");

		
	}
		@AfterClass
		public static void driverQuit() throws Exception {
			Thread.sleep(2000);
			Reporter.loadXMLConfig(new File("C:\\Users\\The Commandant TSP 3\\eclipse-workspace\\AdactinCucumberProject\\src\\test\\resources\\extent_report\\NewFile.xml"));
			
			driver.close();
			
		}
	
	
		
	}


