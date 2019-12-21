package ua.splinestudio.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ua.splinestudio.addressbook.model.GroupData;

import java.util.List;

public class GroupDeletionTests extends TestBase {

  @BeforeMethod
  private void ensurePreconditions() {
    app.goTo().groupPage();
    if (app.group().list().size()==0) {
      app.group().create(new GroupData().withName("test1").withFooter("test2").withHeader("test3"));
    }
  }


  @Test
  public void testGroupDeletion() throws Exception {
    List<GroupData> before = app.group().list();
    int index = before.size()-1;
    app.group().delete(index);
    List<GroupData> after = app.group().list();
    Assert.assertEquals(after.size(), before.size() - 1);
    before.remove(index);
    Assert.assertEquals(before, after);
    }


}
