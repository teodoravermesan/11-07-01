package com.example;

import base.BaseTest;
import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.HomePage;
@Epic("Smoke Tests")
@Feature("Home Page")
@Listeners({io.qameta.allure.testng.AllureTestNg.class})
public class HomePageTest extends BaseTest {

    @Test(description = "Verify clicking submit works")
    @Severity(SeverityLevel.NORMAL)
    @Story("Click Submit")
    public void testClickButton() {
        HomePage homePage = new HomePage(driver);
        homePage.loadHomePage();
        homePage.clickButton();
    }
}
