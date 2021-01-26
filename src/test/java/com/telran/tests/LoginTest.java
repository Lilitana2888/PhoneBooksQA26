package com.telran.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void testLogin() {
        openLoginForm();
        fillLoginForm();
        confirmLoginForm();
    }

    public void confirmLoginForm() {
        app.getUser().click(By.xpath("//button[contains(.,'Login')]"));
    }

    public void fillLoginForm() {

        app.getUser().type(By.cssSelector("[placeholder='Email']"),"Test1611006634796@mail.ru");
        app.getUser().type(By.cssSelector("[placeholder='Password']"),"Test$12345");
    }

    public void openLoginForm() {
      //  app.wd.findElement(By.cssSelector("[href='/login'"));
    }


}
