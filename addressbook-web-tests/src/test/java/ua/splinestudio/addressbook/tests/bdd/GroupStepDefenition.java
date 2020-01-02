package ua.splinestudio.addressbook.tests.bdd;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.remote.BrowserType;
import ua.splinestudio.addressbook.appmanager.ApplicationManager;
import ua.splinestudio.addressbook.model.GroupData;
import ua.splinestudio.addressbook.model.Groups;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class GroupStepDefenition {

    private ApplicationManager app;
    private Groups groups;
    private GroupData newGroup;

    @Before
    public void init() throws IOException {
      app = new ApplicationManager(System.getProperty("browser", BrowserType.FIREFOX));
      app.init();
    }

    @After
    public void stop(){
      app.stop();
      app = null;
    }

    @Given("^a set of groups$")
    public void loadGroups() {
        groups = app.db().groups();
    }

    @When("^I create a new group with name (.+), header (.+) and footer (.+)$")
    public void createGroup(String name, String header, String footer) {
        newGroup = new GroupData().withName(name).withHeader(header).withFooter(footer);
        app.goTo().groupPage();
        app.group().create(newGroup);
    }

    @Then("^the new set our groups is equal to the old set with the added group$")
    public void verifyGroupCreated() {
        Groups newGroups = app.db().groups();
        assertThat(newGroups, equalTo(
                groups.withAdded(newGroup.withId(newGroups.stream().mapToInt((g) -> g.getId()).max().getAsInt()))));
    }
}