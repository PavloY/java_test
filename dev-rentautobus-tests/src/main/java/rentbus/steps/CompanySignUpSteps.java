package rentbus.steps;


import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import rentbus.pages.CompanySignUpPage;
import rentbus.pages.MainPage;

public class CompanySignUpSteps extends ScenarioSteps {
  CompanySignUpPage page;

  @Step
  public void openCompanySignUpPage() {
  page.open();
  }

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
  public void setCityField(String city){
    page.setCityField(city);

  }



}
