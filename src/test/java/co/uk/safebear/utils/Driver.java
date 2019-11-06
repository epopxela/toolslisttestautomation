package co.uk.safebear.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {

    private static final String URL = System.getProperty("url", "https://jobs.bristolairport.co.uk/vacancies/");
    private static final String BROWSER = System.getProperty("browser","chrome");

    public static String getURL(){
        return URL;
    }

    public static WebDriver getDriver() {

        ChromeOptions chromeoptions;


        switch (BROWSER.toUpperCase()) {

            case ("CHROME_HEADLESS"):
                System.out.println(" Executing on CHROME HEADLESS");

                chromeoptions = new ChromeOptions();

                //Set Chrome to run headlessly
                chromeoptions.addArguments("headless");

                //Make sure the window size is large and maximised
                //So nothing disappears off screen
                //(even in headless mode!)
                chromeoptions.addArguments("window-size=1920,1080");
                chromeoptions.addArguments("start-maximised");

                //Set up our Chromedriver
                WebDriverManager.chromedriver().setup();

                //Return the chromedriver with the chromeOptions set
                return new ChromeDriver(chromeoptions);

            case "CHROME":

                //Tell the user which browser we're running our tests on
                System.out.println("Executing on CHROME");

                //Use 'WebDriverManager' to setup our chromedriver
                WebDriverManager.chromedriver().setup();

                //Return our Driver
                return new ChromeDriver();

            default:
                throw new IllegalArgumentException("The Browser Type is Undefined");
        }

    }
}
