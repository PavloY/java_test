package testpackage.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.NoSuchElementException;

import static java.lang.String.format;

public class GetTransportQuotePage {
  private WebDriver driver;

  public GetTransportQuotePage(WebDriver driver) {
    this.driver = driver;
  }


  private By checkboxFromOneWay = By.xpath("(.//*[text()='To'])[1]/following::label[3]");
  private By checkboxToOneWay = By.xpath("(.//*[text()='To'])[1]/following::label[4]");
  private By travelPlane = By.xpath("//button[@id='dLabel']");
  String userByText = ("//a[text()[contains(.,'%s')]]");

  public GetTransportQuotePage setCheckBoxFrom(boolean value) {
    WebElement checkbox = driver.findElement(checkboxFromOneWay);
    if (!checkbox.isSelected() == value) {
      checkbox.click();
    }
    return this;
  }

  public GetTransportQuotePage setCheckBoxTo(boolean value) {
    WebElement checkbox = driver.findElement(checkboxToOneWay);
    if (!checkbox.isSelected() == value) {
      checkbox.click();
    }
    return this;
  }

  public boolean isTravelPlanePresent() {
    try {
      driver.findElement(travelPlane);
      return true;
    } catch (NoSuchElementException ex) {
      return false;
    }
  }

  public boolean isUserByTextVisible(String message){
    return driver.findElements(By.xpath(format(userByText, message))).size() > 0
            && driver.findElements(By.xpath(format(userByText, message))).get(0).isDisplayed();
  }

}