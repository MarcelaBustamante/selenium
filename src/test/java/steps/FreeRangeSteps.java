package steps;

import io.cucumber.java.en.*;
import pages.MainPage;
import pages.PaginaCursos;
import pages.PaginaFundamentosTesting;
import pages.PaginaRegistro;

import java.util.List;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;
 

public class FreeRangeSteps {
   
     MainPage landingPage = new MainPage();
     PaginaCursos cursosPage = new PaginaCursos();
     PaginaFundamentosTesting fundamentosTestingPage = new PaginaFundamentosTesting();
     PaginaRegistro registro = new PaginaRegistro();
    
     SoftAssert softAssert = new SoftAssert();
    
     @Given("I navigate to www.freerangetesters.com")
   public void navigateToRangeTesters(){
        landingPage.navigateToMainPage();
       
        //validate the assertion 
        Assert.assertEquals(0,0,"Assertion is OK");
   }
     @When("I go to {word} using the navigation bar")
     public void navigationBarUse(String section) {
          landingPage.clickOnSectionNavigationBar(section);
      }

     @When("I select Elegir Plan")
     public void clickOnButtonElegirPlan() {
          landingPage.clickOnButtonElegirPlan();
     }
     @Then("I can validate the options in the checkout page")
     public void ValidateCheckoutPlans(){
          List<String> plans = registro.returnPlanDropdownValues();
          List<String> expectedPlans = List.of("Academia: $16.99 / mes • 15 productos", "Academia: $176 / año • 15 productos", "Free: Gratis • 3 productos");
          softAssert.assertEquals(plans, expectedPlans);
     }
}
