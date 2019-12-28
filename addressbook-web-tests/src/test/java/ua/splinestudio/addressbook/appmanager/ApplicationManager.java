package ua.splinestudio.addressbook.appmanager;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    private final Properties properties;
    WebDriver driver;
    private SessionHelper sessionHelper;
    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;
    private String browser;
    private ContactHelper contactHelper;
    private DbHelper dbHelper;

    public ApplicationManager(String browser) {
        this.browser = browser;
        properties = new Properties();
    }

    public void init() throws IOException {
        String target = System.getProperty("target", "local");
        properties.load(new FileReader(new File(String.format("src/test/resources/%s.properties", target))));

        dbHelper = new DbHelper();
      if("".equals(properties.getProperty("selenium.server"))){
          if (browser.equals(BrowserType.FIREFOX)) {
              driver = new FirefoxDriver();
          } else if (browser.equals(BrowserType.CHROME)) {
              driver = new ChromeDriver();
          } else if (browser.equals(BrowserType.IE)) {
              driver = new InternetExplorerDriver();
          }
      }  else {
          DesiredCapabilities capabilities = new DesiredCapabilities();
          capabilities.setBrowserName(browser);
          capabilities.setPlatform(Platform.fromString(System.getProperty("platform", "win7")));
          driver = new RemoteWebDriver(new URL(properties.getProperty("selenium.server")), capabilities);
      }
       driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
       driver.get(properties.getProperty("web.baseUrl"));
    //    driver.get("http://localhost/addressbook/");
       groupHelper = new GroupHelper(driver);
       navigationHelper = new NavigationHelper(driver);
       sessionHelper = new SessionHelper(driver);
       contactHelper = new ContactHelper(driver);
       sessionHelper.login(properties.getProperty("web.adminLogin"),properties.getProperty("web.adminPassword"));
       //sessionHelper.login("admin", "secret");
    }

    public void stop() {
        driver.quit();
    }

    public GroupHelper group() {
        return groupHelper;
    }

    public NavigationHelper goTo() {
        return navigationHelper;
    }

    public ContactHelper contact() { return contactHelper; }

    public DbHelper db() { return dbHelper; }

    public byte[] takeScreenshot() {
      return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}
