package co.uk.safebear.pages.locators;

import lombok.Data;
import org.openqa.selenium.By;

@Data
public class LoginPageLocators {

    //fields

    private By usernameLocator = By.xpath("username");
    private By passwordLocator = By.xpath("password");

    //buttons
    private By Loginbutton = By.xpath("enter");

    //messages
    private By failedLoginMessage = By.xpath(".//p[@id=\"rejectLogin\"]/b");
}
