package testpackage.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import static java.lang.String.format;
import static org.openqa.selenium.By.xpath;

@DefaultUrl("http://rab.dev19.splinestudio.com/")
public class MainPage extends PageObject {

    private By signUpButton = xpath("//button[@id='dLabel']");
    private By emailAddressField = xpath("//input[@id='email']");
    private By passwordField = xpath("//input[@id='password']");
    private By signUpButtonConfirmation = xpath ("//button[@onclick='sign_in()']");
    String userByText = ("//a[text()[contains(.,'%s')]]");

    public void clickSignUpButton() {
      find(signUpButton).click();
    }

    public MainPage setEmailAddress(String emailAddress){
      find(emailAddressField).sendKeys(emailAddress);
      return this;
    }

    public MainPage setPasswordField(String password){
      find(passwordField).sendKeys(password);
      return this;
    }

    public void clickSignUpButtonConfirmation() {
      find(signUpButtonConfirmation).click();
    }

    public boolean isUserByTextVisible(String message){
     return findAll(By.xpath(format(userByText, message))).size() > 0
            && findAll(By.xpath(format(userByText, message))).get(0).isDisplayed();
  }
}

