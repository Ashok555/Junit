package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseMethods.BaseClass;

public class BookingConfirmation extends BaseClass {
	public BookingConfirmation() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "order_no")
	private WebElement OrderNo;

	@FindBy(xpath = "//a[text()='Booked Itinerary']")
	private WebElement Itinerary;

@FindBy(id="btn_id_573813")
private WebElement cancel;

/******************************************/	

	public WebElement getOrderNo() {
		return OrderNo;
	}
	public WebElement getItinerary() {
		return Itinerary;
	}
	
	
	public String BookingConfirmations(String Attributetype) {
		String attribute = getAttribute(getOrderNo(), Attributetype);
		click(getItinerary());
		return attribute;
	}
	
}
