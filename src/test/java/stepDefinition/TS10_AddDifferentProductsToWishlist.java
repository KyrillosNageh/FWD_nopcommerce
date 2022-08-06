package stepDefinition;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProductDetailsPage;

public class TS10_AddDifferentProductsToWishlist {

	ProductDetailsPage productobj;
	String expectedMsg;
	
	
	@When("User add the product to wishlist")
	public void user_add_the_product_to_wishlist() {
		productobj = new ProductDetailsPage(Hooks.driver);
		productobj.addProductToWishList();
	}
	
	@Then("Validate the product added to wishlist successfully")
	public void validate_the_product_added_to_wishlist_successfully() {
		productobj = new ProductDetailsPage(Hooks.driver);
		expectedMsg ="The product has been added to your wishlist";
		Assert.assertEquals(productobj.messageProduct.getText(),expectedMsg);
		System.out.println(productobj.messageProduct.getText());
	}
}
