package com.telran.tests;

import com.telran.model.Contact;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddContactTest extends BaseTest {

    @BeforeMethod
    public void ensurePreconditions() {
        if (!app.getUser().isUserLogined()) {
            app.getUser().userLogin();
        }
    }

    @Test
    public void testAddContactTest() throws InterruptedException {

        //for create date
        int i = (int) (System.currentTimeMillis()/1000%3600);
        String name = "Lili"+ i;
        String surName = "POky"+ i;
        String phone = "123456"+ i;
        String email = "Lili"+ i + "@mail.com";
        String address = "Herclia";
        String description = "my new contact";
        app.getContact().clickOnAddBtn();
        app.getUser().pause(1000);
        app.getContact().fillContactForm(new Contact()
                .withName(name)
                .withSurName(surName)
                .withPhone(phone)
                .withEmail(email)
                .withAddress(address)
                .withDescription(description));
        app.getContact().clickSaveBtn();
        //Assert
    }
}
