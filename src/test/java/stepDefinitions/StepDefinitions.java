package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class StepDefinitions {

    @Given("^I open my website$")
    public void openMyWebsite() throws Throwable {
        log.info("Open my website");
    }

    @When("^I enter valid credentials$")
    public void enterValidCreds() throws Throwable {
        log.info("Enter valid credentials");
    }

    @Then("^I should be able to login$")
    public void shouldLoginSuccessfully() throws Throwable {
        log.info("Should login successfully");
    }

}
