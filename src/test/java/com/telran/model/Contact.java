package com.telran.model;

public class Contact {

    private String name;
    private String surName;
    private String phone;
    private String email;
    private String address;
    private String description;

    public Contact withName(String name) {
        this.name = name;
        return this;
    }

    public Contact withSurName(String lname) {
        surName = lname;
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

    public String getSurName() {
        return surName;
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
