package stepDefinition;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;


public class TS02_Login {

	HomePage homeObject ; 
	LoginPage loginobject;

	@When("User click on log in link")
	public void user_click_on_log_in_link() {
		homeObject = new HomePage(Hooks.driver);
		homeObject.openLoginPage();
	}
	
	@When("User entered {string} , {string}")
	public void user_entered(String username, String password) {
		loginobject = new LoginPage(Hooks.driver);
		loginobject.UserSetLoginData(username, password);
	}
	
	@When("User click on Log in button")
	public void user_click_on_log_in_button() {
		loginobject = new LoginPage(Hooks.driver);
		loginobject.UserClickOnLoginBtn();
	}
	
	@Then("Validate the user log in successflly")
	public void validate_the_user_log_in_successflly() {
		homeObject = new HomePage(Hooks.driver);
		Assert.assertTrue(homeObject.logoutIsDisplay());
	}
}
