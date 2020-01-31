package testpackage.stepDefenitions;


import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import rentbus.steps.CompanySignUpSteps;
import rentbus.steps.MainSteps;

public class CompanySignUpDefinitions {

  @Steps
  MainSteps step;
  CompanySignUpSteps steps;

  @Given("User open main page")
  public void openMainPage() {
    step.openMainPage();
  }

  @When("User click FOR BUSINESS button")
  public void clickForBusinessButton() {
    step.clickForBusinessButton();
  }

  @When("User set first name field '$firstName'")
  public void setFirstNameField(String firstName) {
    steps.setFirstNameField(firstName);
  }

  @When("User set last name field '$lastName'")
  public void setLastNameField(String lastName){
    steps.setLastNameField(lastName);
  }




}
