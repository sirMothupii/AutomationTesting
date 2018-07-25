package pageObjects;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class registerPageObject {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a[href='http://store.demoqa.com/']")
    @CacheLookup
    private WebElement backToOnlineStore;

    @FindBy(id = "user_email")
    @CacheLookup
    private WebElement email;

    @FindBy(css = "a[href='http://store.demoqa.com/wp-login.php']")
    @CacheLookup
    private WebElement logIn;

    @FindBy(css = "a[href='http://store.demoqa.com/wp-login.php?action=lostpassword']")
    @CacheLookup
    private WebElement lostYourPassword;

    @FindBy(css = "a[title='Powered by WordPress']")
    @CacheLookup
    private WebElement onlineStore;

    private final String pageLoadedText = "Registration confirmation will be emailed to you";

    private final String pageUrl = "/wp-login.php?action=register";

    @FindBy(id = "wp-submit")
    @CacheLookup
    private WebElement register;

    @FindBy(id = "user_login")
    @CacheLookup
    private WebElement username;

    public registerPageObject() {
    }

    public registerPageObject(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public registerPageObject(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public registerPageObject(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Back To Online Store Link.
     *
     * @return the registerPageObject class instance.
     */
    public registerPageObject clickBackToOnlineStoreLink() {
        backToOnlineStore.click();
        return this;
    }

    /**
     * Click on Log In Link.
     *
     * @return the registerPageObject class instance.
     */
    public registerPageObject clickLogInLink()
    {
        logIn.click();
        return this;
    }

    /**
     * Click on Lost Your Password Link.
     *
     * @return the registerPageObject class instance.
     */
    public registerPageObject clickLostYourPasswordLink()
    {
        lostYourPassword.click();
        return this;
    }

    /**
     * Click on Online Store Link.
     *
     * @return the registerPageObject class instance.
     */
    public registerPageObject clickOnlineStoreLink()
    {
        onlineStore.click();
        return this;
    }

    /**
     * Click on Register Button.
     *
     * @return the registerPageObject class instance.
     */
    public registerPageObject clickRegisterButton() {
        register.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the registerPageObject class instance.
     */
    public registerPageObject fill() {
        setUsernameTextField();
        setEmailEmailField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the registerPageObject class instance.
     */
    public registerPageObject fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to Email Email field.
     *
     * @return the registerPageObject class instance.
     */
    public registerPageObject setEmailEmailField() {
        return setEmailEmailField(data.get("EMAIL"));
    }

    /**
     * Set value to Email Email field.
     *
     * @return the registerPageObject class instance.
     */
    public registerPageObject setEmailEmailField(String emailValue) {
        email.sendKeys(emailValue);
        return this;
    }

    /**
     * Set default value to Username Text field.
     *
     * @return the registerPageObject class instance.
     */
    public registerPageObject setUsernameTextField() {
        return setUsernameTextField(data.get("USERNAME"));
    }

    /**
     * Set value to Username Text field.
     *
     * @return the registerPageObject class instance.
     */
    public registerPageObject setUsernameTextField(String usernameValue) {
        username.sendKeys(usernameValue);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the registerPageObject class instance.
     */
    public registerPageObject submit() {
        clickRegisterButton();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the registerPageObject class instance.
     */
    public registerPageObject verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the registerPageObject class instance.
     */
    public registerPageObject verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
