import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver; // such dataType is imported extra from java client
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities; // such dataType is imported from selenium
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;

public class FirstTest {
    private AppiumDriver driver; // we announced a new variable "driver" of the dataType Appium Driver

    @Before // markers for the JUnit to understand how and where to start
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "AndroidTestDevice");
        capabilities.setCapability("platformVersion", "8.0.0");//8.1 is the last one
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("appPackage", "org.wikipedia");
        capabilities.setCapability("appActivity", ".main.MainActivity");
        capabilities.setCapability("app", "C:/Users/Mikhail Nersesov/Desktop/JavaAppiumAutomation-2/apks/org.wikipedia.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        /*
        to turn on the Android driver;
        Host "0.0.0.0" means we are hosting on the local server
        linking "capabilites" to the arguments of the new object we send the info with which capabilites the androiddriver should start
         */
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void firstTest() {
        WebElement element_to_init_search = driver.findElementByXPath("//*[contains(@text,'Search Wikipedia')]");// все такие элементы имеют класс/тип данных WebElement; "//" - любая вложенность элемента; "*" - любой элемент
        element_to_init_search.click();

        //WebElement element_to_enter_search_line = driver.findElementByXPath("//*[contains(@text,'Search…')]");

        WebElement element_to_enter_search_line = waitForElementPresentByXpath("//*[contains(@text,'Search…')]","Cannot find the search input", 5);


        element_to_enter_search_line.sendKeys("Appium");
        System.out.println("First test run completed");
    }

    private WebElement waitForElementPresentByXpath(String xpath, String error_message, long timeoutInSeconds){
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);// Selenium method
        wait.withMessage(error_message +"/n"); // "/n" to start at the new line
        By by = By.xpath(xpath); // defining parameter to wait for
        return wait.until(
                ExpectedConditions.presenceOfElementLocated(by)// we are waiting will this condition fullfils
        );
    }
}
// question: how to automate the start of appium server?
// how to clear the app to begin from the cleansetup?