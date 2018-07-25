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

public class searchPageObject {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a[href='http://store.demoqa.com/products-page/product-category/accessories/']")
    @CacheLookup
    private WebElement accessories;

    @FindBy(css = "a.account_icon")
    @CacheLookup
    private WebElement accountmyAccount;

    @FindBy(name = "Buy")
    @CacheLookup
    private WebElement addToCart1;

    @FindBy(name = "Buy")
    @CacheLookup
    private WebElement addToCart2;

    @FindBy(name = "Buy")
    @CacheLookup
    private WebElement addToCart3;

    @FindBy(name = "Buy")
    @CacheLookup
    private WebElement addToCart4;

    @FindBy(name = "Buy")
    @CacheLookup
    private WebElement addToCart5;

    @FindBy(name = "Buy")
    @CacheLookup
    private WebElement addToCart6;

    @FindBy(name = "Buy")
    @CacheLookup
    private WebElement addToCart7;

    @FindBy(css = "#menu-item-72 a")
    @CacheLookup
    private WebElement allProduct;

    @FindBy(css = "#grid_view_products_page_container div.product_grid_display.group div:nth-of-type(4) div:nth-of-type(2) h2.prodtitle a")
    @CacheLookup
    private WebElement appleIpad216gbWifi97in;

    @FindBy(css = "a[title='Apple iPad 6 32GB (White, 3D)']")
    @CacheLookup
    private WebElement appleIpad632gbWhite;

    @FindBy(css = "#footer section:nth-of-type(2) ul.group li:nth-of-type(4) a:nth-of-type(2)")
    @CacheLookup
    private WebElement appleIpad632gbWhite3d;

    @FindBy(css = "#grid_view_products_page_container div.product_grid_display.group div:nth-of-type(2) div:nth-of-type(2) h2.prodtitle a")
    @CacheLookup
    private WebElement appleIphone4s16gbSimfree;

    @FindBy(name = "s")
    @CacheLookup
    private WebElement appleIphone4s32gbSimfree1;

    @FindBy(css = "#grid_view_products_page_container div.product_grid_display.group div:nth-of-type(1) div:nth-of-type(2) h2.prodtitle a")
    @CacheLookup
    private WebElement appleIphone4s32gbSimfree2;

    @FindBy(css = "#grid_view_products_page_container div.product_grid_display.group div:nth-of-type(7) div:nth-of-type(2) h2.prodtitle a")
    @CacheLookup
    private WebElement appleTv;

    @FindBy(css = "a[title='Asus MX239H 23-inch Widescreen AH']")
    @CacheLookup
    private WebElement asusMx239h23inchWides;

    @FindBy(css = "#footer section:nth-of-type(2) ul.group li:nth-of-type(3) a:nth-of-type(2)")
    @CacheLookup
    private WebElement asusMx239h23inchWidescreenAh;

    @FindBy(css = "a[title='Checkout our Google Plus Profile']")
    @CacheLookup
    private WebElement googlePlus;

    @FindBy(css = "#menu-item-15 a")
    @CacheLookup
    private WebElement home;

    @FindBy(css = "a[href='http://store.demoqa.com/products-page/product-category/imacs/']")
    @CacheLookup
    private WebElement imacs;

    @FindBy(css = "a[href='http://store.demoqa.com/products-page/product-category/ipads/']")
    @CacheLookup
    private WebElement ipads;

    @FindBy(css = "#grid_view_products_page_container div.product_grid_display.group div:nth-of-type(3) div:nth-of-type(2) h2.prodtitle a")
    @CacheLookup
    private WebElement iphone5;

    @FindBy(css = "a[href='http://store.demoqa.com/products-page/product-category/iphones/']")
    @CacheLookup
    private WebElement iphones;

    @FindBy(css = "a[title='iPod Nano Blue']")
    @CacheLookup
    private WebElement ipodNanoBlue1;

    @FindBy(css = "#footer section:nth-of-type(2) ul.group li:nth-of-type(1) a:nth-of-type(2)")
    @CacheLookup
    private WebElement ipodNanoBlue2;

    @FindBy(css = "a[href='http://store.demoqa.com/products-page/product-category/ipods/']")
    @CacheLookup
    private WebElement ipods;

    @FindBy(css = "a.cart_icon")
    @CacheLookup
    private WebElement itemsCartcheckout3;

    @FindBy(css = "a[href='http://store.demoqa.com/wp-login.php']")
    @CacheLookup
    private WebElement logIn;

    @FindBy(css = "a[href='http://store.demoqa.com/products-page/product-category/macbooks/']")
    @CacheLookup
    private WebElement macbooks;

    @FindBy(css = "a[title='Magic Mouse']")
    @CacheLookup
    private WebElement magicMouse1;

