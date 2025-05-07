package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class test {
    //first thing to do is create the instance for WebDriver
    private WebDriver driver;

    //second thing to do is create the setup with a beforeMethod
    @BeforeMethod
    public void setUp(){
        //inicialize the WebDriver instance here with chrome
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void testNavigation() {
        //navigate to the URL
        driver.get("https://www.google.com");
    }

    @AfterMethod
    public void tearDown() {
        //close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
