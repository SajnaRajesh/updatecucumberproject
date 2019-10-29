package com.cucumberpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	public WebDriver driver;
	public SearchHotel(WebDriver localdriver) {
		this.driver = localdriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private WebElement locationfield;
	
	//public WebDriver getDriver() {
	//	return driver;
	

	public WebElement getLocationfield() {
		return locationfield;
	}

	public WebElement getHotelsfield() {
		return hotelsfield;
	}

	public WebElement getRoomtypes() {
		return roomtypes;
	}

	public WebElement getRooms() {
		return rooms;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSearch() {
		return search;
	}
	@FindBy(id="hotels")
	private WebElement hotelsfield;
	
	@FindBy(id="room_type")
	private WebElement roomtypes;
	
	@FindBy(id="room_nos")
	private WebElement rooms;
	
	@FindBy(id="datepick_in")
	private WebElement checkin;
	
	@FindBy(id="datepick_out")
	private WebElement checkout;
	
	@FindBy(name="adult_room")
	private WebElement adultroom;
	
	@FindBy(id="child_room")
	private WebElement childroom;
	
	@FindBy(id="Submit")
	private WebElement search;
	public WebElement getUsernamefield() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
