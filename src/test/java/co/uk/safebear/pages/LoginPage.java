package co.uk.safebear.pages;

import co.uk.safebear.pages.locators.LoginPageLocators;
import co.uk.safebear.utils.Waits;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;

@RequiredArgsConstructor
public class LoginPage {

   //Create object
    LoginPageLocators locators = new LoginPageLocators();

    @NonNull
    //Create a new WebDriver
    WebDriver browser;

    public String getPageTitle(){
                return browser.getTitle();
    }

    public void enterUsername(String username){
        Waits.waitForElement(locators.getUsernameLocator(), browser).sendKeys(username);
    }

    public void enterPassword(String password){
        Waits.waitForElement(locators.getPasswordLocator(), browser).sendKeys(password);
    }

    public void clickLoginButton(){
        Waits.waitForElement(locators.getLoginbutton(), browser).click();
    }

    public String checkForFailedLoginWarning(){
        return Waits.waitForElement(locators.getFailedLoginMessage(), browser).getText();
    }

}
