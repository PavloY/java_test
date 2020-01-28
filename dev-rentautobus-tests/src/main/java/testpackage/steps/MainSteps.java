package testpackage.steps;


import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import testpackage.pages.MainPage;

public class MainSteps extends ScenarioSteps {
  MainPage page;

  @Step("User open main page")
  public void openMainPage() {
  page.open();
  }

  @Step("User click sign in button")
  public void clickSignUpButton() {
    page.clickSignUpButton();
  }

  @Step("User set email address [0]")
  public void setEmailAddress(String emailAddress) {
    page.setEmailAddress(emailAddress);
  }

  @Step("User set password field [0]")
  public void setPasswordField (String passwordField) {
    page.setPasswordField(passwordField);
  }

  @Step("User click signin button confirmation")
  public void clickSignUpButtonConfirmation() {
    page.clickSignUpButtonConfirmation();
  }

  @Step("User should see [0]")
  public boolean isUserByTextVisible(String message) {
    return page.isUserByTextVisible(message);}


}
