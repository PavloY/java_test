package ua.splinestudio.rentautobus.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessionHelper extends HelperBase {

    public SessionHelper(FirefoxDriver driver) {
        super(driver);
    }

    public void logIn(String username, String password) {
        click(By.id("dLabel"));
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(password);
        click(By.xpath("//button[@onclick='sign_in()']"));
    }
}
