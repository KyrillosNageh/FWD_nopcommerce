package stepDefinition;

import org.testng.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class TS06_SelectCategories {
	
	HomePage homeObject ; 
	
	@When("Select cmputers category then hover and click on desktops")
	public void select_random_category_then_hover_and_open_sub_category() throws InterruptedException {
		homeObject = new HomePage(Hooks.driver);
	
		
		homeObject.selectCategory(Hooks.driver,homeObject.computersCategory, homeObject.desktopsSubCategory);
		
//		homeObject.selectCategory(Hooks.driver,homeObject.apparelCategory, homeObject.shoesSubCategory);
	}
	
	@Then("Validate the page title is contain the name of the category")
	public void validate_the_page_title_is_contain_the_name_of_the_category() {
		homeObject = new HomePage(Hooks.driver);
		System.out.println(homeObject.getPagetitle());
		Assert.assertTrue(homeObject.getPagetitle().contains("Desktops"));
	}
	
}
