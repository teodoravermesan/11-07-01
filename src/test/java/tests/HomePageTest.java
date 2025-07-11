package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends BaseTest {

    @Test
    public void testClickButton() {
        HomePage homePage = new HomePage(driver);
        homePage.loadHomePage("https://ro.wikipedia.org/wiki/Patagonia");
        homePage.clickButton();
    }
}
