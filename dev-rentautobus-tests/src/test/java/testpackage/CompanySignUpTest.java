package testpackage;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import rentbus.steps.CompanySignUpSteps;
import rentbus.steps.MainSteps;

@RunWith(SerenityRunner.class)
public class CompanySignUpTest {

  @Steps
  MainSteps steps;
  @Steps
  CompanySignUpSteps step;

  @Managed
  WebDriver driver;

  @Test
  @Title("User click singin button")
  public void cliksignin() {
  steps.openMainPage();
  steps.clickForBusinessButton();
  step.setFirstNameField("TestFirstName");
  step.setLastNameField("TestLastName");
  step.setCompanyNameField("TestCompanyName");
  step.setAddressField("TestAddress");
  step.setZipCodeField("123456");
  step.setCityField("TestCity");
  step.setCountryField("UKRAINE");
  step.setEmailFormField("rab@mailforspam.com");
  step.setCountryCodeField("UKRAINE +380");
  step.setPhoneField("12345678");
  step.clickButtonRegister();
  step.isAllertVisible("User with that email is exist.");
  }

}
