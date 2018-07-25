package stepDefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageObjects.homePageObject;
import pageObjects.loginPageObject;
import pageObjects.registerPageObject;

import java.util.Map;

public class registerSteps
{
    //declare variables here
    private WebDriver driver;
    private loginPageObject loginPage;
    private registerPageObject registerPage;
    //mapping data var declaration
    private Map<String, String> data;
    private homePageObject homePage;

    @Test
    @Given("^An e commerce$")
    public void an_e_commerce()
    {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I register with \"([^\"]*)\" \"([^\"]*)\"$")
    public void i_register_with(String arg1, String arg2)
    {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^Email \"([^\"]*)\"$")
    public void email(String arg1)
    {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^Password \"([^\"]*)\"$")
    public void password(String arg1)
    {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^The registration should be successful$")
    public void the_registration_should_be_successful()
    {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
