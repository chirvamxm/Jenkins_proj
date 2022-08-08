package tests.testsSomething;

import pageObj.HomePageHelper;
import pageObj.HomePageWebElements;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestInit;

import java.awt.*;
import java.awt.event.InputEvent;

public class TestOrderPriceOnGlovo extends TestInit {

    public void clickBtnAllowInPushPopUp() {
        try {
            Robot robot = new Robot();
            robot.mouseMove(245, 160);
            robot.delay(2100);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testOrderPrice() {

        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);
        HomePageHelper homePageHelper = new HomePageHelper(driver);

        goToSite("https://glovoapp.com/ua/uk/");
        Assert.assertTrue(getURL().contains("glovo"));
//        homePageHelper.signIn();
//        homePageWebElements.getYouLocationBtn().click();
//        clickBtnAllowInPushPopUp();
//        homePageWebElements.getPrestoPizzaRestaurantBtn().click();
//        homePageWebElements.getPrestoPizzaBtn().click();
//        homePageWebElements.getAddToCartBtn().click();
//        homePageWebElements.getElPoloPizzaBtn().click();
//        homePageWebElements.getAddToCartBtn().click();
//        homePageWebElements.getSalamiPizzaBtn().click();
//        homePageWebElements.getAddToCartBtn().click();
//
//        Assert.assertTrue(homePageWebElements.freeDeliveryMessage().isDisplayed());
    }
}
