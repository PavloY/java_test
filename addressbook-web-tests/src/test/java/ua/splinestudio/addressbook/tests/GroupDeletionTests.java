package ua.splinestudio.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ua.splinestudio.addressbook.model.GroupData;

import java.util.List;
import java.util.Set;

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
    Set<GroupData> before = app.group().all();
    GroupData deletedGroup = before.iterator().next();
    app.group().delete(deletedGroup);
    Set<GroupData> after = app.group().all();
    Assert.assertEquals(after.size(), before.size() - 1);
    before.remove(deletedGroup);
    Assert.assertEquals(before, after);
    }
}
