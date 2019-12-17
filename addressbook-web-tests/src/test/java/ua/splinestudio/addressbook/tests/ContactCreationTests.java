package ua.splinestudio.addressbook.tests;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactCreationTests extends TestBase{

        @Test
        public void testUntitledTestCase() throws Exception {
            driver.findElement(By.linkText("add new")).click();
            driver.findElement(By.name("firstname")).click();
            driver.findElement(By.name("firstname")).clear();
            driver.findElement(By.name("firstname")).sendKeys("test1");
            driver.findElement(By.name("theform")).submit();
            driver.findElement(By.linkText("add new")).click();
            driver.findElement(By.name("firstname")).click();
            driver.findElement(By.name("firstname")).clear();
            driver.findElement(By.name("firstname")).sendKeys("test1");
            driver.findElement(By.name("theform")).click();
            driver.findElement(By.name("middlename")).click();
            driver.findElement(By.name("middlename")).clear();
            driver.findElement(By.name("middlename")).sendKeys("test2");
            driver.findElement(By.name("theform")).click();
            driver.findElement(By.name("lastname")).click();
            driver.findElement(By.name("lastname")).clear();
            driver.findElement(By.name("lastname")).sendKeys("test3");
            driver.findElement(By.name("theform")).click();
            driver.findElement(By.name("nickname")).click();
            driver.findElement(By.name("nickname")).clear();
            driver.findElement(By.name("nickname")).sendKeys("test4");
            driver.findElement(By.name("theform")).click();
            driver.findElement(By.name("title")).click();
            driver.findElement(By.name("title")).clear();
            driver.findElement(By.name("title")).sendKeys("test5");
            driver.findElement(By.name("theform")).click();
            driver.findElement(By.name("company")).click();
            driver.findElement(By.name("company")).clear();
            driver.findElement(By.name("company")).sendKeys("test6");
            driver.findElement(By.name("theform")).click();
            driver.findElement(By.name("address")).click();
            driver.findElement(By.name("address")).clear();
            driver.findElement(By.name("address")).sendKeys("test7");
            driver.findElement(By.name("theform")).click();
            driver.findElement(By.name("home")).click();
            driver.findElement(By.name("home")).clear();
            driver.findElement(By.name("home")).sendKeys("test8");
            driver.findElement(By.name("theform")).click();
            driver.findElement(By.name("mobile")).click();
            driver.findElement(By.name("mobile")).clear();
            driver.findElement(By.name("mobile")).sendKeys("test9");
            driver.findElement(By.name("theform")).click();
            driver.findElement(By.name("work")).click();
            driver.findElement(By.name("work")).clear();
            driver.findElement(By.name("work")).sendKeys("test10");
            driver.findElement(By.name("theform")).click();
            driver.findElement(By.name("fax")).click();
            driver.findElement(By.name("fax")).clear();
            driver.findElement(By.name("fax")).sendKeys("test11");
            driver.findElement(By.name("theform")).click();
            driver.findElement(By.name("email")).click();
            driver.findElement(By.name("email")).clear();
            driver.findElement(By.name("email")).sendKeys("test12");
            driver.findElement(By.name("theform")).click();
            driver.findElement(By.name("email2")).click();
            driver.findElement(By.name("email2")).clear();
            driver.findElement(By.name("email2")).sendKeys("test13");
            driver.findElement(By.name("email3")).click();
            driver.findElement(By.name("email3")).clear();
            driver.findElement(By.name("email3")).sendKeys("test14");
            driver.findElement(By.name("homepage")).click();
            driver.findElement(By.name("homepage")).clear();
            driver.findElement(By.name("homepage")).sendKeys("test15");
            driver.findElement(By.name("address2")).click();
            driver.findElement(By.name("address2")).clear();
            driver.findElement(By.name("address2")).sendKeys("test16");
            driver.findElement(By.name("phone2")).click();
            driver.findElement(By.name("phone2")).clear();
            driver.findElement(By.name("phone2")).sendKeys("test17");
            driver.findElement(By.name("notes")).click();
            driver.findElement(By.name("notes")).clear();
            driver.findElement(By.name("notes")).sendKeys("test18");
            driver.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
            driver.findElement(By.linkText("home page")).click();
        }


}
