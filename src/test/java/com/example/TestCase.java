package com.example;

;

import base.BaseTest;
import io.qameta.allure.*;
import io.qameta.allure.testng.AllureTestNg;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.HomePage;
@Listeners({AllureTestNg.class})
public class TestCase extends BaseTest {

    @Test(description = "Verify example test")
    @Description("This test opens a dummy page and passes")
    public void testClickButton() {
        HomePage homePage = new HomePage(driver);
        homePage.loadHomePage();
        homePage.clickButton();
    }

    @Step("Step one is running")
    public void stepOne() {
        System.out.println("Step one executed.");
    }
}
