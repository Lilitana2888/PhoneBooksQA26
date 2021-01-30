package com.telran.tests;

import com.telran.model.Contact;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddContactTest extends BaseTest{

    @BeforeMethod
    public  void ensurePreconditions()
    {
        if(!app.getUser().isUserLogined())
        {
            app.getUser().userLogin();
        }
    }

    @Test
    public void testAddContactTest() {

        app.getContact().clickOnAddBtn();
        app.getContact().fillContactForm();
        //confirmContact();
        //Assert
    }
}
