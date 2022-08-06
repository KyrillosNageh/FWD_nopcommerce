package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase
{
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="Email")
	WebElement emailTxtBox ; 

	@FindBy(id="Password")
	WebElement passwordTxtBox ; 

	@FindBy(xpath="//*[@class='button-1 login-button']")
	WebElement loginBtn ; 

	public void UserSetLoginData(String email , String password) 
	{
		setTextElementText(emailTxtBox, email);
		setTextElementText(passwordTxtBox, password);
	}
	
	public void UserClickOnLoginBtn()
	{
		clickButton(loginBtn);
	}
}
