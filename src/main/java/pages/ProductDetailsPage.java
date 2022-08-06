package pages;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends PageBase{

	static final String keyword ="Laptop";
	static final String productComparison_URL = "https://demo.nopcommerce.com/compareproducts";
	
	public ProductDetailsPage(WebDriver driver) {
		super(driver);
	}

	
	@FindBy (xpath = "//*[@class='button-2 product-box-add-to-cart-button']")
	WebElement AddToCartBtn;
	
	@FindBy (id = "attribute-option-15")
	WebElement filterByColorRed;
	
//	@FindBy (xpath = "//*[@title='Red']")
	@FindBy (xpath = "//*[@data-attr-value='25']")
	WebElement selectedColor;
	
	@FindBy (xpath = "//*[@class='product-item']")
	List <WebElement> productItem;
	
	@FindBy (xpath = "//*[@class='picture']")
	List <WebElement> showDetails;
	
	@FindBy (xpath = "//*[@class='button-2 add-to-wishlist-button']")
	public  WebElement AddToWishListBtn;

	@FindBy (xpath = "//*[@class='button-2 add-to-compare-list-button']")
	public  List<WebElement> addToCompareListBtn;

	@FindBy (xpath = "//a[contains(text(),\"Laptop\")]")
	public List<WebElement> searchKeyword;

	@FindBy(xpath="//*[@class='content']")
	public WebElement messageProduct ; 
	
	@FindBy(linkText ="camera")
	public WebElement cameraTag ; 
	
    public void addProductToCart()
    {
    	clickButton(AddToCartBtn);
    }
    
    public void addProductToWishList()
    {
    	clickButton(AddToWishListBtn);
    }
    
    public void addProductToCompareList(int index)
    {
    	clickButton(addToCompareListBtn.get(index));
    }
    
    public void clickOnTagProduct(WebElement tag)
    {
    	clickButton(tag);
    }
    
    public int getNumberOfProducts()
    {
    	return addToCompareListBtn.size();
    }
    
    public void filterByColor()
    {
    	clickButton(filterByColorRed);
    }
    
    public void showDetailsOfProduct(int index)
    {
    	
    	clickButton(showDetails.get(index));
    }
    
    public String getSelectedColor()
    {
    	return selectedColor.getAttribute("class");
    }
    
    public void navigateToProductComparisonPage(WebDriver drive)
    {
    	drive.get(productComparison_URL);;
    }
}
