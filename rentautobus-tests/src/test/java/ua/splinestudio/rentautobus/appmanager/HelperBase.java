package ua.splinestudio.rentautobus.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;

import java.io.File;

public class HelperBase {
    protected WebDriver driver;

    public HelperBase(WebDriver driver) {
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

    protected void fillingDate(By locator, String text) {
        driver.findElement(locator).click();
        driver.findElement(locator).sendKeys("selenium" + Keys.ARROW_RIGHT);
        driver.findElement(locator).sendKeys("selenium" + Keys.ARROW_RIGHT);
        driver.findElement(locator).sendKeys("selenium" + Keys.ARROW_RIGHT);
        driver.findElement(locator).sendKeys(text);
    }

    protected void fillTime(By locator, String text) {
        driver.findElement(locator).click();
        driver.findElement(locator).sendKeys("selenium" + Keys.DELETE);
        driver.findElement(locator).sendKeys(text);
        driver.findElement(locator).sendKeys("selenium" + Keys.ENTER);
    }

    public void fillGroupTrip(By locator, String text) {
        driver.findElement(locator).click();
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);

    }
    public void fillAboutTrip(By locator, String text) {
        driver.findElement(locator).click();
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void attach(By locator, File file) {
       driver.findElement(locator).sendKeys(file.getAbsolutePath());
    }

    public void fillPhoneId(By locator) {
        driver.findElement(locator).click();
        driver.findElement(locator).sendKeys("selenium" + Keys.END);
        driver.findElement(locator).click();
        driver.findElement(locator).sendKeys("selenium" + Keys.END);
    }

    public void fillPhone(By locator) {
        driver.findElement(locator).click();
    }

    public void fillTerms(By locator) {
        driver.findElement(locator).click();
    }
}
