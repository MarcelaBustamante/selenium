package pages;


public class MainPage extends BasePage {

    private String bottonAutomation= "//a[@href='https://www.freerangetesters.com/ingenieria-qa']";

    public MainPage() {
        super(driver);
    }

    //Method to navigate to the main page of the application
    public void navigateToMainPage(){
        naviateTo("https://www.freerangetesters.com");
        clickElement(bottonAutomation);
    }
    
}
