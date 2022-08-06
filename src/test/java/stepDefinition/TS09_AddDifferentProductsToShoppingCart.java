package stepDefinition;


import org.testng.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.ProductDetailsPage;

public class TS09_AddDifferentProductsToShoppingCart {
	
	ProductDetailsPage productobj;
	HomePage homeObj;
	String expectedMsg;

	
	@When("User add the product to cart")
	public void user_add_the_product_to_cart() {
		productobj = new ProductDetailsPage(Hooks.driver);
		productobj.addProductToCart();
	}
	
	@Then("Validate the product added to cart successfully")
	public void validate_the_product_added_to_cart_successfully() {
		productobj = new ProductDetailsPage(Hooks.driver);
		expectedMsg ="The product has been added to your shopping cart";
		
		System.out.println(productobj.messageProduct.getText());
		Assert.assertEquals(productobj.messageProduct.getText(),expectedMsg);
	}
}
