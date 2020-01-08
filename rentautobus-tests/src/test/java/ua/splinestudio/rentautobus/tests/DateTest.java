package ua.splinestudio.rentautobus.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import ua.splinestudio.rentautobus.appmanager.ElementHelper;
import ua.splinestudio.rentautobus.appmanager.NavigationHelper;
import ua.splinestudio.rentautobus.appmanager.SessionHelper;
import ua.splinestudio.rentautobus.appmanager.TripHelper;

import java.util.Properties;


public class DateTest {
    WebDriver driver;

    public void setDatepicker(WebDriver driver, String cssSelector, String date) {
        new WebDriverWait(driver, 30000).until(
                (WebDriver d) -> d.findElement(By.cssSelector(cssSelector)).isDisplayed());
        JavascriptExecutor.class.cast(driver).executeScript(String.format("$('%s').datepicker('setDate', '%s')", cssSelector, date));
    }



    @Test
    public void testDate() {

        /*WebDriver driver = new FirefoxDriver();
        driver.get("https://jqueryui.com/datepicker/");
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
        setDatepicker(driver, "#datepicker", "02/20/2002");

         */

        WebDriver driver = new FirefoxDriver();
        driver.get("http://rab.dev19.splinestudio.com/en/");
        driver.switchTo().frame(driver.findElement(By.cssSelector("#from_date")));
        setDatepicker(driver, "#from_date", "20/05/05");

    }

}
