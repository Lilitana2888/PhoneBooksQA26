package com.telran.fw;

import com.telran.model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends HelperBase{

    public UserHelper(WebDriver driwer) {
        super(driwer);
    }

    public void fillRegLogForm(User user)
    {
        type(By.xpath("//input[1]"), user.getEmail());
        type(By.xpath("//input[2]"), user.getPswd());
    }
    public void clickOnLoginBtn() {
        click(By.cssSelector("[href='/login']"));
    }
    public void clickOnRegistration()
    {
        wd.findElement(By.xpath("//*[.=' Registration']")).click();
    }

    //for login
    public  void userLogin()
    {
       openLoginForm();
       fillLoginForm(new User()
                .withEmail("Test602@mail.ru")//Test2222@mail.ru for contact [href='/contacts']
                .withPswd("Test$12345"));
        confirmLoginForm();
    }

    public void confirmLoginForm() {
        click(By.xpath("//button[contains(.,'Login')]"));
    }

    public void fillLoginForm(User user) {

        type(By.cssSelector("input[placeholder='Email']"), user.getEmail());
        type(By.cssSelector("[placeholder='Password']"), user.getPswd());//"Test$12345"
    }

    public void openLoginForm() {

     //   wd.findElement(By.cssSelector("[href='/login'"));
        click(By.cssSelector("[href='/login']"));
    }

    public boolean isUserLogined() {

    return isElementPresent(By.xpath("//*[text()='Sign Out']"));

    }
}
