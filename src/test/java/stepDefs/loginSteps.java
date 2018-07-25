package stepDefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.homePageObject;
import pageObjects.loginPageObject;
import pageObjects.registerPageObject;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertNotNull;

public class loginSteps
{
    private WebDriver driver;
    private Map<String, String> data;
    private homePageObject homePage;
    private loginPageObject loginPage;
    private registerPageObject registerPage;


    @Test
    @Given("^I access login page$")
    public void i_access_login_page()
    {
        // Write code here that turns the phrase above into concrete actions
        driver = new ChromeDriver();

        driver.get("http://store.demoqa.com/products-page/your-account/");

    }

    @When("^I login with credentials \"([^\"]*)\" \"([^\"]*)\"$")
    public void i_login_with_credentials(String arg1, String arg2) throws Exception
    {
        // Write code here that turns the phrase above into concrete actions
        homePage = new homePageObject();
        driver = new ChromeDriver();
        assertNotNull(driver);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        loginPage = new loginPageObject(driver);

        //mapping data to allow for automation of the login
        loginPage = new loginPageObject(driver);
        data = new HashMap<String, String>();
        data.put("USERNAME_OR_EMAIL_ADDRESS", "mothupi.ramalepe@sqs.com");
        data.put("PASSWORD", "mothupi@sqs");

        loginPage.fill();
        Thread.sleep(3000); //wait
        throw new PendingException();

        //homePage.clickHomeLink();
    }

    @When("^email \"([^\"]*)\"$")
    public void email(String arg1)
    {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^password \"([^\"]*)\"$")
    public void password(String arg1)
    {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^login should be successful$")
    public void login_should_be_successful()
    {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
