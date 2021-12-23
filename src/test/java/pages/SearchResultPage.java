package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestBase;

public class SearchResultPage extends TestBase 	 {
	
	@FindBy(linkText="Search")
	WebElement searchHeading;
	
	@FindBy(xpath="//span[contains(text(), 'Add')]")
	WebElement addToCart;
	
	@FindBy(css="span#cart-total")
	WebElement cartTotal;
	
	public SearchResultPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public void addItemToCart() {
		addToCart.click();
			}
	
	public void isItemsListed() {
		
	}
    public void isItemAdded() throws InterruptedException {
//    	WebDriverWait wait = new WebDriverWait(10,TimeUnit.SECONDS);
//    	wait.until(ExpectedConditions.textToBe(null, null))
    	Thread.sleep(1000);
		String total = cartTotal.getText();
		System.out.println("Cart Total :" +total);
	}
}
