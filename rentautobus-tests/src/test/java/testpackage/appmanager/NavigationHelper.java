package testpackage.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase{

    public NavigationHelper(WebDriver driver) {
        super(driver);
    }

    public void gotoNextPage(By locator) {
        doubleСlick(locator);}

    public void clickOneWayTrip() { click(By.id("one_way"));}

    public void gotoHomePage() { click(By.linkText("Home"));}

    public void gotoNextPageClick(By locator) {
        click(locator);}

}
