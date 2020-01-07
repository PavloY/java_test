package ua.splinestudio.rentautobus.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ua.splinestudio.rentautobus.model.TripData;

import java.io.File;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.testng.Assert.assertTrue;

public class TravelerOneWayTripTest extends TestBase{

    @Test
    public void testTravelerOneWayTrip() {
        app.getSessionHelper().logIn(app.properties.getProperty("web.travelerLogin")
                , app.properties.getProperty("web.travelerPassword"));
        app.getElementHelper().waitElementExpected("//button[@onclick='sign_in()']");
        assertTrue(app.getElementHelper().isElementPresent(By.id("dashboard_link")));
        app.getNavigationHelper().gotoHomePage();
        app.getNavigationHelper().clickOneWayTrip();
        app.getTripHelper().fillOneWayTripForm(new TripData(
                "Dnipro, Dnipropetrovsk Oblast, Ukraine"
                , "Kiev, Ukraine"
                , "20-20-2020"
                , "12:45"));
        app.getNavigationHelper().gotoNextPage("//button[@onclick='get_next_page()']");
        app.getElementHelper().waitElementShow("/html/body/div[4]/div[1]/span[2]");
        app.getNavigationHelper().clickOneWayTrip();
        app.getTripHelper().fillOneWayTripForm(new TripData(
                "Dnipro, Dnipropetrovsk Oblast, Ukraine"
                , "Kiev, Ukraine"
                , "20-20-2020"
                , "12:45"));
        app.getNavigationHelper().gotoNextPageClick("//*[@id='next-page']");

        String from = new String("["+"Dnipro, Dnipropetrovsk Oblast, Ukraine"+"]");
        String fromWeb = new String(String.valueOf(app.getTripHelper()
                .getTripWebText(By.cssSelector("p.col:nth-child(2) > span:nth-child(1)"))));
        assertThat(fromWeb, equalTo(from));

        String to = new String("["+"Kiev, Ukraine"+"]");
        String toWeb = new String(String.valueOf(app.getTripHelper()
                .getTripWebText(By.cssSelector("p.col:nth-child(1) > span:nth-child(1)"))));
        assertThat(fromWeb, equalTo(from));

        app.getTripHelper().fillGroupTrip(By.id("passanger"), "8");
        app.getTripHelper().fillAboutTrip(By.id("details"), "test about the group");
        File pdf = new File("src/test/resources/files/spst.pdf");
        app.getTripHelper().attach(By.id("file"),pdf);
        app.getElementHelper().waitElementExpected("//button[@onclick='sign_in()']");
    }
}

