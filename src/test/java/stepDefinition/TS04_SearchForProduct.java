package stepDefinition;


import org.testng.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProductDetailsPage;
import pages.SearchPage;

public class TS04_SearchForProduct {

	SearchPage searchObject;
	ProductDetailsPage productobj;
	
	@When("User serch for {string}")
	public void user_serch_for(String product) {
		searchObject =new SearchPage(Hooks.driver);
		searchObject.searchForProduct(product);

	}
	
	@When("User Autocomplet serch for {string}")
	public void user_autocomplet_serch_for(String product) {
		searchObject =new SearchPage(Hooks.driver);
		searchObject.ProductSearchUsingAutoSuggest(product);
	}
	
	@Then("Validate the search")
	public void validate_the_search() {
		productobj = new ProductDetailsPage(Hooks.driver);
		System.out.println(Hooks.driver.getTitle());
//		Assert.assertTrue(productobj.searchKeyword.get(0).getText().contains("First Prize Pies"));
		Assert.assertTrue(Hooks.driver.getTitle().contains("First Prize Pies"));
	}

}
