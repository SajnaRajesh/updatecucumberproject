package com.cucumberpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelReservationSystem {
	public WebDriver driver;
	public HotelReservationSystem(WebDriver localdriver) {
		this.driver = localdriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement usernamebox;
	
	@FindBy(id="password")
	private WebElement passwordbox;
	
	@FindBy(id="login")
	private WebElement login;
	//public WebDriver getDriver() {
		//return driver;
	

	public WebElement getUsernamebox() {
		return usernamebox;
	}

	public WebElement getPasswordbox() {
		return passwordbox;
	}

	public WebElement getLogin() {
		return login;
	}
	
}
	



	
		
	