    @FindBy(css = "#footer section:nth-of-type(2) ul.group li:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement magicMouse2;

    @FindBy(css = "#footer section:nth-of-type(2) ul.group li:nth-of-type(1) a:nth-of-type(3)")
    @CacheLookup
    private WebElement moreDetails1;

    @FindBy(css = "#footer section:nth-of-type(2) ul.group li:nth-of-type(2) a:nth-of-type(3)")
    @CacheLookup
    private WebElement moreDetails2;

    @FindBy(css = "#footer section:nth-of-type(2) ul.group li:nth-of-type(3) a:nth-of-type(3)")
    @CacheLookup
    private WebElement moreDetails3;

    @FindBy(css = "#footer section:nth-of-type(2) ul.group li:nth-of-type(4) a:nth-of-type(3)")
    @CacheLookup
    private WebElement moreDetails4;

    @FindBy(css = "#menu-item-16 a")
    @CacheLookup
    private WebElement noTitle10;

    @FindBy(css = "#menu-item-17 a")
    @CacheLookup
    private WebElement noTitle20;

    @FindBy(css = "#menu-item-18 a")
    @CacheLookup
    private WebElement noTitle30;

    private final String pageLoadedText = "Apple iPhone 4S 32GB SIM-Free – White";

    private final String pageUrl = "/?s=phone&post_type=wpsc-product";

    @FindBy(css = "a[title='Follow our Pins']")
    @CacheLookup
    private WebElement pinterest;

    @FindBy(css = "#menu-item-33 a")
    @CacheLookup
    private WebElement productCategory;

    @FindBy(css = "a[href='http://store.demoqa.com/wp-login.php?action=register']")
    @CacheLookup
    private WebElement register;

    @FindBy(css = "a[title='Get Fed on our Feeds']")
    @CacheLookup
    private WebElement rss;

    @FindBy(css = "a[href='http://store.demoqa.com/sample-page/']")
    @CacheLookup
    private WebElement samplePage;

    @FindBy(css = "#grid_view_products_page_container div.product_grid_display.group div:nth-of-type(6) div:nth-of-type(2) h2.prodtitle a")
    @CacheLookup
    private WebElement sennheiserRs120;

    @FindBy(css = "#grid_view_products_page_container div.product_grid_display.group div:nth-of-type(5) div:nth-of-type(2) h2.prodtitle a")
    @CacheLookup
    private WebElement skullcandyPlyr1Black;

    @FindBy(css = "#menu-item-53 a")
    @CacheLookup
    private WebElement spHome;

    @FindBy(css = "#menu-item-55 a")
    @CacheLookup
    private WebElement yourAccount;

    public searchPageObject() {
    }

    public searchPageObject(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public searchPageObject(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public searchPageObject(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Accessories Link.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickAccessoriesLink() {
        accessories.click();
        return this;
    }

    /**
     * Click on Accountmy Account Link.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickAccountmyAccountLink() {
        accountmyAccount.click();
        return this;
    }

    /**
     * Click on Add To Cart Button.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickAddToCart1Button() {
        addToCart1.click();
        return this;
    }

    /**
     * Click on Add To Cart Button.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickAddToCart2Button() {
        addToCart2.click();
        return this;
    }

    /**
     * Click on Add To Cart Button.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickAddToCart3Button() {
        addToCart3.click();
        return this;
    }

    /**
     * Click on Add To Cart Button.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickAddToCart4Button() {
        addToCart4.click();
        return this;
    }

    /**
     * Click on Add To Cart Button.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickAddToCart5Button() {
        addToCart5.click();
        return this;
    }

    /**
     * Click on Add To Cart Button.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickAddToCart6Button() {
        addToCart6.click();
        return this;
    }

    /**
     * Click on Add To Cart Button.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickAddToCart7Button() {
        addToCart7.click();
        return this;
    }

    /**
     * Click on All Product Link.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickAllProductLink() {
        allProduct.click();
        return this;
    }

    /**
     * Click on Apple Ipad 2 16gb Wifi 9.7in Black Link.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickAppleIpad216gbWifi97inLink() {
        appleIpad216gbWifi97in.click();
        return this;
    }

    /**
     * Click on Apple Ipad 6 32gb White 3d Link.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickAppleIpad632gbWhite3dLink() {
        appleIpad632gbWhite3d.click();
        return this;
    }

    /**
     * Click on Apple Ipad 6 32gb White... Link.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickAppleIpad632gbWhiteLink() {
        appleIpad632gbWhite.click();
        return this;
    }

    /**
     * Click on Apple Iphone 4s 16gb Simfree Black Link.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickAppleIphone4s16gbSimfreeLink() {
        appleIphone4s16gbSimfree.click();
        return this;
    }

    /**
     * Set default value to Apple Iphone 4s 32gb Simfree White Text field.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickAppleIphone4s32gbSimfree1Link() {
        return clickAppleIphone4s32gbSimfree1Link(data.get("APPLE_IPHONE_4S_32GB_SIMFREE"));
    }

    /**
     * Click on Apple Iphone 4s 32gb Simfree White Link.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickAppleIphone4s32gbSimfree1Link(String appleIphone4s32gbSimfreeValue) {
        appleIphone4s32gbSimfree1.sendKeys(appleIphone4s32gbSimfreeValue);
        return this;
    }

    /**
     * Click on Apple Iphone 4s 32gb Simfree White Link.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickAppleIphone4s32gbSimfree2Link() {
        appleIphone4s32gbSimfree2.click();
        return this;
    }

    /**
     * Click on Apple Tv Link.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickAppleTvLink() {
        appleTv.click();
        return this;
    }

    /**
     * Click on Asus Mx239h 23inch Wides... Link.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickAsusMx239h23inchWidesLink() {
        asusMx239h23inchWides.click();
        return this;
    }

    /**
     * Click on Asus Mx239h 23inch Widescreen Ah Link.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickAsusMx239h23inchWidescreenAhLink() {
        asusMx239h23inchWidescreenAh.click();
        return this;
    }

    /**
     * Click on Google Plus Link.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickGooglePlusLink() {
        googlePlus.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickHomeLink() {
        home.click();
        return this;
    }

    /**
     * Click on Imacs Link.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickImacsLink() {
        imacs.click();
        return this;
    }

    /**
     * Click on Ipads Link.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickIpadsLink() {
        ipads.click();
        return this;
    }

    /**
     * Click on Iphone 5 Link.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickIphone5Link() {
        iphone5.click();
        return this;
    }

    /**
     * Click on Iphones Link.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickIphonesLink() {
        iphones.click();
        return this;
    }

    /**
     * Click on Ipod Nano Blue Link.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickIpodNanoBlue1Link() {
        ipodNanoBlue1.click();
        return this;
    }

    /**
     * Click on Ipod Nano Blue Link.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickIpodNanoBlue2Link() {
        ipodNanoBlue2.click();
        return this;
    }

    /**
     * Click on Ipods Link.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickIpodsLink() {
        ipods.click();
        return this;
    }

    /**
     * Click on 3 Items Cartcheckout Link.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickItemsCartcheckoutLink3() {
        itemsCartcheckout3.click();
        return this;
    }

    /**
     * Click on Log In Link.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickLogInLink() {
        logIn.click();
        return this;
    }

    /**
     * Click on Macbooks Link.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickMacbooksLink() {
        macbooks.click();
        return this;
    }

    /**
     * Click on Magic Mouse Link.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickMagicMouse1Link() {
        magicMouse1.click();
        return this;
    }

    /**
     * Click on Magic Mouse Link.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickMagicMouse2Link() {
        magicMouse2.click();
        return this;
    }

    /**
     * Click on More Details Link.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickMoreDetails1Link() {
        moreDetails1.click();
        return this;
    }

    /**
     * Click on More Details Link.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickMoreDetails2Link() {
        moreDetails2.click();
        return this;
    }

    /**
     * Click on More Details Link.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickMoreDetails3Link() {
        moreDetails3.click();
        return this;
    }

    /**
     * Click on More Details Link.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickMoreDetails4Link() {
        moreDetails4.click();
        return this;
    }

    /**
     * Click on 0 No Title Link.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickNoTitle1Link0() {
        noTitle10.click();
        return this;
    }

    /**
     * Click on 0 No Title Link.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickNoTitle2Link0() {
        noTitle20.click();
        return this;
    }

    /**
     * Click on 0 No Title Link.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickNoTitle3Link0() {
        noTitle30.click();
        return this;
    }

    /**
     * Click on Pinterest Link.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickPinterestLink() {
        pinterest.click();
        return this;
    }

    /**
     * Click on Product Category Link.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickProductCategoryLink() {
        productCategory.click();
        return this;
    }

    /**
     * Click on Register Link.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickRegisterLink() {
        register.click();
        return this;
    }

    /**
     * Click on Rss Link.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickRssLink() {
        rss.click();
        return this;
    }

    /**
     * Click on Sample Page Link.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickSamplePageLink() {
        samplePage.click();
        return this;
    }

    /**
     * Click on Sennheiser Rs 120 Link.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickSennheiserRs120Link() {
        sennheiserRs120.click();
        return this;
    }

    /**
     * Click on Skullcandy Plyr 1 Black Link.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickSkullcandyPlyr1BlackLink() {
        skullcandyPlyr1Black.click();
        return this;
    }

    /**
     * Click on Sp Home Link.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickSpHomeLink() {
        spHome.click();
        return this;
    }

    /**
     * Click on Your Account Link.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject clickYourAccountLink() {
        yourAccount.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject fill() {
        clickAppleIphone4s32gbSimfree1Link();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Submit the form to target page.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject submit()
    {
        //clickAddToCartButton();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the searchPageObject class instance.
     */
    public searchPageObject verifyPageLoaded() {
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
     * @return the searchPageObject class instance.
     */
    public searchPageObject verifyPageUrl()
    {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>()
        {
            public Boolean apply(WebDriver d)
            {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
