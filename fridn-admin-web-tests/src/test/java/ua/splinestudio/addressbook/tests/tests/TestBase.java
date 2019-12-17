package ua.splinestudio.addressbook.tests.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ua.splinestudio.addressbook.tests.appmanager.ApplicationManager;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void setUp() throws Exception {
        app.init();
    }

    @AfterMethod
    public void tearDown() {
        app.stop();}

}
