package com.cucumber.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.cucumber.runner.AdactinRunner;
import com.cucumber.utilities.ConfigReader;
import com.cucumber.utilities.PageObjectmanage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.base.Base_class;

public class AdactinStepdefinition extends Base_class{

	public static WebDriver driver = AdactinRunner.driver;
	public static	PageObjectmanage pom = new PageObjectmanage(driver);
	@Given("^Launch the application using URL$")
	public void launch_the_application_using_URL() throws Throwable {
	    ConfigReader con=new ConfigReader();
	    getUrl(con.getUrl());
	}

	@When("^Enter the username '(.*)' in Login Page$")
	public void enter_the_username_in_Login_Page(String str) throws Throwable {
	   System.out.println(str);
		setkey(pom.getHr().getUsernamebox(), str);
	}

	@When("^Enter the password '(.*)' in LoginPage$")
	public void enter_the_password_in_LoginPage(String str) throws Throwable {
	    setkey(pom.getHr().getPasswordbox(), str);
	}

	@When("^Click on login button in Loginpage$")
	public void click_on_login_button_in_Loginpage() throws Throwable {
	    clickkk(pom.getHr().getLogin());
	}

	@Then("^Verify whether logged in username '(.*)' is displayed in SearchHotelPage$")
	public void verify_whether_logged_in_username_is_displayed_in_SearchHotelPage(String str) throws Throwable {
	    String text2 = pom.getSh().getUsernamefield().getText();
	    String text=str;
		if(text.contentEquals(text2)) {
			System.out.println("Username is displayed");
		}
	}




}
