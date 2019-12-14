package ua.splinestudio.addressbook.tests;

import org.testng.annotations.*;
import ua.splinestudio.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase{

    @Test
    public void testGroupCreation() throws Exception {
        app.gotoGroupCreation();
        app.initGroupCreation();
        app.fillGroupForm(new GroupData("test", "test2", "test3"));
        app.submitGroupCreation();
        app.returnToGroupPage();
    }

}

