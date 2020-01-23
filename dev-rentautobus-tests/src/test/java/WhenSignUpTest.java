import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import pages.MainPage;
import steps.MainSteps;

@RunWith(SerenityRunner.class)
public class WhenSignUpTest {

  @Steps
  MainSteps steps;

  @Managed
  WebDriver driver;

  @Test
  public void testSignUp() {
    steps.openMainPage();
    steps.clickSignUpButton();
    steps.setEmailAddress("dev@splinestudio.com");
    steps.setPasswordField("12345678");
    steps.clickSignUpButtonConfirmation();
    Assert.assertTrue(steps.isUserByTextVisible("Lesha Afternoon"));
  }
}
