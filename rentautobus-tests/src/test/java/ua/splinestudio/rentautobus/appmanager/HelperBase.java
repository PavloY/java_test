package ua.splinestudio.rentautobus.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelperBase {
    protected FirefoxDriver driver;

    public HelperBase(FirefoxDriver driver) {
        this.driver = driver;
    }

    protected void click(By locator) {
        driver.findElement(locator).click();
    }

    protected void doubleСlick(By locator) {
        driver.findElement(locator).click();
        driver.findElement(locator).click();
    }

    protected void filling(By locator, String text) {
        driver.findElement(locator).click();
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }
}
