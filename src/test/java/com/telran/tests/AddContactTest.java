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
    public void testAddContactTest() {

        //for create date
        int i = (int) (System.currentTimeMillis()/1000%3600);
        String name = "Lili"+ i;
        String lname = "PO"+ i;
        String phone = "123456"+ i;
        String email = "Lili"+ i + "@mail.com";
        String address = "Herclia";
        String description = "my new contact";
        app.getContact().clickOnAddBtn();
        app.getContact().fillContactForm(new Contact()
                .withName("name")
                .withLname("lname")
                .withPhone("phone")
                .withEmail("email")
                .withAddress("address")
                .withDescription("description"));
        app.getContact().clickSaveBtn();
        //Assert
    }
}
