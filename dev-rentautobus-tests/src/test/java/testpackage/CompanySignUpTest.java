package testpackage;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import rentbus.steps.MainSteps;

@RunWith(SerenityRunner.class)
public class CompanySignUpTest {

  @Steps
  MainSteps steps;

  @Managed
  WebDriver driver;

  @Test
  @Title("User click singin button")
  public void cliksignin() {
  steps.openMainPage();
  steps.clickSignUpButton();
  steps.clickForBusinessButton();
  }


}
