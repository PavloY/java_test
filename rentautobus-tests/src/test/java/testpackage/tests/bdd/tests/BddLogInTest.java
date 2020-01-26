package testpackage.tests.bdd.tests;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.BrowserType;
import testpackage.appmanager.ApplicationManager;
import testpackage.tests.TestBase;
import testpackage.tests.bdd.RunBddTests;

import java.io.IOException;

import static org.testng.Assert.assertTrue;

public class BddLogInTest  {
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

    @Given("^user click button sign in$")
    public void clickSignIn() {
        app.getSessionHelper().clicklogIn();
    }

    @When("^user enters login (.+) and password (.+)$")
    public void fillForm(String login, String pass) {
        app.getSessionHelper().filllogIn(login, pass);
    }

    @Then("^user gets confirmation$")
    public void assertResults() {
        app.getElementHelper().waitElementExpected("//button[@onclick='sign_in()']");
        assertTrue(app.getElementHelper().isElementPresent(By.id("dashboard_link")));
    }
}
