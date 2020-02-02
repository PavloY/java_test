package rentbus.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.By;

import static java.lang.String.format;


@DefaultUrl("http://rab.dev19.splinestudio.com/")
public class MainPage extends PageObject {

    @FindBy(xpath = "//button[@id='dLabel']")
    private WebElementFacade signUpButton;

    @FindBy(xpath = "//a[text()[contains(.,'FOR BUSINESS')]]")
    private WebElementFacade forBusinessButton;

    @FindBy(xpath = "//input[@id='email']")
    private WebElementFacade emailAddressField;

    @FindBy(xpath = "//input[@id='password']")
    private WebElementFacade passwordField;

    @FindBy(xpath = "//button[@onclick='sign_in()']")
    private WebElementFacade  signUpButtonConfirmation;

    String userByText = ("//a[text()[contains(.,'%s')]]");

    @FindBy(xpath = "//button[@id='return_trip']")
    private WebElementFacade returnTripButton;

    @FindBy(xpath = "//button[@id='one_way']")
    private WebElementFacade oneWayButton;

    @FindBy(xpath = "//button[@id='multi_trip']")
    private WebElementFacade multiStopsButton;

    @FindBy(xpath = "//input[@id='from']")
    private WebElementFacade fromField;

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

    @WhenPageOpens
    public void maximiseScreen() {
    getDriver().manage().window().maximize();
  }


    public void clickSignUpButton() {
      signUpButton.click();
    }

    public void clickForBusinessButton(){
      forBusinessButton.click();
    }

    public MainPage setEmailAddress(String emailAddress){
      emailAddressField.sendKeys(emailAddress);
      return this;
    }

    public MainPage setPasswordField(String password){
      passwordField.sendKeys(password);
      return this;
    }

    public void clickSignUpButtonConfirmation() {
      signUpButtonConfirmation.click();
    }

    public boolean isUserByTextVisible(String message){
     return findAll(By.xpath(format(userByText, message))).size() > 0
            && findAll(By.xpath(format(userByText, message))).get(0).isDisplayed();
  }


}

