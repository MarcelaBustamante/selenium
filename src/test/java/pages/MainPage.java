package pages;


public class MainPage extends BasePage {
    //the %s is a position marker for the section name
    private String sectionLink = "//a[normalize-space()='%s' and @href]";
    private String elegirUnPlanButton = "//a[normalize-space()='Elegir Plan' and @href]";

    private String bottonAutomation= "//a[@href='https://www.freerangetesters.com/ingenieria-qa']";

    public MainPage() {
        super(driver);
    }

    //Method to navigate to the main page of the application
    public void navigateToMainPage(){
        naviateTo("https://www.freerangetesters.com");
    }

    public void clickOnSectionNavigationBar(String section){
        //replace the %s i the sectionLink with the section name
        String xpathSection = String.format(sectionLink, section);
        clickElement(xpathSection);
    }

    public void clickOnButtonElegirPlan() {
        clickElement(elegirUnPlanButton);
    }
    
}
