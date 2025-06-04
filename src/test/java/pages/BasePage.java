package pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
    /** instead of do factory page and have wait for all the code this page will centralice that
     * this variable drive will be use in all the pages and subclassses
     */
    protected static WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));

    /*
     * configuration for chrome driver using WebDriverManager third party library library 
     */
    static {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    //constructor for the class BasePage
    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
    }

    //method to navigate to a URL
    public static void naviateTo(String url) {
        driver.get(url);
    }

    private WebElement find(String locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public void clickElement(String locator){
        find(locator).click();
    }

    public void sendKeys(String locator, String text) {
        find(locator).clear();
        find(locator).sendKeys(text);
    }

    public String getText(String locator) {
        return find(locator).getText();
    }

    public static void closeBrowser() {
        driver.quit();
    }

    public void selectFromDropdownByValue(String locator, String value) {
        Select dropdown = new Select(find(locator));
        dropdown.selectByValue(value);
    }

    public void selectFromDropdownByIndex(String locator, Integer index) {
    Select dropdown = new Select(find(locator));
    dropdown.selectByIndex(index);
    }

    public int dropdownSize(String locator) {
        Select dropdown = new Select(find(locator));
        List<WebElement> dropDownOptions = dropdown.getOptions();
        return dropDownOptions.size();
    }

    public List<String> getDropdownValues(String locator){
        Select dropdown = new Select(find(locator));
        List<WebElement> dropDownOptions = dropdown.getOptions();
        List<String> values = new ArrayList<>();
        for (WebElement option : dropDownOptions) {
            values.add(option.getText());
        }
        return values;
    }

    public void goToLinkText(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

}
