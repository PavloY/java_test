package definitions.itvdn;

import itvdn.steps.ITVDNSiteSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.*;

public class ITVDNSiteStepDefenitions {

    // Для использования шагов их нужно просто объявить без инициализации
    @Steps
    private ITVDNSiteSteps testSteps;

    @BeforeScenario(uponType = ScenarioType.ANY)
    public void doStuff() {

    }

    @AfterScenario(uponType = ScenarioType.ANY)
    public void doAfterScenario() {

    }

    @AfterScenario(uponOutcome = AfterScenario.Outcome.FAILURE, uponType = ScenarioType.ANY)
    public void doAfterScenario2() {

    }

    @Given("Customer open site")
    public void openSite() {
        testSteps.openSite();
    }

    // $ определяет что это переменная
    @Given("Customer open '$courseName' video course")
    public void openSiteOnVideoCourse(String name) {
        testSteps.openVideoCourse(name);
    }

    @When("Customer subscribes to mailing with '$mail'")
    public void subscribe(String mail) {
        testSteps.subscribeToEmail(mail);
    }

    @When("Customer perform search with '$key'")
    public void performeSearch(String key) {
        testSteps.search(key);
    }

    @Then("Customer see results")
    public void checkSearchResults() {
        testSteps.checkResults();
    }

    @Then("Customer see success notification")
    public void successNotificaiton() {
        testSteps.verifySubscription();
    }

    @Then("Customer see fail notification")
    public void customerSeeValidation() {
        testSteps.subscriptionFail();
    }
}
