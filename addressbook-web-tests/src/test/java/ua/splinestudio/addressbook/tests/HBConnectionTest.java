package ua.splinestudio.addressbook.tests;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ua.splinestudio.addressbook.model.ContactData;

import java.util.List;

public class HBConnectionTest {

  private SessionFactory sessionFactory;

  @BeforeClass

  protected void setUp() throws Exception {
    final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
            .configure().build();
    try {
      sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
    }
    catch (Exception e) {
      e.printStackTrace();
      StandardServiceRegistryBuilder.destroy( registry );
    }
  }

  @Test
  public void testHBConnection() {

    Session session = sessionFactory.openSession();
    session.beginTransaction();
    List<ContactData> result = session.createQuery( "from ContactData " + "where deprecated = '0000-00-00'" ).list();
    for (ContactData contact : result ) {
      System.out.println(contact);
    }
    session.getTransaction().commit();
    session.close();
  }
}
