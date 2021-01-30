package com.telran.model;

public class Contact {

    public String name;
    public String lname;
    public String phone;
    public String email;
    public String address;
    public String description;

    public Contact withName(String name) {
        this.name = name;
        return this;
    }

    public Contact withLname(String lname) {
        lname = lname;
        return this;
    }

    public Contact withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public Contact withEmail(String email) {
        this.email = email;
        return this;
    }

    public Contact withAddress(String address) {
        this.address = address;
        return this;
    }

    public Contact withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getLname() {
        return lname;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getDescription() {
        return description;
    }
}
