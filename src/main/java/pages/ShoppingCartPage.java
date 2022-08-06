package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends PageBase
{
	public ShoppingCartPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(name = "removefromcart")
	WebElement removeCheck;
	
	@FindBy(id="checkout")
	WebElement checkoutBtn ; 
	
	@FindBy(id="termsofservice")
	WebElement agreeCheckbox; 
	
	public void RemoveProductFromCart() {
		clickButton(removeCheck);
	}

	public void openCheckoutPage() 
	{
		clickButton(agreeCheckbox);
		clickButton(checkoutBtn);
	}
}
