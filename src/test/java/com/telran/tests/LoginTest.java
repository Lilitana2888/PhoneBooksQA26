package com.telran.tests;

import com.telran.model.User;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void testLogin() throws InterruptedException {
//        app.getUser().openLoginForm();
//        app.getUser().fillLoginForm(new User()
//                .withEmail("Test602@mail.ru")//Test2222@mail.ru for contact [href='/contacts']
//                .withPswd("Test$12345"));
//       app.getUser().confirmLoginForm();

        app.getUser().userLogin();
        app.getUser().pause(2000);

        Assert.assertTrue(app.getUser().isUserLogined());
    }




}
