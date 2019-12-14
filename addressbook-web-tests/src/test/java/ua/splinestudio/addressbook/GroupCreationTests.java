package ua.splinestudio.addressbook;

import org.testng.annotations.*;

public class GroupCreationTests extends TestBase{

    @Test
    public void testGroupCreation() throws Exception {
        gotoGroupCreation();
        initGroupCreation();
        fillGroupForm(new GroupData("test", "test2", "test3"));
        submitGroupCreation();
        returnToGroupPage();
    }

}

