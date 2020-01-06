package ua.splinestudio.rentautobus.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver driver;
    WebDriverWait wait;
    private String browser;
    private ElementHelper elementHelper;
    private SessionHelper sessionHelper;
    private NavigationHelper navigationHelper;
    private TripHelper tripHelper;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }


    public void init() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.PAGE_LOAD_STRATEGY,"eager");

        if (browser.equals(BrowserType.FIREFOX)) {
            driver = new FirefoxDriver(capabilities);
        } else if (browser.equals(BrowserType.CHROME)) {
            driver = new ChromeDriver(capabilities);
        } else if (browser.equals(BrowserType.IE)) {
            driver = new InternetExplorerDriver(capabilities);
        }

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 60);

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
