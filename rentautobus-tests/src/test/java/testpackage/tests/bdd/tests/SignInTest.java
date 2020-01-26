package testpackage.tests.bdd.tests;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.remote.BrowserType;
import org.testng.Assert;
import org.testng.annotations.Test;
import testpackage.appmanager.ApplicationManager;
import testpackage.tests.TestBase;
import testpackage.tests.bdd.RunBddTests;

import java.io.IOException;

import static org.testng.Assert.assertTrue;

public class SignInTest {

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

  @Given("^user click button SignIn on the home page$")
  public void clickSignIn() {
    app.getHomePage().clickSignUpButton();
  }


  @When("^user set login (.+) and set password (.+)$")
  public void fillForm(String login, String pass) {
    app.getHomePage().setEmailAddress(login);
    app.getHomePage().setPasswordField(pass);
  }

  @And("^user click button sign in confirmation$")
  public void clickSignInConfirmation() {
          app.getHomePage().clickSignUpButtonConfirmation();
  }

  @Then("^user SignIn on the site$")
  public void assertResults() {
    Assert.assertTrue(app.getTransportQuotePage().isTravelPlanePresent());
  }
}
