package ua.splinestudio.addressbook.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ua.splinestudio.addressbook.model.GroupData;
import ua.splinestudio.addressbook.model.Groups;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class GroupCreationTests extends TestBase{

    @DataProvider
    public Iterator<Object[]> validGpoups() throws IOException {
        List<Object[]> list = new ArrayList<Object[]>();
        BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/groups.csv")));
        String line = reader.readLine();
        while (line !=null) {
          String[] split = line.split(";");
          list.add(new Object[] {new GroupData().withName(split[0]).withHeader(split[1]).withFooter(split[2])});
          line = reader.readLine();
        }
        return list.iterator();
    }

    @Test(dataProvider="validGpoups")
    public void testGroupCreation(GroupData group) {
            app.goTo().groupPage();
            Groups before = app.group().all();
            app.group().create(group);
            Groups after = app.group().all();
            assertThat(after.size(), equalTo(before.size() + 1));
            assertThat(after, equalTo(
                    before.withAdded(group.withId(after.stream().mapToInt((g) -> g.getId()).max().getAsInt()))));
    }

    @Test (enabled = false)
    public void testBadGroupCreation() {
        app.goTo().groupPage();
        Groups before = app.group().all();
        GroupData group = new GroupData().withName("test1`~@#$").withFooter("test2").withHeader("test3");
        app.group().create(group);
        assertThat(app.group().count(), equalTo(before.size()));
        Groups after = app.group().all();
        assertThat(after, equalTo(before));
    }
}

