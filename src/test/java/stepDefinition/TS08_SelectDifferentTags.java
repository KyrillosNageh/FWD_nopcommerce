package stepDefinition;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProductDetailsPage;

public class TS08_SelectDifferentTags {


	ProductDetailsPage productobj;
	String expectedMsg;
	
	@When("User select Tag")
	public void user_select_tag() {
		productobj = new ProductDetailsPage(Hooks.driver);
		productobj.clickOnTagProduct(productobj.cameraTag);
	}
	
	@Then("Validate the selected tag page")
	public void validate_the_selected_tag_page() {
		productobj = new ProductDetailsPage(Hooks.driver);
		System.out.println(Hooks.driver.getTitle());
		Assert.assertTrue(Hooks.driver.getTitle().contains("Products tagged with 'camera'"));
	}
}
