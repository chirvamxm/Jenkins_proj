package tests.testsSomething;

import pageObj.HomePageHelper;
import pageObj.HomePageWebElements;
import org.testng.annotations.Test;
import tests.TestInit;

import java.awt.*;
import java.awt.event.InputEvent;

public class TestAddingPaymentCard extends TestInit {

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
    public void testAddingPaymentCard() {

        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);
        HomePageHelper homePageHelper = new HomePageHelper(driver);

        goToSite("https://glovoapp.com/ua/uk/");
//        homePageHelper.signIn();
//        homePageWebElements.getYouLocationBtn().click();
//        clickBtnAllowInPushPopUp();
//        homePageWebElements.getProfileBtn().click();
//        homePageWebElements.getAddPaymentCardBtn().click();
//        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
//        driver.switchTo().window(tabs.get(1));
//        homePageWebElements.getNameOnCardField().sendKeys("Ivan Ivanov");
//        homePageWebElements.getNumberOfCardField().sendKeys("5168877702365337");
//        homePageWebElements.getCardDateField().sendKeys("0824");
//        homePageWebElements.getCVVField().sendKeys("467");
//
//        Assert.assertTrue(homePageWebElements.getSaveCardBtn().isDisplayed());
    }
}
