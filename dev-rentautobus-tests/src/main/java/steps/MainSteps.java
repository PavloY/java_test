package steps;


import net.thucydides.core.annotations.Step;
import pages.MainPage;

public class MainSteps {
  MainPage page;

  @Step
  public void openMainPage() {
    page.open();
  }

  @Step("User click SignUp button")
  public void clickSignUpButton() {
    page.clickSignUpButton();
  }

  @Step("User enter email [0]")
  public void setEmailAddress(String emailAddress) {
    page.setEmailAddress(emailAddress);
  }

  @Step("User enter password [0]")
  public void setPasswordField (String passwordField) {
    page.setPasswordField(passwordField);
  }

  @Step("User click SignUp button confirmation")
  public void clickSignUpButtonConfirmation() {
    page.clickSignUpButtonConfirmation();
  }
}
