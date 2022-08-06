package stepDefinition;

import io.cucumber.java.en.When;
import pages.CheckoutPage;
import pages.HomePage;
import pages.ProductDetailsPage;
import pages.ShoppingCartPage;

public class TS12_CreateOrder {

	ProductDetailsPage productobj;
	HomePage homeObj;
	CheckoutPage checkoutObj;
	ShoppingCartPage shoppingCartObj;

	@When("User navigate to shopping cart page and click on Checkout button")
	public void user_navigate_to_shopping_cart_page_and_click_on_checkout_button() {
		homeObj = new HomePage(Hooks.driver);
		homeObj.openShoppingCartPage();
		shoppingCartObj =new ShoppingCartPage(Hooks.driver);
		shoppingCartObj.openCheckoutPage();
	}
	@When("User entered {string} , {string} , {string}, {string}, {string}")
	public void user_entered(String string, String string2, String string3, String string4, String string5) throws InterruptedException {
		Thread.sleep(2000);
		checkoutObj= new CheckoutPage(Hooks.driver);
		checkoutObj.RegisteredUserCheckoutProduct(string, string2, string3, string4, string5);
		checkoutObj.confirmOrder();
		System.out.println(checkoutObj.successMessage.getText());
	}
}
