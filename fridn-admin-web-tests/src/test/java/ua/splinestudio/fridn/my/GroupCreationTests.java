package ua.splinestudio.fridn.my;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GroupCreationTests {
  FirefoxDriver driver;

  @BeforeMethod
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitledTestCase() {
    driver.get("http://my.fridn.com/sign-in");
    driver.findElement(By.id("email-input")).click();
    driver.findElement(By.id("email-input")).click();
    driver.findElement(By.id("email-input")).clear();
    driver.findElement(By.id("email-input")).sendKeys("david@mail.com");
    driver.findElement(By.id("password-input")).click();
    driver.findElement(By.id("password-input")).clear();
    driver.findElement(By.id("password-input")).sendKeys("123456");
    driver.findElement(By.id("auth-button")).click();
  }

  @AfterMethod
  public void tearDown() {
    driver.quit();
        }

  public static boolean isAlertPresent(FirefoxDriver driver) {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;

    }
  }
}
