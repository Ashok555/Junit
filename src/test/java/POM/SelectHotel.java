package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseMethods.BaseClass;

public class SelectHotel extends BaseClass {
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@type='radio']")
	private WebElement Select;
	
	@FindBy(id="continue")
	private WebElement Continue;

	public WebElement getSelect() {
		return Select;
	}

	public WebElement getContinue() {
		return Continue;
	}
		
	public void SelectHotels() {
		click(getSelect());
		click(getContinue());
		
	}
}
