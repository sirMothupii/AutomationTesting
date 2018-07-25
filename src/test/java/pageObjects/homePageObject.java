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

public class homePageObject {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "#slide_menu a:nth-of-type(1)")
    @CacheLookup
    private WebElement _1;

    @FindBy(css = "#slide_menu a:nth-of-type(2)")
    @CacheLookup
    private WebElement _2;

    @FindBy(css = "a.selected")
    @CacheLookup
    private WebElement _3;

    @FindBy(css = "a[href='http://store.demoqa.com/products-page/product-category/accessories/']")
    @CacheLookup
    private WebElement accessories;

    @FindBy(css = "a.account_icon")
    @CacheLookup
    private WebElement accountmyAccount;

    @FindBy(css = "#menu-item-72 a")
    @CacheLookup
    private WebElement allProduct;

    @FindBy(css = "a[title='Apple iPod touch 32GB 5th Generation - Black']")
    @CacheLookup
    private WebElement appleIpodTouch32gb5th;

    @FindBy(css = "#footer section:nth-of-type(2) ul.group li:nth-of-type(3) a:nth-of-type(2)")
    @CacheLookup
    private WebElement appleIpodTouch32gb5thGeneration;

    @FindBy(css = "a[title='Asus MX239H 23-inch Widescreen AH']")
    @CacheLookup
    private WebElement asusMx239h23inchWides;

    @FindBy(css = "#footer section:nth-of-type(2) ul.group li:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement asusMx239h23inchWidescreenAh;

    @FindBy(css = "#slides div:nth-of-type(1) div:nth-of-type(3) div.price a.buynow")
    @CacheLookup
    private WebElement buyNow1;

    @FindBy(css = "#slides div:nth-of-type(2) div:nth-of-type(3) div.price a.buynow")
    @CacheLookup
    private WebElement buyNow2;

    @FindBy(css = "#slides div:nth-of-type(3) div:nth-of-type(3) div.price a.buynow")
    @CacheLookup
    private WebElement buyNow3;

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

    @FindBy(css = "#slides div:nth-of-type(3) div:nth-of-type(2) a")
    @CacheLookup
    private WebElement iphone5;

    @FindBy(css = "a[href='http://store.demoqa.com/products-page/product-category/iphones/']")
    @CacheLookup
    private WebElement iphones;

    @FindBy(css = "#slides div:nth-of-type(1) div:nth-of-type(2) a")
    @CacheLookup
    private WebElement ipodNanoBlue1;

    @FindBy(css = "a[title='iPod Nano Blue']")
    @CacheLookup
    private WebElement ipodNanoBlue2;

    @FindBy(css = "#footer section:nth-of-type(2) ul.group li:nth-of-type(4) a:nth-of-type(2)")
    @CacheLookup
    private WebElement ipodNanoBlue3;

    @FindBy(css = "a[href='http://store.demoqa.com/products-page/product-category/ipods/']")
    @CacheLookup
    private WebElement ipods;

    @FindBy(css = "a.cart_icon")
    @CacheLookup
    private WebElement itemCartcheckout0;

    @FindBy(css = "a[href='http://store.demoqa.com/products-page/product-category/macbooks/']")
    @CacheLookup
    private WebElement macbooks;

    @FindBy(css = "#slides div:nth-of-type(2) div:nth-of-type(2) a")
    @CacheLookup
    private WebElement magicMouse1;

    @FindBy(css = "a[title='Magic Mouse']")
    @CacheLookup
    private WebElement magicMouse2;

    @FindBy(css = "#footer section:nth-of-type(2) ul.group li:nth-of-type(1) a:nth-of-type(2)")
    @CacheLookup
    private WebElement magicMouse3;

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

    @FindBy(css = "#slides div:nth-of-type(1) div:nth-of-type(1) p:nth-of-type(2) a")
    @CacheLookup
    private WebElement moreInfo1;

    @FindBy(css = "#slides div:nth-of-type(2) div:nth-of-type(1) p:nth-of-type(2) a")
    @CacheLookup
    private WebElement moreInfo2;

    @FindBy(css = "#slides div:nth-of-type(3) div:nth-of-type(1) p:nth-of-type(2) a")
    @CacheLookup
    private WebElement moreInfo3;

    @FindBy(css = "#menu-item-16 a")
    @CacheLookup
    private WebElement noTitle10;

    @FindBy(css = "#menu-item-17 a")
    @CacheLookup
    private WebElement noTitle20;

    @FindBy(css = "#menu-item-18 a")
    @CacheLookup
    private WebElement noTitle30;

    private final String pageLoadedText = "We put an amazing amount of care and detail into the design and functionality to ensure that we're creating the best user experience for your customers";

    private final String pageUrl = "/";

    @FindBy(css = "a[title='Follow our Pins']")
    @CacheLookup
    private WebElement pinterest;

    @FindBy(css = "#menu-item-33 a")
    @CacheLookup
    private WebElement productCategory;

    @FindBy(css = "a[title='Get Fed on our Feeds']")
    @CacheLookup
    private WebElement rss;

    @FindBy(css = "a[href='http://store.demoqa.com/sample-page/']")
    @CacheLookup
    private WebElement samplePage;

    @FindBy(css = "#menu-item-53 a")
    @CacheLookup
    private WebElement spHome;

    @FindBy(name = "s")
    @CacheLookup
    private WebElement splashingPixelsWordpressEcommerceThemesOffer;

    @FindBy(css = "#menu-item-55 a")
    @CacheLookup
    private WebElement yourAccount;

    public homePageObject() {
    }

    public homePageObject(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public homePageObject(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public homePageObject(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Accessories Link.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject clickAccessoriesLink() {
        accessories.click();
        return this;
    }

    /**
     * Click on Accountmy Account Link.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject clickAccountmyAccountLink() {
        accountmyAccount.click();
        return this;
    }

    /**
     * Click on All Product Link.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject clickAllProductLink() {
        allProduct.click();
        return this;
    }

    /**
     * Click on Apple Ipod Touch 32gb 5th Generation Black Link.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject clickAppleIpodTouch32gb5thGenerationLink() {
        appleIpodTouch32gb5thGeneration.click();
        return this;
    }

    /**
     * Click on Apple Ipod Touch 32gb 5th... Link.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject clickAppleIpodTouch32gb5thLink() {
        appleIpodTouch32gb5th.click();
        return this;
    }

    /**
     * Click on Asus Mx239h 23inch Wides... Link.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject clickAsusMx239h23inchWidesLink() {
        asusMx239h23inchWides.click();
        return this;
    }

    /**
     * Click on Asus Mx239h 23inch Widescreen Ah Link.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject clickAsusMx239h23inchWidescreenAhLink() {
        asusMx239h23inchWidescreenAh.click();
        return this;
    }

    /**
     * Click on Buy Now Link.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject clickBuyNow1Link() {
        buyNow1.click();
        return this;
    }

    /**
     * Click on Buy Now Link.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject clickBuyNow2Link() {
        buyNow2.click();
        return this;
    }

    /**
     * Click on Buy Now Link.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject clickBuyNow3Link() {
        buyNow3.click();
        return this;
    }

    /**
     * Click on Google Plus Link.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject clickGooglePlusLink() {
        googlePlus.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject clickHomeLink() {
        home.click();
        return this;
    }

    /**
     * Click on Imacs Link.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject clickImacsLink() {
        imacs.click();
        return this;
    }

    /**
     * Click on Ipads Link.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject clickIpadsLink() {
        ipads.click();
        return this;
    }

    /**
     * Click on Iphone 5 Link.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject clickIphone5Link() {
        iphone5.click();
        return this;
    }

    /**
     * Click on Iphones Link.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject clickIphonesLink() {
        iphones.click();
        return this;
    }

    /**
     * Click on Ipod Nano Blue Link.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject clickIpodNanoBlue1Link() {
        ipodNanoBlue1.click();
        return this;
    }

    /**
     * Click on Ipod Nano Blue Link.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject clickIpodNanoBlue2Link() {
        ipodNanoBlue2.click();
        return this;
    }

    /**
     * Click on Ipod Nano Blue Link.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject clickIpodNanoBlue3Link() {
        ipodNanoBlue3.click();
        return this;
    }

    /**
     * Click on Ipods Link.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject clickIpodsLink() {
        ipods.click();
        return this;
    }

    /**
     * Click on 0 Item Cartcheckout Link.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject clickItemCartcheckoutLink0() {
        itemCartcheckout0.click();
        return this;
    }

    /**
     * Click on 1 Link.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject clickLink1() {
        _1.click();
        return this;
    }

    /**
     * Click on 2 Link.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject clickLink2() {
        _2.click();
        return this;
    }

    /**
     * Click on 3 Link.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject clickLink3() {
        _3.click();
        return this;
    }

    /**
     * Click on Macbooks Link.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject clickMacbooksLink() {
        macbooks.click();
        return this;
    }

    /**
     * Click on Magic Mouse Link.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject clickMagicMouse1Link() {
        magicMouse1.click();
        return this;
    }

    /**
     * Click on Magic Mouse Link.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject clickMagicMouse2Link() {
        magicMouse2.click();
        return this;
    }

    /**
     * Click on Magic Mouse Link.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject clickMagicMouse3Link() {
        magicMouse3.click();
        return this;
    }

    /**
     * Click on More Details Link.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject clickMoreDetails1Link() {
        moreDetails1.click();
        return this;
    }

    /**
     * Click on More Details Link.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject clickMoreDetails2Link() {
        moreDetails2.click();
        return this;
    }

    /**
     * Click on More Details Link.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject clickMoreDetails3Link() {
        moreDetails3.click();
        return this;
    }

    /**
     * Click on More Details Link.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject clickMoreDetails4Link() {
        moreDetails4.click();
        return this;
    }

    /**
     * Click on More Info Link.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject clickMoreInfo1Link() {
        moreInfo1.click();
        return this;
    }

    /**
     * Click on More Info Link.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject clickMoreInfo2Link() {
        moreInfo2.click();
        return this;
    }

    /**
     * Click on More Info Link.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject clickMoreInfo3Link() {
        moreInfo3.click();
        return this;
    }

    /**
     * Click on 0 No Title Link.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject clickNoTitle1Link0() {
        noTitle10.click();
        return this;
    }

    /**
     * Click on 0 No Title Link.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject clickNoTitle2Link0() {
        noTitle20.click();
        return this;
    }

    /**
     * Click on 0 No Title Link.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject clickNoTitle3Link0() {
        noTitle30.click();
        return this;
    }

    /**
     * Click on Pinterest Link.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject clickPinterestLink() {
        pinterest.click();
        return this;
    }

    /**
     * Click on Product Category Link.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject clickProductCategoryLink() {
        productCategory.click();
        return this;
    }

    /**
     * Click on Rss Link.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject clickRssLink() {
        rss.click();
        return this;
    }

    /**
     * Click on Sample Page Link.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject clickSamplePageLink() {
        samplePage.click();
        return this;
    }

    /**
     * Click on Sp Home Link.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject clickSpHomeLink() {
        spHome.click();
        return this;
    }

    /**
     * Click on Your Account Link.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject clickYourAccountLink() {
        yourAccount.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject fill() {
        setSplashingPixelsWordpressEcommerceThemesOfferTextField();
        return this;
    }

    /**
     * Set default value to Splashing Pixels Wordpress Ecommerce Themes Offer The Best Ecommerce Solution For Online Stores Text field.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject setSplashingPixelsWordpressEcommerceThemesOfferTextField() {
        return setSplashingPixelsWordpressEcommerceThemesOfferTextField(data.get("SPLASHING_PIXELS_WORDPRESS_ECOMMERCE_THEMES_OFFER"));
    }

    /**
     * Set value to Splashing Pixels Wordpress Ecommerce Themes Offer The Best Ecommerce Solution For Online Stores Text field.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject setSplashingPixelsWordpressEcommerceThemesOfferTextField(String splashingPixelsWordpressEcommerceThemesOfferValue) {
        splashingPixelsWordpressEcommerceThemesOffer.sendKeys(splashingPixelsWordpressEcommerceThemesOfferValue);
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the homePageObject class instance.
     */
    public homePageObject verifyPageLoaded() {
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
     * @return the homePageObject class instance.
     */
    public homePageObject verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
