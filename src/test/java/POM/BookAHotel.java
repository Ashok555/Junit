package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseMethods.BaseClass;

public class BookAHotel extends BaseClass {

	public BookAHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"book_hotel_form\"]/table/tbody/tr[2]/td")
	private static WebElement bookAHotel;
	@FindBy(id = "first_name")
	private WebElement FirstName;
	@FindBy(id = "last_name")
	private WebElement LastName;
	@FindBy(id = "address")
	private WebElement BillingAddress;
	@FindBy(id = "cc_num")
	private WebElement CreditCardNo;
	@FindBy(id = "cc_type")
	private WebElement CreditCardType;
	@FindBy(id = "cc_exp_month")
	private WebElement ExpiryDate;
	@FindBy(id = "cc_exp_year")
	private WebElement Expiryyear;
	@FindBy(id = "cc_cvv")
	private WebElement CVVNumber;
	@FindBy(id = "book_now")
	private WebElement book;

	/**************************************************************/
	public WebElement getbookAHotel() {
		return bookAHotel;
	}
	
	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getBillingAddress() {
		return BillingAddress;
	}

	public WebElement getCreditCardNo() {
		return CreditCardNo;
	}

	public WebElement getCreditCardType() {
		return CreditCardType;
	}

	public WebElement getExpiryDate() {
		return ExpiryDate;
	}

	public WebElement getExpiryyear() {
		return Expiryyear;
	}

	public WebElement getCVVNumber() {
		return CVVNumber;
	}

	public WebElement getBook() {
		return book;
	}

	public void BookHotel(String firstName, String LastNam,	String BillingAddres, String CreditCardN, String CardType, String ExpiryDat,
			String Expiryyea, String CVVNumbe) {

		sendKey(getFirstName(), firstName);
		sendKey(getLastName(), LastNam);
		sendKey(getBillingAddress(), BillingAddres);
		sendKey(getCreditCardNo(), CreditCardN);
		sendKey(getCreditCardType(), CardType);
		sendKey(getExpiryDate(), ExpiryDat);
		sendKey(getExpiryyear(), Expiryyea);
		sendKey(getCVVNumber(), CVVNumbe);
		click(getBook());

	}

}
