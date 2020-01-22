import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.MainPage;
import steps.MainSteps;


public class SignUpTest {

  @Steps
  MainSteps steps;

  @Managed
  WebDriver driver;


  @Test
  public void testSignUp() {
    steps.openMainPage().clickSignUpButton();
    steps.setEmailAddress("dev@splinestudio.com");
    steps.setEmailAddress("12345678");
    steps.clickSignUpButtonConfirmation();
    Assert.assertTrue(page.isElementVisible());
  }
}
