package ua.splinestudio.rentautobus.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class HomePage {
private WebDriver driver;
    public HomePage(WebDriver driver) {
      this.driver = driver;
    }

  private By forBusinessButton = By.linkText("FOR BUSINESS");

  @FindBy(xpath = "//button[@id='dLabel']")
  private WebElement signUpButton;

  @FindBy(xpath = "//input[@id='email']")
  private WebElement emailAddressField;

  @FindBy(xpath = "//input[@id='password']")
  private WebElement passwordField;

  @FindBy(xpath = "//button[@onclick='sign_in()']")
  private WebElement signUpButtonConfirmation;


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
  private By getFreeQuotesButton = By.xpath("//button[@id='next-page']");


  public CompanySignUpPage clickForBusinessButton(){
    driver.findElement(forBusinessButton).click();
    return new CompanySignUpPage(driver);
  }

  public void clickSignUpButton() {
      signUpButton.click();
  }

  public HomePage setPasswordField(String password){
      passwordField.click();
      passwordField.clear();
      passwordField.sendKeys(password);
      return this;
  }

  public GetTransportQuotePage setEmailAddress(String emailAddress){
    emailAddressField.click();
    emailAddressField.clear();
    emailAddressField.sendKeys(emailAddress);
    return new GetTransportQuotePage(driver);
  }

  public void clickSignUpButtonConfirmation() {
    signUpButtonConfirmation.click();
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
    driver.findElement(fromField).click();
    driver.findElement(fromField).clear();
    driver.findElement(fromField).sendKeys(from);
    return this;
  }

  public HomePage setToField(String to){
    driver.findElement(toField).click();
    driver.findElement(toField).clear();
    driver.findElement(toField).sendKeys(to);
    return this;
  }

  public HomePage setFromDateField(String fromDate){
    driver.findElement(fromDateField).click();
    driver.findElement(fromDateField).clear();
    driver.findElement(fromDateField).sendKeys("selenium" + Keys.ARROW_LEFT);
    driver.findElement(fromDateField).sendKeys("selenium" + Keys.ARROW_LEFT);
    driver.findElement(fromDateField).sendKeys("selenium" + Keys.ARROW_LEFT);
    driver.findElement(fromDateField).sendKeys(fromDate);
    return this;
  }

  public HomePage setToDateField(String toDate){
    driver.findElement(toDateField).click();
    driver.findElement(toDateField).clear();
    driver.findElement(toDateField).sendKeys("selenium" + Keys.ARROW_LEFT);
    driver.findElement(toDateField).sendKeys("selenium" + Keys.ARROW_LEFT);
    driver.findElement(toDateField).sendKeys("selenium" + Keys.ARROW_LEFT);
    driver.findElement(toDateField).sendKeys(toDate);
    return this;
  }

  public HomePage setFromTimeField(String fromTime){
    driver.findElement(fromTimeField).click();
   // driver.findElement(fromTimeField).clear();
    driver.findElement(fromTimeField).sendKeys("selenium" + Keys.DELETE);
    driver.findElement(fromTimeField).sendKeys(fromTime);
    return this;
  }

  public HomePage setToTimeField(String toTime){
    driver.findElement(toTimeField).click();
  //  driver.findElement(toTimeField).clear();
    driver.findElement(toTimeField).sendKeys("selenium" + Keys.DELETE);
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

  public GetTransportQuotePage clickGetFreeQuotesButton(){
    driver.findElement(getFreeQuotesButton).click();
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
    this.clickGetFreeQuotesButton();
    return new GetTransportQuotePage(driver);
  }


  }
