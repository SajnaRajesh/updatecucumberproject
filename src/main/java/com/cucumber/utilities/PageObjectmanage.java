package com.cucumber.utilities;

import org.openqa.selenium.WebDriver;

import com.cucumberpom.HotelReservationSystem;
import com.cucumberpom.SearchHotel;

public class PageObjectmanage {
	public WebDriver driver;
	private HotelReservationSystem hr;
	
	public HotelReservationSystem getHr() {
		if (hr==null) {
			hr = new HotelReservationSystem(driver);
		}
		return hr;
	
	}
	private SearchHotel sh;
	
	public SearchHotel getSh() {
		if(sh==null) {
			sh = new SearchHotel(driver);
		}
		return sh;

}
	public PageObjectmanage(WebDriver ldriver) {
		this.driver=ldriver;
	}
}
