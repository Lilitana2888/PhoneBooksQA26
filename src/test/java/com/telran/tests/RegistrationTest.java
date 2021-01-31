package com.telran.tests;

import com.telran.model.User;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest{

    @Test(enabled = false)
    public void testRegistration() throws InterruptedException {

        app.getUser().clickOnLoginBtn();
        long i = System.currentTimeMillis()/1000%3600;
        String email = "Test" + i + "@mail.ru";//Test1611006634796@mail.ru
        System.out.println(email);
        app.getUser().fillRegLogForm(new User()
                .withEmail(email)
                .withPswd("Test$12345"));
        app.getUser().clickOnRegistration();
        app.getUser().pause(3000);

       Assert.assertTrue(app.getUser()
               .isElementPresent(By.xpath("//*[text()='Sign Out']")));

    }

}
