package stepDefs;

import org.junit.Assert;

import base.TestBase;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SearchResultPage;

public class OrderStepDef extends TestBase{
	
	 HomePage homePage;
	 SearchResultPage resultPage;
	 @Before
	 public void setUp()
	 {
		 initialize();
		 homePage =  new HomePage();
	 }
 
	    @Given("User is on Home Page")
		public void user_is_on_home_page() {
      String pageTitle = homePage.getHomePageTitle();
      System.out.println("Got Data");
      Assert.assertEquals("Your Store", pageTitle);
		}	

        @When("User search {string}")
		public void user_search(String strItem) {
        homePage.searchItem(strItem);
		}

		@When("User add Item to cart")
		public void user_add_item_to_cart() {
			resultPage.addItemToCart();
		}
		@Then("Item must be added to cart")
		public void item_must_be_added_to_cart() throws InterruptedException {
			resultPage.isItemAdded();
		}



}
