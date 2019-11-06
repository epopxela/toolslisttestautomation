package co.uk.safebear.pages.locators;

import lombok.Data;
import org.openqa.selenium.By;

@Data
public class LoginPageLocators {

    //fields (by xpath NOT id as per the manual)

    private By usernameLocator = By.xpath (".//input[@id=\"username\"]");
    private By passwordLocator = By.xpath(".//input[@id=\"password\"]");

    //buttons
    private By Loginbutton = By.xpath(".//button[@id=\"enter\"]");

    //messages
    private By failedLoginMessage = By.xpath(".//p[@id=\"rejectLogin\"]/b");
}
