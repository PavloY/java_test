package ua.splinestudio.addressbook.model;

import com.sun.istack.NotNull;
import javafx.application.Application;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.File;
import java.time.LocalDate;


@Entity
@Table(name = "addressbook")
public class ContactData {

    @Id
    @Column(name="id")
    private int id;

    @Column(name="firstname")
    private String firstname;

    @Column(name="lastname")
    private String lastname;

    @Transient
    private String group;

    @Column(name="home")
    @Type(type = "text")
    private String homePhone;

    @Column(name="mobile")
    @Type(type = "text")
    private String mobilePhone;

    @Column(name="work")
    @Type(type = "text")
    private String workPhone;

    @Transient
    private String allPhones;

    @Column(name="photo")
    @Type(type = "text")
    private String photo;

    @Column(name = "deprecated", columnDefinition = "DATETIME")
    private String deprecated;


    public String getAllPhones() {
        return allPhones;
    }

    public ContactData withAllPhones(String allPhones) {
        this.allPhones = allPhones;
        return this;
    }

    public ContactData withPhoto(File photo) {
        this.photo = photo.getPath();
        return this;
    }

    public File getPhoto() {
        return new File(photo);
    }

    public int getId() {return id;}

    public ContactData withId(int id) {
        this.id = id;
        return this;
    }

    public String getFirstname() {
        return firstname;
    }

    public ContactData withFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getLastname() {
        return lastname;
    }

    public ContactData withLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public String getGroup() { return group; }

    public ContactData withGroup(String group) {
        this.group = group;
        return this;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public ContactData withHomePhone(String homePhone) {
        this.homePhone = homePhone;
        return this;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public ContactData withMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public ContactData withWorkPhone(String workPhone) {
        this.workPhone = workPhone;
        return this;
    }
}

