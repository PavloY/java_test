package ua.splinestudio.rentautobus.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;

public class ElementHelper {
    private WebDriverWait wait;
    private WebDriver driver;

    public ElementHelper(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public boolean isElementPresent(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public void waitElementShow(String locator) {
        wait.until(d -> d.findElement(By.xpath(locator)));
    }

    public void waitElementExpected(String locator) {
        wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.xpath(locator))));
    }
}
