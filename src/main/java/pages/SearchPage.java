package pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBase {

	public SearchPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="small-searchterms")
	WebElement searchTxtBox; 
	
	@FindBy(css="input.button-1.search-box-button")
	WebElement searchBtn ; 
	
	@FindBy(id="ui-id-1")
	List<WebElement> ProductList ; 
	
	@FindBy(xpath="//*[@class='search-text valid']")
	WebElement searchKeywordTxt; 
	
	@FindBy(linkText="Apple MacBook Pro 13-inch")
	WebElement productTitle; 

	
	
//	public String  getCurrentPageTittle()
//	{
//		return driver.;
//	}

	public void searchForProduct(String productName)
	{
		searchTxtBox.sendKeys(productName);
		searchTxtBox.sendKeys(Keys.ENTER);
	}
	
	public void OpenProductDetailsPage() 
	{
		clickButton(productTitle);
	}
	
	public String getCurrentPageTittle()
	{
		return searchKeywordTxt.getText();
	}
	
	public void ProductSearchUsingAutoSuggest(String searchTxt) 
	{						
		setTextElementText(searchTxtBox, searchTxt);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ProductList.get(0).click();
	}
}
