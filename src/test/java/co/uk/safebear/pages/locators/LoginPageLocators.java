package co.uk.safebear.pages.locators;

import org.openqa.selenium.By;

public class LoginPageLocators {

    private By usernameLocator = By.xpath("username");
    private By passwordLocator = By.xpath("password");
    private By Loginbutton = By.xpath("enter");
    private By failedLoginMessage = By.xpath(".//p[@id=\"rejectLogin\"]/b");
}
