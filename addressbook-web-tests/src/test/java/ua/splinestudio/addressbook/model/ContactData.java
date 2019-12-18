package ua.splinestudio.addressbook.model;

public class ContactData {
    private final String firstname;
    private final String middlename;
    private final String lastname;
    private final String address;
    private final String email;
    private final String home;
    private String group;


    public ContactData(String firstname, String middlename, String lastname, String address, String email, String home, String group) {
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.address = address;
        this.email = email;
        this.home = home;
        this.group = group;
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
}

