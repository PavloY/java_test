package ua.splinestudio.addressbook.tests;

import org.testng.annotations.Test;
import ua.splinestudio.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase{

        @Test
        public void testContactCreationTests(){
            app.goTo().initContactCreationPage();
            app.getContactHelper().fillContactForm(new ContactData("test1"
                    , "test2"
                    , "test3"
                    , "test4"
                    , "test5"
                    , "test6"
                    , "test1"),
                     true);
            app.getContactHelper().submitContactCreation();
            app.getContactHelper().returnToContactPage();
        }


}
