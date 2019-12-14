package ua.splinestudio.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessionHelper {
    private FirefoxDriver driver;

    public SessionHelper(FirefoxDriver driver) {

        this.driver = driver;
    }

    public void login(String username, String password) {
        driver.findElement(By.name("user")).click();
        driver.findElement(By.name("user")).clear();
        driver.findElement(By.name("user")).sendKeys(username);
        driver.findElement(By.name("pass")).clear();
        driver.findElement(By.name("pass")).sendKeys(password);
        driver.findElement(By.xpath("//input[@value='Login']")).click();
    }


}
