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

    @FindBy(xpath = "//input[@id='email']")
    private WebElementFacade emailAddressField;

    @FindBy(xpath = "//input[@id='password']")
    private WebElementFacade passwordField;

    @FindBy(xpath = "//button[@onclick='sign_in()']")
    private WebElementFacade  signUpButtonConfirmation;

    @FindBy(xpath = "//a[text()[contains(.,'FOR BUSINESS')]]")
    private WebElementFacade forBusinessButton;

    String userByText = ("//a[text()[contains(.,'%s')]]");

    @WhenPageOpens
    public void maximiseScreen() {
    getDriver().manage().window().maximize();
  }

    public void clickSignUpButton() {
      signUpButton.click();
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

    public MainPage clickForBusinessButton(){
      forBusinessButton.click();
      return this;
  }

}

