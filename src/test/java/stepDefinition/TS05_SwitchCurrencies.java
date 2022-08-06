package stepDefinition;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;


public class TS05_SwitchCurrencies {

	HomePage homeObject ; 
	
	@When("User selecte currency {string}")
	public void user_selecte_currency(String currencyType) throws InterruptedException {
		homeObject = new HomePage(Hooks.driver);
		homeObject.selectCurrency("Euro");
		Thread.sleep(5000);
	}
	@Then("Validate the product become by the Euro")
	public void validate_the_product_become_by_the_euro() {
		homeObject = new HomePage(Hooks.driver);
		System.out.println(homeObject.getProductPrice(0));
		Assert.assertTrue(homeObject.productprice.get(0).getText().contains("€"));
	}

}
