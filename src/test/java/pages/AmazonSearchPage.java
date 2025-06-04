package pages;

public class AmazonSearchPage extends BasePage{
    private String textBox = "//input[@id='twotabsearchtextbox']";
    private String searchButton = "//input[@id='nav-search-submit-button']";
    private String thirdResult = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/h2[1]/span[1]";

    public AmazonSearchPage() {
        super(driver);
    }

    public void navigateToAmazon() {
        naviateTo("https://www.amazon.com");
    }

    public void enterSearchCriteria(String criteria){
        sendKeys(textBox, criteria);
    }

    public void clickSearchButton() {
        clickElement(searchButton);
    }

    public void goToPage(String pageNumber){
        goToLinkText(pageNumber);
    }

    public void selectThirdItem(){
        clickElement(thirdResult);
    }
}
