package ua.splinestudio.rentautobus.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;

import static org.openqa.selenium.support.ui.ExpectedConditions.stalenessOf;

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

    public void waitElementShow(By locator) {
        wait.until(d -> d.findElement(locator));
    }

    public void waitElementExpected(String locator) {
        wait.until(stalenessOf(driver.findElement(By.xpath(locator))));
    }

    public void cleaned(String element) {
        element.replaceAll("\\s","").replaceAll("[-()]","");

    }
    public void setDatepicker(WebDriver driver, String cssSelector, String date) {
        new WebDriverWait(driver, 30000).until(
                (WebDriver d) -> d.findElement(By.cssSelector(cssSelector)).isDisplayed());
        JavascriptExecutor.class.cast(driver).executeScript(
                String.format("$('%s').datepicker('setDate', '%s')", cssSelector, date));
    }
    public void fillDate() {
      //  driver.get("http://jqueryui.com/datepicker/");
        driver.switchTo().frame(driver.findElement(By.id("from_date")));
        setDatepicker(driver, "#datepicker", "05/05/2020");
    }


}
