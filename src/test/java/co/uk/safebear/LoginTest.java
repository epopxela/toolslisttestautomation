package co.uk.safebear;

import co.uk.safebear.pages.LoginPage;
import co.uk.safebear.pages.ToolsPage;
import co.uk.safebear.utils.Driver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class LoginTest {

    WebDriver browser;
    LoginPage loginPage;
    ToolsPage toolspage;

    @Before
    public void setup(){
        browser = Driver.getDriver();
        browser.navigate().to(Driver.getURL());

        loginPage = new LoginPage(browser);
        toolspage = new ToolsPage(browser);
    }

    @After
    public void tearDown(){

        browser.quit();
    }

    @Test
    public void successfulLoginTest(){

        Assert.assertEquals("Login Page", loginPage.getPageTitle());

        loginPage.enterUsername("tester");
        loginPage.enterPassword("letmein");
        loginPage.clickLoginButton();

        Assert.assertEquals("Login Successful", toolspage.checkforLoginSuccessfulMessage());
    }

    @Test
    public void unsuccessfulLoginTest(){

        Assert.assertEquals("Login Page", loginPage.getPageTitle());

        loginPage.enterUsername("invalid");
        loginPage.enterPassword("don'tletmein");
        loginPage.clickLoginButton();

        Assert.assertEquals("WARNING: Username or Password is incorrect", toolspage.checkforLoginSuccessfulMessage());
    }
}
