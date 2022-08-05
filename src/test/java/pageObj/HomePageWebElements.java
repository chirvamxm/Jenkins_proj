package pageObj;

import pageObj.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageWebElements extends BasePage {

    public HomePageWebElements(WebDriver driver) {
        super(driver);
    }

    // HEADER
    public static final String GET_STARTED_BTN = "//button[@id='user-register']";
    public static final String PROFILE_BTN = "//img[@alt='Profile']";
    public static final String ADD_PAYMENT_CARD = "//div[@class='account-add-credit-card__card']";
    //SIGN IN WINDOW
    public static final String LOG_IN_BTN = "//button[@data-e2e-id='header-user-login']";
    public static final String EMAIL_ADDRESS_FIELD = "//input[@data-test-id='text-field-input'][@name='email']";
    public static final String PASSWORD_FIELD = "//input[@data-test-id='text-field-input'][@name='password']";
    public static final String LOG_IN_WITH_EMAIL_BTN = "//button[@id='login-button']";
    // ADDRESS DELIVERY WINDOW
    public static final String CLOSE_LOCATION_WINDOW_BTN = "//span[@class='close-button']";
    public static final String YOU_LOCATION_BTN = "//div[@class='current-location__text']";
    //RESTAURANTS CATEGORY
    public static final String PRESTO_PIZZA_RESTAURANT_BTN = "//a[@href='/ua/uk/lutsk/presto-pizza-lut/']";
    //PRESTO PIZZA RESTAURANT PAGE
    public static final String PRESTO_PIZZA_BTN = "//img[@src='https://res.cloudinary.com/glovoapp/f_auto,q_auto/Products/nbutdki8xnx2vufxszsi']";
    public static final String EL_POLO_PIZZA_BTN = "//img[@src='https://res.cloudinary.com/glovoapp/f_auto,q_auto/Products/r6ixea8wnjnnbr5tag07']";
    public static final String SALAMI_PIZZA_BTN = "//img[@src='https://res.cloudinary.com/glovoapp/f_auto,q_auto/Products/o9kivvd5bixhzkwhgfkf']";
    public static final String ADD_TO_CART_BTN = "//button[@data-test-id='add-button']";
    public static final String FREE_DELIVERY_MESSAGE_BTN = "//span[@data-test-id='surcharge-button']";
    //FOOTER
    public static final String SOCIAL_NETWORK_BTN = "//a[@href='%s']";
    //ADDING PAYMENT CARD WINDOW
    public static final String NAME_ON_CARD_FIELD = "//input[@id='cardholdername']";
    public static final String NUMBER_OF_CARD_FIELD = "//input[@id='processout-field'][@name='cc-number']";
    public static final String CARD_DATE_FIELD = "//div[@id='in-month-year']";
    public static final String CVV_CARD_FIELD = "//div[@id='in-cvc']";
    public static final String SAVE_FIELD_BTN = "//input[@type='submit']";

    public WebElement getStartedBtn() {
        return getElementByXpath(GET_STARTED_BTN);
    }

    public WebElement getProfileBtn() {
        return getElementByXpath(PROFILE_BTN);
    }

    public WebElement getAddPaymentCardBtn() {
        return getElementByXpath(ADD_PAYMENT_CARD);
    }

    public WebElement getLogIn() {
        return getElementByXpath(LOG_IN_BTN);
    }

    public WebElement getEmailAddressField() {
        return getElementByXpath(EMAIL_ADDRESS_FIELD);
    }

    public WebElement getPasswordField() {
        return getElementByXpath(PASSWORD_FIELD);
    }

    public WebElement getLogInWithEmailBtn() {
        return getElementByXpath(LOG_IN_WITH_EMAIL_BTN);
    }

    public WebElement getCloseLocationWindowBtn() {
        return getElementByXpath(CLOSE_LOCATION_WINDOW_BTN);
    }

    public WebElement getYouLocationBtn() {
        return getElementByXpath(YOU_LOCATION_BTN);
    }

    public WebElement getPrestoPizzaBtn() {
        return getElementByXpath(PRESTO_PIZZA_BTN);
    }

    public WebElement getElPoloPizzaBtn() {
        return getElementByXpath(EL_POLO_PIZZA_BTN);
    }

    public WebElement getSalamiPizzaBtn() {
        return getElementByXpath(SALAMI_PIZZA_BTN);
    }

    public WebElement getAddToCartBtn() {
        return getElementByXpath(ADD_TO_CART_BTN);
    }

    public WebElement freeDeliveryMessage() {
        return getElementByXpath(FREE_DELIVERY_MESSAGE_BTN);
    }

    public WebElement getPrestoPizzaRestaurantBtn() {
        return getElementByXpath(PRESTO_PIZZA_RESTAURANT_BTN);
    }

    public WebElement getSocialNetworkBtn(String currentNetwork) {
        return getElementByXpath(String.format(SOCIAL_NETWORK_BTN, currentNetwork));
    }

    public WebElement getNameOnCardField() {
        return getElementByXpath(NAME_ON_CARD_FIELD);
    }

    public WebElement getNumberOfCardField() {
        WebElement iframe = getElementByCssSelector("#card-form > div:nth-child(2) > div.form-item > div > iframe");
        driver.switchTo().frame(iframe);
        return getElementByXpath(NUMBER_OF_CARD_FIELD);
    }

    public WebElement getCardDateField() {
        WebElement iframe = getElementByCssSelector("#in-month-year > iframe");
        driver.switchTo().frame(iframe);
        return getElementByXpath(CARD_DATE_FIELD);
    }

    public WebElement getCVVField() {
        WebElement iframe = getElementByCssSelector("#in-cvc > iframe");
        driver.switchTo().frame(iframe);
        return getElementByXpath(CVV_CARD_FIELD);
    }

    public WebElement getSaveCardBtn() {
        return getElementByXpath(SAVE_FIELD_BTN);
    }
}