package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseMethods.BaseClass;

public class SearchHotel extends BaseClass {
	
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "location")
	private WebElement Location;
	@FindBy(id = "hotels")
	private WebElement Hotels;
	@FindBy(id = "room_type")
	private WebElement RoomType;
	@FindBy(id = "room_nos")
	private WebElement NumberofRooms;
	@FindBy(id = "datepick_in")
	private WebElement CheckInDate;
	@FindBy(id = "datepick_out")
	private WebElement CheckOutDate;
	@FindBy(id = "adult_room")
	private WebElement AdultsperRoom;
	@FindBy(id = "child_room")
	private WebElement ChildrenperRoom;
	@FindBy(id = "Submit")
	private WebElement search;

	/*************************************************/

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getRoomType() {
		return RoomType;
	}

	public WebElement getNumberofRooms() {
		return NumberofRooms;
	}

	public WebElement getCheckInDate() {
		return CheckInDate;
	}

	public WebElement getCheckOutDate() {
		return CheckOutDate;
	}

	public WebElement getAdultsperRoom() {
		return AdultsperRoom;
	}

	public WebElement getChildrenperRoom() {
		return ChildrenperRoom;
	}

	public WebElement getSearch() {
		return search;
	}
	
	public void SearchHotels(String location,String hotel,
			String roomty,String NoR,String CheckInDat,
			String CheckOutDat,String Adultsper,String Childrenper) {
		sendKey(getLocation(), location);
		sendKey(getHotels(), hotel);
		sendKey(getRoomType(), roomty);
		sendKey(getNumberofRooms(), NoR);
		BaseClass.clear(getCheckInDate());
		sendKey(getCheckInDate(), CheckInDat);
		BaseClass.clear(getCheckOutDate());
		sendKey(getCheckOutDate(), CheckOutDat);
		sendKey(getAdultsperRoom(), Adultsper);
		sendKey(getChildrenperRoom(), Childrenper);
		click(getSearch());
	}

}
