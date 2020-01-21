import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import rentautobus.pages.MainPage;

import java.util.concurrent.TimeUnit;

public class SignUpTest {
  private WebDriver driver;
  private MainPage page;

  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability(CapabilityType.PAGE_LOAD_STRATEGY, "eager");
    driver.get("http://rab.dev19.splinestudio.com/");
  }

  @Test
  public void signUp() {
    page.clickSignUpButton();
    page.setEmailAddress("dev@splinestudio.com");
    page.setEmailAddress("12345678");
    page.clickSignUpButtonConfirmation();
  }


  @After
  public void tearDown() {
    driver.quit();
    }
}
