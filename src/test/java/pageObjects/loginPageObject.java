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

public class loginPageObject {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a[href='http://store.demoqa.com/']")
    @CacheLookup
    private WebElement backToOnlineStore;

    @FindBy(id = "wp-submit")
    @CacheLookup
    private WebElement logIn;

    @FindBy(css = "a[href='http://store.demoqa.com/wp-login.php?action=lostpassword']")
    @CacheLookup
    private WebElement lostYourPassword;

    @FindBy(css = "a[title='Powered by WordPress']")
    @CacheLookup
    private WebElement onlineStore;

    private final String pageLoadedText = "";

    private final String pageUrl = "/wp-login.php";

    @FindBy(id = "user_pass")
    @CacheLookup
    private WebElement password;

    @FindBy(css = "a[href='http://store.demoqa.com/wp-login.php?action=register']")
    @CacheLookup
    private WebElement register;

    @FindBy(id = "rememberme")
    @CacheLookup
    private WebElement rememberMe;

    @FindBy(id = "user_login")
    @CacheLookup
    private WebElement usernameOrEmailAddress;

    public loginPageObject() {
    }

    public loginPageObject(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public loginPageObject(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public loginPageObject(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Back To Online Store Link.
     *
     * @return the loginPageObject class instance.
     */
    public loginPageObject clickBackToOnlineStoreLink() {
        backToOnlineStore.click();
        return this;
    }

    /**
     * Click on Log In Button.
     *
     * @return the loginPageObject class instance.
     */
    public loginPageObject clickLogInButton() {
        logIn.click();
        return this;
    }

    /**
     * Click on Lost Your Password Link.
     *
     * @return the loginPageObject class instance.
     */
    public loginPageObject clickLostYourPasswordLink() {
        lostYourPassword.click();
        return this;
    }

    /**
     * Click on Online Store Link.
     *
     * @return the loginPageObject class instance.
     */
    public loginPageObject clickOnlineStoreLink() {
        onlineStore.click();
        return this;
    }

    /**
     * Click on Register Link.
     *
     * @return the loginPageObject class instance.
     */
    public loginPageObject clickRegisterLink() {
        register.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the loginPageObject class instance.
     */
    public loginPageObject fill() {
        setUsernameOrEmailAddressTextField();
        setPasswordPasswordField();
        setRememberMeCheckboxField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the loginPageObject class instance.
     */
    public loginPageObject fillAndSubmit()
    {
        fill();
        return submit();
    }

    /**
     * Set default value to Password Password field.
     *
     * @return the loginPageObject class instance.
     */
    public loginPageObject setPasswordPasswordField() {
        return setPasswordPasswordField(data.get("PASSWORD"));
    }

    /**
     * Set value to Password Password field.
     *
     * @return the loginPageObject class instance.
     */
    public loginPageObject setPasswordPasswordField(String passwordValue) {
        password.sendKeys(passwordValue);
        return this;
    }

    /**
     * Set Remember Me Checkbox field.
     *
     * @return the loginPageObject class instance.
     */
    public loginPageObject setRememberMeCheckboxField() {
        if (!rememberMe.isSelected()) {
            rememberMe.click();
        }
        return this;
    }

    /**
     * Set default value to Username Or Email Address Text field.
     *
     * @return the loginPageObject class instance.
     */
    public loginPageObject setUsernameOrEmailAddressTextField() {
        return setUsernameOrEmailAddressTextField(data.get("USERNAME_OR_EMAIL_ADDRESS"));
    }

    /**
     * Set value to Username Or Email Address Text field.
     *
     * @return the loginPageObject class instance.
     */
    public loginPageObject setUsernameOrEmailAddressTextField(String usernameOrEmailAddressValue) {
        usernameOrEmailAddress.sendKeys(usernameOrEmailAddressValue);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the loginPageObject class instance.
     */
    public loginPageObject submit() {
        clickLogInButton();
        return this;
    }

    /**
     * Unset Remember Me Checkbox field.
     *
     * @return the loginPageObject class instance.
     */
    public loginPageObject unsetRememberMeCheckboxField() {
        if (rememberMe.isSelected()) {
            rememberMe.click();
        }
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the loginPageObject class instance.
     */
    public loginPageObject verifyPageLoaded() {
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
     * @return the loginPageObject class instance.
     */
    public loginPageObject verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
