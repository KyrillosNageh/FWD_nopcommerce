package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.ProductDetailsPage;

public class TS07_FilterWithColor {

	ProductDetailsPage productobj;
	HomePage homeObj;
	
	@When("Select Apparel category then hover and click on Shoes")
	public void select_apparel_category_then_hover_and_click_on_shoes() {
		homeObj = new HomePage(Hooks.driver);
		homeObj.selectCategory(Hooks.driver,homeObj.apparelCategory, homeObj.shoesSubCategory);
	}
	
	@When("User filter products by color")
	public void user_filter_products_by_color() throws InterruptedException {
		productobj= new ProductDetailsPage(Hooks.driver);
		productobj.filterByColor();
		Thread.sleep(1000);
	}
	
	@Then("Validate the products are filtered by selected color")
	public void validate_the_products_are_filtered_by_selected_color() {
		productobj= new ProductDetailsPage(Hooks.driver);
		productobj.showDetailsOfProduct(0);
		
		/* >>	Write it like this with Selenium 4	<<*/
		WebDriverWait wait = new WebDriverWait(Hooks.driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.titleContains("adidas Consortium Campus 80s Running Shoes"));

		String excpected="selected-value";
		Assert.assertEquals(productobj.getSelectedColor(), excpected);
	}
}
