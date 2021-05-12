import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver; // such dataType is imported extra from java client
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities; // such dataType is imported from selenium

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
        System.out.println("First test run");
    }
}
// question: how to automate the start of appium server?
