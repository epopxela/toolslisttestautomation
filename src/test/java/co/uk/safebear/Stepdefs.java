package co.uk.safebear;

import co.uk.safebear.utils.Driver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.*;

public class Stepdefs {

    WebDriver browser;

    @Before
    public void setUp(){
        // Get the driver for the browser (e.g. ChromeDriver)
        browser = Driver.getDriver();
        // Navigate to the URL of our webpage
        browser.get(Driver.getURL());

    }

    @After
    public void tearDown(){
        // Pause for a couple of seconds after test has run
        try {
            Thread.sleep(Integer.parseInt(System.getProperty("sleep","2000")));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        browser.quit();
    }


}
