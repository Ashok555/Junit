package JUnit;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import POM.BookAHotel;
import POM.BookingConfirmation;
import POM.SearchHotel;
import POM.SelectHotel;
import POM.logIn;
import baseMethods.BaseClass;

public class AdactinHotel extends BaseClass {

	@BeforeClass
	public static void lunchUrl() {
		BaseClass.lunchBrowser("https://adactinhotelapp.com/");
	}

	@AfterClass
	public static void Quit() {
		//BaseClass.driver.close();
	}

	@Before
	public void BeforeScreenShot() throws IOException {
		BaseClass.screenShot("Akonbefore");
	}

	@After
	public void AfterScreenShot() throws IOException {
		BaseClass.screenShot("Akonafter");
	}

	@Test
	public void SendtheData() throws IOException {

		String userName = BaseClass.excelGetData("Hello", 1, 0).toString();
		String passWord = BaseClass.excelGetData("Hello", 1, 1).toString();
		logIn login = new logIn();
		login.loginmethod(userName, passWord);
		
		String location = BaseClass.excelGetData("Hello", 1, 2).toString();
		String hotel = BaseClass.excelGetData("Hello", 1, 3).toString();
		String roomty = BaseClass.excelGetData("Hello", 1, 4).toString();
		String NoR = BaseClass.excelGetData("Hello", 1, 5).toString();
		String CheckInDat = BaseClass.excelGetData("Hello", 1, 6).toString();
		String CheckOutDat = BaseClass.excelGetData("Hello", 1, 7).toString();
		String Adultsper = BaseClass.excelGetData("Hello", 1, 8).toString();
		String Childrenper = BaseClass.excelGetData("Hello", 1, 9).toString();
		
		SearchHotel search = new SearchHotel();
		search.SearchHotels(location, hotel, roomty, NoR, CheckInDat, CheckOutDat, Adultsper, Childrenper);
		

	}

	@Test
	public void SearchHotel() throws IOException {
		//Thread.sleep(3000);
				SelectHotel select = new SelectHotel();
				select.SelectHotels();
				BookAHotel name = new BookAHotel();
				String getbookAHotel = name.getbookAHotel().getText();
				//Assert.assertEquals("Book A Hotel ", getbookAHotel);
				
	}
	
	@Test
	public void SelectHotel() throws InterruptedException, IOException {
		Thread.sleep(1000);
		String firstName = BaseClass.excelGetData("Hello", 1, 10).toString();
		String LastNam = BaseClass.excelGetData("Hello", 1, 11).toString();
		String BillingAddres = BaseClass.excelGetData("Hello", 1, 12).toString();
		String CreditCardN = BaseClass.excelGetData("Hello", 1, 13).toString();
		String CardType = BaseClass.excelGetData("Hello", 1, 14).toString();
		String ExpiryDat = BaseClass.excelGetData("Hello", 1, 15).toString();
		String Expiryyea = BaseClass.excelGetData("Hello", 1, 16).toString();
		String CVVNumbe = BaseClass.excelGetData("Hello", 1, 17).toString();
		Thread.sleep(3000);
		BookAHotel book = new BookAHotel();
		book.BookHotel(firstName, LastNam, BillingAddres, CreditCardN, CardType, ExpiryDat, Expiryyea, CVVNumbe);
		

		BookingConfirmation booking = new BookingConfirmation();
		Thread.sleep(5000);
		String bookingConfirmations = booking.BookingConfirmations("value");
		BaseClass.setData("Hello", 1, 17, bookingConfirmations);
		

	}
	
	@Test
	public void BookAHotel() throws IOException, InterruptedException {
		
	}
	
	@Test
	public void BookingConfirmation() throws IOException, InterruptedException {
Thread.sleep(5000);
	}
}
