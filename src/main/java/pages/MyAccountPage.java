package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageBase {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(linkText="Change password")
	WebElement changePasswordLink ; 
	
	@FindBy(id = "OldPassword")
    WebElement oldPasswordTxt;
	
    @FindBy(id = "NewPassword")
    WebElement newPasswordTxt;
    
    @FindBy(id = "ConfirmNewPassword")
    WebElement confirmPasswordTxt;
    
    @FindBy(xpath = "//*[@class='button-1 change-password-button']")
    WebElement ChangePasswordBtn;
	
    @FindBy(xpath = "//*[@class='content']")
    WebElement changePasswordMsg;
    
	public void openChangePasswordPage() 
	{
		clickButton(changePasswordLink);
	}
	

	public void setChangePasswordData(String oldpassword, String newpassword) {
        setTextElementText(oldPasswordTxt, oldpassword);
        setTextElementText(newPasswordTxt, newpassword);
        setTextElementText(confirmPasswordTxt, newpassword);
    }
	
	public void userClickOnChangePasswordBtn()
	{
        clickButton(ChangePasswordBtn);
	}
	
	public String getChangePasswordMsg()
	{
		return changePasswordMsg.getText();	
	}

}
