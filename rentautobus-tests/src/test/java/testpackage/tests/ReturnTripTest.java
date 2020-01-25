package testpackage.tests;


import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


public class ReturnTripTest extends TestBase{

  @Test
  public void testReturnTrip() {
    app.getHomePage().clickReturnTripButton();
    app.getHomePage().setToField("Kyiv, Ukraine");
    app.getHomePage().setFromField("Dnipro, Dnipropetrovsk Oblast, Ukraine");
    app.getHomePage().setFromDateField("0505");
    app.getHomePage().setToDateField("0606");
    app.getHomePage().setToTimeField("1946");
    app.getHomePage().setFromTimeField("1640");
    app.getHomePage().clickReturnTripButton();
    app.getHomePage().clickGetFreeQuotesButton();
    assertTrue(app.getTransportQuotePage().isTravelPlanePresent());

  }
}