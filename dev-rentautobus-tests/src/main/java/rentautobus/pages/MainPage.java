package rentautobus.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {
  WebDriver driver;

    public MainPage(WebDriver driver) {
      this.driver = driver;
    }

    @FindBy(xpath = "//button[@id='dLabel']")
    private WebElement signUpButton;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailAddressField;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@onclick='sign_in()']")
    private WebElement signUpButtonConfirmation;

    public void clickSignUpButton() {
      signUpButton.click();
    }

    public MainPage setEmailAddress(String emailAddress){
      emailAddressField.click();
      emailAddressField.clear();
      emailAddressField.sendKeys(emailAddress);
      return this;
    }

    public MainPage setPasswordField(String password){
      passwordField.click();
      passwordField.clear();
      passwordField.sendKeys(password);
      return this;
    }

    public void clickSignUpButtonConfirmation() {
      signUpButtonConfirmation.click();
    }

}

