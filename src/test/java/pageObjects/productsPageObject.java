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

public class productsPageObject
{
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;
    //private AddToCart addToCart;

    @FindBy(css = "#default_products_page_container div:nth-of-type(3) div:nth-of-type(2) div:nth-of-type(2) span.star-rating-control div:nth-of-type(2) a")
    @CacheLookup
    private WebElement _11;

    @FindBy(css = "#default_products_page_container div:nth-of-type(3) div:nth-of-type(2) div:nth-of-type(2) span.star-rating-control div:nth-of-type(3) a")
    @CacheLookup
    private WebElement _12;

    @FindBy(css = "#default_products_page_container div:nth-of-type(3) div:nth-of-type(2) div:nth-of-type(2) span.star-rating-control div:nth-of-type(4) a")
    @CacheLookup
    private WebElement _13;

    @FindBy(css = "#default_products_page_container div:nth-of-type(3) div:nth-of-type(2) div:nth-of-type(2) span.star-rating-control div:nth-of-type(5) a")
    @CacheLookup
    private WebElement _14;

    @FindBy(css = "#default_products_page_container div:nth-of-type(3) div:nth-of-type(2) div:nth-of-type(2) span.star-rating-control div:nth-of-type(6) a")
    @CacheLookup
    private WebElement _15;

    @FindBy(css = "#default_products_page_container div:nth-of-type(4) div:nth-of-type(2) div:nth-of-type(2) span.star-rating-control div:nth-of-type(2) a")
    @CacheLookup
    private WebElement _21;

    @FindBy(css = "#default_products_page_container div:nth-of-type(4) div:nth-of-type(2) div:nth-of-type(2) span.star-rating-control div:nth-of-type(3) a")
    @CacheLookup
    private WebElement _22;

    @FindBy(css = "#default_products_page_container div:nth-of-type(4) div:nth-of-type(2) div:nth-of-type(2) span.star-rating-control div:nth-of-type(4) a")
    @CacheLookup
    private WebElement _23;

    @FindBy(css = "#default_products_page_container div:nth-of-type(4) div:nth-of-type(2) div:nth-of-type(2) span.star-rating-control div:nth-of-type(5) a")
    @CacheLookup
    private WebElement _24;

    @FindBy(css = "#default_products_page_container div:nth-of-type(4) div:nth-of-type(2) div:nth-of-type(2) span.star-rating-control div:nth-of-type(6) a")
    @CacheLookup
    private WebElement _25;

    @FindBy(css = "#default_products_page_container div:nth-of-type(5) div:nth-of-type(2) div:nth-of-type(2) span.star-rating-control div:nth-of-type(2) a")
    @CacheLookup
    private WebElement _31;

    @FindBy(css = "#default_products_page_container div:nth-of-type(5) div:nth-of-type(2) div:nth-of-type(2) span.star-rating-control div:nth-of-type(3) a")
    @CacheLookup
    private WebElement _32;

    @FindBy(css = "#default_products_page_container div:nth-of-type(5) div:nth-of-type(2) div:nth-of-type(2) span.star-rating-control div:nth-of-type(4) a")
    @CacheLookup
    private WebElement _33;

    @FindBy(css = "#default_products_page_container div:nth-of-type(5) div:nth-of-type(2) div:nth-of-type(2) span.star-rating-control div:nth-of-type(5) a")
    @CacheLookup
    private WebElement _34;

    @FindBy(css = "#default_products_page_container div:nth-of-type(5) div:nth-of-type(2) div:nth-of-type(2) span.star-rating-control div:nth-of-type(6) a")
    @CacheLookup
    private WebElement _35;

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

    @FindBy(css = "#menu-item-72 a")
    @CacheLookup
    private WebElement allProduct;

    @FindBy(css = "a[title='Apple iPhone 4S 16GB SIM-Free - Black']")
    @CacheLookup
    private WebElement appleIphone4s16gbSim;

    @FindBy(css = "#footer section:nth-of-type(2) ul.group li:nth-of-type(3) a:nth-of-type(2)")
    @CacheLookup
    private WebElement appleIphone4s16gbSimfree;

    @FindBy(css = "a[title='Apple iPhone 4S 32GB SIM-Free - White']")
    @CacheLookup
    private WebElement appleIphone4s32gbSim;

