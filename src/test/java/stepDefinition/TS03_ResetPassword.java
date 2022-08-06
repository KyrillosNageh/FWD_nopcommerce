package stepDefinition;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.MyAccountPage;

public class TS03_ResetPassword {

	HomePage homeObject ; 
	MyAccountPage myAccountObject;
	String excpectedMsg;
	
	@When("User click On MyAccount page")
	public void user_click_on_my_account_page() {
		homeObject = new HomePage(Hooks.driver);
		homeObject.openMyAccountPage();
	}
	
	@When("User click On change password page")
	public void user_click_on_change_password_page() {
		myAccountObject = new MyAccountPage(Hooks.driver);
		myAccountObject.openChangePasswordPage();
	}
	
	@When("User entered {string} and {string}")
	public void user_entered_and(String oldPassword, String newPassword) {
		myAccountObject = new MyAccountPage(Hooks.driver);
		myAccountObject.setChangePasswordData(oldPassword, newPassword);
	}
	
	@When("User click on change password button")
	public void user_click_on_change_password_button() {
		myAccountObject = new MyAccountPage(Hooks.driver);
		myAccountObject.userClickOnChangePasswordBtn();
	}
	
	@Then("Validate user changed the password successfully")
	public void validate_user_changed_the_password_successfully() {
		myAccountObject = new MyAccountPage(Hooks.driver);
		excpectedMsg = "Password was changed";
		Assert.assertEquals(myAccountObject.getChangePasswordMsg(), excpectedMsg);
	}
}
