package rentbus.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.NoSuchElementException;

import static java.lang.String.format;

@DefaultUrl("http://rab.dev19.splinestudio.com/en/get-transport-quote/")
public class GetTransportQuotePage extends PageObject {

  @FindBy(xpath ="(.//*[text()='To'])[1]/following::label[3]")
  private WebElementFacade checkboxFromOneWay;

  @FindBy(xpath ="(.//*[text()='To'])[1]/following::label[4]")
  private WebElementFacade checkboxToOneWay;

  @FindBy(xpath ="//button[@id='dLabel']")
  private WebElementFacade travelPlane;

  String userByText = ("//a[text()[contains(.,'%s')]]");

  public GetTransportQuotePage setCheckBoxFrom(boolean value) {
    WebElement checkbox = checkboxFromOneWay;
    if (!checkbox.isSelected() == value) {
      checkbox.click();
    }
    return this;
  }

  public GetTransportQuotePage setCheckBoxTo(boolean value) {
    WebElement checkbox = checkboxToOneWay;
    if (!checkbox.isSelected() == value) {
      checkbox.click();
    }
    return this;
  }

  public boolean isTravelPlanePresent() {
    try {
     $(travelPlane);
      return true;
    } catch (NoSuchElementException ex) {
      return false;
    }
  }

  public boolean isUserByTextVisible(String message){
    return findAll(By.xpath(format(userByText, message))).size() > 0
            && findAll(By.xpath(format(userByText, message))).get(0).isDisplayed();
  }

}