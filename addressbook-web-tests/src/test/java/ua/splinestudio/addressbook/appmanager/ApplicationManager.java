package ua.splinestudio.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    private final GroupHelper groupHelper = new GroupHelper();

    private static boolean isAlertPresent(FirefoxDriver driver) {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public void init() {
        groupHelper.driver = new FirefoxDriver();
        groupHelper.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        groupHelper.driver.get("http://localhost/addressbook/");
        login("admin", "secret");
    }

    private void login(String username, String password) {
        groupHelper.driver.findElement(By.name("user")).click();
        groupHelper.driver.findElement(By.name("user")).clear();
        groupHelper.driver.findElement(By.name("user")).sendKeys(username);
        groupHelper.driver.findElement(By.name("pass")).clear();
        groupHelper.driver.findElement(By.name("pass")).sendKeys(password);
        groupHelper.driver.findElement(By.xpath("//input[@value='Login']")).click();
    }

    public void gotoGroupCreation() {
        groupHelper.driver.findElement(By.linkText("groups")).click();
    }

    public void stop() {
        groupHelper.driver.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }
}
