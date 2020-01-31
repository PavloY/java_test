package rentbus.steps;


import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import rentbus.pages.MainPage;

public class MainSteps extends ScenarioSteps {
  MainPage page;

  @Step
  public void openMainPage() {
  page.open();
  }

  @Step
  public void clickSignUpButton() {
    page.clickSignUpButton();
  }

  @Step
  public void setEmailAddress(String emailAddress) {
    page.setEmailAddress(emailAddress);
  }

  @Step
  public void setPasswordField (String passwordField) {
    page.setPasswordField(passwordField);
  }

  @Step
  public void clickSignUpButtonConfirmation() {
    page.clickSignUpButtonConfirmation();
  }

  @Step
  public boolean isUserByTextVisible(String message) {
    return page.isUserByTextVisible(message);}

  @Step
  public void clickForBusinessButton() {
    page.clickForBusinessButton();
  }
}
