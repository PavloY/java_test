package ua.splinestudio.rentautobus.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import ua.splinestudio.rentautobus.pages.MainPage;

public class MainStepsJBH {
  @Steps
  MainPage page;

  @Given("User open main page")
  public void openMainPage() {
    page.open();
  }

  @When("User click sign in button")
  public void clickSignUpButton() {
    page.clickSignUpButton();
  }

  @When("User set email address \"dev@splinestudio.com\"")
  public void setEmailAddress(String emailAddress) {
    page.setEmailAddress(emailAddress);
  }

  @When("User set password field \"12345678\"")
  public void setPasswordField (String passwordField) {
    page.setPasswordField(passwordField);
  }

  @When("User click sign in button")
  public void clickSignUpButtonConfirmation() {
    page.clickSignUpButtonConfirmation();
  }

  @Then("User should see user name \"Lesha Afternoon\"")
  public boolean isUserByTextVisible(String message) {
    return page.isUserByTextVisible(message);
  }

}
