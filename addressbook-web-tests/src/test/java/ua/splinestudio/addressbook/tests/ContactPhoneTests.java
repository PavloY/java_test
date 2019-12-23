package ua.splinestudio.addressbook.tests;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.Test;
import ua.splinestudio.addressbook.model.ContactData;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class ContactPhoneTests extends TestBase{

  @Test
  public void testContactPhone(){
    app.goTo().gotoHomePage();
    ContactData contact = app.contact().all().iterator().next();
    ContactData contactInfoFromEditForm = app.contact().infoFromEditForm(contact);

    assertThat(contact.getHomePhone(), equalTo(contactInfoFromEditForm.getHomePhone()));
    assertThat(contact.getMobilePhone(), equalTo(contactInfoFromEditForm.getMobilePhone()));
    assertThat(contact.getWorkPhone(), equalTo(contactInfoFromEditForm.getWorkPhone()));
  }
}


