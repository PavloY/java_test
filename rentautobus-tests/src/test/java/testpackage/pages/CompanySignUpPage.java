package testpackage.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static java.lang.String.format;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class CompanySignUpPage {
  private WebDriver driver;

  public CompanySignUpPage(WebDriver driver) {
    this.driver = driver;
  }



  private By firstNameField = By.id("invoice_first_name");
  private By lastNameField = By.id("invoice_last_name");
  private By companyNameField = By.id("name");
  private By addressField = By.id("address");
  private By zipCodeField = By.id("zip_code");
  private By cityField = By.id("city");
  private By countryDropDown = By.xpath("//button[@onclick='register()']");
  String countryDropDownOption = ("//select[@id='invoice_country']/option[text()='%s']");
  private By emailFormField = By.id("email-form");
  private By countryCodeDropDown = By.xpath("//select[@id='country']");
  String countryCodeDropDownOption = ("//select[@id='country']/option[text()[contains(.,'%s')]]");
  private By phoneField = By.id("phone");
  private By buttonRegister = By.xpath("//button[@onclick='register()']");
  String allertByText = ("//div[text()[contains(.,'Check your Email')]]");
  private By allertByLabel = By.xpath("//div[text()[contains(.,'Check your Email')]]");


  public CompanySignUpPage setFirstNameField(String firstName){
    driver.findElement(firstNameField).sendKeys(firstName);
    return this;
  }

  public CompanySignUpPage setLastNameField(String lastName){
    driver.findElement(lastNameField).sendKeys(lastName);
    return this;
  }

  public CompanySignUpPage setCompanyNameField(String companyName){
    driver.findElement(companyNameField).sendKeys(companyName);
    return this;
  }

  public CompanySignUpPage setAddressField(String address){
    driver.findElement(addressField).sendKeys(address);
    return this;
  }

  public CompanySignUpPage setZipCodeField(String zipCode){
    driver.findElement(zipCodeField).sendKeys(zipCode);
    return this;
  }

  public CompanySignUpPage setCityField(String city){
    driver.findElement(cityField).sendKeys(city);
    return this;
  }

   public CompanySignUpPage setCountryField(String country){
    driver.findElement(countryDropDown).click();
      new WebDriverWait(driver, 3)
              .until(visibilityOfElementLocated(By.xpath(String.format(countryDropDownOption, country)))).click();
    return this;
  }

  public CompanySignUpPage setEmailFormField(String emailForm){
    driver.findElement(emailFormField).sendKeys(emailForm);
    return this;
  }

  public CompanySignUpPage setCountryCodeField(String country){
    driver.findElement(countryCodeDropDown).click();
    new WebDriverWait(driver, 3)
            .until(visibilityOfElementLocated(By.xpath(String.format(countryCodeDropDownOption, country)))).click();
    return this;
  }

  public CompanySignUpPage setPhoneField(String phone){
    driver.findElement(phoneField).sendKeys(phone);
    return this;
  }

  public void clickButtonRegister() {
    driver.findElement(buttonRegister).click();
  }

  public boolean isAllertVisible(String message){
    return driver.findElements(By.xpath(format(allertByText, message))).size() > 0
            && driver.findElements(By.xpath(format(allertByText, message))).get(0).isDisplayed();
  }

  public List<WebElement> getAllert(){
    return driver.findElements(allertByLabel);
  }

  public String getAllertByNumber(int number){
    return getAllert().get(number -1).getText();
  }

  public String getAllertText() {
  return driver.findElement(allertByLabel).getText();
}

}
