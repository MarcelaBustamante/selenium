package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
}
