package testpackage.steps;


import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import testpackage.pages.MainPage;

public class MainSteps extends ScenarioSteps {
  MainPage page;

  @Step
  @Given("User open main page")
  public void openMainPage() {
  page.open();
  }

  @Step
  @When("User click sign in button")
  public void clickSignUpButton() {
    page.clickSignUpButton();
  }

  @Step
  @When("User set email address \"<emailAddress>\"")
  public void setEmailAddress(String emailAddress) {
    page.setEmailAddress(emailAddress);
  }

  @Step
  @When("User set password field \"<passwordField>\"")
  public void setPasswordField (String passwordField) {
    page.setPasswordField(passwordField);
  }

  @Step
  @When("User click signin button confirmation")
  public void clickSignUpButtonConfirmation() {
    page.clickSignUpButtonConfirmation();
  }

  @Step
  @Then("User should see \"<message>\"")
  public void isUserByTextVisible(String message) {
    Assert.assertTrue(page.isUserByTextVisible(message));}


}
