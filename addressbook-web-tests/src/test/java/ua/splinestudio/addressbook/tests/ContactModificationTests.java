package ua.splinestudio.addressbook.tests;

import org.testng.annotations.Test;
import ua.splinestudio.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase{

    @Test
    public void testContactModification(){
        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("test6"
                , "test5"
                , "test4"
                , "test3"
                , "test2"
                , "test1"
                , null)
                , false);
        app.getContactHelper().submitContactModifycation();
        app.getNavigationHelper().gotoHomePage();
    }
}
