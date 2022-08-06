package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage  extends PageBase
{
	public CheckoutPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "BillingNewAddress_CountryId")
	WebElement countryList;
	
	@FindBy(id = "BillingNewAddress_City")
	private WebElement cityTxt;
	
	@FindBy(id = "BillingNewAddress_Address1")
	private WebElement addressTxt;
	
	@FindBy(id = "BillingNewAddress_ZipPostalCode")
	private WebElement postCodeTxt;
	
	@FindBy(id = "BillingNewAddress_PhoneNumber")
	private WebElement phoneTxt;
	
	@FindBy(xpath = "//*[@class='button-1 new-address-next-step-button']")
	private WebElement continueBillingAddressBtn;
	
	@FindBy(xpath = "//*[@class='button-1 shipping-method-next-step-button']")
	private WebElement continueShippingMethodBtn;
	
	@FindBy(xpath = "//*[@class='button-1 payment-method-next-step-button']")
	private WebElement continuePaymentMethodBtn;
	
	@FindBy(xpath = "//*[@class='button-1 payment-info-next-step-button']")
	private WebElement continuePaymentInfoBtn;
	
	@FindBy(css = "a.product-name")
	public WebElement prodcutName;
	
	
	@FindBy(xpath = "//*[@class='button-1 confirm-order-next-step-button']")
	private WebElement confirmBtn;
	
	@FindBy(css = "h1")
	public WebElement ThankYoulbl;
	
	@FindBy(css = "div.title")
	public WebElement successMessage;
	
	public void RegisteredUserCheckoutProduct(String countryName, String address, 
			String postcode, String phone, String city) throws InterruptedException {
		select = new Select(countryList);
		select.selectByVisibleText(countryName);
		setTextElementText(cityTxt, city);
		setTextElementText(addressTxt, address);
		setTextElementText(postCodeTxt, postcode);
		setTextElementText(phoneTxt, phone);
		clickButton(continueBillingAddressBtn);
		Thread.sleep(1000);
		clickButton(continueShippingMethodBtn);
		Thread.sleep(1000);
		clickButton(continuePaymentMethodBtn);
		Thread.sleep(1000);
		clickButton(continuePaymentInfoBtn);
		Thread.sleep(1000);
	}
	
	public void confirmOrder() throws InterruptedException 
	{
		clickButton(confirmBtn);
		Thread.sleep(2000);
	}

	
}
