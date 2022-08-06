package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ComparePage;
import pages.ProductDetailsPage;

public class TS11_AddDifferentProductsToCompareList {

	ProductDetailsPage productobj;
	ComparePage compareObj;
	String expectedMsg;
	static int count;
	
	@When("User add a differnt products to compare list")
	public void user_add_a_differnt_products_to_compare_list() throws InterruptedException {
		productobj = new ProductDetailsPage(Hooks.driver);
//		count = productobj.getNumberOfProducts();
//		WebDriverWait wait = new WebDriverWait(Hooks.driver,Duration.ofSeconds(1));
		productobj.addProductToCompareList(1);
//		wait.until(ExpectedConditions.visibilityOf(productobj.messageProduct));
//		for (int index =0 ; index < count; index++)
//		{
//			productobj.addProductToCompareList(index);
//			wait.until(ExpectedConditions.visibilityOf(productobj.messageProduct));
//		}
		
	}
	
	@Then("Validate the product added to compare list successfully")
	public void validate_the_product_added_to_compare_list_successfully() throws InterruptedException {
		productobj = new ProductDetailsPage(Hooks.driver);
		expectedMsg ="The product has been added to your product comparison";
		
		System.out.println(productobj.messageProduct.getText());
		Assert.assertEquals(productobj.messageProduct.getText(),expectedMsg);
		
//		count = productobj.getNumberOfProducts();
//		productobj.navigateToProductComparisonPage(Hooks.driver);
//		compareObj = new ComparePage(Hooks.driver);
//		int countCompaerProduct = compareObj.getNumberOfProducts();
//		Assert.assertEquals(countCompaerProduct, count);
		
		
	}
	
	@Then("Validate the results contains {string} keyword")
	public void validate_the_results_contains_keyword(String keyword) {
		productobj = new ProductDetailsPage(Hooks.driver);
		count = productobj.getNumberOfProducts();
		
		Assert.assertTrue(productobj.searchKeyword.get(1).getText().contains(keyword));
		
//		for (int index =0 ; index < count; index++)
//		{
//			System.out.println(productobj.searchKeyword.get(index).getText());
//			Assert.assertTrue(productobj.searchKeyword.get(index).getText().contains(keyword));
//			
//		}
	}
	
	
}

