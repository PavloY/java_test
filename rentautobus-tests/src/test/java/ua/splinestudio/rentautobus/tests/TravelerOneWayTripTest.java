package ua.splinestudio.rentautobus.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ua.splinestudio.rentautobus.model.TripData;

import static org.testng.Assert.assertTrue;

public class TravelerOneWayTripTest extends TestBase{

    @Test
    public void testTravelerOneWayTrip() {
        app.getSessionHelper().logIn("dev@splinestudio.com", "12345678");
        app.getElementHelper().waitElementExpected("//button[@onclick='sign_in()']");
        assertTrue(app.getElementHelper().isElementPresent(By.id("dashboard_link")));
        app.getNavigationHelper().gotoHomePage();
        app.getNavigationHelper().clickOneWayTrip();
        app.getTripHelper().fillOneWayTripForm(new TripData("Dnipro, Dnipropetrovsk Oblast, Ukraine"
                , "Kiev, Ukraine", "05-05-2020", "12:45"));
        app.getNavigationHelper().gotoNextPage("//button[@onclick='get_next_page()']");
        app.getElementHelper().waitElementShow("/html/body/div[4]/div[1]/span[2]");
    }
}

