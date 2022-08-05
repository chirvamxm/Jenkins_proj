package pageObj;

import pageObj.BasePage;
import org.openqa.selenium.WebDriver;

public class HomePageHelper extends BasePage {

    public HomePageHelper(WebDriver driver) {
        super(driver);
    }

    public HomePageHelper signIn() {

        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);
        homePageWebElements.getStartedBtn().click();
        homePageWebElements.getLogIn().click();
        homePageWebElements.getEmailAddressField().sendKeys("chirvamax@ukr.net");
        homePageWebElements.getPasswordField().sendKeys("qwerty12345");
        homePageWebElements.getLogInWithEmailBtn().click();
        homePageWebElements.getCloseLocationWindowBtn().click();
        return this;
    }
}