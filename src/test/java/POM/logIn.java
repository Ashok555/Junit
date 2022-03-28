package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseMethods.BaseClass;

public class logIn extends BaseClass {
	
	public logIn() {		
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(id = "username")
	private WebElement userName;
	
	@FindBy(id = "password")
	private WebElement PassWord;
	
	@FindBy(id = "login")
	private WebElement logIn;
		
	/***********************************************/
	
	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return PassWord;
	}

	public WebElement getLogIn() {
		return logIn;
	}
	
	public void loginmethod(String userName, String passWord) {		
		sendKey(getUserName(), userName);
		sendKey(getPassWord(), passWord);
		click(getLogIn());
	}
	
}
