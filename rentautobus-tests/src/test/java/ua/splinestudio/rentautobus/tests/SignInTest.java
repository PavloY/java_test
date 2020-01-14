package ua.splinestudio.rentautobus.tests;


import org.testng.annotations.Test;



public class SignInTest extends TestBase{

  @Test
  public void testSignIn() {
    app.getHomePage().clickSignUpButton();
    app.getHomePage().setEmailAddress("emailAddress");
    app.getHomePage().setPasswordField("password");
    app.getHomePage().clickSignUpButtonConfirmation();

    //app.getHomePage().signIn("dev@splinestudio.com","12345678");
  }
}