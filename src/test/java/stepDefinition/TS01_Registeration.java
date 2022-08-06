package stepDefinition;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.RegistrationPage;

public class TS01_Registeration {

	HomePage homeObject ; 
	RegistrationPage registerObject ; 
	
	@Given("User open home page")
	public void user_open_home_page() {
	    homeObject =new HomePage(Hooks.driver);
		homeObject.openHomePage();
	}
	
	@When("User click on register link")
	public void user_click_on_register_link() {
		homeObject =new HomePage(Hooks.driver);
		homeObject.openRegistrationPage();
	}
	
	@When("User entered {string} , {string} , {string} , {string}")
	public void user_entered(String firstname, String lastname, String email, String password) {
		registerObject = new RegistrationPage(Hooks.driver);
		registerObject.userSetRegistrationData(firstname, lastname, email, password);
	}
	
	@When("User click on register button")
	public void user_click_on_register_button() {
		registerObject = new RegistrationPage(Hooks.driver);
		registerObject.userClickOnRegisterButton();
	}
	
	@Then("Validate the registration done successfully")
	public void validate_the_registration_done_successfully() {
		registerObject = new RegistrationPage(Hooks.driver);
		Assert.assertTrue(registerObject.successMessage.getText().contains("Your registration completed"));
	}
}
