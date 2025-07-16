package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.ConfigReader;

public class HomePage {

    private final WebDriver driver;

    By loginLink = By.cssSelector("a[href='/w/index.php?title=Special:Autentificare&returnto=Patagonia']");

    // Locators
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Page Actions
    public void clickButton() {
        driver.findElement(loginLink).click();
    }

    public void loadHomePage() {
        String url = ConfigReader.get("base.url");
        driver.get(url);
    }
}
