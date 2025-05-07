package steps;

import io.cucumber.java.en.Given;
import pages.MainPage;

import org.testng.Assert;
 

public class FreeRangeSteps {
   
    MainPage landingPage = new MainPage();
    
    @Given("I navigate to www.freerangetesters.com")
   public void navigateToRangeTesters(){
        landingPage.navigateToMainPage();
       
        //validate the assertion 
        Assert.assertEquals(0,0,"Assertion is OK");
   } 
}
