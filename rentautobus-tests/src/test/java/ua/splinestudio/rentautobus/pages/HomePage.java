package ua.splinestudio.rentautobus.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ua.splinestudio.rentautobus.appmanager.HelperBase;


//public class HomePage {
//private WebDriver driver;
//    public HomePage(WebDriver driver) {
//      this.driver = driver;
//    }

public class HomePage extends HelperBase {

  public HomePage(WebDriver driver) {
        super(driver);
        }

  private By forBusinessButton = By.linkText("FOR BUSINESS");
  private By signUpButton = By.xpath("//button[@id='dLabel']");
  private By emailAddressField = By.xpath("//input[@id='email']");
  private By passwordField = By.xpath("//input[@id='password']");
  private By signUpButtonConfirmation = By.xpath("//button[@onclick='sign_in()']");
  private By returnTripButton = By.id("return_trip");
  private By oneWayButton = By.id("one_way");
  private By multiStopsButton = By.id("multi_trip");
  private By fromField = By.id("from");
  private By toField = By.id("to");
  private By fromDateField = By.id("from_date");
  private By toDateField = By.id("to_date");
  private By fromTimeField = By.id("from_time-hour");
  private By toTimeField = By.id("to_time");
  private By fromFieldMultiStops = By.id("from0");
  private By toFieldMultiStops = By.id("to0");
  private By fromDateMultiStops = By.id("from_date0");
  private By fromTimeMultiStops = By.id("from_time-hour0");
  private By continueButton = By.id("next-page");


  public CompanySignUpPage clickForBusinessButton(){
    driver.findElement(forBusinessButton).click();
    return new CompanySignUpPage(driver);
  }

  public void clickSignUpButton() {
      driver.findElement(signUpButton).click();
  }

  public HomePage setPasswordField(String password){
      driver.findElement(passwordField).sendKeys(password);
      return this;
  }

  public HomePage setEmailAddress(String emailAddress){
    driver.findElement(emailAddressField).sendKeys(emailAddress);
    return this;
  }

  public void clickSignUpButtonConfirmation() {
    driver.findElement(signUpButtonConfirmation).click();
  }

  public void clickReturnTripButton() {
    driver.findElement(returnTripButton).click();
  }

  public void clickOneWayButton() {
    driver.findElement(oneWayButton).click();
  }
  public void clickMultiStopsButton() {
    driver.findElement(multiStopsButton).click();
  }

  public HomePage setFromField(String from){
    driver.findElement(fromField).sendKeys(from);
    return this;
  }

  public HomePage setToField(String to){
    driver.findElement(toField).sendKeys(to);
    return this;
  }

  public HomePage setFromDateField(String fromDate){
    driver.findElement(fromDateField).sendKeys(fromDate);
    return this;
  }

  public HomePage setToDateField(String toDate){
    driver.findElement(toDateField).sendKeys(toDate);
    return this;
  }

  public HomePage setFromTimeField(String fromTime){
    driver.findElement(fromTimeField).sendKeys(fromTime);
    return this;
  }

  public HomePage setToTimeField(String toTime){
    driver.findElement(toTimeField).sendKeys(toTime);
    return this;
  }

  public HomePage setFromFieldMultiStops(String fromFieldMulti){
    driver.findElement(fromFieldMultiStops).sendKeys(fromFieldMulti);
    return this;
  }

  public HomePage setToFieldMultiStops(String toFieldMulti){
    driver.findElement(toFieldMultiStops).sendKeys(toFieldMulti);
    return this;
  }

  public HomePage setFromDateMultiStops(String fromDateMulti){
    driver.findElement(fromDateMultiStops).sendKeys(fromDateMulti);
    return this;
  }

  public HomePage setFromTimeMultiStops(String fromTimeMulti){
    driver.findElement(fromTimeMultiStops).sendKeys(fromTimeMulti);
    return this;
  }

  public GetTransportQuotePage clickContinueButton(){
    driver.findElement(continueButton).click();
    return new GetTransportQuotePage(driver);
  }

  public HomePage signIn(String emailAddress, String password) {
    this.clickSignUpButton();
    this.setEmailAddress(emailAddress);
    this.setPasswordField(password);
    this.clickSignUpButtonConfirmation();
    return this;
  }
  public GetTransportQuotePage setOneWayTrip(String from, String to, String date, String time ){
    this.clickOneWayButton();
    this.setFromField(from);
    this.setToField(to);
    this.setFromDateField(date);
    this.setFromTimeField(time);
    this.clickContinueButton();
    return new GetTransportQuotePage(driver);
  }


  }
