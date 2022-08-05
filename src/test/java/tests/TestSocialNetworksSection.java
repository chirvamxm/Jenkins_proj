package tests;

import pageObj.HomePageWebElements;
import tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.ArrayList;

public class TestSocialNetworksSection extends TestInit {

    @DataProvider
    public static Object[][] networkSelect() {

        return new Object[][]{
                {"https://www.facebook.com/glovoappES", "facebook"},
                {"https://twitter.com/Glovo_ES", "twitter"},
                {"https://www.instagram.com/glovo_es/", "instagram"}};
    }

    @Test(dataProvider = "networkSelect")
    public void socialNetworkSection(String currentNetwork, String assertURL) {
        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);

        goToSite("https://glovoapp.com/ua/uk/");
        homePageWebElements.getSocialNetworkBtn(currentNetwork).click();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        Assert.assertTrue(getURL().contains(assertURL));
    }
}