    @FindBy(css = "#footer section:nth-of-type(2) ul.group li:nth-of-type(4) a:nth-of-type(2)")
    @CacheLookup
    private WebElement appleIphone4s32gbSimfree;

    @FindBy(css = "a[title='Apple TV']")
    @CacheLookup
    private WebElement appleTv1;

    @FindBy(css = "#footer section:nth-of-type(2) ul.group li:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement appleTv2;

    @FindBy(css = "a.default.active")
    @CacheLookup
    private WebElement defaults;

    @FindBy(css = "a[title='Checkout our Google Plus Profile']")
    @CacheLookup
    private WebElement googlePlus;

    @FindBy(css = "a.grid")
    @CacheLookup
    private WebElement grid;

    @FindBy(css = "#menu-item-15 a")
    @CacheLookup
    private WebElement home;

    @FindBy(css = "a[href='http://store.demoqa.com/products-page/product-category/imacs/']")
    @CacheLookup
    private WebElement imacs;

    @FindBy(css = "a[href='http://store.demoqa.com/products-page/product-category/ipads/']")
    @CacheLookup
    private WebElement ipads;

    @FindBy(css = "a[href='http://store.demoqa.com/products-page/product-category/n/']")
    @CacheLookup
    private WebElement iphone5;

    @FindBy(css = "a[href='http://store.demoqa.com/products-page/product-category/iphones/']")
    @CacheLookup
    private WebElement iphones;

    @FindBy(css = "a[href='http://store.demoqa.com/products-page/product-category/ipod-nano-blue/']")
    @CacheLookup
    private WebElement ipodNanoBlue;

    @FindBy(css = "a[href='http://store.demoqa.com/products-page/product-category/ipods/']")
    @CacheLookup
    private WebElement ipods;

    @FindBy(css = "a.cart_icon")
    @CacheLookup
    private WebElement itemCartcheckout0;

    @FindBy(css = "a[href='http://store.demoqa.com/wp-login.php']")
    @CacheLookup
    private WebElement logIn;

    @FindBy(css = "a[href='http://store.demoqa.com/products-page/product-category/macbooks/']")
    @CacheLookup
    private WebElement macbooks;

    @FindBy(css = "a[href='http://store.demoqa.com/products-page/product-category/magic-mouse/']")
    @CacheLookup
    private WebElement magicMouse;

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

    private final String pageLoadedText = "We put an amazing amount of care and detail into the design and functionality to ensure that we’re creating the best user experience for your customers";

    private final String pageUrl = "/products-page/product-category/";

    @FindBy(css = "a[title='Follow our Pins']")
    @CacheLookup
    private WebElement pinterest;

    @FindBy(name = "star32")
    @CacheLookup
    private List<WebElement> pleaseSelectProductOptionsBeforeAdding1;

    @FindBy(name = "star40")
    @CacheLookup
    private List<WebElement> pleaseSelectProductOptionsBeforeAdding10;

    @FindBy(name = "star64")
    @CacheLookup
    private List<WebElement> pleaseSelectProductOptionsBeforeAdding11;

    @FindBy(name = "star64")
    @CacheLookup
    private List<WebElement> pleaseSelectProductOptionsBeforeAdding12;

    @FindBy(name = "star64")
    @CacheLookup
    private List<WebElement> pleaseSelectProductOptionsBeforeAdding13;

    @FindBy(name = "star64")
    @CacheLookup
    private List<WebElement> pleaseSelectProductOptionsBeforeAdding14;

    @FindBy(name = "star64")
    @CacheLookup
    private List<WebElement> pleaseSelectProductOptionsBeforeAdding15;

    @FindBy(name = "star32")
    @CacheLookup
    private List<WebElement> pleaseSelectProductOptionsBeforeAdding2;

    @FindBy(name = "star32")
    @CacheLookup
    private List<WebElement> pleaseSelectProductOptionsBeforeAdding3;

    @FindBy(name = "star32")
    @CacheLookup
    private List<WebElement> pleaseSelectProductOptionsBeforeAdding4;

    @FindBy(name = "star32")
    @CacheLookup
    private List<WebElement> pleaseSelectProductOptionsBeforeAdding5;

    @FindBy(name = "star40")
    @CacheLookup
    private List<WebElement> pleaseSelectProductOptionsBeforeAdding6;

    @FindBy(name = "star40")
    @CacheLookup
    private List<WebElement> pleaseSelectProductOptionsBeforeAdding7;

    @FindBy(name = "star40")
    @CacheLookup
    private List<WebElement> pleaseSelectProductOptionsBeforeAdding8;

    @FindBy(name = "star40")
    @CacheLookup
    private List<WebElement> pleaseSelectProductOptionsBeforeAdding9;

    private final String pleaseSelectProductOptionsBeforeAddingValue = "5";

    private final String pleaseSelectProductOptionsBeforeAddingValue4 = "4";

    private final String pleaseSelectProductOptionsBeforeAddingValue2 = "2";

    private final String pleaseSelectProductOptionsBeforeAddingValue1 = "1";

    private final String pleaseSelectProductOptionsBeforeAddingValue5 = "5";

    private final String pleaseSelectProductOptionsBeforeAddingValues = "1";

    private final String pleaseSelectProductOptionsBeforeAddingVal = "2";

    private final String pleaseSelectProductOptionsBeforeAddingVal5 = "5";

    private final String pleaseSelectProductOptionsBeforeAddingVal3 = "3";

    private final String pleaseSelectProductOptionsBeforeAddingVal4 = "4";

    private final String pleaseSelectProductOptionsBeforeAddingValue3 = "3";

    private final String pleaseSelectProductOptionsBeforeAddingValues3 = "3";

    private final String pleaseSelectProductOptionsBeforeAddingValues4 = "4";

    private final String pleaseSelectProductOptionsBeforeAddingValues2 = "2";

    private final String pleaseSelectProductOptionsBeforeAddingValues1 = "1";

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

    @FindBy(css = "a[title='Skullcandy PLYR 1 - Black']")
    @CacheLookup
    private WebElement skullcandyPlyr1Black1;

    @FindBy(css = "#footer section:nth-of-type(2) ul.group li:nth-of-type(1) a:nth-of-type(2)")
    @CacheLookup
    private WebElement skullcandyPlyr1Black2;

    @FindBy(css = "#menu-item-53 a")
    @CacheLookup
    private WebElement spHome;

    @FindBy(name = "s")
    @CacheLookup
    private WebElement splashingPixelsWordpressEcommerceThemesOffer;

    @FindBy(css = "#menu-item-55 a")
    @CacheLookup
    private WebElement yourAccount;

    public productsPageObject()
    {
    }

    public productsPageObject(WebDriver driver)
    {
        this();
        this.driver = driver;
    }

    public productsPageObject(WebDriver driver, Map<String, String> data)
    {
        this(driver);
        this.data = data;
    }

    public productsPageObject(WebDriver driver, Map<String, String> data, int timeout)
    {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on 1 Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject click1Link1()
    {
        _11.click();
        return this;
    }

    /**
     * Click on 2 Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject click1Link2()
    {
        _12.click();
        return this;
    }

    /**
     * Click on 3 Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject click1Link3()
    {
        _13.click();
        return this;
    }

    /**
     * Click on 4 Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject click1Link4()
    {
        _14.click();
        return this;
    }

    /**
     * Click on 5 Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject click1Link5()
    {
        _15.click();
        return this;
    }

    /**
     * Click on 1 Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject click2Link1()
    {
        _21.click();
        return this;
    }

    /**
     * Click on 2 Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject click2Link2()
    {
        _22.click();
        return this;
    }

    /**
     * Click on 3 Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject click2Link3()
    {
        _23.click();
        return this;
    }

    /**
     * Click on 4 Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject click2Link4()
    {
        _24.click();
        return this;
    }

    /**
     * Click on 5 Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject click2Link5()
    {
        _25.click();
        return this;
    }

    /**
     * Click on 1 Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject click3Link1()
    {
        _31.click();
        return this;
    }

    /**
     * Click on 2 Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject click3Link2()
    {
        _32.click();
        return this;
    }

    /**
     * Click on 3 Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject click3Link3()
    {
        _33.click();
        return this;
    }

    /**
     * Click on 4 Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject click3Link4()
    {
        _34.click();
        return this;
    }

    /**
     * Click on 5 Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject click3Link5()
    {
        _35.click();
        return this;
    }

    /**
     * Click on Accessories Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject clickAccessoriesLink()
    {
        accessories.click();
        return this;
    }

    /**
     * Click on Accountmy Account Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject clickAccountmyAccountLink()
    {
        accountmyAccount.click();
        return this;
    }

    /**
     * Click on Add To Cart Button.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject clickAddToCart1Button()
    {
        addToCart1.click();
        return this;
    }

    /**
     * Click on Add To Cart Button.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject clickAddToCart2Button()
    {
        addToCart2.click();
        return this;
    }

    /**
     * Click on Add To Cart Button.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject clickAddToCart3Button()
    {
        addToCart3.click();
        return this;
    }

    /**
     * Click on All Product Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject clickAllProductLink()
    {
        allProduct.click();
        return this;
    }

    /**
     * Click on Apple Iphone 4s 16gb Sim... Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject clickAppleIphone4s16gbSimLink()
    {
        appleIphone4s16gbSim.click();
        return this;
    }

    /**
     * Click on Apple Iphone 4s 16gb Simfree Black Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject clickAppleIphone4s16gbSimfreeLink()
    {
        appleIphone4s16gbSimfree.click();
        return this;
    }

    /**
     * Click on Apple Iphone 4s 32gb Sim... Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject clickAppleIphone4s32gbSimLink()
    {
        appleIphone4s32gbSim.click();
        return this;
    }

    /**
     * Click on Apple Iphone 4s 32gb Simfree White Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject clickAppleIphone4s32gbSimfreeLink()
    {
        appleIphone4s32gbSimfree.click();
        return this;
    }

    /**
     * Click on Apple Tv Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject clickAppleTv1Link()
    {
        appleTv1.click();
        return this;
    }

    /**
     * Click on Apple Tv Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject clickAppleTv2Link()
    {
        appleTv2.click();
        return this;
    }

    /**
     * Click on Default Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject clickDefaultLink()
    {
        defaults.click();
        return this;
    }

    /**
     * Click on Google Plus Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject clickGooglePlusLink()
    {
        googlePlus.click();
        return this;
    }

    /**
     * Click on Grid Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject clickGridLink()
    {
        grid.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject clickHomeLink()
    {
        home.click();
        return this;
    }

    /**
     * Click on Imacs Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject clickImacsLink()
    {
        imacs.click();
        return this;
    }

    /**
     * Click on Ipads Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject clickIpadsLink()
    {
        ipads.click();
        return this;
    }

    /**
     * Click on Iphone 5 Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject clickIphone5Link()
    {
        iphone5.click();
        return this;
    }

    /**
     * Click on Iphones Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject clickIphonesLink()
    {
        iphones.click();
        return this;
    }

    /**
     * Click on Ipod Nano Blue Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject clickIpodNanoBlueLink()
    {
        ipodNanoBlue.click();
        return this;
    }

    /**
     * Click on Ipods Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject clickIpodsLink()
    {
        ipods.click();
        return this;
    }

    /**
     * Click on 0 Item Cartcheckout Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject clickItemCartcheckoutLink0()
    {
        itemCartcheckout0.click();
        return this;
    }

    /**
     * Click on Log In Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject clickLogInLink()
    {
        logIn.click();
        return this;
    }

    /**
     * Click on Macbooks Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject clickMacbooksLink()
    {
        macbooks.click();
        return this;
    }

    /**
     * Click on Magic Mouse Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject clickMagicMouseLink()
    {
        magicMouse.click();
        return this;
    }

    /**
     * Click on More Details Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject clickMoreDetails1Link()
    {
        moreDetails1.click();
        return this;
    }

    /**
     * Click on More Details Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject clickMoreDetails2Link()
    {
        moreDetails2.click();
        return this;
    }

    /**
     * Click on More Details Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject clickMoreDetails3Link()
    {
        moreDetails3.click();
        return this;
    }

    /**
     * Click on More Details Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject clickMoreDetails4Link()
    {
        moreDetails4.click();
        return this;
    }

    /**
     * Click on 0 No Title Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject clickNoTitle1Link0()
    {
        noTitle10.click();
        return this;
    }

    /**
     * Click on 0 No Title Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject clickNoTitle2Link0()
    {
        noTitle20.click();
        return this;
    }

    /**
     * Click on 0 No Title Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject clickNoTitle3Link0()
    {
        noTitle30.click();
        return this;
    }

    /**
     * Click on Pinterest Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject clickPinterestLink()
    {
        pinterest.click();
        return this;
    }

    /**
     * Click on Product Category Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject clickProductCategoryLink()
    {
        productCategory.click();
        return this;
    }

    /**
     * Click on Register Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject clickRegisterLink()
    {
        register.click();
        return this;
    }

    /**
     * Click on Rss Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject clickRssLink()
    {
        rss.click();
        return this;
    }

    /**
     * Click on Sample Page Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject clickSamplePageLink()
    {
        samplePage.click();
        return this;
    }

    /**
     * Click on Skullcandy Plyr 1 Black Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject clickSkullcandyPlyr1Black1Link()
    {
        skullcandyPlyr1Black1.click();
        return this;
    }

    /**
     * Click on Skullcandy Plyr 1 Black Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject clickSkullcandyPlyr1Black2Link()
    {
        skullcandyPlyr1Black2.click();
        return this;
    }

    /**
     * Click on Sp Home Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject clickSpHomeLink()
    {
        spHome.click();
        return this;
    }

    /**
     * Click on Your Account Link.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject clickYourAccountLink()
    {
        yourAccount.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject fill()
    {
        setSplashingPixelsWordpressEcommerceThemesOfferTextField();
        setPleaseSelectProductOptionsBeforeAdding1RadioButtonField();
        setPleaseSelectProductOptionsBeforeAdding2RadioButtonField();
        setPleaseSelectProductOptionsBeforeAdding3RadioButtonField();
        setPleaseSelectProductOptionsBeforeAdding4RadioButtonField();
        setPleaseSelectProductOptionsBeforeAdding5RadioButtonField();
        setPleaseSelectProductOptionsBeforeAdding6RadioButtonField();
        setPleaseSelectProductOptionsBeforeAdding7RadioButtonField();
        setPleaseSelectProductOptionsBeforeAdding8RadioButtonField();
        setPleaseSelectProductOptionsBeforeAdding9RadioButtonField();
        setPleaseSelectProductOptionsBeforeAdding10RadioButtonField();
        setPleaseSelectProductOptionsBeforeAdding11RadioButtonField();
        setPleaseSelectProductOptionsBeforeAdding12RadioButtonField();
        setPleaseSelectProductOptionsBeforeAdding13RadioButtonField();
        setPleaseSelectProductOptionsBeforeAdding14RadioButtonField();
        setPleaseSelectProductOptionsBeforeAdding15RadioButtonField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to Please Select Product Options Before Adding To Cart Radio Button field.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject setPleaseSelectProductOptionsBeforeAdding10RadioButtonField()
    {
        for (WebElement el : pleaseSelectProductOptionsBeforeAdding10)
        {
            if (el.getAttribute("value").equals(pleaseSelectProductOptionsBeforeAddingValue))
            {
                if (!el.isSelected())
                {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Please Select Product Options Before Adding To Cart Radio Button field.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject setPleaseSelectProductOptionsBeforeAdding11RadioButtonField() {
        for (WebElement el : pleaseSelectProductOptionsBeforeAdding11) {
            if (el.getAttribute("value").equals(pleaseSelectProductOptionsBeforeAddingValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Please Select Product Options Before Adding To Cart Radio Button field.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject setPleaseSelectProductOptionsBeforeAdding12RadioButtonField() {
        for (WebElement el : pleaseSelectProductOptionsBeforeAdding12) {
            if (el.getAttribute("value").equals(pleaseSelectProductOptionsBeforeAddingValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Please Select Product Options Before Adding To Cart Radio Button field.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject setPleaseSelectProductOptionsBeforeAdding13RadioButtonField() {
        for (WebElement el : pleaseSelectProductOptionsBeforeAdding13) {
            if (el.getAttribute("value").equals(pleaseSelectProductOptionsBeforeAddingValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Please Select Product Options Before Adding To Cart Radio Button field.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject setPleaseSelectProductOptionsBeforeAdding14RadioButtonField() {
        for (WebElement el : pleaseSelectProductOptionsBeforeAdding14) {
            if (el.getAttribute("value").equals(pleaseSelectProductOptionsBeforeAddingValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Please Select Product Options Before Adding To Cart Radio Button field.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject setPleaseSelectProductOptionsBeforeAdding15RadioButtonField() {
        for (WebElement el : pleaseSelectProductOptionsBeforeAdding15) {
            if (el.getAttribute("value").equals(pleaseSelectProductOptionsBeforeAddingValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Please Select Product Options Before Adding To Cart Radio Button field.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject setPleaseSelectProductOptionsBeforeAdding1RadioButtonField() {
        for (WebElement el : pleaseSelectProductOptionsBeforeAdding1) {
            if (el.getAttribute("value").equals(pleaseSelectProductOptionsBeforeAddingValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Please Select Product Options Before Adding To Cart Radio Button field.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject setPleaseSelectProductOptionsBeforeAdding2RadioButtonField() {
        for (WebElement el : pleaseSelectProductOptionsBeforeAdding2) {
            if (el.getAttribute("value").equals(pleaseSelectProductOptionsBeforeAddingValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Please Select Product Options Before Adding To Cart Radio Button field.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject setPleaseSelectProductOptionsBeforeAdding3RadioButtonField() {
        for (WebElement el : pleaseSelectProductOptionsBeforeAdding3) {
            if (el.getAttribute("value").equals(pleaseSelectProductOptionsBeforeAddingValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Please Select Product Options Before Adding To Cart Radio Button field.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject setPleaseSelectProductOptionsBeforeAdding4RadioButtonField() {
        for (WebElement el : pleaseSelectProductOptionsBeforeAdding4) {
            if (el.getAttribute("value").equals(pleaseSelectProductOptionsBeforeAddingValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Please Select Product Options Before Adding To Cart Radio Button field.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject setPleaseSelectProductOptionsBeforeAdding5RadioButtonField() {
        for (WebElement el : pleaseSelectProductOptionsBeforeAdding5) {
            if (el.getAttribute("value").equals(pleaseSelectProductOptionsBeforeAddingValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Please Select Product Options Before Adding To Cart Radio Button field.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject setPleaseSelectProductOptionsBeforeAdding6RadioButtonField()
    {
        for (WebElement el : pleaseSelectProductOptionsBeforeAdding6)
        {
            if (el.getAttribute("value").equals(pleaseSelectProductOptionsBeforeAddingValue))
            {
                if (!el.isSelected())
                {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Please Select Product Options Before Adding To Cart Radio Button field.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject setPleaseSelectProductOptionsBeforeAdding7RadioButtonField() {
        for (WebElement el : pleaseSelectProductOptionsBeforeAdding7) {
            if (el.getAttribute("value").equals(pleaseSelectProductOptionsBeforeAddingValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Please Select Product Options Before Adding To Cart Radio Button field.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject setPleaseSelectProductOptionsBeforeAdding8RadioButtonField() {
        for (WebElement el : pleaseSelectProductOptionsBeforeAdding8) {
            if (el.getAttribute("value").equals(pleaseSelectProductOptionsBeforeAddingValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Please Select Product Options Before Adding To Cart Radio Button field.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject setPleaseSelectProductOptionsBeforeAdding9RadioButtonField() {
        for (WebElement el : pleaseSelectProductOptionsBeforeAdding9) {
            if (el.getAttribute("value").equals(pleaseSelectProductOptionsBeforeAddingValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Splashing Pixels Wordpress Ecommerce Themes Offer The Best Ecommerce Solution For Online Stores Text field.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject setSplashingPixelsWordpressEcommerceThemesOfferTextField() {
        return setSplashingPixelsWordpressEcommerceThemesOfferTextField(data.get("SPLASHING_PIXELS_WORDPRESS_ECOMMERCE_THEMES_OFFER"));
    }

    /**
     * Set value to Splashing Pixels Wordpress Ecommerce Themes Offer The Best Ecommerce Solution For Online Stores Text field.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject setSplashingPixelsWordpressEcommerceThemesOfferTextField(String splashingPixelsWordpressEcommerceThemesOfferValue) {
        splashingPixelsWordpressEcommerceThemesOffer.sendKeys(splashingPixelsWordpressEcommerceThemesOfferValue);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject submit()
    {
        //clickAddToCartButton();
        return this;
    }


    /**
     * Verify that the page loaded completely.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject verifyPageLoaded()
    {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>()
        {
            public Boolean apply(WebDriver d)
            {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the productsPageObject class instance.
     */
    public productsPageObject verifyPageUrl()
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
