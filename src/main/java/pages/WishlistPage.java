package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishlistPage extends PageBase
{
	public WishlistPage(WebDriver driver) {
		super(driver);
	}
	
	
    @FindBy(name = "removefromcart")
    private WebElement removefromCartCheck;
    
    public void removeProductFromWishlist() {
        clickButton(removefromCartCheck);
    }
}
