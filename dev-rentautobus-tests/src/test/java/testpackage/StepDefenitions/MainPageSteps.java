package testpackage.StepDefenitions;


import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import testpackage.steps.MainSteps;

public class MainPageSteps {

  @Steps
  private MainSteps steps;


  @Given("User open main page")
  public void openMainPage() {
    steps.openMainPage();
  }


  @When("User click sign in button")
  public void clickSignUpButton() {
    steps.clickSignUpButton();
  }


  @When("User set email address \"<emailAddress>\"")
  public void setEmailAddress(String emailAddress) {
    steps.setEmailAddress(emailAddress);
  }


  @When("User set password field \"<passwordField>\"")
  public void setPasswordField (String passwordField) {
    steps.setPasswordField(passwordField);
  }


  @When("User click signin button confirmation")
  public void clickSignUpButtonConfirmation() {
    steps.clickSignUpButtonConfirmation();
  }


  @Then("User should see \"<message>\"")
  public void isUserByTextVisible(String message) {
    Assert.assertTrue(steps.isUserByTextVisible(message));}


}
