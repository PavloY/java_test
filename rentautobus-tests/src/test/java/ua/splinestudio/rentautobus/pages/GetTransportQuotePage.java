package ua.splinestudio.rentautobus.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.NoSuchElementException;

public class GetTransportQuotePage {
  private WebDriver driver;

  public GetTransportQuotePage(WebDriver driver) {
    this.driver = driver;
  }


  private By checkboxFromOneWay = By.xpath("(.//*[text()='To'])[1]/following::label[3]");
  private By checkboxToOneWay = By.xpath("(.//*[text()='To'])[1]/following::label[4]");
  private By travelPlane = By.xpath("//button[@id='dLabel']");

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
}