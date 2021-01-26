package com.telran.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest{

    @Test
    public void testRegistration() throws InterruptedException {

        app.getUser().clickOnLoginBtn();
        String email = "Test" + System.currentTimeMillis()/1000%3600 + "@mail.ru";//Test1611006634796@mail.ru
        System.out.println(email);
        app.getUser().fillRegLogForm(email,"Test$12345");
        app.getUser().clickOnRegistration();
        app.getUser().pause(1000);

       Assert.assertTrue(app.getUser().isElementPresent(By.xpath("//*[text()='Sign Out']")));

    }

}
