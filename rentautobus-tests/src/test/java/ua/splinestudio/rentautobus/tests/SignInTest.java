package ua.splinestudio.rentautobus.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ua.splinestudio.rentautobus.pages.HomePage;



public class SignInTest extends TestBase{

  @Test
  public void testSignIn() {
    app.getHomePage().signIn("dev@splinestudio.com","12345678");
  }
}