package ua.splinestudio.rentautobus.tests;


import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


public class SignInTest extends TestBase{

  @Test
  public void testSignIn() {
    app.getHomePage().clickSignUpButton();
    app.getHomePage().setEmailAddress(app.properties.getProperty("web.travelerLogin"));
    app.getHomePage().setPasswordField(app.properties.getProperty("web.travelerPassword"));
    app.getHomePage().clickSignUpButtonConfirmation();
    assertTrue(app.getTransportQuotePage().isUserByTextVisible(app.properties.getProperty("web.travelerUser")));

  }
}