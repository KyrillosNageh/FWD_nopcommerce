package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageBase {
	
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[@class='page-title']")
	WebElement 	pageTitle;
	
	@FindBy(xpath="//*[@alt='nopCommerce demo store']")
	WebElement homePageLink;
	
	@FindBy(linkText="Register")
	WebElement registerPageLink;
	
	@FindBy(linkText="Log in")
	WebElement loginLink; 
	
	@FindBy(linkText="Shopping cart")
	WebElement shoppingCart; 
	
	@FindBy(linkText="Log out")
	WebElement logoutLink; 
	
	
	@FindBy(linkText="My account")
	WebElement myAccountLink; 
	
	@FindBy(linkText="Computers")
	public WebElement computersCategory; 
	
	@FindBy(linkText="Desktops")
	public WebElement desktopsSubCategory; 
	
	@FindBy(linkText="Electronics")
	public WebElement electronicsCategory; 
	
	@FindBy(linkText="Apparel")
	public WebElement apparelCategory; 
	
	@FindBy(linkText="Shoes")
	public WebElement shoesSubCategory; 
	
	@FindBy(linkText="Books ")
	public WebElement booksCategory; 
	
	@FindBy(linkText="Digital downloads ")
	public WebElement digitalDownloadsCategory; 
	
	
	@FindBy(id="customerCurrency")
	public WebElement currencySelector; 
	
	
	@FindBy(xpath="//*[@class='price actual-price']")
	public List<WebElement> productprice; 
	
	public void openHomePage() 
	{
		clickButton(homePageLink);
	}
	
	public void openRegistrationPage() 
	{
		clickButton(registerPageLink);
	}

	public void openLoginPage() 
	{
		clickButton(loginLink);
	}
	
	public void openMyAccountPage() 
	{
		clickButton(myAccountLink);
	}
	
	public void openShoppingCartPage() 
	{
		clickButton(shoppingCart);
	}
	
	public void selectCurrency(String currency)
	{
		select = new Select(currencySelector); 
		select.selectByVisibleText(currency);
	}
	public boolean logoutIsDisplay()
	{
		return logoutLink.isDisplayed();
	}
	
	
	public void selectCategory(WebDriver driver,WebElement category,WebElement subCategory)
	{
		Actions action = new Actions(driver);
		action.moveToElement(category).build().perform();
		action.moveToElement(subCategory).click().build().perform();
		
	}
	
	public String getPagetitle()
	{
		return pageTitle.getText();
	}
	
	public String getProductPrice(int index)
	{
		return productprice.get(index).getText();
	}
}
