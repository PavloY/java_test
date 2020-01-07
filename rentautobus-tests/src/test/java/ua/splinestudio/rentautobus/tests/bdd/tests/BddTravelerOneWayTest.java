package ua.splinestudio.rentautobus.tests.bdd.tests;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.BrowserType;
import ua.splinestudio.rentautobus.appmanager.ApplicationManager;
import ua.splinestudio.rentautobus.model.TripData;

import java.io.IOException;

import static org.testng.Assert.assertTrue;

public class BddTravelerOneWayTest {

    protected ApplicationManager app;

    @Before
    public void init() throws IOException {
        app = new ApplicationManager(System.getProperty("browser", BrowserType.FIREFOX ));
        app.init();
    }

    @After
    public void stop() {
        app.stop();
        app = null;
    }

    @Given("^user logged in as traveler$")
    public void fillSignIn() {
        app.getSessionHelper().logIn(app.properties.getProperty("web.travelerLogin")
                , app.properties.getProperty("web.travelerPassword"));
        app.getElementHelper().waitElementExpected("//button[@onclick='sign_in()']");
        assertTrue(app.getElementHelper().isElementPresent(By.id("dashboard_link")));
    }

    @When("^user clicks on the one way trip$")
    public void waitElementExpected() {
        app.getNavigationHelper().gotoHomePage();
        app.getNavigationHelper().clickOneWayTrip();
    }

    @And("^user user populates Trip Form with text$")
    public void assertResult() {
        app.getTripHelper().fillOneWayTripForm(new TripData("Dnipro, Dnipropetrovsk Oblast, Ukraine"
                , "Kiev, Ukraine", "05-05-2020", "12:45"));
    }

    @Then("^user clicks on button and navigates to next page$")
    public void assertResults() {
        app.getNavigationHelper().gotoNextPage("//button[@onclick='get_next_page()']");
        app.getElementHelper().waitElementShow("/html/body/div[4]/div[1]/span[2]");
    }

}
