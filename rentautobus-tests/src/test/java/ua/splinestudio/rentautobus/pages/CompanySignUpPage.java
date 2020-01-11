package ua.splinestudio.rentautobus.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

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
  private By invoiceCountryField = By.id("invoice_country");
  private By emailFormField = By.id("email-form");
  private By countryField = By.id("country");
  private By phoneField = By.id("phone");

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

  public CompanySignUpPage setInvoiceCountryField(String invoiceCountry){
    driver.findElement(invoiceCountryField).click();
      new WebDriverWait(driver, 3)
              .until(visibilityOfElementLocated(By.id(format(invoiceCountry, invoiceCountryField)))).click();
    return this;
  }

  public CompanySignUpPage setEmailFormField(String emailForm){
    driver.findElement(emailFormField).sendKeys(emailForm);
    return this;
  }

  public CompanySignUpPage setCountryField(String country){
    driver.findElement(countryField).click();
    new WebDriverWait(driver, 3)
            .until(visibilityOfElementLocated(By.id(format(country, countryField)))).click();
    return this;
  }

  public CompanySignUpPage setPhoneField(String phone){
    driver.findElement(phoneField).sendKeys(phone);
    return this;
  }






}
