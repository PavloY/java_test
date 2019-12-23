package ua.splinestudio.addressbook.model;

import java.io.File;

public class ContactData {
    private int id = Integer.MAX_VALUE;
    private String firstname;
    private String middlename;
    private String lastname;
    private String address;
    private String email;
    private String home;
    private String group;
    private String homePhone;
    private String mobilePhone;
    private String workPhone;

    public ContactData setPhoto(File photo) {
        this.photo = photo;
        return this;
    }

    public File getPhoto() {
        return photo;
    }

    private File photo;

/*
    public ContactData(String firstname, String middlename, String lastname, String address, String email, String home, String group) {
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.address = address;
        this.email = email;
        this.home = home;
        this.photo = photo;
        this.group = group;
    }

 */
    public ContactData withFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }
    public ContactData withLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public ContactData withHomePhone(String homePhone) {
        this.homePhone = homePhone;
        return this;
    }

    public ContactData withMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }

    public ContactData withWorkPhone(String workPhone) {
        this.workPhone = workPhone;
        return this;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() { return email; }

    public String getHome() { return home; }

    public String getGroup() { return group; }

    public int getId() {
        return id;
    }

    public ContactData withId(int id) {
        this.id = id;
        return this;
    }
}

