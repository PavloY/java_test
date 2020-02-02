package rentbus.steps;


import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.assertj.core.api.Assertions;
import rentbus.pages.CompanySignUpPage;
import rentbus.pages.MainPage;

public class CompanySignUpSteps extends ScenarioSteps {
  CompanySignUpPage page;

   @Step
  public void setFirstNameField(String firstName){
    page.setFirstNameField(firstName);
  }

  @Step
  public void setLastNameField(String lastName){
    page.setLastNameField(lastName);
  }

  @Step
  public void setCompanyNameField(String companyName){
    page.setCompanyNameField(companyName);
  }

  @Step
  public void setAddressField(String address){
    page.setAddressField(address);
  }

  @Step
  public void setZipCodeField(String zipCode){
    page.setZipCodeField(zipCode);
  }

  @Step
  public void setCityField(String city) {
    page.setCityField(city);
    }

   @Step
   public void setCountryField(String country){
      page.setCountryField(country);
    }

    @Step
    public void setEmailFormField(String emailForm){
    page.setEmailFormField(emailForm);
  }

  @Step
    public void setCountryCodeField(String countryCode){
    page.setCountryCodeField(countryCode);
  }


  @Step
  public void setPhoneField(String phone){
    page.setPhoneField(phone);
  }

  @Step
  public void clickButtonRegister() {
    page.clickButtonRegister();
  }

  @Step
  public void isAllertVisible(String message) {
    Assertions.assertThat(page.isAllertVisible(message))
            .as("User did not see message")
            .isTrue();
  }

}
