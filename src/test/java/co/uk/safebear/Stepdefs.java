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
    public void setup(){
        browser = Driver.getDriver();
        browser.navigate().to(Driver.getURL());
    }

    @After
    public void teardown(){
        browser.quit();

    }

    @When("a user searches for a job called {string}")
    public void a_user_searches_for_a_job_called(String jobType) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("all job results containing the word {string} are returned")
    public void all_job_results_containing_the_word_are_returned(String jobExpectedResults) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }


}
