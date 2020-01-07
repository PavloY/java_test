package ua.splinestudio.rentautobus.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase{

    public NavigationHelper(WebDriver driver) {
        super(driver);
    }

    public void gotoNextPage(String locator) {
        doubleСlick(By.xpath(locator));}

    public void clickOneWayTrip() { click(By.id("one_way"));}

    public void gotoHomePage() { click(By.linkText("Home"));}

    public void gotoNextPageClick(String locator) {
        click(By.xpath(locator));}

}
