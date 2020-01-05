package ua.splinestudio.rentautobus.appmanager;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    FirefoxDriver driver;
    WebDriverWait wait;
    private ElementHelper elementHelper;
    private SessionHelper sessionHelper;
    private NavigationHelper navigationHelper;
    private TripHelper tripHelper;


    public void init() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 5);
        tripHelper = new TripHelper(driver);
        navigationHelper = new NavigationHelper(driver);
        sessionHelper = new SessionHelper(driver);
        elementHelper = new ElementHelper(driver, wait);
        driver.get("http://rab.dev19.splinestudio.com/");
    }

    public void stop() {
        driver.quit();
    }

    public TripHelper getTripHelper() {
        return tripHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }

    public ElementHelper getElementHelper() {
        return elementHelper;
    }
}
