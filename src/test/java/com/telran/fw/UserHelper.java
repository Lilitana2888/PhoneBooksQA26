package com.telran.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends HelperBase{

    public UserHelper(WebDriver driwer) {
        super(driwer);
    }
    public void fillRegLogForm(String email, String pswd)
    {
        type(By.xpath("//input[1]"),email);
        type(By.xpath("//input[2]"),pswd);
    }
    public void clickOnLoginBtn() {
        click(By.cssSelector("[href='/login']"));
    }
    public void clickOnRegistration()
    {
        wd.findElement(By.xpath("//*[.=' Registration']")).click();
    }

}
