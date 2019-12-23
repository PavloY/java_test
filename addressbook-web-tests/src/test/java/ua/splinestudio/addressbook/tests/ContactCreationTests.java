package ua.splinestudio.addressbook.tests;

import org.testng.annotations.Test;
import ua.splinestudio.addressbook.model.ContactData;

import java.io.File;

public class ContactCreationTests extends TestBase{

        @Test
        public void testContactCreationTests(){
            app.goTo().initContactCreation();
            File photo = new File("src/test/resources/spst.png");
            //app.contact().initContactCreation();
            app.contact().fillContactForm(
                    new ContactData().withFirstname("test_name").withLastname("test_lastname").withPhoto(photo),true);
            app.contact().submitContactCreation();
            app.contact().returnToHomePage();
        }



      @Test(enabled = false)
      public void testCurrentDir(){
          File currentDir = new File(".");
          System.out.println(currentDir.getAbsolutePath());
          File photo = new File("src/test/resources/spst.png");
          System.out.println(photo.getAbsolutePath());
          System.out.println(photo.exists());
      }

}
