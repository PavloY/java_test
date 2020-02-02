package rentbus.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

import java.util.List;

import static java.lang.String.format;
import static org.openqa.selenium.By.xpath;


@DefaultUrl("http://rab.dev19.splinestudio.com/en/company/signup/")
public class CompanySignUpPage extends PageObject {

  @FindBy(xpath ="//input[@id='invoice_first_name']")
  private WebElementFacade firstNameField;

  @FindBy(xpath ="//input[@id='invoice_last_name']")
  private WebElementFacade lastNameField;

  @FindBy(xpath ="//input[@id='name']")
  private WebElementFacade companyNameField;

  @FindBy(xpath ="//input[@id='address']")
  private WebElementFacade addressField;

  @FindBy(xpath ="//input[@id='zip_code']")
  private WebElementFacade zipCodeField;

  @FindBy(xpath ="//input[@id='city']")
  private WebElementFacade cityField;

  @FindBy(xpath = "//button[@onclick='register()']")
  private WebElementFacade countryDropDown;

  String countryDropDownOption = ("//select[@id='invoice_country']/option[text()='%s']");

  @FindBy(xpath ="//input[@id='email-form']")
  private WebElementFacade emailFormField;

  @FindBy(xpath = "//select[@id='country']")
  private WebElementFacade countryCodeDropDown;

  String countryCodeDropDownOption = ("//select[@id='country']/option[text()[contains(.,'%s')]]");

  @FindBy(xpath = "//input[@id='phone']")
  private WebElementFacade phoneField;

  @FindBy(xpath = "//button[@onclick='register()']")
  private WebElementFacade buttonRegister;

  String allertByText = ("//div[text()[contains(.,'%s')]]");

  @FindBy(xpath = "//div[text()[contains(.,'%s')]]")
  private WebElementFacade allertByLabel;

  public CompanySignUpPage setFirstNameField(String firstName){
    firstNameField.sendKeys(firstName);
    return this;
  }

  public CompanySignUpPage setLastNameField(String lastName){
    lastNameField.sendKeys(lastName);
    return this;
  }

  public CompanySignUpPage setCompanyNameField(String companyName){
    companyNameField.sendKeys(companyName);
    return this;
  }

  public CompanySignUpPage setAddressField(String address){
    addressField.sendKeys(address);
    return this;
  }

  public CompanySignUpPage setZipCodeField(String zipCode){
    zipCodeField.sendKeys(zipCode);
    return this;
  }

  public CompanySignUpPage setCityField(String city){
    cityField.sendKeys(city);
    return this;
  }

   public CompanySignUpPage setCountryField(String country){
      countryDropDown.click();
      find(xpath(String.format(countryDropDownOption, country))).waitUntilVisible().click();
    return this;
  }

  public CompanySignUpPage setEmailFormField(String emailForm){
    emailFormField.sendKeys(emailForm);
    return this;
  }

  public CompanySignUpPage setCountryCodeField(String countryCode){
    countryCodeDropDown.click();
    find(xpath(String.format(countryCodeDropDownOption, countryCode))).waitUntilVisible().click();
    return this;
  }

  public CompanySignUpPage setPhoneField(String phone){
    phoneField.sendKeys(phone);
    return this;
  }

  public void clickButtonRegister() {
    buttonRegister.click();
  }

  public boolean isAllertVisible(String message){
    return findAll(xpath(format(allertByText, message))).size() > 0
            && findAll(xpath(format(allertByText, message))).get(0).isDisplayed();
  }
/*
  public List<WebElement> getAllert(){
    return $(allertByLabel);
  }

  public String getAllertByNumber(int number){
    return getAllert().get(number -1).getText();
  }
*/
/*
  public void  getAllertText(String text) {
  return find(xpath(String.format(allertByLabel, text)));

}
*/
}
