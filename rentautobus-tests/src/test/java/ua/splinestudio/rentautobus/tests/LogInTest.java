package ua.splinestudio.rentautobus.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


public class LogInTest extends TestBase{

    @Test
    public void testBusCompanyLoginIn() {
        app.getSessionHelper().logIn("dev@splinestudio.com", "12345678");
        app.getElementHelper().waitElementExpected("//button[@onclick='sign_in()']");
        assertTrue(app.getElementHelper().isElementPresent(By.id("dashboard_link")));

    }

}

