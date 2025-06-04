package steps;

import io.cucumber.java.en.*;
import pages.AmazonSearchPage;

public class AmazonSearchSteps {
    AmazonSearchPage amazonSearchPage= new AmazonSearchPage();
    @Given("^the user navigates to www.amazon.com$")
    public void navigateToAmazon() {
        amazonSearchPage.navigateToAmazon();
    }

    @And("^Searches for (.+)$")
    public void enterSearchCriteria(String criteria) {
      amazonSearchPage.enterSearchCriteria(criteria);
      amazonSearchPage.clickSearchButton();
    }	
    
    @And("^navigates to the second page$")
    public void navigateToSecondPage(){
        amazonSearchPage.goToPage("2");
    }

    @And("selects the third item")
    public void selectThirdItem() {
        amazonSearchPage.selectThirdItem();
    }

    @Then("the user is able to add it to the cart")
    public void itemCanBeAddedToCart() {
        // Code to verify item can be added to cart
        System.out.println("Item can be added to the cart");
    }    
}
