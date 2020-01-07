package ua.splinestudio.rentautobus.appmanager;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver driver;
    WebDriverWait wait;

    public Properties properties;
    private String browser;
    private ElementHelper elementHelper;
    private SessionHelper sessionHelper;
    private NavigationHelper navigationHelper;
    private TripHelper tripHelper;

    public ApplicationManager(String browser) {
        this.browser = browser;
        properties = new Properties();
    }


    public void init() throws IOException {
        String target = System.getProperty("target", "local");
        properties.load(new FileReader(new File(String.format("src/test/resources/properties/%s.properties", target))));

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.PAGE_LOAD_STRATEGY, "eager");

        if (browser.equals(BrowserType.FIREFOX)) {
            driver = new FirefoxDriver(capabilities);
        } else if (browser.equals(BrowserType.CHROME)) {
            driver = new ChromeDriver(capabilities);
        } else if (browser.equals(BrowserType.IE)) {
            driver = new InternetExplorerDriver(capabilities);
        }

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 60);
        driver.get(properties.getProperty("web.baseUrl"));

        tripHelper = new TripHelper(driver);
        navigationHelper = new NavigationHelper(driver);
        sessionHelper = new SessionHelper(driver);
        elementHelper = new ElementHelper(driver, wait);

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