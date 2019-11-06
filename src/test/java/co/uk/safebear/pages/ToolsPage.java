package co.uk.safebear.pages;

import co.uk.safebear.pages.locators.ToolsPageLocators;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;

@RequiredArgsConstructor
public class ToolsPage {

    @NonNull
    WebDriver browser;

    //Create object
    ToolsPageLocators locators = new ToolsPageLocators();

    public String getPageTitle(){
        return browser.getTitle();
    }

    public String checkforLoginSuccessfulMessage(){
        return browser.findElement(locators.getSuccessfulLoginMessage()).getText();
    }

}
